public class Company {

    private Stock stock = new Stock();
    private TemplateSellOperation sellOperation;

    public Company(){
        sellOperation = new SellOperation();
    }


    public int totalAssets() {
        System.out.println();
        return stock.getTotalAssets();
    }

    public void stock(int quantity, String name, int price) {
        stock.addProductTostock(quantity,name,price);
    }

    public float sells(String productName) {

        return sellOperation.sellsProduct(stock,productName);
    }

    public Company blackFriday()
    {
        sellOperation = new SellOperationBlackFriday();
        return this;
    }

    public Object salesHistory()
    {
        return null;
    }
}
