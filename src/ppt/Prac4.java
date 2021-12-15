package ppt;

public class Prac4 {

    public static void main(String[] args) {
        int i = 2, j= 1;
        do {
            do {
                System.out.print(j + "x" + i + "=" + i * j+"\t");
                j++;
            } while (j <= 9);
            i++;
            j=1;
            System.out.println();

        }  while (i <= 9) ;
    }

}



