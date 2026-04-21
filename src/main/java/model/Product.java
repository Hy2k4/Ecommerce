package model;

import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private Category category;

    // ===== CONSTRUCTOR FULL (dùng cho file / project cũ) =====
    public Product(int id, String name, String description, double price, int stock, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // ===== CONSTRUCTOR DÙNG CHO DATABASE =====
    public Product(int id, String name, double price, int stock, int categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.description = ""; // DB không có description
        this.price = price;
        this.stock = stock;
        this.category = new Category(categoryId, categoryName);
    }

    // ===== GETTER =====
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public Category getCategory() { return category; }

    // ===== SETTER =====
    public void setStock(int stock) { this.stock = stock; }

    public void setCategory(Category category) { this.category = category; }

    // ===== TO STRING (FIX NULL BUG) =====
    @Override
    public String toString() {

        String categoryName = "Unknown";

        if (category != null) {
            categoryName = category.getName();
        }

        return id + " | " + name + " | " + price +
                " | Stock: " + stock +
                " | Category: " + categoryName;
    }
}