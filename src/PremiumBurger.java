public class PremiumBurger extends Hamburger{
    @Override
    public void AddHamburgerAddition1(String name, double price) {
        System.out.println("You can't add additional items to a premium burger");
    }

    @Override
    public void AddHamburgerAddition2(String name, double price) {
        System.out.println("You can't add additional items to a premium burger");
    }

    @Override
    public void AddHamburgerAddition3(String name, double price) {
        System.out.println("You can't add additional items to a premium burger");
    }

    @Override
    public void AddHamburgerAddition4(String name, double price) {
        System.out.println("You can't add additional items to a premium burger");
    }

    public PremiumBurger() {
        super("Fresh White", "Premium Burger", "Bacon and Sausage", 12.30d);
        super.AddHamburgerAddition1("chips",5.00d);
        super.AddHamburgerAddition2("Cola",5.00d);
    }
}
