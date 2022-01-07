package gspractice; //패키지명

import java.util.Random; //Random 클래스 임포트
import java.util.Scanner; // Scanner 클래스 임포트

public class GoGame2 { //클래스명

    public static void main(String [] args){//메인 메소드

        GetSet gt = new GetSet();//gt 클래스 생성



        loop: // 아래 반복문 안에서 loop를 타면 여기로 위치 이동후 다시 반복문 시작
        while (true) {// 게임을 마친후 다시 할경우 반복 시작되는 부분
            Random rd= new Random(); //컴퓨터의 임의의 값 rd 클래스변수
            gt.setComvalue((int)(Math.random()*3)+1); //숫자 3까지 랜덤값 나오게

            System.out.println(gt.getComvalue());
            System.out.println("1~3숫자 입력!"); // 숫자입력하라는 메시지 출력
            while (true) { // 숫자입력 실패시 다시 반복되는 부분


                Scanner sc = new Scanner(System.in); // 내 값 입력할 스캐너 설정
                try {//예외처리를 위한 try catch문 시작
                    gt.setMyvalue(Integer.parseInt(sc.nextLine()));//내 입력 값 int 인데 그외 문자로 들어올때 int 로 변환해주는곳

                    if (gt.getMyvalue() != 1 && gt.getMyvalue() != 2 && gt.getMyvalue() != 3) {//내 값이 1,2,3 이 아닐경우 가까운 while문으로 가서 다시반복
                        System.out.println("1~3 까지만 입력요망");//숫자입력을 잘못했을경우 다시입력하라는 메시지 출력
                        continue;//가까운 while 문으로 이동 하여 다시 반복
                    }

                } catch (Exception e) {//예외처리를 위한 try catch문 e 는 다음에러부터 다른문자로
                    System.out.println("숫자로 1~3까지");//숫자를 제외한 문자입력시 다시 입력하라는 메시지 출력
                    continue;//가까운 while 문으로 다시 이동 하여 반복
                }
                break; //가까운 while 문을 빠져나가고 다음 실행
            }

            int win = gt.getWinvalue(); // win 에 이긴횟수 대입
            System.out.println(gt.getWinvalue());
            int draw = gt.getDrawvalue(); // draw 에 비긴횟수 대입
            int lose = gt.getLosevalue();// lose 에 진횟수 대입

            if (gt.getMyvalue() == gt.getComvalue()) {// 만약 내 값과 pc 값이 같을때
                System.out.println(draw);
                draw++; //정수형 변수 draw에 1씩 추가
                System.out.println(draw+"ee");
                System.out.println(draw+"@ee");
                gt.setDrawvalue(draw);//비긴값 setter(int)
                System.out.println("DRAW");//비길경우 DRAW 메시지 출력
            } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 2) {//내 값이 1 이고 pc값이 2 일경우
                win++; // win 에 1씩 추가
                gt.setWinvalue(win);// 이긴값 setter(int)
                System.out.println("YOU WIN");//이길경우 YOU WIN 메시지 출력
            } else if (gt.getMyvalue() == 1 && gt.getComvalue() == 3) {//내값이 1이고 pc 값이 3일경우
                lose++;//진값에 1 추가
                gt.setLosevalue(lose); //진값 setter
                System.out.println("YOU LOSE");//진경우 YOU LOSE 메시지 출력
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 1) {//내값이 2이고 pc 값이 1일경우
                lose++;//진값에 1추가
                gt.setLosevalue(lose); //진값 setter
                System.out.println("YOU LOSE");//진경우 YOU LOSE 메시지 출력
            } else if (gt.getMyvalue() == 2 && gt.getComvalue() == 3) {//내값2 pc값 3일때
                win++;// 이긴값 1추가
                gt.setWinvalue(win);//이긴값 setter
                System.out.println("YOU WIN");//이길경우 YOU WIN 메시지 출력
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 1) {//내값 3 pc값 1
                win++;//이긴값에 1추가
                gt.setWinvalue(win);//이긴값 setter
                System.out.println("YOU WIN");//이길경우 YOU WIN 메시지 출력
            } else if (gt.getMyvalue() == 3 && gt.getComvalue() == 2) {//내값 3 pc값 2
                lose++;//진값에 1추가
                gt.setLosevalue(lose);//진값 setter
                System.out.println("YOU LOSE");//진경우 YOU LOSE 메시지 출력
            }

            switch(gt.getMyvalue()){//switch case문 변수>>>(내값이)
                case(1)://1일때
                    System.out.println("나=주먹");//나=주먹 출력
                    break;//switch문 빠져나감
                case(2)://2일때
                    System.out.println("나=가위");//나=가위 출력
                    break;//switch문 빠져나감
                case(3)://3일때
                    System.out.println("나=보");//나=보 출력
                    break;//switch문 빠져나감
            }
            switch(gt.getComvalue()){//switch case문 변수>>>(pc값이)
                case(1)://1일때
                    System.out.println("PC=주먹");//pc=주먹 출력
                    break;//switch문 빠져나감
                case(2)://2일때
                    System.out.println("PC=가위");//pc=가위 출력
                    break;//switch문 빠져나감
                case(3)://3일때
                    System.out.println("PC=보");//pc=보 출력
                    break;//switch문 빠져나감
            }

            System.out.println("계속? y or n");// 게임을 계속할지말지 정하는구간   계속? y or n 출력
            loop1:
            while(true) {
                Scanner gamePlay = new Scanner(System.in); // gamePlay 라는 변수 만들어 새로 입력받는다
                gt.setRegame(gamePlay.nextLine());//regame에 gamePlay 문자열값 set
                if(gt.getRegame().equals("y")){//만약 입력받아 가져온 regame 값이 y 와 같을때
                    continue loop;//loop while 문 으로 위치 이동 하여 게임 재시작
                }else if (!gt.getRegame().equals("y") && !gt.getRegame().equals("n")) {//regame값이y가 아니고 n이 아닐때
                    System.out.println("y 또는 n 입력!");//y또는n입력 메시지 출력
                    continue loop1;//그리고 loop1 while 으로 위치 이동후 반복
                }else if(gt.getRegame().equals("n")){//regame값이 n과 같을때
                    System.out.println("끝");//끝 메시지 출력
                }
                break;// 가까운 while 문 빠져나옴
            }


            break;//가장 바깥의 while 문 빠져나옴
        }//최종 전적 출력 (이긴값 +비긴값+ 진값)
        System.out.println("전적 "+ gt.getWinvalue()+" 승 "+gt.getDrawvalue()+" 무 "+gt.getLosevalue()+" 패 ");
    }



}
