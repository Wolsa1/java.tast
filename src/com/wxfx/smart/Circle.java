package com.wxfx.smart;

//정보 은닉 개념을 도입하시오
//

public class Circle {
    private int age;
    private String name;

    
    public Circle(int age, String name) {
        this.age = age;
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public String getName() {
        return name;
    }

  
    public void showInfo() {
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
    }

    public static void main(String[] args) {
        
        Circle myCircle = new Circle(10, "박민호");
        myCircle.showInfo();
        
       
    }
}