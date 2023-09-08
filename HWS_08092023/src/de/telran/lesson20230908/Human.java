package de.telran.lesson20230908;

public class Human implements Playable, Walkable {

  private String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("Human " + name + " plays");
  }

  @Override
  public void play(Playable playable) {
    System.out.println("Human " + name + " plays with " + playable);
  }

  @Override
  public void walk() {
    System.out.println("Human walking a pet");
  }

  @Override
  public void walk(Pet pet) {
    if (pet.getClass() == WildAnimal.class) {
      System.out.println("Sorry, " + name + ", but you can't walk a wild animal.");
    } else {
      System.out.println("Human walking " + pet);
    }
  }

  @Override
  public String toString() {
    return "Human " + name;
  }
}
