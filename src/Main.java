import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> evenNumbers = new ArrayList<>();
        for (int x : intList) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            evenNumbers.add(x);
        }
        Collections.sort(evenNumbers);
        for (int i : evenNumbers) System.out.println(i);
    }
    }