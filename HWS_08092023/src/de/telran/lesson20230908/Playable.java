package de.telran.lesson20230908;

import de.telran.lesson20230901.Cat;

public interface Playable {

  void play();

  void play(Playable playable);

   default void play(Playable playable, Pet pet) {
    if (playable.getClass() == Dog.class) {
      System.out.println("Gav-gav!!!");
    } else if (playable.getClass() == Cat.class) {
      System.out.println("The cat runs away!!!");
    } else {
      System.out.println("Play with " + pet);
    }
  }
};
