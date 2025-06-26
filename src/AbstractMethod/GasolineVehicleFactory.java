package AbstractMethod;

public class GasolineVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new GasolineCar();
    }

    @Override
    public Bike createBike() {
        return new GasolineBike();
    }
}
