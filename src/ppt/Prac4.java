package ppt;

public class Prac4 {

    final int a=1;
    public static int b=1;
    int c=1;

    //t22 클래스를 선언하여
    //d에 랜덤한숫자를 대입하고
    //내가 입력받은 값을 c에 대입하여
    //if문을 활용해서 가위바위보를 진행
    //내가 이긴경우 a 출력
    //내가 진 경우 b출력
    //내가 이긴 횟수는 e에 대입
    //내가 진 횟수는 f에 대입

    //결과출력메소드 호출


    public static void main(String[] args) {

        a();



        System.out.println("b="+String.valueOf((b+1)));

        int i=1, j=1;
        do {
            do {
                System.out.print(i + "x" + j + "=" + i * j + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
                i++;
                j=1;
        } while (i <= 9) ;



    }

    public static void a(){
        System.out.println("222222");
    }
}

