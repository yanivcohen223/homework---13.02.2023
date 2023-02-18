package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //EX3
    public static void greet(){
        System.out.println("good morning!");
    }

    //EX4
    public static void printNum(int num){
        System.out.println(num);
    }

    //EX6
    public static int changeNumber(int num) {
        return num+1;
    }

    //EX7
    public static void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }

    //EX8
    public static void simpleCalc(int num1, int num2, char action){
        if (action == '+') {
            System.out.println(num1 - num2);
        } else if (action == '-'){
            System.out.println( num1 + num2 );
        }
        else {
            throw new IllegalArgumentException("This calculator doesn't know this action");
        }
    }

    //EX9
    public static int sumNum(int num1, int num2, int num3){
        int allNum = num1+num2+num3;
        return allNum/3;
    }

    //EX10
    public static boolean numChecker(int[] numArr, int num){
        for (int number: numArr) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    //EX11
    public static void roundDiv(int num){
        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                System.out.println(i);
            }
        }
    }

    //EX12
    public static void hello(){
        System.out.println("hello");
        world();
    }

    //EX14
    public static void numberType(int num){
        System.out.format("%s is int \n", num);
    }
    public static void numberType(float num){
        System.out.format("%s is float \n", num);
    }
    public static void numberType(double num){
        System.out.format("%s is double \n", num);
    }


    //EX15
    static Scanner sc = new Scanner(System.in);
  //static String str = sc.nextLine();
/*
    public static String getScanner() {
        return str;
    }*/

    //EX16
    public static int randNumArr(int[] numArr){
        int randNum = (int) Math.floor(Math.random()*numArr.length);
        return numArr[randNum];
    }

    //EX17
    public static void string1 (String someString) {
        someString += "@@@";
        string2(someString);
    }
    public static void string2 (String someString) {
        someString += "**";
        string3(someString);

    }
    public static void string3 (String someString) {
        someString += "#";
        System.out.println(someString);
    }


    //EX19
    public static String magicWord = "please";

    public static void printWord(String word){
        System.out.println(word);
    }

    public static void changeWord(String word){
        magicWord = word;
        System.out.println(magicWord);
    }

    //EX20
    public static void multiplyZugi(int[] expArr){
        for (int i = 0; i < expArr.length; i++){
            if (expArr[i]%2 == 0) {
                expArr[i] = expArr[i]*2;
            }
        }
    }

    public static void addOne(int[] expArr){
        int num = expArr.length-1;
        expArr[num] = expArr[num]+1;
    }

    public static void setZero(int[] expArr){
        for (int i = 0; i < expArr.length; i++){
            if (expArr[i]%2 !=0 ) {
                expArr[i] = 0;
            }
        }
    }
    //EX21
    public static void sumNumbers(int number){
    }






    public static void world(){
        System.out.println("world");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        greet();

        printNum(4);
        System.out.println("\n");

        //EX5
        for (int i = 1; i < 11; i++){
            printNum(i);
        }

        int k = 5;
        System.out.println(changeNumber(k));
        System.out.println(k);
        //K will stay with his starting value as long as we
        //determine him.

        //EX7
        multiply(7,5);
        multiply(3,6);
        multiply(5,4);

        //EX8
        //action need to be inserted between ''
        simpleCalc(7, 3, '+');

        simpleCalc(7, 3, '-');

        //simpleCalc(7, 3, '/');

        //EX9
      //System.out.println(sumNum(1, 2, 3));

        //EX10
        int[] numberArr = {1,2,3};
        System.out.println(Arrays.toString(numberArr));
        System.out.println(numChecker(numberArr, 3));
        System.out.println(numChecker(numberArr, 4));

        //EX11
        roundDiv(15);

        //EX12
        hello();

        //EX14
        numberType(14);
        numberType(14.2f);
        numberType(14.3d);

        //EX15
        //im pretty sure I didn't do it right just because I put static on everything
        //System.out.println(getScanner());

        //EX16
        int[] numArr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(randNumArr(numArr));
        //EX17
        String newString = "hello";
        string1(newString);

        //EX19
        printWord(magicWord);
        changeWord("Accio");
        printWord(magicWord);
        //the ward has been changed not only in the function



        //EX20
        int[] arrNum = {2, 6, 7, 8, 34, 16};
        multiplyZugi(arrNum);
        System.out.println(Arrays.toString(arrNum));
        addOne(arrNum);
        System.out.println(Arrays.toString(arrNum));
        setZero(arrNum);
        System.out.println(Arrays.toString(arrNum));
        //yes

        //EX21
        int num = 524;
        System.out.println((int) Math.floor(num/100));

    }
}

//EX1

//EX2
//The first function is main like the first class

//EX13
//when our function does the same action but with different type of numbers or variables
//like double and int

//EX18
//the difference is when we want to use the variable
//if we will determine the variable in the global scope we could use it
//in every function but if we will determine it in a function it wouldn't be
//accessible i