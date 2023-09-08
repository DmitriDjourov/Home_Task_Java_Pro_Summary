# Home_Task_Java_Pro

# **Описание задания.**

## **[HW_28082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_28082023)**
## * 1 уровень сложности: 
> ##  1. [Найти среднее арифметическое положительных элементов массива.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumPositivArrayElement.java)
> ##  2. [Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfAllElemDiv3notSimDiv5.java)
> ##  3. [Найти в массиве наибольшую сумму подряд идущих элементов.n](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfConsElem.java)

## **[HW_30082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_30082023)**
## * 1 уровень сложности: 
**Цель: Создать программу для управления списком товаров в интернет-магазине**

>1. Enums:
>> ## 1.1. [ProductCategory - Перечисление для представления категорий товаров в магазине:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ProductCategory.java)
>> ## 1.2. [Size - Перечисление для представления размеров одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Size.java)
>> ## [1.3. Currency - Перечисление для представления валют для цен товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)

>2. Классы:
>> ## [2.1. Product - Класс для представления товара:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)
**Поля:**
* id (уникальный идентификатор товара)
* name (имя товара)
* category (категория товара из ProductCategory)
* price (цена товара)
* currency (валюта цены из Currency)
* Конструктор для   полей.

>> ## [2.2. Clothing - Подкласс класса Product для представления одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Clothing.java)
* Дополнительное поле size (размер одежды из Size).
* Конструктор для инициализации полей.

>> ## [2.3. ShopManager - Класс для управления списком товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ShopManager.java)

* Поле products (массив товаров).
* Метод addProduct(Product product) для добавления товара в список.
* Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
* Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
* заданном диапазоне цен и в указанной валюте.
