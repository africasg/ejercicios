package AbstractMethod;

// Implementaciones concretas de Bike
public class ElectricBike implements Bike {
    @Override
    public void assemble() {
        System.out.println("Assembling Electric Bike");
    }
}
