package garage.parts.wheel;

public class Wheel {
    private final String name;
    private final int radius;
    private final WheelType type;

    public Wheel(String name, int radius, WheelType type) {
        this.name = name;
        this.radius = radius;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public WheelType getType() {
        return type;
    }

    public enum WheelType {
        SUMMER, WINTER, MULTIGRADE
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", type=" + type +
                '}';
    }
}
