package com.kodilla;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.someMethod();
        calculator.addingNumbers();
        calculator.subtractionNumbers();
    }
    public void addingNumbers() {
        System.out.println("This method add numbers");
    }
    public void subtractionNumbers(){
        System.out.println("This method subtract numbers");
    }
    public void someMethod() {
        System.out.println("It works!");
    }
}
