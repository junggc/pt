package t2;

public class me {

    public static void main(String arg[]){

        me d = new me();
        //d.입_학생의이름을물어봐();

        d.입_학생에게이름을알려줘("영희");

    }

    public void 입_학생의이름을물어봐(){
        student s = new student();
        s.이름은뭐니();
    }

    public void 입_학생에게이름을알려줘(String name){
        student s = new student();
         s.너의이름은(name);
        System.out.println();
    }
}
