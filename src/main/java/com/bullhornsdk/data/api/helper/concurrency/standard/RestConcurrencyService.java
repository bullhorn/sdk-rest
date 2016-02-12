package com.bullhornsdk.data.api.helper.concurrency.standard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.helper.concurrency.ConcurrencyService;

public class RestConcurrencyService implements ConcurrencyService {

	private static Logger log = Logger.getLogger(RestConcurrencyService.class);

	@Override
	public <T, C extends Callable<T>> List<T> spinThreadsAndWaitForResult(List<C> taskList) {
        return this.handleList(taskList, true);
	}

	@Override
	public <T, C extends Callable<T>> void spinThreadsAndDoNotWaitForResult(List<C> taskList) {
		handleList(taskList, false);
	}

	private <T, C extends Callable<T>> List<T> handleList(List<C> taskList, boolean wait) {
		if (taskList == null || taskList.isEmpty()) {
			return Collections.emptyList();
		}

		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// First get all the FileContent
		List<Future<T>> futureList = new ArrayList<Future<T>>();

		for (C task : taskList) {
			Future<T> futureResult = executor.submit(task);
			futureList.add(futureResult);
		}

		List<T> taskResultList = new ArrayList<T>();

		for (Future<T> future : futureList) {
			try {
				taskResultList.add(future.get());
			} catch (InterruptedException e) {
				log.error("Error in RestConcurrencyService.spinThreads", e);
			} catch (ExecutionException e) {
				log.error("Error in RestConcurrencyService.spinThreads", e);
			}
		}

		// shutdown pool
		executor.shutdown();
		if (wait) {
			// wait until it's done
			while (!executor.isTerminated()) {
			}
			// null it out
			executor = null;
		}
		return taskResultList;
	}

	@Override
	public <T, C extends Callable<T>> void spinOneThreadAndDoNotWaitForResult(C task) {
		if (task == null) {
			return;
		}

		ExecutorService executor = Executors.newSingleThreadExecutor();

		executor.submit(task);

		// shut down executor but do not wait for results
		executor.shutdown();

	}

}
