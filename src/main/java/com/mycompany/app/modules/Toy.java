package com.mycompany.app.modules;

/**
 * @author Jhonatan Parada <jhonatanparada499@gmail.com>
 */

public class Toy {
  private String name;
  private int number;

  public Toy(String initialName, int initialNumber) {
    name = initialName;
    number = initialNumber;
  }

  public Toy(Toy toy) {
    name = toy.name;
    number = toy.number;
  }

  public Toy() {
    this("No name yet", 0);
  }

  // default access
  void set(String newName, int newNumber) {
    name = newName;
    number = newNumber;
  }

  public String toString() {
    return (name + " " + number);
  }

  public static void changer(Toy toy) {
    toy.name = "Hot Shot";
    toy.number = 42;
  }

  public boolean equals(Object otherObject) {
    if (otherObject == null) {
      return false;
    }

    if (otherObject.getClass() != this.getClass()) {
      return false;
    }

    Toy otherToy = (Toy) otherObject;

    return ((this.name.equals(otherToy.name))
        && (this.number == otherToy.number));
  }
}
