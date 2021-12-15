package ppt;

import t2.t22;
import java.util.*;


public class Prac6 {
    public static void main(String[]args){
        int c;//c는 PC
        int d;//d는 나
        Random rd = new Random();//rd
        c=(int)(Math.random()*3)+1;
        System.out.println(c);
        //1=주먹 2=가위 3=보
        Scanner sc = new Scanner(System.in);
        System.out.println("1~3 사이의 숫자를 입력하시오");
        d = sc.nextInt();
        if(c==d){
            System.out.println("비겼습니다");
        }else if(c==1 && d==2){
            System.out.println("이겼습니다");
        }else if(c==1 && d==3){
            System.out.println("졌습니다");
        }else if(c==2 && d==1){
            System.out.println("이겼습니다");
        }else if(c==2 && d==3){
            System.out.println("졌습니다");
        }else if(c==3 && d==1){
            System.out.println("졌습니다");
        }else if(c==3 && d==2){
            System.out.println("이겼습니다");
        }
        if(c==1){
            System.out.println("PC=주먹");
        }else if(c==2){
            System.out.println("PC=가위");
        }else{
            System.out.println("PC=보");
        }
        switch(d){
            case(1):
                System.out.println("나=주먹");
                break;
            case(2):
                System.out.println("나=가위");
                break;
            case(3):
                System.out.println("나=보");
                break;
        }
    }
}
