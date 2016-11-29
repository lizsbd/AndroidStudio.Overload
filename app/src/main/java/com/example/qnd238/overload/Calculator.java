package com.example.qnd238.overload;

import java.util.ArrayList;

/**
 * Created by qnd238 on 11/29/2016.
 */

public class Calculator {
    private ArrayList<Double> doubledata;
    private  static double sumdouble, averagedouble, productdouble, first, second;
    private static int factorial;


    private ArrayList<Integer> intdata;



    public static double sum(ArrayList<Double> doubledata){
        for( double num : doubledata) {
            sumdouble= sumdouble + num;
        }
        return sumdouble;
    }

    public static double sum(double first, double second){
        return first + second;
    }

    public static double average(ArrayList<Double> doubledata){
        for( double num : doubledata) {
            sumdouble= sumdouble + num;
        }
        int number = doubledata.size();
        return averagedouble = sumdouble/number;
    }
    public static double average(double first, double second ){
        return (first + second)/2;
    }
    public static double product(ArrayList<Double> doubledata){
        for( double num : doubledata) {
            productdouble= productdouble*num;
        }
        return productdouble;
    }
    public static double product(double first, double second){
     return first*second;
    }
    public static int factorial(int input){
        int counter = 1;
        while(counter <= input){
            factorial = factorial*counter;
        }
        return factorial;
    }
}
