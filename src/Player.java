

public class Player {

	   // 1.가위 2.바위 3.보
	   private int rsp;

	   // 컴퓨터가 객체 생성 될때
	   public Player() {
	      rsp = (int) (Math.random() * 3 + 1);
	   }

	   public Player(String str) {
	      if (str.equals("가위"))
	         rsp = 1;
	      else if (str.equals("바위"))
	         rsp = 2;
	      else
	         rsp = 3;
	   }

	   public void getResult(Player player) {

	      if (this.rsp == player.rsp) {
	         System.out.println("비겼습니다.");
	         return;
	      }

	      // 1.가위 2.바위 3.보
	      if (this.rsp == 1 && player.rsp == 2) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rsp == 1 && player.rsp == 3) {
	         System.out.println("제가 이겼습니다.");
	      } else if (this.rsp == 2 && player.rsp == 1) {
	         System.out.println("제가 이겼습니다.");
	      } else if (this.rsp == 2 && player.rsp == 3) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rsp == 3 && player.rsp == 1) {
	         System.out.println("제가 졌습니다.");
	      } else if (this.rsp == 3 && player.rsp == 2) {
	         System.out.println("제가 이겼습니다");
	      }

	   }

	}