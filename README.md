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
>
# **[HWS_20102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_20102023/taski.txt)**
>
##  1 уровень сложности: [Переписать фрагменты кода с применением стримов](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_20102023/taski.txt):
> 
- 1)

  public static void feed(List catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
    }

- 2)
    public static int getSum(List integers) {
        int oddSum = 0;
        for(Integer i: integers) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }

- 3)

    public static Map> getMap() {
        Map> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                    map.get(true).add(i);
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                    map.get(false).add(i);
                }
            }
        }
        return map;
    }

- 4) Код в классе de.telran.lesson20230929.Dictionary (см. репозиторий)
  -  Ответ в классе [Dictionary](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_20102023/src/main/java/org/example/Dictionary.java)

# **[HWS_27102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/tree/main/HWS_27102023/src/main/java/org/example)**
## * 1 уровень сложности: Exceptions. Проверка логина и пароля

[Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов.
Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_27102023/src/main/java/org/example/Validator.java)

[WrongPasswordException](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/7736af8cf89232317eed4938458e43b895f1ac1a/HWS_27102023/src/main/java/org/example/Validator.java#L32) и [WrongLoginException](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/7736af8cf89232317eed4938458e43b895f1ac1a/HWS_27102023/src/main/java/org/example/Validator.java#L22) - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится внутри метода.
Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.
[Пример вызова метода:
checkLoginAndPassword(john, 123, 123) --> true
checkLoginAndPassword(john, 123, 1234) --> false
checkLoginAndPassword(john, 123@, 123@) --> false
checkLoginAndPassword(john@, 123, 123) --> false](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_27102023/src/main/java/org/example/Main.java)


# **[HWS_10112023](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_10112023/src/main/java/org/example/Main.java)**
## * 1 уровень сложности:
Написать [метод T[] filter(T[] t, Filter filter)](https://github.com/DmitriDjourov/Home_Task_Java_Pro_Summary/blob/main/HWS_10112023/src/main/java/org/example/Main.java), который принимает на вход массив (любого типа) и
производит фильтрацию данных согласно реализации интерфейса Filter (например, через лямбда-выражение)
Интерфейс Filter имеет метод apply (T t), с помощью которого можно будет указывать способ фильтрации.
interface Filter {
boolean apply(T t);
}
Проверьте как работает метод на строках или других объектах.

Пример применения:
String[] filtered = filter(new String[]{"One", "Two", "Three"}, o1 -> o1.length() == 3);
Integer[] filteredInts = filter(new Integer[]{0, 1, 2, 3, 4, 5}, i -> (i % 2 == 0));
либо:

Integer[] filteredInts = filter(new Integer[]{0, 1, 2, 3, 4, 5}, new Filter() {
@Override
public boolean apply(Integer i) {
return (i % 2 == 0);
}
});
