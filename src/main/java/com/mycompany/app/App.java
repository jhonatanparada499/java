package com.mycompany.app;

/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

// import java.util.Random;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import com.mycompany.app.modules.DiscountSale;
// import com.mycompany.app.exceptions.DivisionByZero;
// import com.mycompany.app.modules.Time;
// import com.mycompany.app.modules.Sale;
// import com.mycompany.app.modules.Sale;
// import com.mycompany.app.modules.Time;

public class App {
  enum WorkDay {
    MONDAY, TUESDAY, WENDNESDAY
  };

  public static void main(String[] args) {
    /*
     * ========================================
     * CHAPTER 10: File I/O
     * ========================================
     */

    Scanner keyboard = new Scanner(System.in);

    System.exit(0);

    /*
     * ========================================
     * CHAPTER 9: Exception Handling Basics
     * ========================================
     */

    int n = 0;
    boolean done = false;

    while (!done) {
      try {
        System.out.print("Enter a whole number: ");
        n = keyboard.nextInt();
        done = true;
      } catch (InputMismatchException e) {
        keyboard.nextLine();
        System.out.println(e.getMessage());
        System.out.println("Try Again");
      }
    }

    System.out.println("You entered " + n);
    keyboard.close();
    System.exit(0);
    /*
     * ========================================
     * CHAPTER 8: Polymorphism and Abstract Classes
     * ========================================
     */
    // Sale s1 = new Sale();
    DiscountSale d1 = new DiscountSale();

    System.out.println(d1);

    /*
     * ========================================
     * CHAPTER 7: Inheritance
     * ========================================
     */
    // Toy t2 = new Toy();
    // Toy t1 = new Toy();
    // set() has default access or package access
    // t1.set("Jhonatan", 3);
    // System.out.println(t1.equals(t2));

    /*
     * ========================================
     * CHAPTER 6: Arrays and Enumerated Types
     * ========================================
     */
    double[][] a = new double[1][];
    // double[] b = new double[1];
    a[0] = new double[1];
    System.out.println(a[0]);

    // WorkDay startDay = WorkDay.MONDAY;
    System.out.println(WorkDay.valueOf("MONDAY"));

    char[] chars = { 'H', 'i', ' ', 'w', 'o', 'r', 'l', 'd' };
    String st = new String(chars, 1, 2);
    System.out.println(st);

    /*
     * ========================================
     * CHAPTER 5: Classes II
     * ========================================
     */
    // Toy var1 = new Toy("Joe", 42);
    // Toy var2 = var1;
    // var2.set("Josephine", 2);
    // System.out.println(var1);

    /*
     * ========================================
     * CHAPTER 4: Classes I
     * ========================================
     */
    // Date date2 = new Date(
    // 1, 1, 1),
    // date3 = new Date();

    // Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a line message");
    String s = keyboard.nextLine();
    System.out.println(s);

    // date2.setDate(1, 1, 1);
    // date3.setDate(2, 1, 1);

    StringTokenizer wordFactory = new StringTokenizer(
        "Give a message, friend.", " ");

    while (wordFactory.hasMoreTokens()) {
      System.out.println(wordFactory.nextToken());
    }

    System.exit(0);

    // double sum = 1;
    // for (int n = 2; n <= 10; n++) {
    // sum += n;
    // }

    // System.out.print(sum);
    keyboard.close();
  }
}
