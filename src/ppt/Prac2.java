package ppt;

import java.util.Scanner;

public class Prac2 {
        public static void main(String[] args ){
        //0부터 2까지 숫자중 0일경우 주먹 1일 경우 가위 2일 경우 보  출력
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("0~2 까지 숫자 1개를 입력 하세요.");
            //i에 값을 입력 받음
        i = sc.nextInt();
            switch(i) {
                case (0):
                    System.out.println("주먹");
                    break;
                case (1):
                    System.out.println("가위");
                    break;
                case (2):
                    System.out.println("보");
                    break;

            }
        }

}
