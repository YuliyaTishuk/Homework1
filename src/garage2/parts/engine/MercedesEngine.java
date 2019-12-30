package garage2.parts.engine;

public class MercedesEngine implements IEngine {

    @Override
    public int getVolumeCm() {
        return 4000;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL;
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.V_SHAPED;
    }

    @Override
    public int consumptionPer100Km() {
        return 10;
    }
}
