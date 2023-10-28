package org.example;

public class Main {
		public static void main(String[] args) {
				boolean result1 = Validator.checkLoginAndPass("john", "123", "123");
				System.out.println(result1);  // Вернет true

				boolean result2 = Validator.checkLoginAndPass("john", "123", "1234");
				System.out.println(result2);  // Вернет false

				boolean result3 = Validator.checkLoginAndPass("john", "123@", "123@");
				System.out.println(result3);  // Вернет false

				boolean result4 = Validator.checkLoginAndPass("john@", "123", "123");
				System.out.println(result4);  // Вернет false
		}


}




