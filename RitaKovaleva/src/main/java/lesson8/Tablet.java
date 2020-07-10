package lesson8;

public class Tablet extends Laptop {
    private String touchScreen;

    public Tablet(String brand, double price, double weight, int batteryHours, String touchScreen) {
        super(brand, price, weight, batteryHours);
        this.touchScreen = touchScreen;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Touchscreen is %s.", touchScreen);
    }
}
