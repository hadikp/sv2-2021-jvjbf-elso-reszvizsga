package cars;

public class Car {
    private String brand;
    private double motorSize;
    private Color color;
    private int price;

    public Car(String brand, double motorSize, Color color, int price) {
        this.brand = brand;
        this.motorSize = motorSize;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price -= (int) (percent * price);
    }

    public String getBrand() {
        return brand;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
