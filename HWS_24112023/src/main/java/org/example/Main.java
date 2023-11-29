package org.example;

/**
 * 3. Имеется счет BankAccount, на котором хранится определенная сумма денег int sum.
 * Реализовать потокобезопасный метод пополнения счета - deposit(int amount), снятия со счета - withdraw(int amount).
 */
public class Main {
		public static void main(String[] args) {
				BankAccount account = new BankAccount(1000);

				// Пример использования методов BankAccount в многопоточной среде
				Thread depositThread = new Thread(() -> {
						for (int i = 0; i < 5; i++) {
								account.deposit(100);
								try {
										Thread.sleep(100);// Имитируем некоторое время обработки

								} catch (InterruptedException e) {
										throw new RuntimeException(e);
								}
						}
				});

				Thread withdrawThread = new Thread(() -> {
						for (int i = 0; i < 5; i++) {
								account.withdraw(50);
								try {
										Thread.sleep(150);
								} catch (InterruptedException e) {
										throw new RuntimeException(e);
								}
						}
				});
				depositThread.start();
				withdrawThread.start();

				try {
						depositThread.join();
						withdrawThread.join();
				} catch (InterruptedException e) {
						throw new RuntimeException(e);
				}
				System.out.println("Final Balance: " + account.getBalance());
		}
}