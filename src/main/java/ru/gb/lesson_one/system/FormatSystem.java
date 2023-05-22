package ru.gb.lesson_one.system;


/**
 *  Класс, который приводить программе эстетический вид.
 */

public class FormatSystem {
    public static String format(int x) {
        /*
         -  Метод приводит результат мат.действия в формат строк
         */

        return String.format("Answer is : %d",x);
    }

}
