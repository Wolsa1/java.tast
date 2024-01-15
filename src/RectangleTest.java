public class RectangleTest {
	 private int width;
	   private int height;

	   public RectangleTest(int width, int height) {
	      setWidth(width);
	      setHeight(height);
	   }
	   
	   public int getWidth() {
	      return width;
	   }

	   public void setWidth(int width) {

	      if (width < 0) { // 반지름은 0보다 작을 수 없으므로
	         width = 0;
	         return; // 메소드를 빠져나감
	      }

	      this.width = width;
	   }

	   public int getHeight() {
	      return height;
	   }

	   public void setHeight(int height) {
	      if(height < 0) {
	         height = 0;
	         return;
	      }
	      
	      this.height = height;
	   }

	   public int getArea() {
	      return width * height;
	   }

	}