CREATE DATABASE StoreDB;
GO

USE StoreDB;
GO

CREATE TABLE categories (
    id INT PRIMARY KEY,
    name NVARCHAR(100)
)
go

CREATE TABLE products (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(100),
    price FLOAT,
    stock INT,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES categories(id)
)
go

INSERT INTO categories (id, name) VALUES
(1, N'Electronics'),
(2, N'Books'),
(3, N'Clothing'),
(4, N'Home Appliances'),
(5, N'Sports'),
(6, N'Toys'),
(7, N'Beauty'),
(8, N'Automotive'),
(9, N'Groceries'),
(10, N'Furniture')
go

INSERT INTO products (name, price, stock, category_id) VALUES
(N'iPhone 15', 1200, 10, 1),
(N'Samsung TV 55 inch', 800, 5, 1),
(N'Java Programming Book', 25, 50, 2),
(N'T-shirt', 15, 100, 3),
(N'Washing Machine', 500, 7, 4),
(N'Football', 20, 30, 5),
(N'Lego Set', 60, 25, 6),
(N'Lipstick', 10, 80, 7),
(N'Car Battery', 120, 12, 8),
(N'Office Chair', 150, 20, 10)
go

select * from categories
select * from products