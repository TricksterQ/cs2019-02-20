package by.it.Bildziuh.lesson05;



/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        for (; ; ) {
            String value = scanner.next();
            if (value.equals("END"))
                break;
            list.add(value);
        }
        System.out.println(list);
    }
}
