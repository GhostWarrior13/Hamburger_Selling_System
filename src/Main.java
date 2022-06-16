public class Main {
    // This application simulates a burger selling system
    // The user can choose between 3 hamburger options
    // A basic burger (bread roll with meat, up to 4 extra toppings), healthy burger (comes with 2 extra toppings)
    // and the premium burger that comes with chips and a cola but does NOT allow for additional toppings
    // Each burger comes with a base price, each topping comes with an additional cost.
    // When the CalculatePrice method is called the program will output which burger you chose,
    // the base price of that burger, how many additional items you chose and the cost of each additional item
    // and finally a total price which displays the total amount for the entire burger including additional items

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White","Basic Burger","Sausage",3.50d);
        hamburger.AddHamburgerAddition1("lettuce",0.25d);
        hamburger.AddHamburgerAddition2("cheese",0.90d);
        hamburger.AddHamburgerAddition3("onions",1.00d);
        System.out.println("Total basic burger price is: $" + hamburger.CalculatePrice());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.00d);
        healthyBurger.addHealthAddition1("mayonaize",0.50d);
        healthyBurger.addHealthAddition2("egg",2.00d);
        System.out.println("Total healthy burger price is: $" + healthyBurger.CalculatePrice());

        PremiumBurger premiumBurger = new PremiumBurger();
        System.out.println("Total premium burger price is: $" + premiumBurger.CalculatePrice());


    }
}