package com.mycompany.app;

/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Collections;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

import com.mycompany.app.interfaces.MonthNumbers;
// import com.mycompany.app.modules.BankAccount;
import com.mycompany.app.modules.DiscountSale;
// import com.mycompany.app.exceptions.DivisionByZero;
// import com.mycompany.app.modules.Time;
// import com.mycompany.app.modules.Sale;
// import com.mycompany.app.modules.Sale;
// import com.mycompany.app.modules.Time;
import com.mycompany.app.modules.Toy;

public class App implements MonthNumbers {
  enum WorkDay {
    MONDAY, TUESDAY, WENDNESDAY
  };

  public static void main(String[] args) {

    /*
     * ========================================
     * CHAPTER 16: Collections
     * ========================================
     */

    HashMap<String, Integer> database = new HashMap<>();
    database.put("Jhon", 1);
    System.out.println(database.get("Jhon").toString());
    System.exit(0);

    /*
     * ========================================
     * CHAPTER 14: Generics and the ArrayList Class
     * ========================================
     */

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      double random = (Math.random() * 100) + 1;
      int intRandom = (int) random;
      list.add(intRandom);
    }
    Collections.sort(list);
    System.out.println(list);

    Toy t1 = new Toy("Chucky", 1);

    DiscountSale d1 = new DiscountSale(1.3489532);
    System.out.println(d1);
    System.exit(0);

    ArrayList<String> myList = new ArrayList<>(5);
    myList.add("One");
    myList.add("Two");
    myList.add("Three");
    myList.add("Four");
    myList.add(0, "Zero");

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.exit(0);
    /*
     * ========================================
     * CHAPTER 13: Interfaces and Inner Classes
     * ========================================
     */

    // System.out.println(JANUARY);
    // BankAccount.Money balance = new BankAccount().new Money();
    // BankAccount.StaticMoney balance2 = new BankAccount.StaticMoney();

    System.exit(0);

    /*
     * ========================================
     * CHAPTER 10: File I/O
     * ========================================
     */

    Scanner keyboard = new Scanner(System.in);
    Scanner inputStream = null;
    PrintWriter outputStream = null;
    ObjectOutputStream outputStream2 = null;

    try {
      outputStream2 = new ObjectOutputStream(new FileOutputStream("numbers.dat"));
      outputStream2.writeInt(83);
      outputStream2.close();
    } catch (Exception e) {
      System.out.println(e);
    }

    System.exit(0);

    try {
      inputStream = new Scanner(new FileInputStream("morestuff.txt"));
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    List<Integer> numbers = new ArrayList<>();

    int count = 0;
    while (inputStream.hasNext()) {
      if (inputStream.hasNextInt()) {
        numbers.add(inputStream.nextInt());
        count++;
      } else {
        inputStream.next();
      }
    }
    System.out.println(count);

    System.out.print("Numbers found: ");
    for (int i : numbers) {
      System.out.print(i + ", ");
    }
    System.out.println();

    System.exit(0);

    try {
      outputStream = new PrintWriter(new FileOutputStream("foo.txt"));
    } catch (Exception e) {
      System.out.println(e);
      System.exit(0);
    }

    inputStream.close();
    outputStream.close();
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
    // DiscountSale d1 = new DiscountSale();

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
