package garage2;

import garage2.car.Audi;
import garage2.car.Mercedes;
import garage2.car.api.ICar;
import garage2.driver.Driver;
import garage2.driver.Vehicle;
import garage2.parts.engine.AudiEngine;
import garage2.parts.engine.MercedesEngine;
import garage2.parts.key.AKey;
import garage2.parts.lock.Lock;
import garage2.parts.wheel.Wheel;

public class GarageMain {

    public static void main(String[] args) {
        AKey audiKey = new AKey();
        AKey wrongAudiKey = new AKey();
        AKey mercedesKey = new AKey();
        Lock audiLock = new Lock(audiKey);
        Lock mercedesLock = new Lock(mercedesKey);
        AudiEngine audiEngine = new AudiEngine();
        MercedesEngine mercedesEngine = new MercedesEngine();
        Wheel audiWhell = new Wheel("Nokian", 15, Wheel.WheelType.WINTER);
        Wheel mercedesWhell = new Wheel("Michelin",19, Wheel.WheelType.WINTER);
        ICar myAudi = new Audi(audiEngine, audiLock, audiWhell);
        ICar myMercedes = new Mercedes(mercedesEngine, mercedesLock, mercedesWhell, 1);
        Vehicle Audi = new Audi(audiEngine,audiLock,audiWhell);
        Vehicle Mercedes = new Mercedes(mercedesEngine,mercedesLock, mercedesWhell, 1);
        Driver audi = new Driver(Vehicle.Category.B);
        Driver mercedes = new Driver(Vehicle.Category.D);





//        myAudi.fillInTank(1);
//        myAudi.start(key);
//        myAudi.drive(7);
//        driver.drive(Audi);
//        myAudi.fillInTank(1);
//        myAudi.start(key);
//        driver.drive(Audi);
//        myAudi.drive(7);
//        myAudi.wheel(6);
//        myAudi.start(key);
//        myAudi.fillInTank(1);
//        myAudi.wheel(4);
//        driver.drive(Audi);
//        driver2.drive(Audi);
//        myAudi.fillInTank(1);
//        myAudi.start(audiKey);
//        myAudi.drive(7);
        myAudi.unlock(audiKey);
        //myMercedes.unlock(audiKey);
        myMercedes.unlock(mercedesKey);
        myAudi.start(audiKey);
        myAudi.fillInTank(5);
        myAudi.start(audiKey);
        audi.drive(Audi);
        myAudi.drive(7);











    }
}
