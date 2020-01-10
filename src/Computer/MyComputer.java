package Computer;

import java.util.*;

public class MyComputer extends AbstractComputer {

    public static void main(String[] args) {
        MyComputer dell = new MyComputer(
                Collections.singletonList(CpuType.XEON),
                Arrays.asList(HddType.IDE, HddType.SATA),
                Arrays.asList(RamType.DDR2, RamType.DDR3));

        System.out.println(dell.start(RamType.DDR3, CpuType.CELERON, HddType.SATA));
    }
    private final Set<CpuType> cpuTypes;
    private final Set<HddType> hddTypes;
    private final Set<RamType> ramTypes;

    public MyComputer(Collection<CpuType> cpuTypes, Collection<HddType> hddTypes, Collection<RamType> ramTypes) {
        this.cpuTypes = new HashSet<>(cpuTypes);
        this.hddTypes = new HashSet<>(hddTypes);
        this.ramTypes = new HashSet<>(ramTypes);
    }

    public boolean start(RamType ram, CpuType cpu, HddType hdd) {
        return supportsCpu(cpu) && supportsHdd(hdd) && supportsRam(ram);
    }
    @Override
    protected boolean supportsRam(RamType ramType) {
        return ramTypes.contains(ramType);
    }
    @Override
    protected boolean supportsHdd(HddType hddType) {
        return hddTypes.contains(hddType);
    }

    @Override
    protected boolean supportsCpu(CpuType cpuType) {
        return cpuTypes.contains(cpuType);
    }

  }
