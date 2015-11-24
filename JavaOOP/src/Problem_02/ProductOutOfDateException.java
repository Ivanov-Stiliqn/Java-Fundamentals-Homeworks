package Problem_02;

public class ProductOutOfDateException extends ProductManagementException {
    public static final long serialVersionUID = 3L;

    public ProductOutOfDateException(String mesage) {
        super(mesage);
    }
}