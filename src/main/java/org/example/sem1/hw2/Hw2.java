package org.example.sem1.hw2;
// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример ввода:
// 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        int posNum = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                posNum = num;
            }
            if (num < 0 && posNum != 0) {
                summ += posNum;
                posNum = 0;
            }
        }

        System.out.println("Сумма положительных чисел, после которых следует отрицательное число: " + summ);
    }
}