public class LottoProgram {
	public static void main(String[] args){
	    
	    int[] LottoArr = new int[6]; // 길이가 6인 int[] 배열 생성
	    
	    for(int i=0; i<LottoArr.length; i++){
	    //   
	    	LottoArr[i] = (int)(Math.random()*45)+1;
	    	// 난수 생성
			for(int j=0; j<i; j++){
	        	if(LottoArr[i] == LottoArr[j]){
			       	i--; // 값 비교 후 같다면 i 감소
					break; // i 반복문으로 다시 회귀
			} // if문 범위
		  } // for문 변수 j 범위
		} // for문 변수 i 범위
	    
	    for(int e : LottoArr){
	    	System.out.print(e + " ");
	    
	    } // enhanced For문 범위
	  } // main함수 범위
	} // LottoProgram 범위
