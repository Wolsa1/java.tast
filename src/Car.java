public class Car {
	   public Car() {
		      System.out.println("차 입니다.");
		   }

		}

		class UpDown{
		   int num =0 ;
		   
		   void up(int num) {
		      this.num += num;
		      System.out.println(num);
		   }
		   
		   void up(int num,int num2) {
		      this.num += num;
		      System.out.println(this.num);
		   }
		   void up(String str) {
			      this.num += num;
			      System.out.println(num);
			   }
		   void up(String str1,String str2) {
			      this.num += num;
			      System.out.println(num);
			   }
		   
			   
		   void upDouble(double num) {
		      this.num += num;
		      System.out.println(num);
		   }
		   
		   
		}

class CarTest{
	public static void main(String[] args) {
		      UpDown up = new UpDown();
		      up.up(9);      
		      up.up(7.5);
		      up.up("AAA");
		      
		      up.up(10,10);
		      
		      up.up("AAA","BBB");
		      
		      
		   }
		} 

