
import eneity.Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobile mobile =new Mobile();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2~4位手机尾号");
        mobile.getMobile(sc.next());
    }
}