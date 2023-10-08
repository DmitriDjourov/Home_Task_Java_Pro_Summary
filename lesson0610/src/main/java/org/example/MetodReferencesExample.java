package org.example;

import java.util.function.Consumer;

public class MetodReferencesExample {
		public static void main(String... args) {
				 //Consumer<String> consumer = (s) -> MetodReferencesExample.doSomething(s);
				// to je samoe
				Consumer<String> consumer = MetodReferencesExample::doSomething;

				MetodReferencesExample examples = new MetodReferencesExample();

				Consumer<String> consumer2 = examples::doSomethingNonStatic;
				Consumer<String> consumer3 = consumer2.andThen(System.out::println);
				// to je samoe v odnu stroku: Refactor --> Inline Variable
				// Consumer<String> consumerFinel = ((Consumer<String>) examples::doSomethingNonStatic)
				//                                      .andThen(System.err::println)
				//                                          .andThen(System.out::println);

				consumer.accept(" !");
				consumer2.accept(" !!!");
		}
		static void doSomething(String s){
				System.out.println("doing something with " + s);
		}		void doSomethingNonStatic(String s){
				System.out.println("doing something NonStatic with " + s);
		}
}
