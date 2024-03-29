package DZ6_ListAndSet;

import DZ6_ListAndSet.resources.Lastname;
import DZ6_ListAndSet.resources.Name;
import DZ6_ListAndSet.resources.Surname;

import java.util.Collection;
import java.util.Random;

public final class Supply {

    private static Random r = new Random();

    static String randomString(int dlinna) {
        String resultString = "";
        for (int i = 0; i <= dlinna; i++) {
            resultString += (char) (r.nextInt(26) + 'a');
        }
        return resultString;
    }

    static Book randomBook() {
        return new Book(randomString(r.nextInt(30) + 4),
                r.nextLong() + 1,
                Name.values()[r.nextInt(Name.values().length)].toString(),
                Surname.values()[r.nextInt(Surname.values().length)].toString(),
                Lastname.values()[r.nextInt(Lastname.values().length)].toString());
    }

    static Student randomStudent(){
        return new Student(
                Name.values()[r.nextInt(Name.values().length)].toString(),
                Surname.values()[r.nextInt(Surname.values().length)].toString()
        );
    }

    static void printBookList(Collection<Book> listBook) {
        int counter = 1;
        for (Book b : listBook) {
            System.out.println(counter + ".\t" + b);
            counter++;
        }
    }

    static void printSeparator() {
        String separatorString = "";
        for (int i = 0; i < 63; i++) {
            separatorString += "-";
        }
        System.out.println(separatorString);
    }
}
