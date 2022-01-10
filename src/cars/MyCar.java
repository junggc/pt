package cars;

import java.util.Scanner;

public class MyCar {
    public static void main(String[] args) {

        Carinfo carinfo = new Carinfo();

        carinfo.setCarBrand("대우");
        carinfo.setCarYear(1980);
        carinfo.setCarColor(String.valueOf(123456));
        carinfo.setCarName("");

        Scanner sc = new Scanner(System.in);
        System.out.println("브랜드 이름을 입력하세요");
        carinfo.setCarBrand(sc.nextLine());

        if(carinfo.getCarBrand().equals("현대")){
            System.out.println(carinfo.getCarBrand());
        }else if(carinfo.getCarType().equals("Truck")){
            System.out.println("이 차의 종류는 트럭 입니다.");
        }else{
            System.out.println("이 차의 종류는 세단 입니다.");
        }




        System.out.println("제 차는 "+carinfo.getCarYear()+" 년식 "+carinfo.getCarBrand()+" "+carinfo.getCarName()+" "+ "이며"+" 색상은 "+carinfo.getCarColor()+" "+"입니다.");

















    }
}
