package com.mycompany.app.modules;

/**
 * @author Jhonatan Parada Torres <jhonatanparada499@gmail.com>
 */

// import java.util.Scanner;

public class DateFirstTry {
  private static int turn = 0;

  private String month;
  private int day;
  private int year;

  public DateFirstTry() {
    setDate(1, 1, 1);
  }

  public DateFirstTry(int theMonth, int theDay, int theYear) {
    setDate(theMonth, theDay, theYear);
  }

  public static int getTurn() {
    return ++turn;
  }

  public static int maximum(int n1, int n2) {
    return n1 > n2 ? n1 : n2;
  }

  public void setDate(int month, int day, int year) {
    ToyClass t1 = new ToyClass();
    t1.set("JHon", 2);
    this.month = setMonth(month);
    this.day = day;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getYear() {
    return year;
  }

  public int getNextYear() {
    return year + 1;
  }

  public String setMonth(int monthNumber) {
    switch (monthNumber) {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "Octuber";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        System.out.println("Fatal error");
        System.exit(0);
        return "Error";
    }
  }

  public String getMonth() {
    return month;
  }

  public String toString() {
    return this.month + " " + this.day + ", " + this.year;
  }

  public boolean equals(DateFirstTry otherDate) {
    return this.toString() == otherDate.toString();
  }

  public boolean precedes(DateFirstTry otherDate) {
    return this.year <= otherDate.year
        || otherDate.day <= this.day
        || otherDate.year <= this.year;
  }
}
