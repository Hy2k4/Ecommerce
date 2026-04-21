package service;

import model.Product;

public class StockThread extends Thread {

    private StoreManager manager;
    private Product product;

    public StockThread(StoreManager manager, Product product) {
        this.manager = manager;
        this.product = product;
    }

    @Override
    public void run() {
        manager.updateStock(product, 1);
    }
}