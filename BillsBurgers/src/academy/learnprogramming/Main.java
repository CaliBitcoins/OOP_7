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

public class Main {

    public static void main(String[] args) {

        Hamburger brownEye = new Hamburger("Big Brown Eye", 12.00, "Juicy", "Pretzel");
        double price = brownEye.totalCost();
        brownEye.addHamburgerTopping("hair", 5.00);
        brownEye.addHamburgerTopping1("boogers", 2.00);
        brownEye.addHamburgerTopping2("dick cheese", 2.50);
        brownEye.addHamburgerTopping3("Schmegma", 0.25);
        System.out.println("Total BrownEye price is: " + brownEye.totalCost());
    }
}
