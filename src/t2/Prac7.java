package t2;

import t2.t22;
import java.util.*;

import static t2.t22.c;
import static t2.t22.d;


public class Prac7 {


    private static int dCount; // 비긴 횟수 고유 변수
    public static String p;

    public static void main(String[] args) {

        t22.e = 0; //이긴경우 e
        t22.f = 0; //진 경우 f
        t22.g = 0; //비긴경우 dCount

        t22.d = 4;//d는 PC
        t22.c = 3;//c는 나
        Scanner sc = new Scanner(System.in); //내가 입력할 스캐너
        System.out.println();
        loop:
        while(true) {
            Random rd = new Random();//rd
            t22.d = (int) (Math.random() * 3) + 1;//d는 컴퓨터 랜덤값
            System.out.println(d);
            //1=주먹 2=가위 3=보
            System.out.println("1~3 사이의 숫자를 입력하시오");
            t22.c = sc.nextInt(); // 내가 입력하는부분

            if (c == d) {
                t22.h++;
                System.out.println("비겼습니다");
            } else if (c == 1 && t22.d == 2) {
                t22.e++;
                System.out.println("이겼습니다");
            } else if (c == 1 && d == 3) {
                t22.f++;
                System.out.println("졌습니다");
            } else if (c == 2 && d == 1) {
                t22.f++;
                System.out.println("졌습니다");
            } else if (c == 2 && d == 3) {
                t22.e++;
                System.out.println("이겼습니다");
            } else if (c == 3 && d == 1) {
                t22.e++;
                System.out.println("이겼습니다");
            } else if (c == 3 && d == 2) {
                t22.f++;
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
            if (t22.d == 1 && c == 2) {
                System.out.println(t22.a);
            } else if (d == 2 && c == 1) {
                System.out.println(t22.b);
            } else if (d == 3 && c == 2) {
                System.out.println(t22.b);
            }
            if (d == 1 && c == 3) {
                System.out.println(t22.b);
            } else if (t22.d == 2 && t22.c == 3) {
                System.out.println(t22.a);
            } else if (t22.d == 3 && c == 1) {
                System.out.println(t22.a);
            } else if (t22.c == t22.d) {
                System.out.println(t22.g);
            }
            System.out.println("이긴횟수:" + t22.e);
            System.out.println("진 횟수:" + t22.f);
            System.out.println("비긴 횟수:" + t22.h);

            while (true) {
                System.out.println("계속 게임을 진행 합니까? y or n");
                Scanner gamePlay = new Scanner(System.in);
                p = gamePlay.nextLine();// 게임 진행 여부 입력
                if (p.equals("y")) {
                    continue;
                } else if (!p.equals("y") && !p.equals("n")) {
                    System.out.println("잘못 입력하셨습니다.y 또는 n 으로 입력하세요");
                    break;
                } else if (p.equals("n")) {
                    System.out.println("Game Over");
                    break;
                }
            }
        }
    }


}

