package com.greenfoxacademy.bankofsymba.Models;

public class BankAccount {
  
  private String name;
  private double balance;
  private String animalType;
  private boolean king;
  private boolean goodGuy;
  
  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
  
  public String getName() {
  
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(float balance) {
    this.balance = balance;
  }
  
  public String getAnimalType() {
    return animalType;
  }
  
  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
  
  public boolean isKing() {
    return king;
  }
  
  public void promoteToKing() {
    this.king = true;
  }
  
  public void makeBadGuy(){
    this.goodGuy = true;
  }
  
  public boolean isGoodGuy(){
    return goodGuy;
  }
}
