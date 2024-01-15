class BankAccount {
	int balance = 0;    // 예금 잔액

	   // balance와 연관있는 메소드
	    public int deposit(int amount){
	        balance += amount;
	        return balance;
	    }

	   // balance와 연관있는 메소드
	    public int withdraw(int amount){
	        balance -= amount;
	        return amount;
	    }

	   // balance와 연관있는 메소드
	    public int checkMyBalance(){
	        System.out.println("잔액: " + balance);
	        return balance;
	    }
	}

	public class BankTest {

	   public static void main(String[] args) {
		   String str = "ABCD";
		   
		   System.out.println(str);

		   
		   BankAccount ref1 = new BankAccount();
	      BankAccount ref2 = ref1;   // ref1이 참조하는 대상을 ref2도 참조

//	        ref2=null;
//	        System.out.println(ref1);
	 //       System.out.println(ref2);
	        
	        
//	        if(ref2 == null) {
//	        	System.out.println("프로그램 종료 입니다");
//	        }else {
//	        }
	        
	        ref1.deposit(3000);
	        ref2.deposit(2000);
	        ref1.withdraw(400);
	        ref2.withdraw(300);
	        ref1.checkMyBalance();
	        ref2.checkMyBalance();
	   
	   }

	}