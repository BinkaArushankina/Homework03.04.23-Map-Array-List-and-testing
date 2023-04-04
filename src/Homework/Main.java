package Homework;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        //Решить и написать тесты для следующих задач:
        Main main = new Main();
        //1)Дана Map map, написать метод, который вернет мапу, такую, что если в исходной map есть ключи ‘a’ и ‘b’,
        // то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве значения.
        // Если нет, ничего не менять
        // Примеры:
        // mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        // mapAB({"a": "Hi"}) → {"a": "Hi"}
        // mapAB({"b": "There"}) → {"b": "There"}
        Map<String,String> maps= new HashMap<>();
        maps.put("a","Hi");
        maps.put("b","There");
        System.out.println(main.map(maps));
        //2)Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем,
        // а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
        // Примеры:
        // wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        // wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        // wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        String[]strings= {"a","b","a","c","b"};
        System.out.println(main.wordMultiple(strings));
        //3)Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет количество вхождений
        // этого имени в список.
        // Пример: nameToNumberOccurence(List list, String name)
        // Vasia -> 3
        List <String> names= Arrays.asList("John","John","Jack","Jack","Jack");
        System.out.println(main.nameToNumberOccurence(names,"Jack"));
    }

    public Map<String,String> map(Map <String,String> map){
            if(map.containsKey("a") && map.containsKey("b")) {
                String key = "a" + "b";
                String value = map.get("a") + (map.get("b"));
                map.put(key, value);
            }
        return map;
    }

    public Map<String,Boolean> wordMultiple(String[] strings){
        Map<String,Boolean>map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }
        }
        return map;
    }

    public int nameToNumberOccurence(List<String> list, String name){
        //int counter=0;
        //for (Object o : list) {
        //    if (o.equals(name)) {
        //        counter++;
        //    }
        //}
        //return counter;


        //2 Variant

        Map<String,Integer>result = new HashMap<>();
        for(String s: list){
        if(result.containsKey(s)){
            result.put(s,result.get(s)+1);  //  key (s),  i to schto w result.get(s) usche bilo uwelitschiwaem na 1
        }else{
            result.put(s,1);                //  key (s), i 1 bolsche on ne wstretschaetsa
        }
        }
        return result.getOrDefault(name,0);

    }
}
