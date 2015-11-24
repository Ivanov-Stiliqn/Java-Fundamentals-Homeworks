package Problem_02;


public class ProductOutOfStockException extends ProductManagementException {
    public static final long serialVersionUID = 2L;

    public ProductOutOfStockException(String mesage) {
        super(mesage);
    }
}
