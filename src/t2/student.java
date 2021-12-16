package t2;

//학생
public class student {

    private String name = "없어";
    private int age = 1;
    private int weight = 3;
    private String job = "아기";


    //getter
    public void 몇살이니(){
        System.out.println(age+"살이야");
    }

    //getter
    public void 이름은뭐니(){
        System.out.println("내이름은"+name);
    }

    //getter
    public void 몸무게몇이니(){
        System.out.println(weight+"kg 야");
    }

    //getter
    public void 직업이뭐니(){
        System.out.println(job+"야");
    }

    //setter
    public String 너의이름은(String name){
        this.name=name;

        return "나의이름은 "+this.name+"야";
    }
}
