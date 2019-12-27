package garage;

import garage.car.api.ICar;
import garage.parts.engine.AudiEngine;
import garage.parts.key.AudiKey;
import garage.parts.wheel.Wheel;

public class GarageMain {
    public static void main(String[] args) {
        AudiKey key = new AudiKey();
        AudiKey wrongKey = new AudiKey();

        AudiEngine engine = new AudiEngine();
        Wheel wheel = new Wheel("Nokian", 15, Wheel.WheelType.WINTER);
        ICar myAudi = new AudiR8(engine, key, wheel);
        myAudi.unlock(key);
        myAudi.unlock(wrongKey);
        myAudi.wheel(3);
        myAudi.start(key);
        myAudi.fillInTank(10);
        myAudi.wheel(4);
        myAudi.start(key);
        myAudi.drive(15);
        myAudi.stop(key);
        myAudi.lock(key);
    }
}
