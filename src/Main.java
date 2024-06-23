import java.util.*;
import static net.mindview.util.Print.*;
import static net.mindview.util.Range.*;


public class Main
{
    public static char findMissingLetter(char[] array)
    {
        char result = ' ';
        int count = array[0];
        for (int i = 0; i < array.length; i++) {

            if(count == (int)array[i]) {
                count += 1;
            }
            else {
                result = (char)count;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        char[] a = {'O','Q','R','S'};
        char c = findMissingLetter(a);
        System.out.println(c);
    }
}