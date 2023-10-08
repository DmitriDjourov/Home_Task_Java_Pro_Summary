package org.example;

import lombok.Getter;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class hw {
		public static void main(String... args) {
				//1. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного
				// исходного списка анекдотов.
				String[] jokesArray = {"1", "2", "3", "4", "5"};
				Supplier<String> randomJoke = () -> {
						Random random = new Random();
						int index = random.nextInt(jokesArray.length);
						return jokesArray[index];
				};
				System.out.println("Joke N" + randomJoke.get());

				//2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.
				Consumer<Integer> printEO = num -> {
						if (num % 2 == 0) {
								System.out.println(num);
						} else {
								System.err.println(num);
						}
				};
				printEO.accept(2);
				printEO.accept(3);
				printEO.accept(4);
				printEO.accept(5);
				printEO.accept(6);


				//3. Cоздать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey.

				class Monkey {
						@Getter
						private String color;
						private String name;
						private int age;
						public static Predicate<Monkey> isYellowMonkey = monkey -> "yellow".equalsIgnoreCase(monkey.getColor());


				}

				//4. Создать с помощью методов Function .compose() и .andThen() функцию convertToCelsius, которая:
				//
				//    - заменяет исходное число типа Integer на его строковое представление, добавляя в строковом
				//      представлении перед числом его знак (+ или -)(1)
				//
				//    - добавляет после числа текст "degrees Celsius"(2)
				//
				//    - ограничивает значения числа значениями +/- 100, выдавая граничные значения при превышении диапазона
				//        convertToCelsius.apply(-150) вернет "-100 degrees Celsius"
				//        convertToCelsius.apply(150) вернет "+100 degrees Celsius"

				//1.
				Function<Integer, String> toStringWithSign = num -> {
						String sign = num >= 0 ? "+" : "-";
						return sign + num.toString();
				};
				//2.
				Function<Integer, String> addCelsius = num -> num + " degrees Celsius";
				//3.
				Function<Integer, String> convertToCelsius = ((Function<Integer, Integer>) x -> Math.min(Math.max(x, -100), 100))
						                                             .andThen(x -> x.toString())
						                                             .compose(x -> Integer.valueOf((x < 0 ? "-" : "+") + Math.abs(x)));
				System.out.println(convertToCelsius.apply(-150));
				System.out.println(convertToCelsius.apply(150));
				System.out.println(convertToCelsius.apply(-50));
				System.out.println(convertToCelsius.apply(75));
		}
}
