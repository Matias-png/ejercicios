package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class InvoiceItem {

    private String id;
    private String Desc;
    private int qty;
    private double unitPrice;


    public InvoiceItem(String id, String Desc, int qty, double unitPrice) {
        this.id = id;
        this.Desc = Desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }
    public String getDesc() {
        return Desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;
    }
    public String toString() {
        return "IncoiceItem[id = " + id + ", desc = " + Desc + ", qty = " + qty + ", unitPrice = " + unitPrice + "]" ;
    }


}
