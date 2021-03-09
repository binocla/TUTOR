package binocla;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TODO idea prinadlezhit Ildar'u

        ArrayList<String> stringArrayList = new ArrayList<>();
        int indexOfBegin = 0; // Будем считать наш первый BEGIN
        int indexOfEnd = 0; // Будем считать наш ПОСЛЕДНИЙ END
        int cnt = 0; // Счетчик индекса
        while (true) {
            String s = in.nextLine(); // ввод
            if (s.equals("BEGIN") && !stringArrayList.contains("BEGIN")) { // если ВВЕДЕННАЯ строка == BEGIN И до этого в нашем Листе строк не было BEGIN
                indexOfBegin = cnt; // Индекс Бегина (то есть он первый) => cnt
            }
            stringArrayList.add(s); // Добавляем в наш Лист строк введенную строку
            if (s.equals("END")) {
                indexOfEnd = cnt; // Индекс ПОСЛЕДНЕГО (!) END'a
            }
            if (s.equals("FINISH")) { // Если финиш - выход
                break;
            }
            cnt++; // увеличиваем счетчик
        }
         /*
        while (!s.equals("FINISH")) {
            s = in.nextLine();
            if ((s.equals("END") || s.equals("FINISH")) && !stringArrayList.contains("BEGIN")) {
                flag = false;
            }
            if (flag) {
                stringArrayList.add(s);
            }
            if (s.equals("BEGIN")) {
                stringArrayList.add(s);
                flag = true;
            }
        }
         */

        for (int i = indexOfEnd - 1; i > indexOfBegin; i--) { // Вывод в обратном порядке ОТ ПОСЛЕДНЕГО END'a до первого BEGIN'a
            System.out.println(stringArrayList.get(i)); // по i-тому элементу выводим строку
        }

    }
}
