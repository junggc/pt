package gspractice;

public class Pt {
   public static void main(String[]args){
       Qna qna = new Qna();
       System.out.println(qna.getA());
       qna.setA(10);
       int p = qna.getA();
       int s = 11;
       if(p==s){
           System.out.println(true);
       }else if(p!=s){
           System.out.println(false);
       }
       qna.setB(13);
      // System.out.println(qna.getA() * qna.getB());

   }
}