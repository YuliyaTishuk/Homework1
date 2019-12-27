package garage.car.api;

import garage.parts.key.IKey;

public interface ICar {
    void unlock(IKey key);
    void lock(IKey key);
    void start(IKey key);
    void stop(IKey key);
    void fillInTank(int volume);
    void drive(int km);
    void wheel(int piece);
//    void drive();
//    void open();
//    void close();
//    void start();
//    void stop();
//    void fuel();
//    void changeWheel();
//    void driverSeat();
//    void passengerSeat();

}
