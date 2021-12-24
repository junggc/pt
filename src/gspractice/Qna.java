package gspractice;

public class Qna {
    private int a=0;
    private int b=0;
    public void c(int e,int f){

    }


    public int getA(){
            return a;
    }
    public void setA(int a){
            this.a=a;
    }
    public int getB(){
            return b;
    }
    public void setB(int b){
            this.b=b;
    }
    public static void main(String[]args){
        Qna g = new Qna();
        int ab=g.getA()+g.getB();
          if(ab>0){
              System.out.println(true);
          }else if(ab<0){
              System.out.println(false);
          }
          if(ab>0){
              for(ab=1; ab<10;ab++){
                  System.out.println(ab);
              }
          }





    }



}
