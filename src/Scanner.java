public class Scanner {
	public Scanner(String source) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
		
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}