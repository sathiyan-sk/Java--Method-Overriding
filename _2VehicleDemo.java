// 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
class Vehicle {
    String model;
    public Vehicle(String model) {
        this.model = model;
    }
    public void start() {
        System.out.println(model + " is starting.");
    }
    public void stop() {
        System.out.println(model + " is stopping.");
    }
}
class Bus extends Vehicle {
    public Bus(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(model + " starts with a rumble.");
    }

    @Override
    public void stop() {
        System.out.println(model + " stops with a screech.");
    }
}

class Lorry extends Vehicle { // Added Lorry class
    public Lorry(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(model + " starts with a heavy chug.");
    }

    @Override
    public void stop() {
        System.out.println(model + " stops with a grinding halt.");
    }
}

public class _2VehicleDemo {
    public static void main(String[] args) {
        
        Vehicle bus = new Bus("City Transit 101");
        Vehicle lorry = new Lorry("Freightliner Cascadia"); 

        bus.start();
        bus.stop();

        lorry.start(); 
        lorry.stop(); 
    }
}
