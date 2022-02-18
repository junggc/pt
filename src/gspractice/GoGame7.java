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
        loop:
        while (true) {

            gt.setComvalue((int) (Math.random() * 3) + 1);

            System.out.println(gt.getComvalue());
            //1 주먹,2가위 3 보로 정한다
            System.out.println("숫자 1~3까지 한가지만 입력하세요");
            //스캐너 클래스 생성하여 내값을 입력 받는다

            while(true) {
                Scanner sc = new Scanner(System.in);

                //내 입력값을 myvalue에 set 한다 여기까지가 pc와 나의 입력값 반영
                try {
                    gt.setMyvalue(Integer.parseInt(sc.nextLine()));

                    if ((gt.getMyvalue() != 1) && (gt.getMyvalue() != 2) && (gt.getMyvalue() != 3)) {
                        System.out.println("숫자는 1~3 까지 가능 합니다.");
                        continue;
                    }
                } catch (Exception r) {
                    System.out.println("숫자만 입력 하세요");
                    continue;
                }break;
            }

            //나와 pc의 값을 입력 받았으니 서로의 입력값 확인
            if (gt.getMyvalue() == 1) {
                System.out.println("나는 주먹");
            } else if (gt.getMyvalue() == 2) {
                System.out.println("나는 가위");
            } else if (gt.getMyvalue() == 3) {
                System.out.println("나는 보");
            }
            if (gt.getComvalue() == 1) {
                System.out.println("pc는 주먹");
            } else if (gt.getComvalue() == 2) {
                System.out.println("pc는 가위");
            } else if (gt.getComvalue() == 3) {
                System.out.println("pc는 보");
            }
            //승부 반영
            //내값과 pc 값을 비교

            int win = gt.getWinvalue();
            int lose = gt.getLosevalue();
            int draw = gt.getDrawvalue();


            if ((gt.getMyvalue() == 1 && gt.getComvalue() == 2) || (gt.getMyvalue() == 2 && gt.getComvalue() == 3) || (gt.getMyvalue() == 3 && gt.getComvalue() == 1)) {
                win++;
                gt.setWinvalue(win);
                System.out.println("이겼습니다!");

            }else if ((gt.getMyvalue() == 1 && gt.getComvalue() == 3) || (gt.getMyvalue() == 2 && gt.getComvalue() == 1) || (gt.getMyvalue() == 3 && gt.getComvalue() == 2)){
                lose++;
                gt.setLosevalue(lose);
                System.out.println("졌습니다.");

            }else if (gt.getMyvalue() == gt.getComvalue()) {
                draw++;
                gt.setDrawvalue(draw);
                System.out.println("비겼습니다.");
            }

            System.out.println("또 게임을 하겠습니까? y또는 n으로 입력하세요");
            loop1:
            while(true) {
                Scanner rg = new Scanner(System.in);

                try{
                    gt.setRegame(String.valueOf(rg.nextLine()));
                }catch(Exception e){
                    System.out.println("문자만 입력하세요");
                }


                if (gt.getRegame().equals("y")) {
                    System.out.println("게임을 다시 시작합니다.");
                    continue loop;
                } else if (gt.getRegame().equals("n")) {
                    System.out.println("게임을 종료 합니다.");
                    break;
                } else if (!gt.getRegame().equals("y") || !gt.getRegame().equals("n")) {
                    System.out.println("y또는 n으로 정확하게 입력 해주세요");
                    continue loop1;
                }break;
            }break ;
        }


        System.out.println("총 게임횟수 "+ (gt.getWinvalue()+gt.getLosevalue()+gt.getDrawvalue()));
        System.out.println(gt.getWinvalue() + "승 " + gt.getDrawvalue() + "무 " + gt.getLosevalue() + "패");













    }


}
