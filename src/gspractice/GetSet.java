package gspractice;

public class GetSet {

    private int myvalue;
    private int comvalue;
    private int winvalue;
    private int drawvalue = 0;
    private int losevalue;
    private String regame;
    private int totalgame;

    public int getMyvalue(){
        return myvalue;
    }
    public void setMyvalue(int myvalue){
        this.myvalue = myvalue;
    }
    public int getComvalue(){
        return comvalue;
    }
    public void setComvalue(int comvalue){
        this.comvalue = comvalue;
    }
    public int getWinvalue(){
        return winvalue;
    }
    public void setWinvalue(int winvalue){
        this.winvalue = winvalue;
    }
    public int getDrawvalue() {
        return drawvalue;
    }
    public void setDrawvalue(int drawvalue) {
        this.drawvalue = drawvalue;
    }
    public int getLosevalue(){
        return losevalue;
    }
    public void setLosevalue(int losevalue){
        this.losevalue = losevalue;
    }
    public String getRegame(){
        return regame;
    }
    public void setRegame(String regame){
        this.regame=regame;
    }
    public int getTotalgame(){
        return totalgame;
    }
    public void setTotalgame(int totalgame){
        this.totalgame = totalgame;
    }
}
