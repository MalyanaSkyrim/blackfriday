public class SellOperation extends TemplateSellOperation{

    private static final int SALE_QUANTITY = 5;
    private static final float MARGIN = 0.2f;


    @Override
    public int getSaleQuantity() {
        return SALE_QUANTITY;
    }

    @Override
    public float getMargin() {
        return MARGIN;
    }
}
