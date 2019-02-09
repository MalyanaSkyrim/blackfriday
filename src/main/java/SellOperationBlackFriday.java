public class SellOperationBlackFriday extends TemplateSellOperation {

    private static final int SALE_QUANTITY = 10;
    private static final float MARGIN = 0.1f;

    @Override
    public int getSaleQuantity() {
        return 10;
    }

    @Override
    public float getMargin() {
        return 0.1f;
    }
}
