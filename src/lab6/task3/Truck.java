package lab6.task3;

public class Truck extends Car {
    private int numberOfWheels;
    private float maxWeight;
    public Truck(int weight, String model, char color, float speed, int numberOfWheels, float maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int newNumberOfWheels) {
        numberOfWheels = newNumberOfWheels;
        System.out.println("Количество колес: " + numberOfWheels);
    }
}
