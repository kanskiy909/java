import java.util.*;

public class tap4 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3)
                .stream()
                .map(x->x*x)
                .forEach(System.out::println);
    }
}