package by.it.Bildziuh.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        int rest;
        rest = number % 10;
        sum = sum + rest; // sum = 7

        number = number / 10; //num = 546
        rest = number % 10;
        sum = sum + rest;  // sum = 13

        number = number / 10; // num = 54
        rest = number % 10; //ostatok = 4
        sum = sum + rest;// sum = 17

        sum = sum + number/10;

        return sum;
    }
}