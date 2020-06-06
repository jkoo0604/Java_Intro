import java.util.Arrays;
public class BasicJava {
    public static void main(String[] args) {
        print255();
        printOdd255();
        printSum255();
        int[] sample4 = {1,3,5,7,9,13};
        printArray(sample4);
        int[] sample5 = {-3, -5, -7, 0};
        System.out.println(findMax(sample5));
        int[] sample6 = {2, 10, 3, 7};
        System.out.println(findAvg(sample6));
        System.out.println(Arrays.toString(oddArray()));
        int[] sample8 = {1,3,5,7};
        System.out.println(greaterThanY(sample8,3));
        int[] sample9 = {1,5,10,-2};
        System.out.println(Arrays.toString(squareArray(sample9)));
        int[] sample10 = {1,5,10,-2};
        System.out.println(Arrays.toString(noNegArray(sample10)));
        int[] sample11 = {1,5,10,-2};
        System.out.println(Arrays.toString(findMaxMinAvg(sample11)));
        int[] sample12 = {1, 5, 10, 7, -2};
        System.out.println(Arrays.toString(shiftValues(sample12)));

    }

    public static void print255() {
        for (int i = 1; i<=255; i++) {
            System.out.println(i);
        }
    }

    public static void printOdd255() {
        for (int i = 1; i<=255; i+=2) {
            System.out.println(i);
        }
    }

    public static void printSum255() {
        int sum = 0;
        for (int i = 1; i<=255; i++) {
            sum += i;
            System.out.println("New Number: " + i + "Sum: " + sum);
        }
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int findMax(int[] intArray) {
        int max = intArray[0];
        for (int i=0; i<intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public static double findAvg(int[] intArray) {
        double sum = 0;
        for (int i = 0; i<intArray.length; i++) {
            sum += intArray[i];
        }
        return sum/intArray.length;
    }

    public static int[] oddArray() {
        int[] newArray = new int[((255-1)/2)+1];
        int j = 0;
        for (int i = 1; i<=255;i+=2) {
            newArray[j] = i;
            j++;
        }
        return newArray;
    }

    public static int greaterThanY(int[] intArray, int y) {
        int count = 0;
        for (int i=0;i<intArray.length; i++) {
            if (intArray[i] > y) {
                count++;
            }
        }
        return count;
    }

    public static int[] squareArray(int[] intArray) {
        for (int i=0;i<intArray.length;i++) {
            intArray[i] = intArray[i] * intArray[i];
        }
        return intArray;
    }

    public static int[] noNegArray(int[] intArray) {
        for (int i=0;i<intArray.length;i++) {
            if (intArray[i] < 0) {
                intArray[i] = 0;
            }
        }
        return intArray;
    }

    public static Object[] findMaxMinAvg(int[] intArray) {
        double sum = 0;
        int max = intArray[0];
        int min = intArray[0];
        for (int i=0;i<intArray.length;i++) {
            sum+=intArray[i];
            if (intArray[i] > max) {
                max = intArray[i];
            } else if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        Object[] newArray = {max, min, sum/intArray.length};
        return newArray;
    }

    public static int[] shiftValues(int[] intArray) {
        for (int i=0;i<intArray.length-1;i++) {
            intArray[i] = intArray[i+1];
        }
        intArray[intArray.length-1] = 0;
        return intArray;
    }


}