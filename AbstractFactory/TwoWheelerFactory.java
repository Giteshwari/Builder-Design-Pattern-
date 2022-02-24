package AbstractFactory;

public class TwoWheelerFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case Bike:
                return new Bike(120,45,"Black","Disc","Bajaj");
            case Scooter:
                return new Scooter(110,30,"Blue","Drum","Honda","Petrol");

        };
        return null;
    }
}
