package domain.vos;
import domain.commons.Entity;

public class Order extends Entity {
    private int productId;
    private Entity whoIsCreatingOrder;

    public Entity whoIsCreatingOrder() {
        return whoIsCreatingOrder;
    }
    public void setWhoIsCreatingOrder(Entity whoIsCreatingOrder) {
        this.whoIsCreatingOrder = whoIsCreatingOrder;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
}
