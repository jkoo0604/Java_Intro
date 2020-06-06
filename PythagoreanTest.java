public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean iD = new Pythagorean();
        double hype = iD.calcHypotenuse(6, 8);
        System.out.println("Hypotenuse of a right triangle given legs 6 and 8 is: " + hype);
    }
}