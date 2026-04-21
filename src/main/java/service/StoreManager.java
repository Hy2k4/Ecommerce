package service;

import model.*;
import java.io.*;
import java.util.*;
import utils.*;

public class StoreManager implements Serializable {

    private List<Category> categories = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    // CATEGORY CRUD
    public void addCategory(Category c) {
        categories.add(c);
    }

    public void showCategories() {
        categories.forEach(System.out::println);
    }

    public Category findCategory(int id) {
        return categories.stream()
                .filter(c -> c.getId() == id)
                .findFirst().orElse(null);
    }

    // PRODUCT CRUD
    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        products.forEach(System.out::println);
    }

    // SEARCH
    public List<Product> search(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }

    // FILTER
    public List<Product> filter(int categoryId) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().getId() == categoryId) {
                result.add(p);
            }
        }
        return result;
    }

    // MULTITHREAD SAFE
    public synchronized void updateStock(Product p, int amount) {
        p.setStock(p.getStock() + amount);
    }

    // FILE SAVE
    public void save(String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FILE LOAD
    public static StoreManager load(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (StoreManager) ois.readObject();
        } catch (Exception e) {
            return new StoreManager();
        }
    }
}