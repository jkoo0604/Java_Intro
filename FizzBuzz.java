public class FizzBuzz {
    public String checkModulo(int number) {
        if (number%3 == 0) {
            if (number%5==0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (number%5==0) {
            return "Buzz";
        } else {
            String numtxt = Integer.toString(number);
            // String.valueOf(number) also works
            return numtxt;
        }
    }
}