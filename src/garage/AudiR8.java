package garage;

import garage.car.Audi;
import garage.parts.engine.AudiEngine;
import garage.parts.key.AudiKey;
import garage.parts.wheel.Wheel;

public class AudiR8 extends Audi {

    protected AudiR8(AudiEngine engine, AudiKey key, Wheel wheel) {
        super(engine, key, wheel, 70);
    }
}