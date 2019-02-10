public class Company {

    private Stock stock = new Stock();
    private ProxySalesHistory proxySalesHistory;

    public Company(){
        TemplateSellOperation sellOperation = new SellOperation();
        proxySalesHistory = new ProxySalesHistory(sellOperation);

    }


    public int totalAssets() {
        System.out.println();
        return stock.getTotalAssets();
    }

    public void stock(int quantity, String name, int price) {
        stock.addProductTostock(quantity,name,price);
    }

    public float sells(String productName) {

        return proxySalesHistory.sellsProduct(stock,productName);
    }

    public Company blackFriday()
    {
        TemplateSellOperation sellOperation = new SellOperationBlackFriday();
        proxySalesHistory = new ProxySalesHistory(sellOperation);
        return this;
    }

    public String salesHistory()
    {


        return proxySalesHistory.getSaleHistory();
    }
}
