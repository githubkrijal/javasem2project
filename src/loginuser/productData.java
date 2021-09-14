package loginuser;

public class productData {
    String username;
    String product_1;
    String product_p1;


    public productData(String username, String product_1, String product_p1) {
        super();
        this.username = username;
        this.product_1 = product_1;
        this.product_p1 = product_p1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProduct_1() {
        return product_1;
    }

    public void setProduct_1(String product_1) {
        this.product_1 = product_1;
    }

    public String getProduct_p1() {
        return product_p1;
    }

    public void setProduct_p1(String product_p1) {
        this.product_p1 = product_p1;
    }
}
