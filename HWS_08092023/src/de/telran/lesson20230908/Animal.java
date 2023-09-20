package de.telran.lesson20230908;

import java.util.Objects;

public abstract class Animal implements Playable {
    @lombok.Getter
    private String name;
    @lombok.Getter
    private int age;
    private boolean isHungry;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (isHungry != animal.isHungry) return false;
        return Objects.equals(name, animal.name);
    }

    public Animal() {
    }

    public Animal(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void feed(){
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " is not hungry");
    }

    public abstract void sayHello();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
//        name != null ? name.hashCode() : 0 - это условное выражение (тернарный оператор).
//        Оно проверяет, если name не равно null, то выполняется вызов name.hashCode(),
//        в противном случае, если name равно null, присваивается значение 0.
//        Таким образом, если name содержит строку, то будет вычислен ее хеш-код, а если name
//        равно null, то хеш-код будет равен 0.
        result = 31 * result + age;
        result = 31 * result + (isHungry ? 1 : 0);
//        (isHungry ? 1 : 0) - это условное выражение (тернарный оператор), которое
//        преобразует логическое значение isHungry в 1 (если объект голоден)
//        или 0 (если объект не голоден)
        return result;
    }

    @Override
    public void play() {
        System.out.println("Animal " + name + "plays");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

