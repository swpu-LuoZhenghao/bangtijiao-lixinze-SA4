
import eneity.Mobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mobile mobile =new Mobile();
        Scanner sc = new Scanner(System.in);
        System.out.println("������2~4λ�ֻ�β��");
        mobile.getMobile(sc.next());
    }
}