package AbstractFactory;

public class Car implements Vehicle {
    int noOfAirbags,mileage;
    String color,brand;

    public Car(int noOfAirbags, int mileage, String color, String brand) {
        this.noOfAirbags = noOfAirbags;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public void getDetails() {
        System.out.println("No. of Airbags are: "+noOfAirbags+" "+"Mileage is: "+mileage+" "+"Color is: "+color+" "+"Brand is: "+brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfAirbags=" + noOfAirbags +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
