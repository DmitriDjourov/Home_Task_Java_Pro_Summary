package org.example;

import java.util.Scanner;

/**
 * Описание задания:
 * 1. Арбалет. См. класс Crossbow в репозитории.
 * 2. Стрелок robinHood в одном потоке стреляет из арбалета,vего помощник servant в другом потоке приносит ему колчан,
 * когда стрелы закончатся.
 * 3. Заготовка логики в классе Crossbow. Доработать логику, чтобы:
 * 1. стрельба продолжалась бесконечно.
 * 2. количество приносимых стрел каждый раз определял бы пользователь, вводя число arrows через консоль
 */

public class Crossbow {

		private int arrows = 0; // Start with 0 arrows

		// When the arrows end, the wait() method is called and releases.
		synchronized public void fire() {
				while (true) {
						if (arrows > 0) {
								System.out.println("The arrow is " + (arrows) + " right on the target!");
								arrows--;
						} else {
								System.out.println("The arrows are over");
								try {
										wait();
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
								System.out.println("Carry a new quiver with arrows!!");
						}
						try {
								Thread.sleep(1000);
						} catch (InterruptedException e) {
								e.printStackTrace();
						}
				}
		}

		// reload() brings new arrows, calls the notify() method, which awakens the thread
		synchronized public void reload(int newArrows) {
				System.out.println("New arrows on the way: " + newArrows);
				arrows = newArrows;
				notify();
		}

		public static void main(String[] args) {

				Crossbow crossbow = new Crossbow();

				Thread robinHood = new Thread(() -> {
						crossbow.fire();
				});

				Thread servant = new Thread(() -> {
						Scanner scanner = new Scanner(System.in);
						while (true) {
								System.out.println("Enter the number of arrows to reload: ");
								int newArrows = scanner.nextInt();
								crossbow.reload(newArrows);
						}
				});

				robinHood.start();
				servant.start();

				try {
						robinHood.join(); // Wait for robinHood thread to finish (which is never)
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
		}
}
/**
 *  метод fire будет продолжать стрелять стрелами бесконечно, а метод reload теперь принимает аргумент для количества
 *  новых добавляемых стрел. Поток-слуга изменен, чтобы постоянно запрашивать у пользователя количество стрелок для
 *  перезагрузки. Метод join используется для ожидания завершения потока robinHood (чего никогда не происходит,
 *  поскольку это бесконечный цикл).
 */
