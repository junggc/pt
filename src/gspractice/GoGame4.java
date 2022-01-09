package gspractice;

import java.util.Scanner;

public class GoGame4 {
    //가위바위보게임만들기
    //메인 메소드 생성
    public static void main(String[] args) {
        // getset 클래스 변수 생성
        GetSet getset = new GetSet();
//게임 시작 안내문 출력
        //게임 재 시작위치 아래 continue loop에서 여기로 이동

            System.out.println("가위,바위,보 게임을 시작합니다.");
            loop:
            while (true) {
//게임 방법 소개 안내문 출력
            System.out.println("주먹 = 1 번, 가위 = 2번, 보 = 3번 입니다. 1,2,3 중 숫자 하나를 입력 하세요");
            //컴퓨터의 값 먼저 입력 받기 위해 랜덤 함수를 이용하여 1~3까지의 숫자 중 하나를 생성
            //Math.random()원 하는 버무이 만큼 곱해줌(10미만일 경우 * 10),주사위는 1,2,3 이므로 3까지 곱한거 0,1,2 에 더하기 1씩하여 1,2,3
            getset.setComvalue((int) (Math.random() * 3) + 1);
            System.out.println(getset.getComvalue());
            //나의 값 입력 받기
            while(true) {
                //내값을 입력받을 sc 클래스변수생성
                Scanner sc = new Scanner(System.in);



                //try catch문 사용하여 내값에 문자가 들어올경우 형변환이 이뤄져서 try타고 catch를 타서 가까운 while 문으로 가서 반복함
                try {
                    //내 값을 Myvalue에 set한다 . 문자로 들어올 경우도 있기때문에 문자열을 정수형으로 형변환작업을 한다.
                    getset.setMyvalue(Integer.parseInt(sc.nextLine()));
                    // 문자말고 숫자가 들어올경우 if 문을 타서 1, 2, 3 외에 다른숫자 입력받을시 역시 가까운 while 문 으로 이동 하여 반복
                    if (getset.getMyvalue() != 1 && getset.getMyvalue() != 2 && getset.getMyvalue() != 3) {
                        System.out.println("1 ,2 ,3 중 하나만 입력하세요.");
                        //continue; 를 타서 가까운 while 문으로 이동 하여 반복
                        continue;
                    }
                //문자로 입력받을시 int 로 형변환 이루어져서 catch를 타고 가까운 while 문으로 가서 반복
                } catch (Exception e) {
                    System.out.println("숫자만 입력하세요.");
                        continue ;
                }break;
            }

            //내값을 출력하기
            if (getset.getMyvalue() == 1) {
                System.out.println("나는 주먹을 냈다");
            } else if (getset.getMyvalue() == 2) {
                System.out.println("나는 가위를 냈다");
            } else if (getset.getMyvalue() == 3) {
                System.out.println("나는 보를 냈다");
            }
            //컴퓨터 값 출력하기
            if (getset.getComvalue() == 1) {
                System.out.println("컴퓨터는 주먹을 냈다");
            } else if (getset.getComvalue() == 2) {
                System.out.println("컴퓨터는 가위를 냈다");
            } else if (getset.getComvalue() == 3) {
                System.out.println("컴퓨터는 보를 냈다");
            }
            //게임 수 누적출력을 위해
            //정수형 변수 win 에 이긴값을 대입
            int win = getset.getWinvalue();
            //정수형 변수 draw 에 비긴값을 대입
            int draw = getset.getDrawvalue();
            //정수형 변수 lose 에 진값을 대입
            int lose = getset.getLosevalue();
            //이제 내값과 컴퓨터 값을 비교한다 먼저 같을 경우 정수형비교이기때문에 == 사용,
            if (getset.getMyvalue() == getset.getComvalue()) {
                //무승부 출력
                System.out.println("결과는 무승부 입니다.");
                //비길경우 후위로 draw에
                draw++;
                //drawvalue 에 비긴값을 set
                getset.setDrawvalue(draw);
                //내가 주먹이고 컴퓨터는 가위 일때, 내가 가위 컴퓨터 보자기 일때, 내가 보 컴퓨터 주먹일때
            } else if ((getset.getMyvalue() == 1 && getset.getComvalue() == 2) || (getset.getMyvalue() == 2 && getset.getComvalue() == 3) || (getset.getMyvalue() == 3 && getset.getComvalue() == 1)) {
                //나의 승리 출력
                System.out.println("결과는 나의 승리 입니다.");
                win++;
                getset.setWinvalue(win);
                //네가 주먹이고 컴퓨터 보 일때, 내가 가위이고 컴퓨터 주먹일때 , 내가 보 컴퓨터 가위 일때
            } else if ((getset.getMyvalue() == 1 && getset.getComvalue() == 3 || (getset.getMyvalue() == 2 && getset.getComvalue() == 1) || (getset.getMyvalue() == 3 && getset.getComvalue() == 2))) {
                //컴퓨터의 승리 출력
                System.out.println("결과는 컴퓨터의 승리 입니다.");
                lose++;
                getset.setLosevalue(lose);
            }
            //게임을 또 할지 말지 결정 메시지 출력
            System.out.println("y(재 진행) 또는 n(그만) 으로 게임 진행 여부를 결정하시오.");
            //y 또는 n 입력 값 받기
            while(true) {
                Scanner rg = new Scanner(System.in);
                //regame 에 y 또는 n 을 입력받아 set. 숫자에서 문자열로는 형변환 오류 발생 안함
                getset.setRegame(rg.nextLine());
                //equals() 는 메소드 ==는 연산자 , equals()는 값 비교, ==는 객체(주소값)을 비교, 주소값이 이해안됨
                //입력받은값으로 어떻게 할지 결정, 문자열로 입력 받으므로 .equals 로 비교한다 y를 입력받으면
                if (getset.getRegame().equals("y")) {
                    //다시 게임시작하는 메시지 출력
                    System.out.println(" 게임을 다시 시작합니다.");
                    //게임을 다시 하기위해 loop 문으로 이동
                    continue loop;
                // n 입력받을경우
                } else if (getset.getRegame().equals("n")) {
                    //게임을 종료합니다 출력
                    System.out.println("게임을 종료합니다.");
                    // 가까운 while 문 빠져나감
                    break;
                // y또는 n 외에 문자 입력시
                } else if (!getset.getRegame().equals("Y") || !getset.getRegame().equals("n")) {
                    System.out.println("y 또는 n 으로 입력하세요");
                    //가까운 while문으로 반복
                    continue;
                }
            //가장바깥 반복문을 빠져나감
            }break;
        }
            // 게임 결과를 합산하여 총 게임수 출력, 이긴횟수,비긴횟수,진횟스 출력
        System.out.println(" 총 게임 횟수 = "+(getset.getWinvalue()+ getset.getDrawvalue()+ getset.getLosevalue())+"게임 중 "+getset.getWinvalue()+"승 "+getset.getDrawvalue()+"무 "+getset.getLosevalue()+"패 ");
            // 만약 이긴횟수가 진횟수보다 클때
            if(getset.getWinvalue()> getset.getLosevalue()){
            //훌륭합니다 출력
                System.out.println("훌륭합니다");
            //만약 이긴횟수가 진횟수보다 작을때
            }else if(getset.getWinvalue()<getset.getLosevalue()) {
            //좀더 노력하세요 출력
                System.out.println("좀 더 노력 하세요");
            }
    }
}
