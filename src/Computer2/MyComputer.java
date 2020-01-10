package Computer2;

public class MyComputer extends AbstractComputer {

    public static void main(String[] args) {
        MyComputer dell = new MyComputer(
                new CpuType[]{CpuType.XEON},
                new HddType[]{HddType.IDE, HddType.SATA},
                new RamType[]{RamType.DDR2, RamType.DDR3});

        System.out.println(dell.start(RamType.DDR3, CpuType.XEON, HddType.SATA));
    }
    private final CpuType[] supportedCpuTypes;
    private final HddType[] supportedHddTypes;
    private final RamType[] supportedRamTypes;

    public MyComputer(CpuType[] supportedCpuTypes, HddType[] supportedHddTypes, RamType[] supportedRamTypes) {
        this.supportedCpuTypes = supportedCpuTypes;
        this.supportedHddTypes = supportedHddTypes;
        this.supportedRamTypes = supportedRamTypes;
    }

    public boolean start(RamType ram, CpuType cpu, HddType hdd) {
        return supportsCpu(cpu) && supportsHdd(hdd) && supportsRam(ram);
    }
    @Override
     public boolean supportsRam(RamType ramType) {
        return contains(supportedRamTypes, ramType);
    }
    @Override
    public boolean supportsHdd(HddType hddType) {
        return contains(supportedHddTypes, hddType);
    }
    @Override
    public boolean supportsCpu(CpuType cpuType) {
        return contains(supportedCpuTypes, cpuType);
    }



    private boolean contains(Object[] array, Object element) {
        for (Object object : array) {
            if (object == element) {
                return true;
            }
        }
        return false;
    }
}

