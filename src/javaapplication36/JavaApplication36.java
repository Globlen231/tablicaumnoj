/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;
import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
/**
 *
 * @author Slavik
 */
public class JavaApplication36 {
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_RESET = "\u001B[0m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("таблица умножения");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int attempt=0;
        for (int i = 0; i < 5; i++) {
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.print(a + "*" + b + "=");
        int c = scanner.nextInt();
         if (a*b == c) {
             System.out.println(ANSI_GREEN+ "Правильно"+ ANSI_RESET);
             attempt++;
             }else{
             System.err.println("Неправильно");
         }
         System.out.println("Вы ответили правильно на " + attempt+"из 5 правильно");
}    }
   
}