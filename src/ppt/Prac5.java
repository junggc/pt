package ppt;

import java.util.Scanner;

public class Prac5 {

    public static void main(String[] args) {
        int i = 0;
        int answer = 0;
        answer=(int)(Math.random()*100)+1;

//        System.out.println(answer);
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("1과 100사이의 정수를 입력 하세요.");
            i = sc.nextInt();

            if (i > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (i < answer) {
                System.out.println("더 큰수로 다시 시도해보세요.");
            }


        }while(i!=answer);
        System.out.println("정답입니다.");
    }

}