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


        for (int raw = 2; raw <= 10; raw++)
            for (int column = 2; column <= 10; column++)
                System.out.println(string(raw) + " умножить на " + string(column) + " равно " + string(raw * column));

    }

    private static String string(int i) {
        String[] units = {
                "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
                "девять", "десять", "одинадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {
                "ноль", "десять", "двадцать", "тридцать", "сорок", "пятьдесят",
                "шестьдесят", "семьдесят", "восемьдесят", "девяносто", "сто"};

        if (i < 20)
            return units[i];
        int d = i / 10;
        int m = i % 10;
        if (m == 0)
            return tens[d];
        else
            return tens[d] + " " + units[m];
    }
}


