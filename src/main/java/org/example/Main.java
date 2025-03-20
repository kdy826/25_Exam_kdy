package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        int j = 1;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", sum);
            sum = n - j;
            ++j;
        }
    }
}


//continue n = n - 1 ??


