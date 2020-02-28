
package lab.assignment.beforerefactoring;



public class CoffeeClient {


    public static void main(String[] args) {
        System.out.println("Brewing Americano");
        CoffeeMaker starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();
        System.out.println("********************");

        System.out.println("Brewing Capuccino");
        CoffeeMaker starbuzz1 = new CapuccinoCoffee();
        starbuzz1.prepareCoffee();
        System.out.println("********************");

        System.out.println("Brewing Mocha");
        CoffeeMaker starbuzz2 = new MochaCoffee();
        starbuzz2.prepareCoffee();
        System.out.println("********************");



    }

}
