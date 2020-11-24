package com.company;
import java.util.Scanner;

public class CoffeeMachine {
    static final Scanner s = new Scanner(System.in);

    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;

    CoffeeMachine() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        money = 550;
    }


    void makeCoffee() {

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = s.next();
            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String coffee = s.next();
                    switch (coffee) {
                        case "1":
                            if (water >= 250 && coffeeBeans >= 16) {
                                water -= 250;
                                coffeeBeans -= 16;
                                money += 4;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20) {
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                money += 7;
                                disposableCups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                money += 6;
                                disposableCups -= 1;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else {
                                System.out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                    }
                    System.out.println();
                    break;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add:");
                    int addWater = s.nextInt();
                    water += addWater;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int addMilk = s.nextInt();
                    milk += addMilk;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int addBeans = s.nextInt();
                    coffeeBeans += addBeans;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int addCups = s.nextInt();
                    disposableCups += addCups;
                    System.out.println();
                    break;
                case "take":
                    System.out.println();
                    System.out.printf("I gave you $%d\n", money);
                    System.out.println();
                    money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d of water\n%d of milk\n%d of coffee beans\n%d of disposable cups\n$%d of money\n", water, milk, coffeeBeans, disposableCups, money );
                    System.out.println();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input!");
                    System.out.println();
                    break;
            }
        }while(true);
    }
}