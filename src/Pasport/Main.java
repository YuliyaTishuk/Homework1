package Pasport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        ArrayList<Passport> passportsArrayList = new ArrayList<>();
        LinkedList<Passport> passportLinkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        addNRandomPassports(passportsArrayList, 1000000);
        System.out.println("Add to array list: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        addNRandomPassports(passportLinkedList, 1000000);
        System.out.println("Add to linked list: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        removeAllElementsByIndex(passportsArrayList);
        System.out.println("Remove from array list: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        removeAllElementsByIndex(passportLinkedList);
        System.out.println("Remove from linked list: " + (System.currentTimeMillis() - start));

    }

    private static void addNRandomPassports(List<Passport> passports, int n) {
        for (int i = 0; i < n; i++) {
            passports.add(generateWithRandomId());
        }
    }

    private static void removeAllElementsByIndex(List<Passport> passports) {
        passports.clear();
//        for (int i = 0; i < passports.size(); i++) {
//            passports.remove(i);
//        }
    }
    private static Passport generateWithRandomId() {
        return new Passport(UUID.randomUUID().toString());
    }
}
