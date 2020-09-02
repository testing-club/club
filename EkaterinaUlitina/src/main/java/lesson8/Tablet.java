package lesson8;

public class Tablet extends Laptop {
    private String touchscreen;

    public Tablet(String brand, double price, double weight, int batteryHours, String touchscreen) {
        super(brand, price, weight, batteryHours);
        this.touchscreen = touchscreen;
    }

    public String getTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    @Override
    public void printInfo() {
        System.out.printf("It's a %s type of computer. Price is %f EUR. Weight is %f kg. Battery life is %d hours. Type of touchscreen is %s. \n", brand, price, weight, batteryHours, touchscreen);
    }
}
