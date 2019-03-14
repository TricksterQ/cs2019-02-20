package by.it.Bildziuh.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/


import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }

        sort(array);

        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);

    }

    public static void sort(int[] array) {
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}


