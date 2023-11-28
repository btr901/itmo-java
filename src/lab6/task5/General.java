package lab6.task5;

import java.util.Scanner;

class General {
    private static Scanner scanner = new Scanner(System.in);
    public static int getUserAge() {
        System.out.print("Возраст: ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Sub subObject = new Sub();
        String userName = subObject.getUserName();
        System.out.println("Имя: " + userName);
        int userAge = getUserAge();
        System.out.println("Возраст: " + userAge);
    }
}
class Sub extends General {
    @Override
    public String getUserName() {
        System.out.print("Имя: ");
        return scanner.next();
    }
}