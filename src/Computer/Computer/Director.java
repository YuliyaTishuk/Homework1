package Computer;

import Computer.Standart.CpuType;
import Computer.Standart.HddType;
import Computer.Standart.RamType;

import javax.swing.*;

public class Director {
    public void construktorComputer1(Builder builder){
        builder.setCpuType(CpuType.CELERON);
        builder.setHddType(HddType.IDE);
        builder.setRamType(RamType.DDR2);
    }
    public void construktorComputer2 (Builder builder){
        builder.setCpuType(CpuType.XEON);
        builder.setHddType(HddType.SATA);
        builder.setRamType(RamType.DIMM);
    }
    public void construktorComputer3 (Builder builder){
        builder.setCpuType(CpuType.XEON);
        builder.setHddType(HddType.SATA);
        builder.setRamType(RamType.DDR3);
    }
}
