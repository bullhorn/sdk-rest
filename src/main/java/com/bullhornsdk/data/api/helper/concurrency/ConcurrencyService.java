package com.bullhornsdk.data.api.helper.concurrency;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * Centralizes thread management.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public interface ConcurrencyService {

    /**
     * Handles the passed in taskList concurrently, and returns the result.
     * 
     * @param taskList
     * @return
     */
    public <T, C extends Callable<T>> List<T> spinThreadsAndWaitForResult(List<C> taskList);

    /**
     * Handles the passed in taskList concurrently. There is not guarantee this method will execute before subsequent client code.
     * This method is appropriate when client code is not depending on the result of the passed in List<Callable<T>> to function.
     * 
     * @param taskList
     * @return
     */
    public <T, C extends Callable<T>> void spinThreadsAndDoNotWaitForResult(List<C> taskList);

    public <T, C extends Callable<T>> void spinOneThreadAndDoNotWaitForResult(C task);

}
