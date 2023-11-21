package lab7.task2;

public class Airplane {
    static class Wing {
        private double weight;
        public Wing(double weight) {
            this.weight = weight;
        }
        public void showWeight() {
            System.out.println("Вес крыла: " + weight + " тонн");
        }
    }
    public static void main(String[] args) {
        Wing wing1 = new Wing(555.5);
        Wing wing2 = new Wing(655.5);




        wing1.showWeight();
        wing2.showWeight();
    }
}
