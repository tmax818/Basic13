import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Basic13 b13 = new Basic13();
        Object[] theArray = {1,2,3,-4,6,7};
        Object[] result = b13.ReplaceWithDojo(theArray);
        System.out.println(Arrays.toString(result));
    }
}