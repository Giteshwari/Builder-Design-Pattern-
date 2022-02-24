package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Vehicle car = FactoryGenerator.getFactory(FactoryType.FourWheelerFactory).getVehicle(VehicleType.Car);
        car.getDetails();
        Vehicle scooter=FactoryGenerator.getFactory(FactoryType.TwoWheelerFactory).getVehicle(VehicleType.Scooter);
        scooter.getDetails();
    }
}