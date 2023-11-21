package lab6.task3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(555, "Kamaz", 'B', 80.0f, 8, 20000.0f);
        truck.newWheels(22);
        truck.outPut();
    }
}

