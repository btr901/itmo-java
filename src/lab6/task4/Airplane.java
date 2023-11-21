package lab6.task4;

class Airplane extends Truck {
    public Airplane(int number) {
        super(number);
    }
    public void showMyNumber() {
        System.out.println("Значение из Truck: " + number);
    }
}
