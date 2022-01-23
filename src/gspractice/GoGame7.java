package gspractice;

import java.util.Random;
import java.util.Scanner;

public class GoGame7 {

    public static void main(String[] args) {
        //클래스변수 gt 생성 GetSet 클래스를 gt 로 사용하겠다
        GetSet gt = new GetSet();

        //pc와 가위바위보 게임하기
        System.out.println("가위바위보 게임을 시작합니다.");
        //먼저 pc의 값을 정해본다 랜덤함수를 이용하여 1에서 3까지의 숫자중 한가지를 comvalue 에 set 한다
        gt.setComvalue((int) (Math.random() * 3) + 1);

        System.out.println(gt.getComvalue());
        //1 주먹,2가위 3 보로 정한다다
       System.out.println("숫자 1~3까지 한가지만 입력하세요");
        //스캐너 클래스 생성하여 내값을 입력 받는다
        Scanner sc = new Scanner(System.in);

        //내 입력값을 myvalue에 set 한다 여기까지가 pc와 나의 입력값 반영
         gt.setMyvalue(Integer.parseInt(sc.nextLine()));

        //나와 pc의 값을 입력 받았으니 승부를 겨뤄야 한다 우선 경우의 수를 따져본다












    }


}
