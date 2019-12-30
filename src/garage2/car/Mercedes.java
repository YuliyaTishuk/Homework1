package garage2.car;

import garage2.car.api.ACar;
import garage2.parts.engine.MercedesEngine;
import garage2.parts.lock.Lock;
import garage2.parts.wheel.Wheel;

public class Mercedes extends ACar {

    public Mercedes(MercedesEngine engine, Lock lock, Wheel wheel, int tankVolume) {
        super(engine, lock, wheel, 40);
    }

    @Override
    protected int numberOfPassengerSeats() {
        return 2;
    }

    @Override
    public Category getCategory() {
        return Category.C;
    }
}
