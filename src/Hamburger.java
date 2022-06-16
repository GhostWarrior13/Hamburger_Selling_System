public class Hamburger {
    private String breadRollType, burgerName, meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String breadRollType, String burgerName, String meat,double price) {
        this.breadRollType = breadRollType;
        this.burgerName = burgerName;
        this.meat = meat;
        this.price = price;
    }

    public void AddHamburgerAddition1(String name,double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void AddHamburgerAddition2(String name,double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void AddHamburgerAddition3(String name,double price){
        this.addition3Name = name;
        this.addition3Price= price;
    }

    public void AddHamburgerAddition4(String name,double price){
        this.addition4Name = name;
        this.addition4Price= price;
    }

    public double CalculatePrice(){
        double burgerPrice = this.price;

        System.out.println(this.burgerName+ " on a " + breadRollType + " roll" + ", base price is $" + this.price );

        if (this.addition1Name != null){
            burgerPrice += this.addition1Price;
            System.out.println("Added " + addition1Name + " for an extra $" + addition1Price);
        }
        if (this.addition2Name != null){
            burgerPrice += this.addition2Price;
            System.out.println("Added " + addition2Name + " for an extra $" + addition2Price);
        }

        if (this.addition3Name != null){
            burgerPrice += this.addition3Price;
            System.out.println("Added " + addition3Name + " for an extra $" + addition3Price);
        }

        if (this.addition4Name != null){
            burgerPrice += this.addition4Price;
            System.out.println("Added " + addition4Name + " for an extra $" + addition4Price);
        }
        return burgerPrice;
    }
}
