package org.example;

/**
 * 3. Имеется счет BankAccount, на котором хранится определенная сумма денег int sum.
 * Реализовать потокобезопасный метод пополнения счета - deposit(int amount), снятия со счета - withdraw(int amount).
 */
public class BankAccount {
		private int sum;

		public BankAccount(int sum) {
				this.sum = sum;
		}

		public synchronized void deposit(int amount) {
				if (amount > 0) {
						sum += amount;
						System.out.println("Deposited: " + amount + " New Balance: " + sum);
				} else {
						System.out.println("Invalide deposit amount");
				}
		}

		public synchronized void withdraw(int amount) {
				if (amount > 0 && amount <= sum) {
						sum -= amount;
						System.out.println("Withdraw: " + amount + " New Balance: " + sum);
				} else {
						System.out.println("Invalide withdraw amount");
				}
		}

		public int getBalance() {
				return sum;
		}

		@Override
		public String toString() {
				return "BankAccount{" +
						       "sum=" + sum +
						       '}';
		}
}
