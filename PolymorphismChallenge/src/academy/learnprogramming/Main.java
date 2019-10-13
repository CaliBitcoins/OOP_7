package academy.learnprogramming;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car.startEngine() called";
    }

    public String accelerate() {
        return "Car.accelerate() called";
    }

    public String brake() {
        return "Car.brake() called";
    }
}

class GM extends Car {

    public GM(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override super methods: startEngine(), accelerate(), and brake()
    // modify output to reflect this GM Car
    @Override
    public String startEngine() {
        return "GM.startEngine() called";
    }

    @Override
    public String accelerate() {
        return "GM.accelerate() called";
    }

    @Override
    public String brake() {
        return "GM.brake() called";
    }
}
class Lamborghini extends Car {

    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override super methods: startEngine(), accelerate(), and brake()
    // modify output to reflect this Lamborghini Car
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - Lamborghini.startEngine() called";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - Lamborghini.accelerate() called";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - Lamborghini.brake() called";
    }
}

class Mercedes extends Car {

    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    // Override super methods: startEngine(), accelerate(), and brake()
    // modify output to reflect this Mercedes Car
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " - Mercedes.startEngine() called";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " - Mercedes.accelerate() called";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " - Mercedes.brake() called";
    }
}

public class Main {

    public static void main(String[] args) {
	    //Car tests
        Car car = new Car(8, "POS");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        GM truck = new GM(8, "silverado");
        System.out.println(truck.startEngine());
        System.out.println(truck.accelerate());
        System.out.println(truck.brake());

        Lamborghini lambo = new Lamborghini(8, "Diablo");
        System.out.println(lambo.startEngine());
        System.out.println(lambo.accelerate());
        System.out.println(lambo.brake());

        Mercedes merc = new Mercedes(8, "Diablo");
        System.out.println(merc.startEngine());
        System.out.println(merc.accelerate());
        System.out.println(merc.brake());
    }

}
