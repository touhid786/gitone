package org.example;

class Main{
    public static void main(String[] args) {
       Addition addition = new Addition();
       Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
       int resultAdd = addition.add(50, 50);
       int resultSub = subtraction.subtract(100,50);
       int reusltMul = multiplication.multiply(10,10);
       System.out.print(resultAdd);
        System.out.println();
       System.out.print(resultSub);
        System.out.println();
        System.out.println(reusltMul);


    }
}