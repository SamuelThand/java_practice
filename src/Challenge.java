import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {
    public static int differenceMaxMin(int[] arr) {

        Arrays.sort(arr);
        int lastIndex = arr.length - 1;

        return arr[lastIndex] - arr[0];

    }

    public static String nameShuffle(String s) {
            int spaceIndex = s.indexOf(' ');
            int stringLength = s.length();

            String firstName = s.substring(0, spaceIndex);
            String lastName = s.substring(spaceIndex + 1, stringLength);
            String shuffledName = lastName + " " + firstName;

            return shuffledName;
    }

    public class ExistsANumberHigher {
        public static boolean existsHigher(int[] arr, int n) {
            boolean exists = false;
            for (int element : arr) {
                if (element > n) exists = true;
            }
            return exists;
        }
    }

    public class ArrayOfMultiples {
        public static int[] buildArray(int number, int length) {
            int[] multiples = new int[length];
            for (int i = 0; i < length; i++) {
                multiples[i] = number * (i + 1);
                System.out.println(Arrays.toString(multiples));
            }
            return multiples;
        }
    }

    public class StringMatching {
        public static boolean checkStringMatching(String string1, String string2) {
            String endOfString1 = string1.substring((string1.length() - string2.length()));
            return endOfString1.contentEquals(string2);
        }
    }

}