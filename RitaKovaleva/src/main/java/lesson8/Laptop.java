package lesson8;

public class Laptop extends Computer {
    protected int batteryHours;

    public Laptop(String brand, double price, double weight, int batteryHours) {
        super(brand, price, weight);
        this.batteryHours = batteryHours;
    }

    public int getBatteryHours() {
        return batteryHours;
    }

    public void setBatteryHours(int batteryHours) {
        this.batteryHours = batteryHours;
    }

    @Override
    public void printInfo() {
        System.out.printf("It's a %s brand of computer. Price is %f EUR. Weight is %f kg. Battery life is %d. \n", brand, price, weight, batteryHours);
    }
}
