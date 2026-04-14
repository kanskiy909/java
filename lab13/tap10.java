import java.util.*;

public class tap10 {
    public static void main(String[] args) {
        int min=Arrays.asList(7,2,5)
                .stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}