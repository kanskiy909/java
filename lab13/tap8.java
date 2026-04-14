import java.util.*;

public class tap8 {
    public static void main(String[] args) {
        Arrays.asList("java","programming","code")
                .stream()
                .filter(s->s.length()>5)
                .forEach(System.out::println);
    }
}