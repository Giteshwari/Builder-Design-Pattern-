package AbstractFactory;

public class Bike implements Vehicle{
    int measureCc,mileage;
    String color,breaks,brand;

    public Bike(int measureCc, int mileage, String color, String breaks,String brand) {
        this.measureCc = measureCc;
        this.mileage = mileage;
        this.color = color;
        this.breaks = breaks;
        this.brand=brand;
    }

    @Override
    public void getDetails() {
        System.out.println("CC is "+measureCc+" "+"Mileage is: "+mileage+" "+"Color is: "+color+" "+"Breaks are: "+breaks+" "+"Brand is: "+brand);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "measureCc=" + measureCc +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", breaks='" + breaks + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
