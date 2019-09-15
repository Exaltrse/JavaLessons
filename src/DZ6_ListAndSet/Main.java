package DZ6_ListAndSet;

import java.util.*;

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
            //Task 1
            List<Book> linkedListBook = new LinkedList<>();
            linkedListBook.add(Supply.randomBook()); //1
            linkedListBook.add(Supply.randomBook()); //2
            linkedListBook.add(Supply.randomBook()); //3
            System.out.println("LinkedList contains: ");
            Supply.printBookList(linkedListBook);
            Supply.printSeparator();
            for (int i = 0; i < linkedListBook.size(); i++) {
                if (i == 1) linkedListBook.remove(i);
            }
            System.out.println("Edited LinkedList contains: ");
            Supply.printBookList(linkedListBook);
            Supply.printSeparator();
        }
        {
            //Task 2
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
            //Task 3
            System.out.println("\nSorted\n");
            List<Book> bookList = new ArrayList<>();
            bookList.addAll(setBook);
            Collections.sort(bookList);
            Supply.printBookList(bookList);

        }
        {
            //Task 4
            System.out.println("******* TreeSet *******");
            Set<Student> studentSet = new TreeSet<>();
            int count = 100;
            for(int i = 0; i<count; i++){
                studentSet.add(Supply.randomStudent());
            }
            Iterator<Student> iterator = studentSet.iterator();
            for(int i=0;iterator.hasNext();i++){
                if(i%2==0){
                    Student tmpStudent = iterator.next();
                    System.out.println(tmpStudent);
                }
                else{
                    iterator.remove();
                }

            }
        }
        //Task5
        {
            Map<String, Long> onlinerMap = new HashMap<>();
            onlinerMap.put("Cathegory 1", 13l);
            onlinerMap.put("Cathegory 2", 0l);
            onlinerMap.put("Cathegory 3", 1653l);
            onlinerMap.put("Cathegory 4", 9851l);
            onlinerMap.put("Cathegory 5", 31226l);
            onlinerMap.put("Cathegory 6", 645l);
            onlinerMap.put("Cathegory 7", 98l);
            onlinerMap.put("Cathegory 8", 0l);
            onlinerMap.put("Cathegory 9", 9845l);
            onlinerMap.put("Cathegory 10", 312l);
            onlinerMap.put("Cathegory 11", 461l);
            List<Map.Entry<String, Long>> sortedList = new LinkedList<>(onlinerMap.entrySet());
            Collections.sort(sortedList, new Comparator<Map.Entry<String, Long>>() {
                @Override
                public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            System.out.println("******* SortedCollection *******");
            for(Map.Entry<String, Long> m : sortedList){
                System.out.println(m.getKey() + "   " + m.getValue());
            }
            System.out.println("******* MaxNumberOfProducts *******");
            Long compare = Long.MIN_VALUE;
            Map.Entry<String, Long> entry = null;
            Set<Map.Entry<String, Long>> setEmptyEntryes = new HashSet<>();
            for(Map.Entry<String, Long> m : sortedList){
                if(m.getValue()>compare) {
                    compare=m.getValue();
                    entry = m;
                }
                if(m.getValue()<=0L){
                    setEmptyEntryes.add(m);
                }
            }
            System.out.println("Max number of products is in " + entry.getKey() + ". It is " + entry.getValue() + ".");
            System.out.println("******* RemoveEmptyCategories *******");
            for(Map.Entry<String, Long> s:setEmptyEntryes){
                onlinerMap.remove(s.getKey());
            }
            for(Map.Entry<String,Long> m : onlinerMap.entrySet()){
                System.out.println(m.getKey()+"   "+m.getValue());
            }


        }


    }

}
