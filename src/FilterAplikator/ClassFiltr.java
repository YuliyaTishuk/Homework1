package FilterAplikator;

import Pasport.Passport;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class ClassFiltr<T> {
    public void filtr(List <Passport> passports){
        ListIterator<?> iterator = passports.listIterator();
        while (iterator.hasNext()){
            if (iterator.next()..equals(new Date()){
                passports.remove();
            }

        }
    }
}
