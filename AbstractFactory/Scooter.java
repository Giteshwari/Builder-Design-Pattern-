package AbstractFactory;

public class Scooter implements Vehicle{
    int measureCc,mileage;
    String color,breaks,brand,base;

    public Scooter(int measureCc, int mileage, String color, String breaks, String brand, String base) {
        this.measureCc = measureCc;
        this.mileage = mileage;
        this.color = color;
        this.breaks = breaks;
        this.brand = brand;
        this.base = base;
    }

    @Override
    public void getDetails() {
        System.out.println("CC is: "+measureCc+" "+"Mileage is: "+mileage+" "+"Color is"+color+" "+"Breaks are: "+breaks+" "+"Brand is: "+brand+" "+"Base is: "+base);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "measureCc=" + measureCc +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", breaks='" + breaks + '\'' +
                ", brand='" + brand + '\'' +
                ", base='" + base + '\'' +
                '}';
    }
}
