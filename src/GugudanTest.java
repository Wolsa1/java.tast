class Gugudan{
	void printGugu(int n) {
    	for(int i = 1; i <= n; i++) {
        	for(int j = 1; j <= 9; j++) {
            	System.out.println(i+" * "+j+" = "+(i * j));
            }
            System.out.println();
        }
    }
}

public class GugudanTest{
	public static void main(String[]args) {
    	Gugudan gugudan = new Gugudan();
        gugudan.printGugu(10);
        gugudan.printGugu(20);
    }
}