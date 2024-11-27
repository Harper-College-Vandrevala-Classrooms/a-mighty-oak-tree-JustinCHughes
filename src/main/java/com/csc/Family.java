package com.csc;

public class Family {
  private String name;
  private Integer birth;
  private Integer death;

  public Family(String name, Integer birth, Integer death) {
    this.name = name;
    this.birth = birth;
    this.death = death;
  }

  public Family(String name, Integer birth) {
    this.name = name;
    this.birth = birth;
    this.death = null;
  }

  public void print() {
    System.out.printf("%s was born in %d and died in %d.\n"
                      , this.name, this.birth, this.death);
  }
}
