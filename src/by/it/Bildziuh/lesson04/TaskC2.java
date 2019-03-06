package by.it.Bildziuh.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int answer = 0;
        switch (month) {
            case 1:
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 2:
                answer = answer + 31;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 3:
                answer = answer + 59;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 4:
                answer = answer + 90;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 5:
                answer = answer + 120;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 6:
                answer = answer + 151;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 7:
                answer = answer + 181;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 8:
                answer = answer + 212;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 9:
                answer = answer + 243;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 10:
                answer = answer + 273;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 11:
                answer = answer + 304;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
            case 12:
                answer = answer + 334;
                for (int i = 1; i <= day; i++)
                    answer = answer + 1;
                break;
        }
        System.out.println(+answer);
    }
}
