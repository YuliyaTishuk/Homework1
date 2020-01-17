package MyException;

public class MyRun2 extends MyRun {
    String tieYourShoelaces = "Да";

    @Override
    public void running1(String tieYourShoelaces)throws Myexception, Myexception2 {
        try {
            if (tieYourShoelaces.equalsIgnoreCase("Нет")) {
                throw new Myexception2 ("Сначала бы надеть кроссовки");
            }
        } catch (Myexception2 s) {
            System.out.println(s.getMessage());
        }
    }

    public static void main(String[] args) throws Myexception2, Myexception {
        MyRun2 myRun2 = new MyRun2();
        MyRun myRun = new MyRun();
        myRun.running1("Нет");
        myRun2.running1("нет");
    }

    }
