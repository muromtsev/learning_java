import java.util.Arrays;
import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = range(5);
        int[] numsStartEnd = range(10, 20);
        int[] numsStartEndStep = range(100, 150, 2);
        print(Arrays.toString(numsStartEndStep));
    }
}