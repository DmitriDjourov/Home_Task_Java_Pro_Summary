package org.example;

import java.util.*;

public class Main {
		public static void main(String[] args) {
//				Составить тестовый список экземпляров данного класса List monkeys и на его основе
				System.out.println("\nСоставить тестовый список экземпляров данного класса List monkeys и на его основе\n");
				Monkey monkey1 = new Monkey("Tom", 3, "черного", false, 50);
				Monkey monkey2 = new Monkey("Bim", 3, "коричневого", true, 10);
				Monkey monkey3 = new Monkey("Bom", 4, "белого", false, 30);
				Monkey monkey4 = new Monkey("Ivan", 2, "черного", true, 40);
				Monkey monkey5 = new Monkey("Tim", 1, "коричневого", false, 20);

				List<Monkey> monkeys = new ArrayList<>();
				monkeys.add(monkey1);
				monkeys.add(monkey2);
				monkeys.add(monkey3);
				monkeys.add(monkey4);
				monkeys.add(monkey5);

				for (Monkey m : monkeys) {
						System.out.println(m);
				}

//				Получить Map имя / информация, голодна ли обезьянка
				System.out.println("\nПолучить Map имя / информация, голодна ли обезьянка\n");
				Map<String, Boolean> mapMonkeyNameIsHungry = new HashMap<>();
				mapMonkeyNameIsHungry.put(monkey1.getName(), monkey1.isHungry());
				mapMonkeyNameIsHungry.put(monkey2.getName(), monkey2.isHungry());
				mapMonkeyNameIsHungry.put(monkey3.getName(), monkey3.isHungry());
				mapMonkeyNameIsHungry.put(monkey4.getName(), monkey4.isHungry());
				mapMonkeyNameIsHungry.put(monkey5.getName(), monkey5.isHungry());

				for (Map.Entry<String, Boolean> map : mapMonkeyNameIsHungry.entrySet()) {
						String status = map.getValue() ? "голодна" : "не голодна";
						System.out.println("Обезьянка по имени : " + map.getKey() + " / " + status);
				}
//				Получить Map цвет / количество обезьян данного цвета
				System.out.println("\nПолучить Map цвет / количество обезьян данного цвета\n");

				Map<String, Integer> colorQuantityMap = new HashMap<>();
				for (Monkey m : monkeys) {
						String color = m.getColor();
						colorQuantityMap.put(color, colorQuantityMap.getOrDefault(color, 0) + 1);
				}
				for (Map.Entry<String, Integer> entry : colorQuantityMap.entrySet()) {
						System.out.println("Обезьяны " + entry.getKey() + " цвета / в количестве : " + entry.getValue() + " штук");
				}

//				Получить Map> цвет / список имен обезьян данного цвета
				System.out.println("\nПолучить Map> цвет / список имен обезьян данного цвета\n");

				Map<String, List<String>> colorMonkeyMap = new HashMap<>();
				for (Monkey m : monkeys) {
						String color = m.getColor();
						String name = m.getName();

						List<String> namesForColor = colorMonkeyMap.getOrDefault(color, new ArrayList<>());
						namesForColor.add(name);

						colorMonkeyMap.put(color, namesForColor);

				}
				for (Map.Entry<String, List<String>> entry : colorMonkeyMap.entrySet()) {
						String color = entry.getKey();
						List<String> names = entry.getValue();

						System.out.println("Обезьяны " + color + " цвета : " + names);
				}

//				Создать компаратор и отсортировать исходный список по весу и имени
				System.out.println("\nСоздать компаратор и отсортировать исходный список по весу и имени\n");

				ComparatorByWeightName comparator = new ComparatorByWeightName();
				System.out.println(" Список до сортировки ");
				for (Monkey m : monkeys) {
						System.out.println(m);
				}

				Collections.sort(monkeys, comparator);
				System.out.println(" Список после сортировки ");
				for (Monkey n : monkeys) {
						System.out.println(n);
				}

		}
}
