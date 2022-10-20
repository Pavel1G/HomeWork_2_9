import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Задание 1 урока 2.9 \"Коллекции\".");
        part01();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 2 урока 2.9 \"Коллекции\".");
        part02();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        System.out.println("Задание 3 урока 2.9 \"Коллекции\".");
        part03();
    }

    public static void part01() {
        Map<String, String> phonebook = new HashMap<>();
        for (int i = 0; i < 21; i++) {
            phonebook.put("SecondName FirstName " + (int) (Math.random() * 100 + 1),
                    "+7" + (int) (Math.random() * 999_999_999 + 900_000_000));
        }
        System.out.println(phonebook);
    }

    public static void part02() {
        System.out.println("Для ознакомления с решением задачи прошу проследовать по этой ссылке -" +
                " https://github.com/Pavel1G/HomeWork_2_8/pull/1");
    }

    public static void part03() throws Exception {
        Map<String, Integer> randomMap = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            randomMap.put("str" + (int) (Math.random() * 4), (int) (Math.random() * 4));
        }
        System.out.println(randomMap);
        for (int i = 0; i < 4; i++) {
            Method.addData(randomMap);
            System.out.println(randomMap);
        }
    }
}