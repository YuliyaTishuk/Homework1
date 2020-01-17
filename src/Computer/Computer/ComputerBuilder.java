package Computer;

import Computer.Standart.CpuType;
import Computer.Standart.HddType;
import Computer.Standart.RamType;

public class ComputerBuilder implements Builder {
    private CpuType cpuType;
    private HddType hddType;
    private RamType ramType;

    @Override
    public void setCpuType(CpuType cpuType) {
        this.cpuType = cpuType;
    }

    @Override
    public void setHddType(HddType hddType) {
        this.hddType = hddType;
    }

    @Override
    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }
    public MyComputer2 getResult(){
        return new MyComputer2 (cpuType, hddType, ramType);
    }
}
