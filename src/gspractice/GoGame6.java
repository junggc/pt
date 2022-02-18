package gspractice;

import java.util.Scanner;

public class GoGame6 {
    //가위바위보게임만들기
    //메인 메소드 생성
    public static void main(String[] args) {
        // getset 클래스 변수 생성
        GetSet ff = new GetSet();
//게임 시작 안내문 출력
        System.out.println("게임 시작");
        //게임 재 시작위치 아래 continue loop에서 여기로 이동
        loop:
        while (true) {
            //게임 방법 소개 안내문 출력

            System.out.println(" 숫자를 입력하세요. 1 = 주먹, 2 = 가위, 3 = 보 입니다. ");
            //컴퓨터의 값 먼저 입력 받기 위해 랜덤 함수를 이용하여 1~3까지의 숫자 중 하나를 생성
            ff.setComvalue((int) (Math.random() * 3) + 1);
          //  System.out.println(ff.getComvalue());
            //Math.random()원 하는 범위 만큼 곱해줌(0부터 10미만일 경우 * 10),주사위는 1,2,3 이므로 3까지 곱한거 0,1,2 에 더하기 1씩하여 1,2,3
            //나의 값 입력 받기
            //내값을 입력받을 sc 클래스변수생성
            Scanner sc = new Scanner(System.in);
            while (true) {
                //try catch문 사용하여 내값에 문자가 들어올경우 형변환이 이뤄져서 try타고 catch를 타서 가까운 while 문으로 가서 반복함
                try {
                    //내 값을 Myvalue에 set한다 . 문자로 들어올 경우도 있기때문에 문자열을 정수형으로 형변환작업을 한다.
                    ff.setMyvalue(Integer.parseInt(sc.nextLine()));
                    // 문자말고 숫자가 들어올경우 if 문을 타서 1, 2, 3 외에 다른숫자 입력받을시 역시 가까운 while 문 으로 이동 하여 반복
                    if (ff.getMyvalue() != 1 && ff.getMyvalue() != 2 && ff.getMyvalue() != 3) {
                        System.out.println("숫자를 정확히 입력하세요.");
                        //continue; 를 타서 가까운 while 문으로 이동 하여 반복
                        continue;
                    }
                    //문자로 입력받을시 int 로 형변환 이루어져서 catch를 타고 가까운 while 문으로 가서 반복
                } catch (Exception p) {
                    System.out.println("숫자만 입력하세요");
                    continue;
                }
                break;
            }

            //내값을 출력하기
            if (ff.getMyvalue() == 1) {
                System.out.println("1p는 주먹 ");
            } else if (ff.getMyvalue() == 2) {
                System.out.println("1p는 가위");
            } else if (ff.getMyvalue() == 3) {
                System.out.println("1p는 보");
            }
            //컴퓨터 값 출력하기
            if (ff.getComvalue() == 1) {
                System.out.println("컴퓨터는 주먹");
            } else if (ff.getComvalue() == 2) {
                System.out.println("컴퓨터는 가위");
            } else if (ff.getComvalue() == 3) {
                System.out.println("컴퓨터는 보");
            }
//게임 수 누적출력을 위해
//정수형 변수 win 에 이긴값을 대입
            int win = ff.getWinvalue();
//정수형 변수 draw 에 비긴값을 대입
            int draw = ff.getDrawvalue();
            //정수형 변수 lose 에 진값을 대입
            int lose = ff.getLosevalue();
            //이제 내값과 컴퓨터 값을 비교한다 먼저 같을 경우 정수형비교이기때문에 == 사용,
            if (ff.getMyvalue() == ff.getComvalue()) {
                //비길경우 후위로 draw에
                draw++;
                ff.setDrawvalue(draw);
                //무승부 출력
                System.out.println("무승부!");
                //내가 주먹이고 컴퓨터는 가위 일때, 내가 가위 컴퓨터 보자기 일때, 내가 보 컴퓨터 주먹일때
            } else if (ff.getMyvalue() == 1 && ff.getComvalue() == 2) {
                //win에 횟수 추가
                win++;
                // winvalue에 win값 set
                ff.setWinvalue(win);
                //당신이 이겼네요 출력
                System.out.println("당신이 이겼네요");
            } else if (ff.getMyvalue() == 1 && ff.getComvalue() == 3) {
                lose++;
                ff.setLosevalue(lose);
                System.out.println("컴퓨터가 이겼네요");
            } else if (ff.getMyvalue() == 2 && ff.getComvalue() == 1) {
                lose++;
                ff.setLosevalue(lose);
                System.out.println("컴퓨터가 이겼네요");
            } else if (ff.getMyvalue() == 2 && ff.getComvalue() == 3) {
                win++;
                ff.setWinvalue(win);
                System.out.println("당신이 이겼네요");
            } else if (ff.getMyvalue() == 3 && ff.getComvalue() == 1) {
                win++;
                ff.setWinvalue(win);
                System.out.println("당신이 이겼네요");
            } else if (ff.getMyvalue() == 3 && ff.getComvalue() == 2) {
                lose++;
                ff.setLosevalue(lose);
                System.out.println("컴퓨터가 이겼네요");
            }
//게임을 또 할지 말지 결정 메시지 출력
            System.out.println("게임을 다시 진행 합니까?");
            System.out.println("y 를 입력하면 게임을 다시 진행 합니다");
            System.out.println("n 를 입력하면 게임을 바로 종료 합니다");

            //y 또는 n 입력 값 받기
            while (true) {
                Scanner gg = new Scanner(System.in);
                ff.setRegame(gg.nextLine());
                if (ff.getRegame().equals("y")) {
                    continue loop;
                } else if (ff.getRegame().equals("n")) {
                    System.out.println("☆ Game Over ★");
                    break;
                } else if (!ff.getRegame().equals("y") || !ff.getRegame().equals("n")) {
                    System.out.println(" y 또는 n 으로 입력 하세요");
                    continue;
                }
                break;
            }
            //regame 에 y 또는 n 을 입력받아 set. 숫자에서 문자열로는 형변환 오류 발생 안함
            //equals() 는 메소드 ==는 연산자 , equals()는 값 비교, ==는 객체(주소값)을 비교, 주소값이 이해안됨
            //입력받은값으로 어떻게 할지 결정, 문자열로 입력 받으므로 .equals 로 비교한다 y를 입력받으면
            //다시 게임시작하는 메시지 출력
            //게임을 다시 하기위해 loop 문으로 이동
            // n 입력받을경우
            //게임을 종료합니다 출력
            // 가까운 while 문 빠져나감
            // y또는 n 외에 문자 입력시
            //가까운 while문으로 반복
            //가장바깥 반복문을 빠져나감
            // 게임 결과를 합산하여 총 게임수 출력, 이긴횟수,비긴횟수,진횟수 출력
            // 만약 이긴횟수가 진횟수보다 클때
            //훌륭합니다 출력
            //만약 이긴횟수가 진횟수보다 작을때
            //좀더 노력하세요 출력
             break;
        }
        ff.setTotalgame((ff.getWinvalue()+ff.getDrawvalue()+ff.getLosevalue()));

        System.out.println("Total "+ff.getTotalgame()+"게임 ");
        System.out.println(ff.getWinvalue()+"승 "+ff.getDrawvalue()+"무 "+ff.getLosevalue()+"패");
        if(ff.getWinvalue()>ff.getLosevalue() && ff.getWinvalue()>10 && ff.getDrawvalue()<10 && ff.getLosevalue()<10){
            System.out.println("대단 합니다!");
        }else if(ff.getWinvalue()<ff.getLosevalue() && ff.getLosevalue()>5){
            System.out.println("최악 이군요!");
        }else if(ff.getDrawvalue()>ff.getWinvalue()){
            System.out.println("다음엔 더 많은 승리를~");
        }else if(ff.getDrawvalue()<ff.getLosevalue() && ff.getWinvalue()<ff.getLosevalue()){
            System.out.println("당신은 게임을 하지 않는게 좋겠어요.");
        }
    }

}