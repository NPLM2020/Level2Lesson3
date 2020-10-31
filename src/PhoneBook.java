import java.util.*;

/**
 * Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class PhoneBook {

    private HashMap<String, Set<String>> book = new HashMap<>();

    public void add(String name, String number){
        if (!book.containsKey(name)) {
            book.put(name, new HashSet());
        }
        book.get(name).add(number);
    }

    public Collection<String> get(String name) {
        return book.containsKey(name) ? book.get(name) : Collections.emptyList();
    }

}
