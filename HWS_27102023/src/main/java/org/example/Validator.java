package org.example;

public class Validator {
		public static boolean checkLoginAndPass(String login, String password, String confirmPassword) {
				try {
						if (login.length() >= 20 || !login.matches("^[a-zA-Z0-9_]*$")) {
								throw new WrongLoginException("Login is not valid");
						}

						if (password.length() >= 20 || !password.matches("^[a-zA-Z0-9_]*$") || !password.equals(confirmPassword)) {
								throw new WrongPasswordException("Password is not valid");
						}

						return true;
				} catch (WrongLoginException | WrongPasswordException e) {
						System.out.println("Exception: " + e.getMessage());
						return false;
				}
		}
}

class WrongLoginException extends Exception {
		public WrongLoginException() {
				super("Wrong login format");
		}

		public WrongLoginException(String message) {
				super(message);
		}
}

class WrongPasswordException extends Exception {
		public WrongPasswordException() {
				super("Wrong password format");
		}

		public WrongPasswordException(String message) {
				super(message);
		}
}




