import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude_05_EX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());

        Collections.reverse(list);
        list.stream().filter(e -> e % n != 0).forEach(e -> System.out.print(e + " "));
    }
}
