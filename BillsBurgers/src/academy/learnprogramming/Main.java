package academy.learnprogramming;

class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String rollType;
    
    private String toppingName;
    private double toppingPrice;

    private String toppingName1;
    private double toppingPrice1;
    
    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;
    
    public Hamburger(String name, double price, String meat, String rollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.rollType = rollType;
    }
    
    public void addHamburgerTopping(String name, double price) {
        this.toppingName = name;
        this.toppingPrice = price;
    }

    public void addHamburgerTopping1(String name, double price) {
        this.toppingName1 = name;
        this.toppingPrice1 = price;
    }

    public void addHamburgerTopping2(String name, double price) {
        this.toppingName2 = name;
        this.toppingPrice2 = price;
    }

    public void addHamburgerTopping3(String name, double price) {
        this.toppingName3 = name;
        this.toppingPrice3 = price;
    }

    public double totalCost() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger" + " on a " + this.rollType + " roll "
        + "price is " + this.price);
        if(this.toppingName != null) {
            hamburgerPrice += this.toppingPrice;
            System.out.println("Added " + this.toppingName + " for " + this.toppingPrice);
        }
        if(this.toppingName1 != null) {
            hamburgerPrice += this.toppingPrice1;
            System.out.println("Added " + this.toppingName1 + " for " + this.toppingPrice1);
        }
        if(this.toppingName2 != null) {
            hamburgerPrice += this.toppingPrice2;
            System.out.println("Added " + this.toppingName2 + " for " + this.toppingPrice2);
        }
        if(this.toppingName3 != null) {
            hamburgerPrice += this.toppingPrice3;
            System.out.println("Added " + this.toppingName3 + " for " + this.toppingPrice3);
        }

        return hamburgerPrice;
    }

}

class HealthyBurger extends Hamburger {
    private String toppingName4;
    private double toppingPrice4;

    private String toppingName5;
    private double toppingPrice5;

    public HealthyBurger(double price, String meat) {
        super("Healthy Browneye", price, "Lean Browneye Patty", "Brown rye bread");

    }

    public void addHealthyTopping4(String name, double price) {
        this.toppingName4 = name;
        this.toppingPrice4 = price;
    }

    public void addHealthyTopping5(String name, double price) {
        this.toppingName5 = name;
        this.toppingPrice5 = price;
    }

    @Override
    public double totalCost() {
        double healthyPrice = super.totalCost();
        if(toppingName4 != null) {
            healthyPrice += toppingPrice4;
            System.out.println("Added " + this.toppingName4 + " for " + this.toppingPrice4);

        }
        if(toppingName5 != null) {
            healthyPrice += toppingPrice5;
            System.out.println("Added " + this.toppingName5 + " for " + this.toppingPrice5);
        }
        return healthyPrice;
    }
}

class Delux extends Hamburger {
    public Delux() {
        super("Delux BrownWyw", 12.32, "BrownEye Prime", "Browneye Bun");
        super.addHamburgerTopping("Chips", 2.32);
        super.addHamburgerTopping1("drink", 1.43);
    }
}

public class Main {

    public static void main(String[] args) {

        Hamburger brownEye = new Hamburger("Big Brown Eye", 12.00, "Juicy", "Pretzel");
        double price = brownEye.totalCost();
        brownEye.addHamburgerTopping("hair", 5.00);
        brownEye.addHamburgerTopping1("boogers", 2.00);
        brownEye.addHamburgerTopping2("dick cheese", 2.50);
        brownEye.addHamburgerTopping3("Schmegma", 0.25);
        System.out.println("Total BrownEye price is: " + brownEye.totalCost());

        HealthyBurger healthyBrownEye = new HealthyBurger(15.00, "Healthy BrownEye Patty");
        healthyBrownEye.addHealthyTopping4("Choad Greese", 1.35);
        healthyBrownEye.addHealthyTopping5("Speutum", 1.32);
        System.out.println("Total healthy browneye price is: " + healthyBrownEye.totalCost());

        Delux deluxBrownEye = new Delux();
        System.out.println("Total Delux BrownEye price is: " + deluxBrownEye.totalCost());
    }
}
