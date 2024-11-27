package com.csc;

public class Squirrel {
  private String name;

  public Squirrel(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void print() {
    System.out.printf("This squirrel's name is %s.\n", this.name);
  }
}
