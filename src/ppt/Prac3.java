package ppt;

public class Prac3 {
      public static void main(String[]args) {
            //while 문으로 구구단 작성
          int i = 2;
          while(i<=9){
              int j = 1;
              while(j<=9){
                  System.out.print(j+"x"+i+"="+i*j+"\t");
                  j++;

              }
              System.out.println();
          i++;

          }

      }
}








