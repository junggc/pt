package gspractice;

import java.util.Scanner;
import java.util.Set;

public class GoGame5 {

    public static void main(String[] args) {
        // 묵찌빠 게임

        //먼저 가위바위보를 한다.
        //내가 낸값을 입력 받는다.
        //컴퓨터가 내는값은 랜덤으로 생성한다.
        //그다음 낸 값을 비교 해서 이긴쪽이 공격하면서 새로운 값을 낸다. 상대방도 새로운 값을 낸다.
        //또 다시 낸값을 비교 해서 이긴쪽이 공격하면서 새로운 값을 낸다. 상대방도 새로운 값을 낸다.
        //또 다시 낸값을 비교 해서 두 값이 같아지면 공격한 사람이 승리한다.
        //이렇게 게임이 끝나면 다시 게임을 할지 말지 입력 받아서 진행 한다.
        //y입력시 재게임
        //n입력시 게임종료
        GetSet gs = new GetSet();

        //입력받을 객체생성
        Scanner sc = new Scanner(System.in);
        // 일단 입력한다 1 주먹, 2 가위, 3 보
        do {
            System.out.println("입력해 보세요");
            gs.setMyvalue(sc.nextInt());
        //1,2,3이 아닐경우 계속 입력 받는다 >>> 1,2,3,중에서 입력 받는걸로 할경우.
        }while(gs.getMyvalue() !=1 && gs.getMyvalue()!=2 && gs.getMyvalue()!=3);
//        switch(gs.getMyvalue()){
//            case(1):
//                System.out.println(" 나는주먹이네");
//        }
        gs.setComvalue((int)(Math.random()*3)+1);
            System.out.println(gs.getComvalue());
            if(gs.getMyvalue()==1 && gs.getComvalue()==2) {
                System.out.println("나는 주먹 컴퓨터는 가위>> 나의 공격시작");
            }else if(gs.getMyvalue()==1 && gs.getComvalue()==3){
                System.out.println("나는 주먹 컴퓨터는 보>> 컴퓨터의 공격시작");
            }else if(gs.getMyvalue()==2 && gs.getComvalue()==1) {
                System.out.println("나는 가위 컴퓨터는 주먹>> 컴퓨터의 공격시작");
            }else if(gs.getMyvalue()==2 && gs.getComvalue()==3) {
                System.out.println("나는 가위 컴퓨터는 보>> 컴퓨터의 공격시작");
            }else if(gs.getMyvalue()==3 && gs.getComvalue()==1) {
                System.out.println("나는 보 컴퓨터는 주먹>> 나의 공격시작");
            }else if(gs.getMyvalue()==3 && gs.getComvalue()==2) {
                System.out.println("나는 주먹 컴퓨터는 보>> 컴퓨터의 공격시작");
            }
        gs.setComvalue((int)(Math.random()*3)+1);




    }



}
