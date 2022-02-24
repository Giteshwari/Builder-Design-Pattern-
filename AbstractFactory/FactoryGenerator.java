package AbstractFactory;

public class FactoryGenerator {
    public static AbstractVehicleFactory getFactory(FactoryType factorytype){
        switch(factorytype){
            case TwoWheelerFactory:
                return new TwoWheelerFactory();
            case FourWheelerFactory:
                return new FourWheelerFactory();
        }
        return null;
    }
}
