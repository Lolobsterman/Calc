package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        System.out.println(PolskiWpis.ExpressionRPN(expression));
        System.out.println(PolskiWpis.RPNtoAnswer(PolskiWpis.ExpressionRPN(expression)));
    }
}
