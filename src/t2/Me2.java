package t2;

public class Me2 {

    public static void main(String args[]){
        //나는 stu를 먼저 부를거야
        Stu t = new Stu();
        //나는 stu에게 먼저 이름을 물어볼거야
        System.out.println(t.getName());
        //이릉미 마음에 안들면 이름을 바꿔줄거야
        t.setName("철수");
        //제대로 이름을 바꿨는지 다시 물어볼거야
        System.out.println(t.getName());

    }
}
