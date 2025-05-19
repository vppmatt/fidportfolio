import domain.Stock;

public class Main {

    public static void main(String[] args) {

        Stock microsoft = new Stock();
        microsoft.setName("Microsoft");
        microsoft.setTicker("MSFT");

        Stock apple = new Stock("Apple", "APPL");

        System.out.println(apple);
    }
}
