package com.mycompany.app;

/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

// import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.mycompany.app.modules.ToyClass;

public class App {
  enum WorkDay {
    MONDAY, TUESDAY, WENDNESDAY
  };

  public static void main(String[] args) {
    /*
     * ========================================
     * CHAPTER 7: Inheritance
     * ========================================
     */
    ToyClass t1 = new ToyClass();
    t1.set("Jhonatan", 3);
    System.out.println(t1.toString());
    System.exit(0);

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
    // ToyClass var1 = new ToyClass("Joe", 42);
    // ToyClass var2 = var1;
    // var2.set("Josephine", 2);
    // System.out.println(var1);

    /*
     * ========================================
     * CHAPTER 4: Classes I
     * ========================================
     */
    // DateFirstTry date2 = new DateFirstTry(
    // 1, 1, 1),
    // date3 = new DateFirstTry();

    Scanner keyboard = new Scanner(System.in);
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

    double sum = 1;
    for (int n = 2; n <= 10; n++) {
      sum += n;
    }

    System.out.print(sum);
    keyboard.close();
  }
}
