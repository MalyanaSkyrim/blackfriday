public abstract class TemplateSellOperation {


    public float sellsProduct(Stock stock, String productName){

        int newQuantity = stock.getQuantityByProductName(productName)-getSaleQuantity();
        if(newQuantity<0) throw new RuntimeException();
        stock.setQuantityForProduct(productName,newQuantity);

        float priceMargin = stock.getPriceByProductName(productName)*getSaleQuantity()*getMargin();

        int newTotalAssets = stock.getTotalAssets()+ Math.round(priceMargin);

        stock.setTotalAssets(newTotalAssets);

        return priceMargin+stock.getPriceByProductName(productName)*getSaleQuantity();
    }

    abstract public int getSaleQuantity();
    abstract public float getMargin();

}
