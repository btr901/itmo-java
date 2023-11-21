package lab6.task1;

//абстрактный класс человек
abstract class Human {
    protected String givenName; //защита
    protected String surName; //защита

    public Human(String givenName, String surName) {
        this.givenName = givenName;
        this.surName = surName;
    }

    public String getgivenName() {
        return givenName;
    }

    public String getsurName() {
        return surName;
    }

    //показывает всю информации
    public abstract void showInfo();
}

//интерфейс для определения банка
interface Bankinfo {
    String getBankName();
}

//класс клиент
class Client extends Human implements Bankinfo {
    private String bankName;

    public Client(String givenName, String surName, String bankName) {
        super(givenName, surName);
        this.bankName = bankName;
    }

    //вывода информации
    @Override
    public void showInfo() {
        System.out.println("Клиент: " + getgivenName() + " " + getsurName());
        System.out.println("Банк: " + bankName);
    }

    //метод из интерфейса Bankinfo
    @Override
    public String getBankName() {
        return bankName;
    }
}

//класс работник банка
class Bankworker extends Human implements Bankinfo {
    private String bankName;

    public Bankworker(String givenName, String surName, String bankName) {
        super(givenName, surName);
        this.bankName = bankName;
    }

    //вывода информации
    @Override
    public void showInfo() {
        System.out.println("Банкир: " + getgivenName() + " " + getsurName());
        System.out.println("Банк: " + bankName);
    }

    //метод из интерфейса Bankinfo
    @Override
    public String getBankName() {
        return bankName;
    }
}
