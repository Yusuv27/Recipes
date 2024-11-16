package org.springframework;

public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items

        boolean powderBoolean;
        boolean sugarBoolean;
        boolean milkBoolean;
        boolean oilBoolean;
        boolean eggsBoolean;
        boolean appleBoolean;

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        powderBoolean =  powderAmount >= 400;
        sugarBoolean = sugarAmount >= 10;
        milkBoolean = milkAmount >= 1000;
        oilBoolean = oilAmount >= 30;

        if (powderBoolean && sugarBoolean && milkBoolean && oilBoolean) {
            System.out.println("Pancakes");
        }

        // milk - 300 ml, powder - 5 g, eggs - 5
        milkBoolean = milkAmount >= 300;
        powderBoolean = powderAmount >= 5;
        eggsBoolean = eggsCount >= 5;

        if (milkBoolean && powderBoolean && eggsBoolean) {
            System.out.println("Omelette");
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        appleBoolean = appleCount >= 3;
        milkBoolean = milkAmount >= 100;
        powderBoolean = powderAmount >= 300;
        eggsBoolean = eggsCount >= 4;

        if (appleBoolean && milkBoolean && powderBoolean && eggsBoolean) {
            System.out.println("Apple pie");
        }
    }
}