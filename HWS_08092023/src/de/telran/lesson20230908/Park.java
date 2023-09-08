package de.telran.lesson20230908;

import de.telran.lesson20230901.Cat;

public class Park {


    public static void main(String[] args) {
        Pet pet = new Cat( "Tom", 1);
        pet.feed();
        pet = new Dog("Mikky", 2, "grey");
        pet.feed();
        pet.sayHello();

//        ((Dog) animal).bark(); // possible, but not save
        Dog mikky = new Dog("Mikky", 2, "grey");
        mikky.bark();

        Human human = new Human("Harry");
        Cat cat = new Cat("Murzik", 2);
        Dog dog = new Dog("Sharik", 2, "grey");
        Robot robot = new Robot();
        WildAnimal wildAnimal = new WildAnimal("Marusya", 1);

//        human.play();
//        cat.play();
//        dog.play();
        human.play(cat);
        System.out.println("========================================================");
        //у классов Human и Robot появилась возможность выгуливать домашних животных
        // - метод walk(Pet pet)
        human.walk(cat);
        human.walk(dog);
        robot.walk(cat);
        robot.walk(dog);
        System.out.println("========================================================");
        //дикие животные по-прежнему умели бы играть, их можно было бы кормить, но их
        // нельзя было бы выгуливать
        wildAnimal.sayHello();
        human.play(wildAnimal);
        wildAnimal.play(human);
        wildAnimal.feed();
        human.walk(wildAnimal);//  их нельзя выгуливать
        System.out.println("========================================================");

//        Playable[] arrayOfGamers = {human, cat, dog};
//        allPlay(arrayOfGamers);
        allPlayWithVarArg(human, cat, dog, robot);
    }

    public static void allPlay(Playable[] playables) {
        for (Playable p : playables) {
            p.play();
        }

    }

    public static void allPlayWithVarArg(Playable... playables) {
        for (Playable p : playables) {
            p.play();
        }

    }

}
