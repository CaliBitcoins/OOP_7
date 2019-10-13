package academy.learnprogramming;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void print(int pages) {
        System.out.println("Printing " + pages + " page(s)...");
        for(int i=0; i<pages; i++) {
            this.pagesPrinted++;
            this.tonerLevel = getTonerLevel() - 0.15;
        }
        System.out.println("You have " + getTonerLevel() + " % Toner Level Remaining");
        System.out.println("You have printed " + pagesPrinted + " pages total.");
    }

    public void fillToner(double tonerFill) {
        if((this.tonerLevel + tonerFill) < 100.00) {
            this.tonerLevel += tonerFill;
        } else {
            this.tonerLevel = 100.00;
        }
        System.out.println("You have " + getTonerLevel() + " % Toner Level Remaining");
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
