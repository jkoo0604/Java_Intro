import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class PuzzleJava {
    public static void main(String[] args) {
        int[] sample1 = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(greaterThan10(sample1));
        String[] sample2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(greaterThan5Char(sample2));
        shuffleAlphabet();
        System.out.println(randomArray());
        System.out.println(randomList());
        System.out.println(randStr());
        System.out.println(randStrArray());
    }

    public static ArrayList<Integer> greaterThan10(int[] intArray) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0;i<intArray.length;i++) {
            sum+=intArray[i];
            if (intArray[i] > 10) {
                newArray.add(intArray[i]);
            }
        }
        System.out.println(sum);
        return newArray;
    }

    public static ArrayList<String> greaterThan5Char(String[] nameArray) {
        ArrayList<String> newArray = new ArrayList<String>(Arrays.asList(nameArray));
        Collections.shuffle(newArray);
        for (int i = 0;i<newArray.size();i++) {
            System.out.println(newArray.size());
            System.out.println(newArray.get(i));
            if (newArray.get(i).length() <= 5) {
                newArray.remove(i);
                i--;
            }
        }
        return newArray;
    }

    public static void shuffleAlphabet() {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> newArray = new ArrayList<Character>();
        for (int i=0;i<alphabet.length;i++) {
            newArray.add(alphabet[i]);
        }
        Collections.shuffle(newArray);
        System.out.println(newArray.get(0));
        System.out.println(newArray.get(newArray.size()-1));
        if (newArray.get(0) == 'a' || newArray.get(0) == 'e' || newArray.get(0) == 'i' || newArray.get(0) == 'o' || newArray.get(0) == 'u') {
            System.out.println("First element in shuffled list is a vowel");
        }
    }

    public static String randomArray() {
        Random randnum = new Random();
        int[] randArray = new int[10];
        for (int i=0;i<10;i++) {
            randArray[i] = randnum.nextInt(100-55)+1+55;

        }
        return Arrays.toString(randArray);
    }

    public static ArrayList<Integer> randomList() {
        Random r = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            randArray.add(r.nextInt(100-55)+1+55);

        }
        Collections.sort(randArray);
        for (int j=0;j<randArray.size();j++) {
            System.out.println(randArray.get(j));
        }
        System.out.println("Maximum value: " + Collections.max(randArray));
        System.out.println("Minimum value: " + Collections.min(randArray));
        return randArray;
    }

    public static String randStr() {
        int lower = 97;
        int upper = 122;
        Random randNum = new Random();
        char[] randString = new char[5];
        String returnStr = new String();
        for (int i=0;i<5;i++) {
            randString[i] = (char) (randNum.nextInt(upper-lower)+1+lower);
            returnStr+=randString[i];
        }
        return returnStr;
    }

    public static String randStrArray() {
        int lower = 97;
        int upper = 122;
        Random rn = new Random();
        char[] randString = new char[5];
        String returnStr = new String();
        String[] returnArray = new String[10];
        for (int j=0;j<10;j++) {
            returnStr="";
            for (int i=0;i<5;i++) {

                randString[i] = (char) (rn.nextInt(upper-lower)+1+lower);
                returnStr+=randString[i];
            }
            returnArray[j] = returnStr;

        }
        return Arrays.toString(returnArray);
    }

}