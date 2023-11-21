package lab7.task1;

public class Airplane {
    public class Wing {
        private double weight;
        public Wing(double weight) {
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
    }
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Airplane.Wing wing = airplane.new Wing(888.8);
        System.out.println("Вес крыла: " + wing.getWeight() + " тонн");
    }
}
