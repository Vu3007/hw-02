import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name " );
        String name= sc.nextLine();
        System.out.print(" age ");
        int age= Integer.parseInt(sc.nextLine());

        System.out.print("sex " );
        String sex= sc.nextLine();
        System.out.print("Adress " );
        String address= sc.nextLine();
        System.out.print("Xin chào các bạn, mình tên là "+ name+", năm nay mình " + age+" tuổi, giới tính "+sex+". Hiện tại mình đang sống và làm việc tại " +address);



    }
}
