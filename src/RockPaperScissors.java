import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
            String userChoice = scanner.nextLine().toLowerCase();  // 입력값을 소문자로 변환

            if (!(userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보"))) {
                System.out.println("잘못된 입력입니다. 가위, 바위, 보 중 하나를 입력하세요.");
                continue;
            }

            int computerRandom = random.nextInt(3);  // 0, 1, 2 중 무작위로 선택
            String[] choices = {"가위", "바위", "보"};
            String computerChoice = choices[computerRandom];

            System.out.println("컴퓨터: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("비겼습니다.");
            } else if (
                (userChoice.equals("가위") && computerChoice.equals("보")) ||
                (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                (userChoice.equals("보") && computerChoice.equals("바위"))
            ) {
                System.out.println("이겼습니다!");
            } else {
                System.out.println("졌습니다.");
            }

            System.out.print("계속하시겠습니까?(Y/N): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("y")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}
