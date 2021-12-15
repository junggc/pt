package ppt;

import java.util.Scanner;

public class Prac2 {



        public static void main(String[] args ){
            int i = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("0~2 까지 숫자 하나를 입력 하세요.");
            i = sc.nextInt();

            switch(i){
                case 0:
                    System.out.println("주먹");
                    break;
                case 1:
                    System.out.println("가위");
                    break;
                case 2:
                    System.out.println("보");
                    break;

            }

        }

}
