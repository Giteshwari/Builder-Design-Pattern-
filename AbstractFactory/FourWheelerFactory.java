package AbstractFactory;

public class FourWheelerFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        switch(vehicleType){
            case Car:
                return new Car(4,28,"Biege","Maruti Suzuki");
        }
        return null;
    }
}
