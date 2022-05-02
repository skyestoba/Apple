package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Apple HoneyCrisp = new Apple("Honey Crisp", "red", 2);

        System.out.println("There a worm in this apple? : " + HoneyCrisp.hasWorm());
        System.out.println("This is edible? : " + HoneyCrisp.isEdible());
        System.out.println("This is a rock? : " + HoneyCrisp.isRock());

        Apple actuallyARock = new Apple("rock", "grey", 8);

        System.out.println("There a worm in this apple? : " + actuallyARock.hasWorm());
        System.out.println("This is edible? : " + actuallyARock.isEdible());
        System.out.println("This is a rock? : " + actuallyARock.isRock());
    }
}
