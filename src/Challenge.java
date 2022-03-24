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
}