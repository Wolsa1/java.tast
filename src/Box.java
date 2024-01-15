public class Box {
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}	
}

class AutoCallToString{
	public static void main(String[] args) {
		
		Box box = new Box("Camera");
		System.out.println(box.toString());
		System.out.println(box);
		
	}
}