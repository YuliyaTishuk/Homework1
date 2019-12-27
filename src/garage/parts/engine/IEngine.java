package garage.parts.engine;

public interface IEngine {
    int getVolumeCm();

    FuelType getFuelType();//рядные, горизонтальные (оппозитные), вертикальные, V-образные.

    EngineType getEngineType();

    int consumptionPer100Km();

    enum FuelType {
        GASOLINE, DIESEL, ELECTRIC
    }

    enum EngineType {
        I_SHAPED, V_SHAPED, W_SHAPED
    }
}
