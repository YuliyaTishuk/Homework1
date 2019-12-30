package garage2.driver;

public interface Vehicle {
    void drive();
    void canDrive();
    Category getCategory();
    enum Category {
        A, B, C, D, E
    }
}
