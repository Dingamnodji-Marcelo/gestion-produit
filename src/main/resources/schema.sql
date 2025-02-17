
CREATE TABLE IF NOT EXISTS `produit` (
    `product_id` INT AUTO_INCREMENT PRIMARY KEY,
    `product_name` VARCHAR(50) NOT NULL,
    `product_price` INT,
    `product_quantity` INT
);

INSERT INTO produit (product_id, product_name, product_price, product_quantity) VALUES ('Ananas', 5000, 12);
INSERT INTO produit VALUES (2, 'Lait Nido', 20200, 4);
