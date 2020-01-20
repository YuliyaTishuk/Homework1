import Pasport.Passport;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Passport> passportsArrayList = new ArrayList<>();

        addNRandomPassports(passportsArrayList, 10);
        System.out.println("Коллекция до заполнение " + passportsArrayList);
        ListIterator<Passport> passportIterator = passportsArrayList.listIterator();
        while (passportIterator.hasNext()){
//            System.out.println(passportIterator.next());
            passportIterator.next();
            passportIterator.remove();
            System.out.println("Коллекция после удаления: " + passportsArrayList);
        }

    }
    private static void addNRandomPassports(List<Passport> passports, int n) {
        for (int i = 0; i < n; i++) {
            passports.add(generateWithRandomId());
        }
    }

    private static Passport generateWithRandomId() {
        return new Passport(UUID.randomUUID().toString());
    }
}

