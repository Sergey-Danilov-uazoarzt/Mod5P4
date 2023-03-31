import java.util.Scanner;
public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифры три раза: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        String number = a + "," + b + "," + c;

        System.out.println(number);
    }
}
