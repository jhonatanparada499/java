package com.mycompany.app.modules;

/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

public class ToyClass {
  private String name;
  private int number;

  public ToyClass(String initialName, int initialNumber) {
    name = initialName;
    number = initialNumber;
  }

  public ToyClass(ToyClass toy) {
    name = toy.name;
    number = toy.number;
  }

  public ToyClass() {
    this("No name yet", 0);
  }

  // default access
  public void set(String newName, int newNumber) {
    name = newName;
    number = newNumber;
  }

  public String toString() {
    return (name + " " + number);
  }

  public static void changer(ToyClass toy) {
    toy.name = "Hot Shot";
    toy.number = 42;
  }

  public boolean equals(ToyClass otherObject) {
    return ((name.equals(otherObject.name))
        && (number == otherObject.number));
  }
}
