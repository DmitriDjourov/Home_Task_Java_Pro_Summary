package de.telran.lesson20230908;

import de.telran.lesson20230901.Cat;

import java.util.Objects;

public class Dog extends Pet {

    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void bark() {
        System.out.println("Gav-gav!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sayHello() {
        System.out.println("Gav-gav!");
    }

    @Override
    public void play(Playable playable) {
        if (playable.getClass() == Cat.class) {
            System.out.println("The dog sees the cat! Gav-gav!!!");
        } else {
            System.out.println("Dog plays with " + playable);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (!this.getName().equals(dog.getName()) || this.getAge() != dog.getAge() || this.isHungry() != dog.isHungry())
            return false;

        return Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return " Dog ";
    }
}
