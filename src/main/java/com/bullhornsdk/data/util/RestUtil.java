package com.bullhornsdk.data.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class RestUtil {

	private static final DateTimeZone timeZone = DateTimeZone.forID("EST5EDT");

	public static DateTimeZone defaultTimeZone() {
		return timeZone;
	}

	public static DateTime nowInESTWithUTCTimeZone() {
		DateTime now = new DateTime(timeZone);
		return now.withZoneRetainFields(DateTimeZone.UTC);
	}

	public static boolean isNumeric(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))
					&& !".".equalsIgnoreCase(Character.toString(str.charAt(i))))
				return false;
		}
		return true;
	}

	public static <E> List<E> newList(E... elements) {
		if (elements == null) {
			return Collections.emptyList();
		}
		return new ArrayList<E>(Arrays.asList(elements));
	}
}
