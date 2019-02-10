public class ProxySalesHistory implements Sell {

    private TemplateSellOperation sellOperation;

    public ProxySalesHistory(TemplateSellOperation sellOperation) {
        this.sellOperation = sellOperation;
    }

    @Override
    public float sellsProduct(Stock stock, String productName) {
         addSaleToHistory(productName);
        return sellOperation.sellsProduct(stock,productName);
    }

    public void addSaleToHistory(String productName){
        if(sellOperation.getSalesHistory().containsKey(productName)){
            int quantity = sellOperation.getSalesHistory().get(productName);
            sellOperation.getSalesHistory().replace(productName,quantity+sellOperation.getSaleQuantity());
        }else{
            sellOperation.getSalesHistory().put(productName,sellOperation.getSaleQuantity());
        }

    }

    public String getSaleHistory(){
        String saleHistory="";
        for(String currentProductName : sellOperation.getSalesHistory().keySet()){
            saleHistory += sellOperation.getSalesHistory().get(currentProductName)+":"+currentProductName+"s";
        }
        return saleHistory;
    }

}
