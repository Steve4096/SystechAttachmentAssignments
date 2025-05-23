import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsCollection {

    public static void main(String[]args){
        SetsCollection setsCollection=new SetsCollection();
        List<Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        setsCollection.uniqueNumbers(numbers);
    }


    public Set<Integer> uniqueNumbers(List<Integer> numbers){
        Set<Integer> set1=new HashSet<>();
        set1.addAll(numbers);
        System.out.println(set1);
        return set1;
    }
}
