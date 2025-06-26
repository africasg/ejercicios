package AbstractMethod;

// Implementaciones concretas de Car
public class ElectricCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Electric Car");
    }
}

