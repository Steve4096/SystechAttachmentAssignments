import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCollection {
    Map<Integer, List<String>> mapCollection=new HashMap<>();

    public static void main(String[]args){
        mapCollection();
    }

    public static void mapCollection(){
        Map<Integer, List<String>> mapCollection=new HashMap<>();
        List<String> list1=new ArrayList<>();
        list1.add("Gas");
        list1.add("Mattress");
        list1.add("Utensils");
        list1.add("Curtains");
        mapCollection.put(1,list1);

        List<String> list2=new ArrayList<>();
        list2.add("Racks");
        list2.add("Chair");
        list2.add("Table");
        mapCollection.put(2,list2);

        List<String> list3=new ArrayList<>();
        list3.add("Bed");
        list3.add("Carpet");
        list3.add("Mirror");
        mapCollection.put(3,list3);

        List<String> list4=new ArrayList<>();
        list4.add("Bathroom");
        list4.add("Kitchen");
        list4.add("Dining Room");
        mapCollection.put(4,list4);

        List<String> list5=new ArrayList<>();
        list5.addAll(list4);
        mapCollection.put(5,list5);

        for (Map.Entry<Integer, List<String>> entry:mapCollection.entrySet()){
            System.out.println("The key is: "+entry.getKey()+". The value is: "+entry.getValue());
        }
    }

    public static void map(){
        Map<String, List<Integer>> numbers=new HashMap<>();
        List<Integer> one=new ArrayList<>();
        one.add(1);
        one.add(2);
        one.add(3);
        numbers.put("one",one);

        List<Integer> two=new ArrayList<>();
        two.add(1);
        two.add(2);
        two.add(3);
        two.add(4);
        two.add(5);
        numbers.put("two",two);

        List<Integer> three=new ArrayList<>();
        three.add(1);
        three.add(2);
        three.add(5);
        numbers.put("three",three);

        for (Map.Entry<String, List<Integer>> entry:numbers.entrySet()){
            if(entry.getKey().equalsIgnoreCase("two")){
                entry.getValue().set(2,4);
            }
            System.out.println("The key is: "+entry.getKey()+"The value is: "+entry.getValue());
        }
    }


}
