package org.example;

import java.util.Arrays;

public class Main {
		public static void main(String[] args) {
				String[] strings = filter(new String[]{"One", "Two", "Three"}, s -> s.length() == 3);
				Integer[] integers = filter(new Integer[]{0, 1, 2, 3, 4, 5}, i -> i % 2 == 0);

				for (String str : strings) {
						System.out.println(str);
				}

				for (Integer num : integers) {
						System.out.println(num);
				}
		}

		interface Filter<T> {
				boolean apply(T t);
		}


		static <T> T[] filter(T[] array, Filter<T> filter) {
				return Arrays.stream(array)
						       .filter(filter::apply)
						       .toArray(size -> Arrays.copyOf(array, size));
		}
}