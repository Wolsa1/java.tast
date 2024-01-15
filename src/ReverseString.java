import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력:");
        String inputString = scanner.nextLine();

        System.out.print("출력:");
        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }

        scanner.close();
    }
}