package garage2.car;

import garage2.car.api.ACar;
import garage2.parts.engine.AudiEngine;
import garage2.parts.lock.Lock;
import garage2.parts.wheel.Wheel;

public class Audi extends ACar {
    private String model;

    public Audi(AudiEngine engine, Lock lock, Wheel wheel) {
        super(engine, lock, wheel, 50);
    }

    @Override
    protected int numberOfPassengerSeats() {
        return 4;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public Category getCategory() {
        return Category.B;
    }
}
