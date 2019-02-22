package by.it.Bildziuh.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("DEC:"+a+"+"+b+"="+c);
        System.out.println("BIN:"+Integer.toBinaryString(a)+"+"+Integer.toBinaryString(b)+"="+Integer.toBinaryString(c));
        System.out.println("HEX:"+Integer.toHexString(a)+"+"+Integer.toHexString(b)+"="+Integer.toHexString(c));
        System.out.println("OCT:"+Integer.toOctalString(a)+"+"+Integer.toOctalString(b)+"="+Integer.toOctalString(c));
    }
}
