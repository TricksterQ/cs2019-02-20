package by.it.Bildziuh.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        int raw;
        int column;
        for (raw = 2; raw <= 10; raw++) {
            for (column = 2; column <= 10; column++) {
                switch (column) {
                    case 2:
                        System.out.println("два умножить на " + raw + " равно " + raw * column);
                        break;
                    case 3:
                        System.out.println("три умножить на " + raw + " равно " + raw * column);
                        break;
                    case 4:
                        System.out.println("четыре умножить на " + raw + " равно " + raw * column);
                        break;
                    case 5:
                        System.out.println("пять умножить на " + raw + " равно " + raw * column);
                        break;
                    case 6:
                        System.out.println("шесть умножить на " + raw + " равно " + raw * column);
                        break;
                    case 7:
                        System.out.println("семь умножить на " + raw + " равно " + raw * column);
                        break;
                    case 8:
                        System.out.println("восемь умножить на " + raw + " равно " + raw * column);
                        break;
                    case 9:
                        System.out.println("девять умножить на " + raw + " равно " + raw * column);
                        break;
                    case 10:
                        System.out.println("десять умножить на " + raw + " равно " + raw * column);
                        break;
                }

            }
        }
    }
}
