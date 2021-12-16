package ppt;

import t2.t22;
import java.util.*;


public class Prac6 {

    private static int vCount; //이긴 횟수 고유 변수
    private static int lCount; // 진 횟수 고유 변수
    private static int dCount; // 비긴 횟수 고유 변수
    public static String g;

    public static void main(String[] args) {

        int vCount = 0; //이긴경우 vCount
        int lCount = 0; //진 경우 lCount
        int dCount = 0; //비긴경우 dCount

        int c;//c는 PC
        int d;//d는 나
        Scanner sc = new Scanner(System.in); //내가 입력할 스캐너


            while(true) {
                Random rd = new Random();//rd
                c = (int) (Math.random() * 3) + 1;//c는 컴퓨터 랜덤값
//                System.out.println(c);
                //1=주먹 2=가위 3=보
                System.out.println("1~3 사이의 숫자를 입력하시오");
                d = sc.nextInt(); // 내가 입력하는부분

                if (c == d) {
                    dCount++;
                    System.out.println("비겼습니다");
                } else if (c == 1 && d == 2) {
                    lCount++;
                    System.out.println("졌습니다");
                } else if (c == 1 && d == 3) {
                    vCount++;
                    System.out.println("이겼습니다");
                } else if (c == 2 && d == 1) {
                    vCount++;
                    System.out.println("이겼습니다");
                } else if (c == 2 && d == 3) {
                    lCount++;
                    System.out.println("졌습니다");
                } else if (c == 3 && d == 1) {
                    lCount++;
                    System.out.println("졌습니다");
                } else if (c == 3 && d == 2) {
                    vCount++;
                    System.out.println("이겼습니다");
                }
                if (c == 1) {
                    System.out.println("PC=주먹");
                } else if (c == 2) {
                    System.out.println("PC=가위");
                } else {
                    System.out.println("PC=보");
                }
                switch (d) {
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
                if (c == 1 && d == 2) {
                    System.out.println(t22.b);
                } else if (c == 2 && d == 1) {
                    System.out.println(t22.a);
                } else if (c == 3 && d == 2) {
                    System.out.println(t22.a);
                }
                if (c == 1 && d == 3) {
                    System.out.println(t22.a);
                } else if (c == 2 && d == 3) {
                    System.out.println(t22.b);
                } else if (c == 3 && d == 1) {
                    System.out.println(t22.b);
                } else if (c == d) {
                    System.out.println(t22.g);
                }
                System.out.println("이긴횟수:" + vCount);
                System.out.println("진 횟수:" + lCount);
                System.out.println("비긴 횟수:" + dCount);
                System.out.println("계속 게임을 진행 합니까? y or n");

                g = sc.nextLine();
                System.out.println();
            }


    }

}