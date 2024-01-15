public class Person {
    private int regiNum;     // 주민등록 번호
    private int passNum;     // 여권 번호
    private String name;
    
    //함수 오버 로딩 = 생성자도 그대로 적용됨
    public Person(int rnum, int pnum) {
        regiNum = rnum;
        passNum = pnum;
    }
    //Person kim = new Person(334477,112233,"김복순");
    public Person(int rnum, int pnum,String name) {
        this.regiNum = rnum;
        this.passNum = pnum;
        this.name = name;
        
    }
    
    public Person(int rnum) {
        regiNum = rnum;
        passNum = 0;
    }  
    
    //주민등록 번호: 334477
   //여권 번호: 112233
   //이름: 김복순
    
    public void showPersonalInfo() {
        
       System.out.println("주민등록 번호: " + regiNum);
        
        if(passNum != 0)
            System.out.println("여권 번호: " + passNum );
        else
            System.out.println("여권을 가지고 있지 않습니다.");
        
        if(name == null )
            System.out.println("이름:" + "이름이 없습니다");
        else
            System.out.println("이름:" + name);
        
        System.out.println();
    }   
    
}

class ConOverloading {
    public static void main(String[] args) {
       // 여권 있는 사람의 정보를 담은 인스턴스 생성
       Person jung = new Person(334477,112233);
       
       // 여권 없는 사람의 정보를 담은 인스턴스 생성
       Person hong = new Person(775544);
       
       jung.showPersonalInfo();
       hong.showPersonalInfo();
       
       Person kim = new Person(334477,112233,"김복순");
       kim.showPersonalInfo();
       
       //주민등록 번호: 334477
       //여권 번호: 112233
       //이름: 김복순
       
       
    }
}