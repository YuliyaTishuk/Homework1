package Computer;

import Computer.Standart.CpuType;
import Computer.Standart.HddType;
import Computer.Standart.RamType;

public interface Builder {
    void setCpuType(CpuType cpuType);
    void setHddType(HddType hddType);
    void setRamType(RamType ramType);

}
