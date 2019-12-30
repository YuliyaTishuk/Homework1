package garage2.driver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    private final Set<Vehicle.Category> categories;

    public Driver(Vehicle.Category... categories) {
        this.categories = new HashSet<>(Arrays.asList(categories));
    }

    public void drive(Vehicle vehicle) {
        if (categories.contains(vehicle.getCategory())) {
            vehicle.drive();
        } else {
            System.out.println("Вы не можете управлять машиной");
            vehicle.canDrive();
        }
    }
}
