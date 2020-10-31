import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся
        int[] numbers = new int[] {1,1,1,1,2,3,4,5,6,7,7,9,10};

        //  Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        System.out.println(getUniqueSet(numbers));

        // Посчитать сколько раз встречается каждое слово
        System.out.println(getDuplicatesMap(numbers));



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Doe", "+78005553535");
        phoneBook.add("Joe", "+78007171716");
        phoneBook.add("Goe", "+78005003535");
        phoneBook.add("Doe", "+78009999999");
        phoneBook.add("Zoe", "+78001234567");


        System.out.println("Phone numbers for Doe: " + phoneBook.get("Doe"));
        System.out.println("Phone numbers for Joe: " + phoneBook.get("Joe"));
        System.out.println("Phone numbers for Coco: " + phoneBook.get("Coco"));
    }

    static Set<Integer> getUniqueSet(int[] array) {
        return new HashSet(arrayToList(array));
    }

    static Map<Integer, Integer> getDuplicatesMap(int[] array) {
        Map<Integer, Integer> map = new HashMap();
        for (int number : array) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            }
            else {
                map.put(number, map.get(number) + 1);
            }
        }
        return map;
    }

    static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }
}
