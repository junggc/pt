package gspractice;

import java.util.Random;
import java.util.Scanner;

public class GoGame {
    public static void main(String[] args){

        GetSet gt = new GetSet();

            Scanner sc = new Scanner(System.in); //내가 입력할 스캐너
            System.out.println();
            loop:
            while(true) {
                Random rd = new Random();//rd
                gt.setComvalue(rd.nextInt()); //= (int) (Math.random() * 3) + 1;//d는 컴퓨터 랜덤값
//                    System.out.println(d);
                //1=주먹 2=가위 3=보
                System.out.println("1~3 사이의 숫자를 입력하시오");

                try {
                    gt.setMyvalue(sc.nextInt());// = Integer.parseInt(sc.nextLine());
                    if(gt.getMyvalue()!=1 && gt.getMyvalue()!=2 && gt.getMyvalue()!=3){
                        System.out.println("1~3 까지 입력하세요");
                        continue;
                    }


                }catch(Exception e2){
                    System.out.println("잘못 입력했습니다 숫자 1~3만 입력하세요");
                    continue;
                }




                if (gt.getMyvalue() == gt.getComalue()) {
                    GetSet.()
                    System.out.println("비겼습니다");
                } else if (c == 1 && T22.d == 2) {
                    T22.e++;
                    System.out.println("이겼습니다");
                } else if (c == 1 && d == 3) {
                    T22.f++;
                    System.out.println("졌습니다");
                } else if (c == 2 && d == 1) {
                    T22.f++;
                    System.out.println("졌습니다");
                } else if (c == 2 && d == 3) {
                    T22.e++;
                    System.out.println("이겼습니다");
                } else if (c == 3 && d == 1) {
                    T22.e++;
                    System.out.println("이겼습니다");
                } else if (c == 3 && d == 2) {
                    T22.f++;
                    System.out.println("졌습니다");
                }
                if (d == 1) {
                    System.out.println("PC=주먹");
                } else if (d == 2) {
                    System.out.println("PC=가위");
                } else {
                    System.out.println("PC=보");
                }
                switch (c) {
                    case (1):
                        System.out.println("나=주먹");
                        break;
                    case (2):
                        System.out.println("나=가위");
                        break;
                    case (3):
                        System.out.println("나=보");
                        break;
                }
                if (T22.d == 1 && c == 2) {
                    System.out.println(T22.a);
                } else if (d == 2 && c == 1) {
                    System.out.println(T22.b);
                } else if (d == 3 && c == 2) {
                    System.out.println(T22.b);
                }
                if (d == 1 && c == 3) {
                    System.out.println(T22.b);
                } else if (T22.d == 2 && T22.c == 3) {
                    System.out.println(T22.a);
                } else if (T22.d == 3 && c == 1) {
                    System.out.println(T22.a);
                } else if (T22.c == T22.d) {
                    System.out.println(T22.g);
                }
//                    System.out.println("이긴횟수:" + T22.e);
//                    System.out.println("진 횟수:" + T22.f);
//                    System.out.println("비긴 횟수:" + T22.h);

                GetSet total = new GetSet();
                total.getWinvalue();total.getDrawvalue();total.getLosevalue();


                loop1:
                while (true) {
                    System.out.println("계속 게임을 진행 합니까? y or n");
                    Scanner gamePlay = new Scanner(System.in);
                    p = gamePlay.nextLine();// 게임 진행 여부 입력
                    if (p.equals("y")) {
                        continue loop;
                    } else if (!p.equals("y") && !p.equals("n")) {
                        System.out.println("잘못 입력하셨습니다.y 또는 n 으로 입력하세요");
                        continue loop1;
                    } else if (p.equals("n")) {
                        System.out.println("Game Over");
                        break;
                    }
                }
                break;
            }
            gt.getWinvalue();


        }


    }




