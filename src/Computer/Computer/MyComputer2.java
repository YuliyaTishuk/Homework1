package Computer;

import Computer.Standart.CpuType;
import Computer.Standart.HddType;
import Computer.Standart.RamType;

public class MyComputer2 {
    private final CpuType cpuType;
    private final HddType hddType;
    private final RamType ramType;
    public MyComputer2(CpuType cpuType, HddType hddType, RamType ramType) {
        this.cpuType = cpuType;
        this.hddType = hddType;
        this.ramType = ramType;
    }
    public CpuType getCpuType(){
        return cpuType;
    }
    public HddType getHddType(){
        return hddType;
    }
    public RamType getRamType(){
        return ramType;
    }
}
