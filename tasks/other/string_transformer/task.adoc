# String Transformer: ProcessStrings

## Описание

Дан `ArrayList<String>` из слов.
Задача — создать функциональный интерфейс `StringTransformer` с методом `String transform(String text)`,
написать метод `processStrings`, который изменяет каждый элемент списка **на месте** (через `set`).

В `Main` через lambda привести все слова к **верхнему регистру**.

Исходный список: `["java", "lambda", "interface"]`

## Запуск

```java
Main.main(args)
// Вывод: [JAVA, LAMBDA, INTERFACE]
```
