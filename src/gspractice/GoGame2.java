package gspractice;

import java.util.Random;
import java.util.Scanner;

public class GoGame2 {

    public static void main(String [] args){
        GetSet gt = new GetSet();



        loop:
        while (true) {
            Random rd= new Random();
            gt.setComvalue((int)(Math.random()*3)+1);
            System.out.println("1~3숫자 입력!");
            while (true) {


                Scanner sc = new Scanner(System.in);
                try {
                    gt.setMyvalue(Integer.parseInt(sc.nextLine()));

                    if (gt.getMyvalue() != 1 && gt.getMyvalue() != 2 && gt.getMyvalue() != 3) {
                        System.out.println("1~3 까지만 입력요망");
                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("숫자로 1~3까지");
                    continue;
                }break;
            }

            int win = gt.getWinvalue();
            int draw = gt.getDrawvalue();
            int lose = gt.getLosevalue();

            if (gt.getMyvalue() == gt.getComvalue()) {
                draw++;
                gt.setDrawvalue(draw);
                System.out.println("DRAW");
            } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 2) {
                win++;
                gt.setWinvalue(win);
                System.out.println("YOU WIN");
            } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 3) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("YOU LOSE");
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 1) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("YOU LOSE");
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 3) {
                win++;
                gt.setWinvalue(win);
                System.out.println("YOU WIN");
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 1) {
                win++;
                gt.setWinvalue(win);
                System.out.println("YOU WIN");
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 2) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("YOU LOSE");
            }

            switch(gt.getMyvalue()){
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
            switch(gt.getComvalue()){
                case(1):
                    System.out.println("PC=주먹");
                    break;
                case(2):
                    System.out.println("PC=가위");
                    break;
                case(3):
                    System.out.println("PC=보");
                    break;
            }

            System.out.println("계속? y or n");
            loop1:
            while(true) {
                Scanner gamePlay = new Scanner(System.in);
                gt.setRegame(gamePlay.nextLine());
                if(gt.getRegame().equals("y")){
                    continue loop;
                }else if (!gt.getRegame().equals("y") && !gt.getRegame().equals("n")) {
                    System.out.println("y 또는 n 입력!");
                    continue loop1;
                }else if(gt.getRegame().equals("n")){
                    System.out.println("끝");
                }
                break;
            }


            break;
        }
        System.out.println("전적 "+ gt.getWinvalue()+" 승 "+gt.getDrawvalue()+" 무 "+gt.getLosevalue()+" 패 ");
    }



}
