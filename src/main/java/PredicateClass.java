import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
        names.add("Kush");
        names.add("Luv");
        names.add("");
        names.add("Minki");
        names.add("");

        Predicate<String> checkBlank = (s)->!s.isEmpty();
        Predicate<String> checklength = (s)->s.length()<=4 && !s.isEmpty();
        List<String> newNames = fileterList(names,checkBlank);
        List<String> newNamesLength = fileterList(names,checklength);
        System.out.println(newNames);
        System.out.println(newNamesLength);
    }

    private static <T> List<T> fileterList(List<T> list, Predicate<String> predicate) {
        List<T> updated = new ArrayList<>();
        for(int i=0; i<list.size();i++){
            if(predicate.test(list.get(i).toString())) {
                updated.add(list.get(i));
            }
        }
        return updated;
    }
}
