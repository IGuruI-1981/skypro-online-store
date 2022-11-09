package pro.sky.skypro.onlinestore.model;

import java.util.Objects;

public class Item {

    private final int prodId;

    private final String prodName;

    private final double prodCost;

    public Item(int prodId, String prodName, double prodCost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return prodId == item.prodId && Double.compare(item.prodCost, prodCost) == 0 && Objects.equals(prodName, item.prodName);
    }

    @Override
    public String toString() {
        return "Item{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodCost=" + prodCost +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodId, prodName, prodCost);

    }
}
