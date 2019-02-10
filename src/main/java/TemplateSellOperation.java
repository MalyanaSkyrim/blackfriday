import java.util.HashMap;

public abstract class TemplateSellOperation implements Sell {

    private HashMap<String,Integer> salesHistory = new HashMap<>();

    @Override
    public float sellsProduct(Stock stock, String productName){


        setNewQuantityOfProduct(stock,productName);
        return setNewTotalAssets(stock,productName);
    }

    public HashMap<String, Integer> getSalesHistory() {
        return salesHistory;
    }

    public void setNewQuantityOfProduct(Stock stock, String productName){
        int newQuantity = stock.getQuantityByProductName(productName)-getSaleQuantity();
        if(newQuantity<0) throw new RuntimeException();
        stock.setQuantityForProduct(productName,newQuantity);
    }

    public float setNewTotalAssets (Stock stock,String productName){
        float priceMargin = stock.getPriceByProductName(productName)*getSaleQuantity()*getMargin();

        int newTotalAssets = stock.getTotalAssets()+ Math.round(priceMargin);

        stock.setTotalAssets(newTotalAssets);
        return priceMargin+stock.getPriceByProductName(productName)*getSaleQuantity();
    }


    abstract public int getSaleQuantity();
    abstract public float getMargin();

}
