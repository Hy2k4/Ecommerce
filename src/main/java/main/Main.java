package main;

import repository.ProductRepository;
import repository.CategoryRepository;
import model.Product;
import model.Category;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductRepository repo = new ProductRepository();
        CategoryRepository cateRepo = new CategoryRepository();

        while (true) {

            System.out.println("=================================");
            System.out.println(" MAIN MENU");
            System.out.println("=================================");
            System.out.println("1. Show Products");
            System.out.println("2. Search");
            System.out.println("3. Pagination");
            System.out.println("4. Insert Product");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    repo.getAll().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Keyword: ");
                    String keyword = sc.nextLine();
                    repo.search(keyword).forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Page: ");
                    int page = sc.nextInt();
                    System.out.print("Size: ");
                    int size = sc.nextInt();
                    repo.pagination(page, size).forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();

                    // 👉 HIỂN THỊ CATEGORY
                    System.out.println("=== CATEGORY LIST ===");
                    List<Category> categories = cateRepo.getAll();
                    categories.forEach(System.out::println);

                    System.out.print("Choose Category ID: ");
                    int cid = sc.nextInt();

                    repo.insert(name, price, stock, cid);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid!");
            }
        }
    }
}