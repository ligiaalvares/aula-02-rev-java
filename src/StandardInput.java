import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextLong();
        var c = scanner.nextFloat();
        var d = scanner.nextDouble();
        var bb = scanner.nextBoolean();

        var s = scanner.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(bb);
        System.out.println(s);

        scanner.close();
    }
}
