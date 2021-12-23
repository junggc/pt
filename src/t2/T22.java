package t2;

import ppt.Prac4;

public class T22 {
   //클래스의 생성자
    public T22(){
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;

    }

//t22 클래스를 선언하여
    //d에 랜덤한숫자를 대입하고
    //내가 입력받은 값을 c에 대입하여
    //if문을 활용해서 가위바위보를 진행
    //내가 이긴경우 a 출력
    //내가 진 경우 b출력
    //비긴 경우 g 출력
    //내가 이긴 횟수는 e에 대입
    //내가 진 횟수는 f에 대입
    //내가 비긴 횟수는 h에 대입

    //결과출력메소드 호출
    public void win(){
        System.out.print(e+"승");
    }
    public void draw(){
        System.out.print(h+"무");
    }
    public void lose(){
        System.out.println(f+"패");
    }

    public void totalgame(){
        System.out.println("총 게임 전적 " + e +"승 " + h + "무 " + f + "패 ");
    }

    //public
    //상수 a = 1;
    public static int a=1;

    //public
    //고유한 상수 b = 2;

    public static  int b=2;

    //public
    //고유한 변수 d = 4;
    public static int d=4;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        T22.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        T22.b = b;
    }

    public static int getD() {
        return d;
    }

    public static void setD(int d) {
        T22.d = d;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        T22.c = c;
    }

    public static int getE() {
        return e;
    }

    public static void setE(int e) {
        T22.e = e;
    }

    public static int getF() {
        return f;
    }

    public static void setF(int f) {
        T22.f = f;
    }

    public static int getG() {
        return g;
    }

    public static void setG(int g) {
        T22.g = g;
    }

    public static int getH() {
        return h;
    }

    public static void setH(int h) {
        T22.h = h;
    }

    //private
    //변수 c = 3;
   public static int c = 0;
    //public
    //고유한 변수 e = 0;
    //결과 출력메소드 작성
    public static int e=0;

    //public
    //고유한 변수 f = 0;
    public static int f=0;
    //public
    //고유한 변수 g = 6;
    public static int g=0;
    //고유한 변수 h = 6;
    public static int h=0;


}
