package Computer;

public class ComputerMain {
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder computer = new ComputerBuilder();
        director.construktorComputer1(computer);
        MyComputer2 myComputer = computer.getResult();
        System.out.println("Мой компьютер:\n" + myComputer.getCpuType() + "\n" +  myComputer.getHddType() +"\n" +  myComputer.getRamType());
    }

}
