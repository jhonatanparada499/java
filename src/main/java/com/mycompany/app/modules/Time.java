package com.mycompany.app.modules;

public class Time {
  private int hrs;
  private int mins;
  private int secs;

  public Time() {
    this(0, 0, 0);
  }

  public Time(int h, int m, int s) {
    this.hrs = h;
    this.mins = m;
    this.secs = s;
  }

  public void increase() {
    secs++;

    if (secs >= 60) {
      secs = 0;
      mins++;
    }

    if (mins >= 60) {
      mins = 0;
      hrs++;
    }

    if (hrs >= 24) {
      hrs = 0;
    }
  }

  public boolean equals(Time t) {

    if (this.secs != t.secs) {
      return false;
    }

    if (this.mins != t.mins) {
      return false;
    }

    if (this.hrs != t.hrs) {
      return false;
    }

    return true;
  }

  public void setTime(int h, int m, int s) throws Exception {
    if (h <= -1 || m <= -1 || s <= -1) {
      throw new Exception("Time can not be negative");
    }

    this.hrs = h;
    this.mins = m;
    this.secs = s;
  }

  public void resetTime() {
    this.hrs = 0;
    this.mins = 0;
    this.secs = 0;
  }

  public String toString() {
    return String.format("%02d:%02d:%02d",
        this.hrs, this.mins, this.secs);
  }
}
