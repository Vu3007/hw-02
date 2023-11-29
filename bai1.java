import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài :" );
        Double chieudai= sc.nextDouble();
        System.out.print("Nhập chiều rộng :");
        Double chieurong= sc.nextDouble();
        Double chuvi= (chieudai + chieurong)*2;
        System.out.print("Chu vi là : "+ chuvi);

        Double dientich = (chieudai*chieurong);
        System.out.print(" Diện tích là : "+dientich);
    }
}
