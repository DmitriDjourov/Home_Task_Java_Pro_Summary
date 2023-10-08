# Home_Task_Java_Pro_Summary
# **[HWS_08092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/tree/main/HWS_08092023)**
## * 1 уровень сложности: 
> ## 1. Доработать систему классов, созданных на уроке (см. код в репозитории https://github.com/IliaIliukovich/summary300523-m-be), так чтобы:
> ### *     появилось новое понятие [домашнее животное Pet](HWS_08092023/src/de/telran/lesson20230908/Pet.java)
> ### *     [Dog](HWS_08092023/src/de/telran/lesson20230908/Dog.java) и [Cat](HWS_08092023/src/de/telran/lesson20230901/Cat.java) были бы наследниками Pet
> ### *     у классов [Human](HWS_08092023/src/de/telran/lesson20230908/Human.java) и [Robot](HWS_08092023/src/de/telran/lesson20230908/Robot.java) появилась [возможность выгуливать домашних животных - метод walk(Pet pet)](HWS_08092023/src/de/telran/lesson20230908/Walkable.java)
> ### *     [дикие животные по-прежнему умели бы играть, их можно было бы кормить](HWS_08092023/src/de/telran/lesson20230908/WildAnimal.java), но их [нельзя было бы выгуливать](HWS_08092023/src/de/telran/lesson20230908/WildAnimal.java)

> ## 2. Доработать методы play() так, чтобы при попытке игры кошек с собаками:
> ### *     [dog.play(cat) - собака бы лаяла на кошку](HWS_08092023/src/de/telran/lesson20230908/Dog.java)
> ### *     [cat.play(dog) - кошка бы убегала](HWS_08092023/src/de/telran/lesson20230901/Cat.java)

# **[HWS_29092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/tree/main/HWS_29092023/src/main/java/org/example)**
## * 1 уровень сложности: 
> ## [Имеется класс Monkey c полями](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_29092023/src/main/java/org/example/Monkey.java):
> ## public class Monkey {
> ## private String name;
> ## private int age;
> ## private String colour;
> ## private boolean isHungry;
> ## private double weight;
> ## }
>> ## [Составить тестовый список экземпляров данного класса List monkeys и на его основе](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/461139863c80ff139e0f95583e50a4d178469879/HWS_29092023/src/main/java/org/example/Main.java#L7)
>> ## [Получить Map имя / информация, голодна ли обезьянка](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/461139863c80ff139e0f95583e50a4d178469879/HWS_29092023/src/main/java/org/example/Main.java#L26)
>> ## [Получить Map цвет / количество обезьян данного цвета](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/461139863c80ff139e0f95583e50a4d178469879/HWS_29092023/src/main/java/org/example/Main.java#L39)
>> ## [Получить Map> цвет / список имен обезьян данного цвета](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/461139863c80ff139e0f95583e50a4d178469879/HWS_29092023/src/main/java/org/example/Main.java#L51)
>> ## [Создать компаратор и отсортировать исходный список по весу и имени](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_29092023/src/main/java/org/example/ComparatorByWeightName.java)

# **[HWS_08102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/tree/main/HWS_08102023/src/main/java/org/example)**
## * 1 уровень сложности:

>> ## 1. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.

>> ## 2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.

>> ## 3. Cоздать Predicate isYellowMonkey, который проверяет, желтого ли цвета обезьянка Monkey.

>> ## 4*.Создать с помощью методов Function .compose() и .andThen() функцию convertToCelsius, которая:

> ###  - заменяет исходное число типа Integer на его строковое представление, добавляя в строковом
> ###    представлении перед числом его знак (+ или -)

> ###  - добавляет после числа текст "degrees Celsius"

> ###     - ограничивает значения числа значениями +/- 100, выдавая граничные значения при превышении диапазона
> ###       convertToCelsius.apply(-150) вернет "-100 degrees Celsius"
> ###       convertToCelsius.apply(150) вернет "+100 degrees Celsius"