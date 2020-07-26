import java.util.List;

@FunctionalInterface
public interface PracticeFI<T,R> {
    public  List<R> getData(T...input);
}
