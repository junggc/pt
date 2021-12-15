package ppt;

public class Prac {

    public static void main(String[] args) {

        Prac4 prac4 = new Prac4();


        System.out.println(prac4.a);

        prac4.b = 2;
        System.out.println(prac4.b);

        prac4.c = 2;
        System.out.println(prac4.c);

        prac4.a();

        Prac4.a();

        System.out.println(Prac4.b);

        for(int i =1; i <=9; i++){
            for(int j=1; j <=9; j++)
            System.out.print(j+"x"+i+"="+i*j+"\t");
            System.out.println();
        }
    }


}

