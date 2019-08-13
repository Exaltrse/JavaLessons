package DZ6;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

//    Viachaslau, [24.07.19 14:20]
//            1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book.
//            List< Book > list = new LinkedList< Book >();
//    Вывести информацию о всех книгах.
//    Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.
//            2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book,
//    предусмотреть не менее 6 одинаковых по значению книг.
//    Вывести на экран информацию о книга (содержащихся в коллекции HashSet),
//    название которых начинается с гласной буквы.
//
//
//
//            3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству
//            (эти поля надо добавить в класс Book для автора книги).
//
//            4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать).
//    Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного студента удалить из коллекции.
//5. Создать экземпляр класса HashMap, разместить в нём следующую информацию:
//    в качестве ключа  - категория товара в каталоге (catalog.onliner.by)
//    в качестве значения - количество товаров в данной категории.
//    Сортировать коллекцию по количеству товаров в каждой категории,
//    найти категорию в которой содержится максимальное количество товаров,
//    удалить все категории в которых нет ни одного товара (предусмотреть такие категории при заполнении коллекции)

    public static void main(String[] args) {
        {
            List<Book> linkedListBook = new LinkedList<>();
            linkedListBook.add(Supply.randomBook()); //1
            linkedListBook.add(Supply.randomBook()); //2
            linkedListBook.add(Supply.randomBook()); //3
            System.out.println("LinkedList contains: ");
            Supply.printBookList(linkedListBook);
            Supply.printSeparator();
            //linkedListBook.remove(1);
            for (int i = 0; i < linkedListBook.size(); i++) {
                if (i == 1) linkedListBook.remove(i);
            }
            System.out.println("Edited LinkedList contains: ");
            Supply.printBookList(linkedListBook);
            Supply.printSeparator();
        }
        {
            Supply.printSeparator();
            Book notUniqBook = Supply.randomBook();
            Set<Book> setBook = new HashSet<>();
            for (int i = 0; i < 25; i++) {
                if (i % 4 == 0) {
                    setBook.add(
                            new Book(notUniqBook.getName(),
                                    notUniqBook.getIsbn(),
                                    notUniqBook.getAuthorName(),
                                    notUniqBook.getAuthorSurname(),
                                    notUniqBook.getAuthorLastname()));
                } else {
                    setBook.add(Supply.randomBook());
                }
            }
            System.out.println("HashSet");
            Supply.printBookList(setBook);
            for (Book b : setBook) {
                //if (b.getName().startsWith())
            }
        }


    }

}
