package garage.parts.engine;

public class AudiEngine implements IEngine {
    @Override
    public int getVolumeCm() {
        return 3000;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GASOLINE;
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.W_SHAPED;
    }

    @Override
    public int consumptionPer100Km() {
        return 15;
    }
}

