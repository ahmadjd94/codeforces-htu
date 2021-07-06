import java.util.Scanner;

public class cap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.matches("[A-Z]*")) {
            System.out.println(s.toLowerCase());
        } else if (s.matches("[a-z][A-Z]*")) {
            System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase());
        } else {
            System.out.println(s);
        }
    }
}