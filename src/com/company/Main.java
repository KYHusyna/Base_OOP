package com.company;

import com.company.Earning.*;
import com.company.Methods.KindMethods;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //inheritance

        Reseller resellerMoney = new Reseller();
        Creator creatorMoney = new Creator();

        Programmer programmerMoney = new Programmer();
        Worker workerMoney = new Worker();

        int[] allSalary = new int[]{resellerMoney.salary(), creatorMoney.salary(),
                programmerMoney.salary(), workerMoney.salary()};

        System.out.println("We have main class: earn money. And children classes " +
                "\nBUSINESS\n");
        resellerMoney.SuccessPath();
        creatorMoney.SuccessPath();

        System.out.println("\nWORK\n");
        workerMoney.SuccessPath();
        programmerMoney.SuccessPath();


        //methods
        KindMethods kindMethods = new KindMethods();
        kindMethods.sumNumber("Sum of salary", allSalary);
        kindMethods.sumNumber(kindMethods.randomArray());

        System.out.println("\n Method take recursion");
        kindMethods.Recur(0);
    }



}
