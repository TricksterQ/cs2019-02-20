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
 /*           switch (raw) {
                case 2:
                    System.out.print("Два");
                    break;
                case 3:
                    System.out.print("Три");
                    break;
                case 4:
                    System.out.print("Четыре");
                    break;
                case 5:
                    System.out.print("Пять");
                    break;
                case 6:
                    System.out.print("Шесть");
                    break;
                case 7:
                    System.out.print("Семь");
                    break;
                case 8:
                    System.out.print("Восемь");
                    break;
                case 9:
                    System.out.print("Девять");
                    break;
                case 10:
                    System.out.print("Десять");
                    break;
            }
            */
            for (column = 2; column <= 10; column++) {
                switch (column) {
                    case 2:
                        System.out.println(+raw +" умножить на два равно " + raw * column);
                        break;
                    case 3:
                        System.out.println(+raw +" умножить на три равно " + raw * column);
                        break;
                    case 4:
                        System.out.println(+raw +" умножить на четыре равно " + raw * column);
                        break;
                    case 5:
                        System.out.println(+raw +" умножить на пять равно " + raw * column);
                        break;
                    case 6:
                        System.out.println(+raw +" умножить на шесть равно " + raw * column);
                        break;
                    case 7:
                        System.out.println(+raw +" умножить на семь равно " + raw * column);
                        break;
                    case 8:
                        System.out.println(+raw +" умножить на восемь равно " + raw * column);
                        break;
                    case 9:
                        System.out.println(+raw +" умножить на девять равно " + raw * column);
                        break;
                    case 10:
                        System.out.println(+raw +" умножить на десять равно " + raw * column);
                        break;
                }

            }
        }
    }
}
