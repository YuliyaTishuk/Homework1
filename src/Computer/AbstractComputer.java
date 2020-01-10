package Computer;

import Computer.Standart.ISandart;

public abstract class AbstractComputer implements ISandart {
    protected abstract boolean supportsRam(RamType ramType);

    protected abstract boolean supportsHdd(HddType hddType);

    protected abstract boolean supportsCpu(CpuType cpuType);

    public boolean start(RamType ram, CpuType cpu, HddType hdd) {
        return supportsCpu(cpu) && supportsHdd(hdd) && supportsRam(ram);
    }
}

