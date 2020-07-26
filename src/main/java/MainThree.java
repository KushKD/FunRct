import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainThree {

    public static void main(String... params) {

        Predicate<String> checkLength = (s) -> !s.isEmpty() && s.length() >= 4 && s.contains("o");
        Predicate<Integer> checkNumber = (s) -> s >= 5;
        PracticeFI practiceFI = (Object... objects) -> {
            List data = new ArrayList<>();
            for (int i = 0; i < objects.length; i++) {
                data.add(objects[i]);
            }

            return data;
        };

        List updatedList = getUpdatedList(practiceFI.getData(14, 34, 1, 23, 56, 89, 54), checkNumber);
        List updatedList2 = getUpdatedList(practiceFI.getData("kush Dhawan o", "foxes", "", "fFd", "rewter", "oooooo"), checkLength);
        System.out.println(updatedList + "  " + updatedList2);
    }

    private static <T> List<T> getUpdatedList(List<T> integers, Predicate<T> check) {
        List<T> getupdatedList = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (check.test(integers.get(i))) {
                getupdatedList.add(integers.get(i));
            }
        }

        return getupdatedList;
    }


}
