package MyException;

public class MyRun {
    String toWearSneakers = "Да";

    public void running1(String toWearSneakers) throws Myexception, Myexception2 {
        try {
            if (toWearSneakers.equalsIgnoreCase("Да")) {
                System.out.println("Хороший день для пробежки!");
            } else {
                throw new Myexception("Завяжите, пожалуйста шнурки");
            }
        } catch (Myexception a) {
            System.out.println(a.getMessage());
        }
    }
}
