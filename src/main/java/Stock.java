import java.util.HashMap;

public class Stock {


    private HashMap<String,Integer> productsQuatities = new HashMap<>();
    private HashMap<String,Integer> productsPrices = new HashMap<>();


    private int totalAssets = 0;

    public void addProductTostock(int quantity,String productName,int price){

        productsQuatities.put(productName,quantity);
        productsPrices.put(productName,price);

        totalAssets += quantity*price;
    }

    public HashMap<String, Integer> getProductsQuatities() {
        return productsQuatities;
    }

    public void setTotalAssets(int totalAssets) {
        this.totalAssets = totalAssets;
    }

    public int getTotalAssets(){

        return totalAssets;
    }

    public int getPriceByProductName(String productName){
        return productsPrices.get(productName);
    }

    public int getQuantityByProductName(String productName){
        return productsQuatities.get(productName);
    }

    public void setQuantityForProduct(String productName,int newQuantity){
        this.getProductsQuatities().replace(productName,newQuantity);
    }

}
