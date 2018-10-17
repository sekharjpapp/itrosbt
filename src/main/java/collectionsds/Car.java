package collectionsds;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String registrationNumber;
    private int price;

    public Car(int price) {
        this.price = price;
    }

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car(String registrationNumber, int price) {
        this.registrationNumber = registrationNumber;
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(registrationNumber, price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.getPrice() > o.price) {
            return 1;
        } else if (this.getPrice() < o.getPrice()) {
            return -1;
        }
        return 0;
    }
}
