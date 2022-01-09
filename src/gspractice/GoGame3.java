package gspractice;


import java.util.Scanner;

public class GoGame3 {
    public static void main(String[] args) {

        GetSet gt = new GetSet();//gt 클래스 변수 생성
        loop:
        while (true) {
          //  Random rd = new Random();// pc 값 입력받을 random 클래스
            double aa = Math.random();
            gt.setComvalue(((int)(aa * 3)) + 1);

            System.out.println(aa+" 그냥 aa 값");
            System.out.println((aa*3)+" 곱하기 3만 한값");
            System.out.println(((aa*3)+1)+" 곱하기 3 에  더하기 1한값");
            System.out.println((int)((aa*3)+1)+" 인트 나중에  곱하기 3 에  더하기 1한값");
            System.out.println((((int)(aa*3))+1)+" 인트 먼저  곱하기 3 에  더하기 1한값");
            // Math.random()은 0이상 1미만 수 하나를 랜덤으로 생성한다. 여기에 곱하게3을하여 int 강제 형변환시킴 그럼 범위는 0,1,2 에 정수의값만 리턴하는데 +1하여 1,2,3 중 하나 랜덤 생성
            System.out.println(gt.getComvalue());
            System.out.println("1~3까지 숫자 입력");// 숫자입력 하라는 메시지 출력
            loop1:
            while (true) { //내 입력값 오류시 반복 시작 위치
                Scanner sc = new Scanner(System.in);//내 입력 값 Scanner 클래스
                try {//try catch 시작 부분 >>> 내값 오류 체크
                    gt.setMyvalue(Integer.parseInt(sc.nextLine()));// 정수로 내입력값 받아서 set, 문자열로 입력받으면  int 로 형변환

                    if (gt.getMyvalue() != 1 && gt.getMyvalue() != 2 && gt.getMyvalue() != 3) {//내값이 1 and 2 and 3 이 아닐때
                        System.out.println("1~3까지만 입력 하세요");
                        continue loop1; //loop1 로 가서 반복
                    }
                } catch (Exception e) {// 오류 발생하면(형변환 작업이 이뤄지면)
                    System.out.println("숫자만 입력 하세요");// 출력
                    continue loop1;// loop1 로 이동
                }
                break;// 반복문 탈출
            }
            switch (gt.getMyvalue()) {// 내값을 스위치문으로 출력
                case (1):// 내가주먹인경우
                    System.out.println("나 = 주먹 ");
                    break;   //스위치문 탈출
                case (2):// 내가가위인경우
                    System.out.println("나 = 가위 ");
                    break;
                case (3):// 내가보인경우
                    System.out.println("나 = 보 ");
                    break;
            }
            switch (gt.getComvalue()) { // PC값을 스위치문으로 출력
                case (1): //PC 값이 주먹인경우
                    System.out.println("PC = 주먹 ");
                    break;//스위치문 탈출
                case (2):
                    System.out.println("PC = 가위 ");
                    break;
                case (3):
                    System.out.println("PC = 보 ");
                    break;
            }

            int win = gt.getWinvalue();  //  누적횟수 출력을 위해 정수형 변수 win에 이긴값을 넣음
            int draw = gt.getDrawvalue();
            int lose = gt.getLosevalue();

            if (gt.getMyvalue() == 1 && gt.getComvalue() == 2) {
                win++;
                gt.setWinvalue(win);
                System.out.println("나의 승리");
            } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 3) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("PC의 승리");
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 1) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("PC의 승리");
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 3) {
                win++;
                gt.setWinvalue(win);
                System.out.println("나의 승리");
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 1) {
                win++;
                gt.setWinvalue(win);
                System.out.println("나의 승리");
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 2) {
                lose++;
                gt.setLosevalue(lose);
                System.out.println("PC의 승리");
            } else if (gt.getMyvalue() == gt.getComvalue()) {
                draw++;
                gt.setDrawvalue(draw);
                System.out.println("무승부");
            }
            System.out.println("승부가 끝났습니다. 한게임 더 할까요?");
            System.out.println("한게임 더하시려면 y 를 그만 두시려면 n 을 입력 하세요.");
            loop2:
            while(true) {
            Scanner rgame = new Scanner(System.in);

            gt.setRegame(rgame.nextLine());

            if (gt.getRegame().equals("y")) {
                continue loop;
            } else if (gt.getRegame().equals("n")) {
                System.out.println(" 게임을 종료 합니다. ");
                break;
            } else if (!gt.getRegame().equals("y") && !gt.getRegame().equals("n")) {
                System.out.println("y 또는 n 으로 입력바랍니다.");
                continue loop2;
            }
            break;

        }break;

        }
        System.out.println("나의 총 전적은 "+gt.getWinvalue()+" 승 "+gt.getDrawvalue()+" 무 "+gt.getLosevalue()+" 패 입니다." );

    }
}