package de.telran.lesson20230908;

public abstract class Pet extends Animal {

  // static boolean isHungry;
  public Pet(String name, int age) {
    super(name, age);
    setHungry(false);
  }
 }
