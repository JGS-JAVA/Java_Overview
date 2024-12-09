package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class ProductService {
    //제품목록 저장할 배열리스트
    private ArrayList<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the list");
    }
//제품목록 보기
    public void viewProducts() {
        if (products.size() > 0) {
            for (Product product : products) {
                System.out.println(products);
            }
        }
    }

    public Product searchProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product; //제품정보 전달
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Product[] products = new Product[10];
    }
}
