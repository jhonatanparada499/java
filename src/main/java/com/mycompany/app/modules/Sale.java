package com.mycompany.app.modules;

/**
 * Class for a simple sale of one item with no tax, discount, or other
 * adjustments.
 * Class invariant: The price is always nonnegative; the name is a nonempty
 * string.
 */
public class Sale {
  private String name; // A nonempty string
  private double price; // nonnegative

  public Sale() {
    name = "No name yet";
    price = 0;
  }

  /**
   * Precondition: theName is a nonempty string; thePrice is nonnegative.
   */
  public Sale(String theName, double thePrice) {
    setName(theName);
    setPrice(thePrice);
  }

  public Sale(Sale theSale) {
    setSale(theSale);
  }

  public static void announcement() {
    System.out.println("This is the Sale class.");
  }

  public void showAdvertisement() {
    announcement();
    System.out.println(toString());
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public Sale clone() {
    return new Sale(this);
  }

  /**
   * Precondition: newName is a nonempty string.
   */
  public void setName(String newName) {
    if (newName != null && newName != "")
      name = newName;
    else {
      System.out.println("Error: Improper name value.");
      System.exit(0);
    }
  }

  /**
   * Precondition: newPrice is nonnegative.
   */
  public void setPrice(double newPrice) {
    if (newPrice >= 0)
      price = newPrice;
    else {
      System.out.println("Error: Negative price.");
      System.exit(0);
    }
  }

  public void setSale(Sale newSale) {
    if (newSale != null) {
      this.name = newSale.name;
      this.price = newSale.price;
    } else {
      System.out.println("Error: Improper sale object.");
      System.exit(0);
    }
  }

  public double bill() {
    return price;
  }

  /*
   * Returns true if the names are the same and the bill for the calling
   * object is equal to the bill for otherSale; otherwise returns false.
   * Also returns false if otherObject is null.
   */
  public boolean equalDeals(Sale otherSale) {
    if (otherSale == null)
      return false;
    else
      return (name.equals(otherSale.name) && bill() == otherSale.bill());
  }

  /*
   * Returns true if the bill for the calling object is less
   * than the bill for otherSale; otherwise returns false.
   */
  public boolean lessThan(Sale otherSale) {
    if (otherSale == null) {
      System.out.println("Error: null Sale object.");
      System.exit(0);
    }
    return (bill() < otherSale.bill());
  }

  public boolean equals(Object otherObject) {
    if (otherObject == null)
      return false;
    else if (getClass() != otherObject.getClass())
      return false;
    else {
      Sale otherSale = (Sale) otherObject;
      return (name.equals(otherSale.name) && (price == otherSale.price));
    }
  }

  public String toString() {
    return (name + " Price and total cost = $" + price);
  }
}
