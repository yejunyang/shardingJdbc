package ai.yunxi.sharding.model;

public class OrderItem {

    private long orderId;
    private long userId;
    private String brandName;
    private String productName;
    private String orderDate;
    private String payDate;
    private Float totalPrice;
    private int payDiscount;
    private Float payPrice;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPayDiscount() {
        return payDiscount;
    }

    public void setPayDiscount(int payDiscount) {
        this.payDiscount = payDiscount;
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", brandName='" + brandName + '\'' +
                ", productName='" + productName + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", payDate='" + payDate + '\'' +
                ", totalPrice=" + totalPrice +
                ", payDiscount=" + payDiscount +
                ", payPrice=" + payPrice +
                '}';
    }
}
