package org.example;

public class Alcancia {

    /*
    Denominations coins
     */
    private final int[] typesCoins = {20, 50, 100, 200, 500};

    /*
    Savings
     */
    private int[] coinsSaved = {};

    /*
    Constructor
     */
    public Alcancia() {
        coinsSaved = new int[typesCoins.length];
    }

    public void addCoin(int coinValue) {
        var index = this.getIndex(coinValue);

        if (index != -1) {
            this.coinsSaved[index]++;
            System.out.println("A coin of " + coinValue + " was added.");
        } else {
            System.out.println("Type coin not valid.");
        }
    }

    public void countByTypeCoin() {
        System.out.println("There are your saved coins");
         for (int i = 0; i < this.typesCoins.length; i++) {
             System.out.println("$" + this.typesCoins[i] + " -> " + this.coinsSaved[i]);
         }
    }

    public int getTotalSaved() {
        var total = 0;

        for (int i = 0; i < this.typesCoins.length; i++) {
            total += this.typesCoins[i] * this.coinsSaved[i];
        }

        return total;
    }

    public void breakSavings() {
        var total = this.getTotalSaved();

        for (int i = 0; i < this.typesCoins.length; i++) {
            this.coinsSaved[i] = 0;
        }

        System.out.println("Your savings are " + total);
    }

    private int getIndex(int valor) {
        for (int i = 0; i < this.typesCoins.length; i++) {
            if (this.typesCoins[i] == valor) {
                return i;
            }
        }

        return -1;
    }
}
