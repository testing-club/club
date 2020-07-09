package lesson_8;

public class Computer {
    protected String brand;
    protected double price;
    protected double weight;

    public void printInfo() {
        System.out.printf("It's a %s brand of computer. Price is %f EUR. Weight is %f kg. \n", brand,price,weight);
    }

    public Computer(String brand, double price, double weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
