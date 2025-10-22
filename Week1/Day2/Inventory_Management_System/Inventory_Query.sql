1. List products with low stock (less than 20)

SELECT * FROM Product WHERE Stock < 20;

2. Calculate total amount spent by each customer

SELECT
  c.customer_id,
  c.first_name,
  c.last_name,
  NVL(SUM(d.order_quantity * d.item_price), 0) AS total_spent
FROM customer c
LEFT JOIN orders o ON c.customer_id = o.customer_id
LEFT JOIN order_details d ON o.order_id = d.order_id
GROUP BY c.customer_id, c.first_name, c.last_name
ORDER BY total_spent DESC;

3. Update product stock after orders

UPDATE product p
SET p.stock = p.stock - (
  SELECT NVL(SUM(d.order_quantity), 0)
  FROM order_details d
  WHERE d.product_id = p.product_id
)
WHERE EXISTS (
  SELECT 1 FROM order_details d WHERE d.product_id = p.product_id
);
