import org.example.TaxServiceImpl;
import org.example.TaxServiceImplService;

public class Main {
    public static void main(String[] args) {

        TaxServiceImplService service = new TaxServiceImplService();

        TaxServiceImpl port = service.getPort(TaxServiceImpl.class);

        double money = port.compute(20000);
        System.out.println("收入为20000时的税为" + money);

    }
}
