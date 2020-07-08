package lesson8;

public class Example1 {
    public static void main(String[] args) {
        Computer com1 = new Computer("Microsoft", 5000, 10);
        com1.printInfo();

        Laptop lap1 = new Laptop("Lenovo", 1500, 2, 8);
        lap1.printInfo();
    }
}
