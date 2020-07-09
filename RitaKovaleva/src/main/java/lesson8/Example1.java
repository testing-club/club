package lesson8;

public class Example1 {
    public static void main(String[] args) {
        // Inheritance example
        Computer comp1 = new Computer("Intel", 2000,15);
        comp1.printInfo();

        Laptop lamp1 = new Laptop("Lenovo",3000,2,8);
        lamp1.printInfo();

        Tablet tab1 = new Tablet("Apple", 1000, 1, 5, "Resistive");
        tab1.printInfo();

        // Abstract class example

        // Doctor doc = new Doctor(); -error

        Surgeon surg = new Surgeon("Tom", "Summer", "ER", 3500);
        surg.printData();
    }
}
