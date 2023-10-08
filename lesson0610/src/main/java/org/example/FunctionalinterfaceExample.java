package org.example;

import java.util.Random;
import java.util.function.*;

public class FunctionalinterfaceExample {
		public static void main(String[] args) {


		//void -> data //Supplier get
		Supplier<Integer>  randomGenerator = () -> {
				Random random = new Random();
				return random.nextInt();
		};

		Supplier<Integer> newRandomGenDiapazon = () -> {
				Random random = new Random();
				return random.nextInt(0, 100);

		};
				System.out.println(randomGenerator.get());
				System.out.println(randomGenerator.get());
				System.out.println(randomGenerator.get());

				System.out.println(newRandomGenDiapazon.get());
				System.out.println(newRandomGenDiapazon.get());
				System.out.println(newRandomGenDiapazon.get());

				// date -> void --- Consuner accept
				//Consumer<String> printData =  (s) -> System.out.println(s);
				// eto je virajenie tolko v bolee lakonichnoy forme
				Consumer<String> printData = System.out::println;
				printData.accept("Data 1");
				printData.accept("Data 2");

		// data1 -> data2  -- Function / UnaryOperator(one type of input-output) --apply
				Function<Double,Double> multiplayTo100 = (x ) -> x*100;
				System.out.println(multiplayTo100.apply(10.0));
				// (data1,data2) -> data3 BiFunction / BinaryOperator(one type of input-output) -- apply
				BiFunction<Double,Double,Double> multiplay = (x,y) -> x * y;
				System.out.println(multiplay.apply(20.0, 100.0));
				// data -> boolean Predicate -- test
				Predicate<String> isLongEnough = (s) -> s.length() > 5;
				System.out.println(isLongEnough.test("Hello!"));
				System.out.println(isLongEnough.test("Hi!"));

				Function<String,String> processString = (s) -> s.substring(6,11);
				// Function<String, String> BeforFunction = (v) -> v.toUpperCase();
				// to je samoe cherez referens
				Function<String,String> BeforFunction = String::toUpperCase;

				Function<String,String> processString2 = processString.compose(BeforFunction);
				Function<String,String> afterFunction = (p) -> "====================" + p + "====================";
				Function<String,String> processString3 = processString2.andThen(afterFunction);
				String result = processString3.apply("Hello world!");
				System.out.println(result);
				//========== obedenyaem virajeniya ===============
				Function<String,String> finalFunction = processString.compose(BeforFunction).andThen(afterFunction);
				result = finalFunction.apply("Hello world!!!");
				System.out.println(result);
				//============= pishem odnoy strokoy ===========
				Function<String,String> oneFunction = (p) -> {
						String result1 = p.toUpperCase().substring(6,11);
						       result1 = "====================" + result1 + "====================";
						return   result1;
				};
				System.out.println(oneFunction.apply("Hello world !!!"));
				//===========================================
// (data1,data2) -> data3 BiFunction / BinaryOperator(one type of input-output) -- apply
				BiFunction<Integer,Integer,Integer> stepen = (x,y) -> (int)Math.pow(x,y);
				System.out.println(stepen.apply(2, 3));
		}
}