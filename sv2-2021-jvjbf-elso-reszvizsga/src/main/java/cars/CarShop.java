package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String carShopName;
    private int maxPrice;
    private List<Car> carList = new ArrayList<>();

    public CarShop(String carShopName, int maxPrice) {
        this.carShopName = carShopName;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carList.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice() {
        int sum = 0;
        for (Car cl: carList) {
            sum += cl.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int counter = 0;
        for (Car cl: carList) {
            if (cl.getPrice() < price) {
                counter++;
            }
        }
        return counter;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carBrandList = new ArrayList<>();
        for (Car cl: carList) {
            if (brand.equals(cl.getBrand())) {
                carBrandList.add(cl);
            }
        }
        return carBrandList;
    }


    public String getCarShopName() {
        return carShopName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carList;
    }
}
