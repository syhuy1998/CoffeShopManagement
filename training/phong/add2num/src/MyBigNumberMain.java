import java.util.Scanner;

/**
 *
 * @author Bùi Thanh Phong
 */
public class MyBigNumberMain implements IRemember{

    public static void main(String[] args) {
        
        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        String num1 = sc.nextLine();
        System.out.print("Nhap so thu hai: ");
        String num2= sc.nextLine();
        String result = s.sum(num1, num2);
        
        System.out.print("Ket Qua: " + result);
    }
    
    @Override
    public void sendMessage(String mString) {
        System.out.println(mString);
    }
    
}
