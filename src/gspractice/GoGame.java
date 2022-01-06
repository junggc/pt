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
                gt.setComvalue((int) (Math.random() * 3) + 1);
                    System.out.println(gt.getComvalue());
                //1=주먹 2=가위 3=보
                System.out.println("1~3 사이의 숫자를 입력하시오");

                try {
                    gt.setMyvalue(Integer.parseInt(sc.nextLine())); //= Integer.parseInt(sc.nextLine());
                    if(gt.getMyvalue()!=1 && gt.getMyvalue()!=2 && gt.getMyvalue()!=3){
                        System.out.println("1~3 까지 입력하세요");
                        continue;
                    }



                }catch(Exception e2){
                    System.out.println("잘못 입력했습니다 숫자 1~3만 입력하세요");
                    continue;
                }


                    int win = gt.getWinvalue();
                    int draw = gt.getDrawvalue();
                    int lose = gt.getLosevalue();
                  // System.out.println(lose);
                if (gt.getMyvalue() == gt.getComvalue()) {
                    draw++;
                    gt.setDrawvalue(draw);
                    System.out.println("비겼습니다");
                } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 2) {
                    win++;
                    gt.setWinvalue(win);
                    System.out.println("이겼습니다");
                } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 3) {
                    lose++;
                    gt.setLosevalue(lose);
                    System.out.println("졌습니다");
                } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 1) {
                    lose++;
                    gt.setLosevalue(lose);
                    System.out.println("졌습니다");
                } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 3) {
                    win++;
                    gt.setWinvalue(win++);
                    System.out.println("이겼습니다");
                } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 1) {
                    win++;
                    gt.setWinvalue(win);
                    System.out.println("이겼습니다");
                } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 2) {
//                    lose=lose+1;
                    //gt.setLosevalue(++lose);
                    lose++;
                    gt.setLosevalue(lose);
                    //lose = 1
                    //set 1
                    // lose + 1
                    System.out.println("졌습니다");

                }
                if (gt.getComvalue() == 1) {
                    System.out.println("PC=주먹");
                } else if (gt.getComvalue() == 2) {
                    System.out.println("PC=가위");
                } else {
                    System.out.println("PC=보");
                }
                switch (gt.getMyvalue()) {
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

//                if (gt.getComvalue() == 1 && gt.getMyvalue() == 2) {
//                   // System.out.println(T22.a);
//                } else if (gt.getComvalue() == 2 && gt.getMyvalue() == 1) {
//                   // System.out.println(T22.b);
//                } else if (gt.getComvalue() == 3 && gt.getMyvalue() == 2) {
//                   // System.out.println(T22.b);
//                }
//                if (gt.getComvalue() == 1 && gt.getMyvalue() == 3) {
////                    System.out.println(T22.b);
//                } else if (gt.getComvalue() == 2 && gt.getMyvalue() == 3) {
////                    System.out.println(T22.a);
//                } else if (gt.getComvalue() == 3 && gt.getMyvalue() == 1) {
////                    System.out.println(T22.a);
//                } else if (gt.getMyvalue() == gt.getComvalue()) {
////                    System.out.println(T22.g);
//                }
//                    System.out.println("이긴횟수:" + T22.e);
//                    System.out.println("진 횟수:" + T22.f);
//                    System.out.println("비긴 횟수:" + T22.h);


                System.out.println(gt.getWinvalue());
                System.out.println(gt.getDrawvalue());
                System.out.println(gt.getLosevalue());

                System.out.println("계속 게임을 진행 합니까? y or n");
                loop1:
                while (true) {

                    Scanner gamePlay = new Scanner(System.in);
                    gt.setRegame(gamePlay.nextLine());
                    if (gt.getRegame().equals("y")) {
                        continue loop;
                    } else if (!gt.getRegame().equals("y") && !gt.getRegame().equals("n")) {
                        System.out.println("잘못 입력하셨습니다.y 또는 n 으로 입력하세요");
                        continue loop1;
                    } else if (gt.getRegame().equals("n")) {
                        System.out.println("Game Over");
                        break;
                    }
                }
                break;
            }
            System.out.println("총 게임 전적 " +gt.getWinvalue()+" 승"+gt.getDrawvalue()+" 무"+ gt.getLosevalue()+" 패");




        }


    }




