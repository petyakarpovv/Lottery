import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> lottery = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            lottery.add(i);
        }
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            int index = random.nextInt(100);
            int temp = lottery.get(index);
            lottery.set(index, lottery.get(i));
            lottery.set(i, temp);
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", lottery.get(i));
        }
    }
}