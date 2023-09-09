package de.telran.lesson20230908;

public class Robot implements Playable, Workable, Walkable {

  @Override
  public void play() {
    System.out.println("Robot plays");

  }

  @Override
  public void play(Playable playable) {
    System.out.println("Robot plays with " + playable);
  }

  @Override
  public void work() {
    System.out.println("Robot works");
  }

  @Override
  public void walk() {
    System.out.println("Robot walking a pet");
  }

  @Override
  public void walk(Pet pet) {
    if (pet.getClass() == WildAnimal.class) {
      System.out.println("Sorry, Robot, but you can't walk a wild animal.");
    } else {
      System.out.println("Robot walking " + pet);
    }
  }

  @Override
  public String toString() {
    return "Robot";
  }
}
