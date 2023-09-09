package de.telran.lesson20230908;

public class WildAnimal extends Pet {
  public WildAnimal(String name, int age) {
    super(name, age);
  }

  @Override
  public void sayHello() {
    System.out.println("Kwa - kwaaaa !");
  }

  @Override
  public void play(Playable playable) {
    System.out.println("Wild animal plays with " + playable);
  }

  @Override
  public void feed() {
    isHungry = false;
    System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
  }

  @Override
  public String toString() {
    return "WildAnimal " + getName();
  }
}
