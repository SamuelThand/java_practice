import java.io.IOException;
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

    public class EqualityOf3Values {
        public static int checkEquality(int num1, int num2, int num3) {
            int equalValues = 0;
            if (num1 == num2 && num1 == num3) equalValues = 3;
            else if (num1 == num2 || num1 == num3) equalValues = 2;
            return equalValues;
        }
    }

    public class basicCalculator {
        public static int calculate(int num1, char operator, int num2){
            if (num2 == 0 && operator == '/') return 0;
            return switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> throw new IllegalStateException(
                "Incorrect operator: " + operator + " Allowed values = + - * /");
            };
        }
    }

    public class captureTheRook {
        public static boolean canCapture(String[] rooks) {
            return (rooks[0].charAt(0) == rooks[1].charAt(0) ||
                    rooks[0].charAt(1) == rooks[1].charAt(1));
        }
    }

    public class phoneNumberFormatting {
        public static String formatNumbers(int[] numbers) {
        //Hashmap implementation?
            StringBuilder phoneNumber = new StringBuilder();
            for (int i = 0; i < numbers.length; i += 1) {
                phoneNumber.append(numbers[i]);
            }
            phoneNumber.insert(0, '(');
            phoneNumber.insert(4, ')');
            phoneNumber.insert(5, ' ');
            phoneNumber.insert(9, '-');
            return phoneNumber.toString();
        }
    }
}