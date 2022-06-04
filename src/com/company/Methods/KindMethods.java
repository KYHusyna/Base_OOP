package com.company.Methods;

import java.util.Random;

public class KindMethods {

   private Random rand = new Random();
   private int size = rand.nextInt(1, 10);

    public void sumNumber(int... numberArr) {
        int sum = 0;
        System.out.print("\n Count numbers: " + numberArr.length + " [ ");

        for (int el : numberArr) {
            System.out.print(el + " ");
            sum += el;
        }
        System.out.println("] \nsum= " + sum);
    }

    public void sumNumber(String text, int... numberArr) {
        int sum = 0;
        System.out.print("\n" + text + "\n Count numbers: " + numberArr.length + " [ ");

        for (int el : numberArr) {
            System.out.print(el + " ");
            sum += el;
        }
        System.out.println("] \nsum= " + sum);
    }

    public int[] randomArray() {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(1, 25);
        }
        return numbers;
    }

    public static void Recur(int recNumb) {
        System.out.println(recNumb);
        if (recNumb < 8)
            Recur(recNumb + 1);
        System.out.println(recNumb);
    }
}
