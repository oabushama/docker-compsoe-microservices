package sa.edu.kau.fcit.cpit490.productshippingapi.model;

public class Shipping {
    private long id;
    private String content;
    private String status;

    public Shipping(){
        super();
    }
    public Shipping(long id, String content, String status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }
}

