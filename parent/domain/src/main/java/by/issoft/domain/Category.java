package by.issoft.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Product> productList;

    public Category(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        this.productList.add(product);
    }
}



