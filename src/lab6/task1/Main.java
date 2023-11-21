package lab6.task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", "Сосков", "Росколхозбанк");
        Bankworker bankworker = new Bankworker("Дмитрий", "Дмитриев", "Mybank");
        client.showInfo();
        System.out.println();
        bankworker.showInfo();
    }
}
