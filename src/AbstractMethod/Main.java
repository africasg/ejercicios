package AbstractMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear fábrica de vehículos eléctricos
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Car electricCar = electricFactory.createCar();
        Bike electricBike = electricFactory.createBike();

        List<Car> electricCars = new ArrayList<>();

        // Crear 50 carros eléctricos
        for (int i = 0; i < 50; i++) {
            electricCars.add(electricCar); // Guardar en una lista (opcional)
            electricCar.assemble(); // Ensamblar el carro
            System.out.println("ElectricCar #" + (i + 1) + " ensamblado");
        }
        electricCar.assemble();
        electricBike.assemble();

        // Crear fábrica de vehículos de gasolina
        VehicleFactory gasolineFactory = new GasolineVehicleFactory();
        Car gasolineCar = gasolineFactory.createCar();
        Bike gasolineBike = gasolineFactory.createBike();

        gasolineCar.assemble();
        gasolineBike.assemble();
    }
}
