package garage.car;

import garage.car.api.ICar;
import garage.parts.engine.AudiEngine;
import garage.parts.key.AudiKey;
import garage.parts.key.IKey;
import garage.parts.wheel.Wheel;

public abstract class Audi implements ICar {
    private final AudiEngine engine;
    private final AudiKey key;
    private boolean isOpen;
    private final Wheel wheel;
    private final int tankVolume;
    private int fuelVolume = 0;
    private boolean isRunning;

    protected Audi(AudiEngine engine, AudiKey key, Wheel wheel, int tankVolume) {
        this.engine = engine;
        this.key = key;
        this.wheel = wheel;
        this.tankVolume = tankVolume;
    }

    private boolean isOpen() {
        return isOpen;
    }

    public AudiEngine getEngine() {
        return engine;
    }

    public Wheel getWheel () {return wheel; }

    @Override
    public void unlock(IKey key) {
        performKeyAction(key, this::unlock);
    }

    @Override
    public void lock(IKey key) {
        performKeyAction(key, this::lock);
    }

    private void performKeyAction(IKey key, Runnable block) {//Runnable - интеряейс с методом run.
        if (key.equals(this.key)) {
            block.run();
        } else {
            System.out.println("Ваш ключ не подходит");
        }
    }

    private void unlock() {
        if (isOpen()) {
            System.out.println("Машина уже открыта");
        } else {
            isOpen = true;
            System.out.println("Машина открыта");
        }
    }

    private void lock() {
        if (!isOpen()) {
            System.out.println("Машина уже закрыта");
        } else {
            isOpen = false;
            System.out.println("Машина закрыта");
        }
    }

    @Override
    public void start(IKey key) {
        performKeyAction(key, this::start);
    }

    private void start() {
        if (!isRunning) {
            if (fuelVolume > 0) {
                isRunning = true;
                System.out.println("Машина завелась");
            } else {
                System.out.println("Бак пуст. Пожалуйста, залейте топливо");
            }
        } else {
            System.out.println("Машина едет");
        }
    }

    @Override
    public void stop(IKey key) {
        this.performKeyAction(key, this::stop);
    }

    private void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Машина остановилась");
        } else {
            System.out.println("Машина не едет");
        }
    }

    @Override
    public void fillInTank(int volume) {
        this.fuelVolume = Math.min(volume, this.tankVolume);
    }

    @Override
    public void drive(int km) {
        if (isRunning) {
            int fuelAmount = engine.consumptionPer100Km() * km / 100;
            if (fuelVolume >= fuelAmount) {
                fuelVolume -= fuelAmount;
                System.out.println("Вы на месте!");
            } else {
                int distanceForTank = 100 * fuelVolume / engine.consumptionPer100Km();
                fuelVolume = 0;
                System.out.println("Вы проехали " + distanceForTank + " км, осталось " + (km - distanceForTank) + " км");
            }
        } else {
            System.out.println("Заведите машину");
        }
    }
    public void wheel (int piece){
        final int quantity = 4;
        if (piece == quantity){
            System.out.println("Все колёса на месте");
        }else {
            int lacks = quantity-piece;
            System.out.println("Вам не хватает " + lacks + " колёс. Вы не сможете ехать.");
            isRunning = false;
        }
    }
}
