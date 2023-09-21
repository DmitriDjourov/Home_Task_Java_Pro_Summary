package de.telran.lesson20230908;

public class WildAnimal extends Animal {

  boolean isHungry;
  public WildAnimal(String name, int age){
    super(name, age);
    isHungry = false;
  }

  @Override
  public void sayHello() {
    System.out.println("Kwa - kwaaaa !");
  }

  @Override
  public void play(Playable playable) {
    System.out.println("Wild Animal " + getName() + " plays with " + playable);
  }

  @Override
  public void feed() {
    isHungry = false;
    System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
  }

  @Override
  public String toString() {
    return "Wild Animal " + getName();
  }

}


