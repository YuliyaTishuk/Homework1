package garage2.car.api;

import garage2.driver.Vehicle;
import garage2.parts.engine.IEngine;
import garage2.parts.key.IKey;
import garage2.parts.lock.Lock;
import garage2.parts.wheel.Wheel;

public abstract class ACar implements ICar, Vehicle {
    private final IEngine engine;
    private final Lock lock;
    private final Wheel wheel;
    private final int tankVolume;
    private float fuelVolume = 0.0f;
    private boolean isRunning;
    private int passengerCount;

    protected ACar(IEngine engine, Lock lock, Wheel wheel, int tankVolume) {
        this.engine = engine;
        this.lock = lock;
        this.wheel = wheel;
        this.tankVolume = tankVolume;
    }
    @Override
    public void drive() {
        System.out.println("Вы можете управлять машиной");
        isRunning = true;
    }
    public void canDrive() {
        System.out.println("Вашей категории прав не достаточно");
        isRunning = false;
    }

    protected abstract int numberOfPassengerSeats();

    public void putPassengers(int numberOfPassengers) {
        if (passengerCount + numberOfPassengers <= numberOfPassengerSeats()) {
            passengerCount += numberOfPassengers;
        } else {
            System.out.println("Машина полная");
        }
    }

    public IEngine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void fillInTank(int volume) {
        this.fuelVolume = Math.min(volume, this.tankVolume);
    }

    @Override
    public void unlock(IKey key) {
        if (lock.unlock(key)) {
            System.out.println("Машина открыта");
        } else {
            System.out.println("Не могу открыть");
        }
    }

    @Override
    public void lock(IKey key) {
        if (lock.lock(key)) {
            System.out.println("Машина закрыта");
        } else {
            System.out.println("Не могу закрыть");
        }
    }

    @Override
    public void start(IKey key) {
        if (lock.isKeyValid(key)) {
            if (fuelVolume > 0) {
                isRunning = true;
                System.out.println("Машина заведена");
            } else {
                System.out.println("Бак пустой");
            }
        }
    }

    @Override
    public void stop(IKey key) {
        if (lock.isKeyValid(key)) {
            stop();
        }
    }

    private void stop() {
        isRunning = false;
        System.out.println("Машина заглушена");
    }

    public void drive(int km) {
        if (isRunning) {
            float fuelAmount = engine.consumptionPer100Km() * km / 100f;
            if (fuelVolume >= fuelAmount) {
                fuelVolume -= fuelAmount;
                System.out.println("Вы на месте!");
            } else {
                float distanceForTank = 100 * fuelVolume / engine.consumptionPer100Km();
                fuelVolume = 0.0f;
                System.out.println(String.format("Вы проехали %.2f км, осталось %.2f км", distanceForTank, (km - distanceForTank)));
            }
            if (fuelVolume == 0.0f) {
                stop();
            }
        } else {
            System.out.println("Заведите машину");
        }
    }

    public void wheel(int piece) {
        final int quantity = 4;
        if (piece > 4) {
            int lacks1 = piece - quantity;
            System.out.println("У вас больше на " + lacks1 + " колёс, у лекгового автомобиля не может быть больше 4 колёс");
            isRunning = false;
        } else if (piece < 4) {
            int lacks = quantity - piece;
            System.out.println("Вам не хватает " + lacks + " колёс. Вы не сможете ехать.");
            isRunning = false;
        } else {
            System.out.println("Все колёса на месте, можно ехать");
        }
    }
}


