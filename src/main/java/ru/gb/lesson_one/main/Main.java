package ru.gb.lesson_one.main;

import ru.gb.lesson_one.system.FormatSystem;
import ru.gb.lesson_one.system.BasicMathSystem;

public class Main {
    public static void main(String[] args) {
        int result = BasicMathSystem.add(2, 5);
        print(result);
    }

    public static void print(int x) {
        System.out.println(FormatSystem.format(x));
    }

}
