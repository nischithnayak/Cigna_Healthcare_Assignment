CREATE TABLE Product (
  Product_Id VARCHAR2(20) PRIMARY KEY,
  Product_Name VARCHAR2(20) NOT NULL,
  Category VARCHAR(20) NOT NULL,
  Price NUMBER(10,2) CHECK(Price>0),
  Stock NUMBER(10) DEFAULT 0
);

CREATE TABLE Customer(
 Customer_Id VARCHAR2(20) PRIMARY KEY,
 First_Name VARCHAR(20) NOT NULL,
 Last_Name VARCHAR(20) NOT NULL,
 Phone VARCHAR2(15) UNIQUE,
 Email VARCHAR2(20) UNIQUE NOT NULL
);
  
  
CREATE TABLE Orders(
 Order_Id VARCHAR2(20) PRIMARY KEY,
 Customer_Id VARCHAR2(20) NOT NULL,
 Order_Date DATE DEFAULT SYSDATE,
 Total_Amount NUMBER(10,2) CHECK (Total_Amount>=0),
 CONSTRAINT FK_Orders FOREIGN KEY (Customer_Id) REFERENCES Customer(Customer_Id) ON DELETE CASCADE
);

CREATE TABLE ORDER_Details(
 Billing_Id VARCHAR2(20) PRIMARY KEY,
 Order_Id VARCHAR2(20) NOT NULL,
 Product_Id VARCHAR2(20) NOT NULL,
 Item_Price NUMBER(10,2) NOT NULL,
 Order_Quantity NUMBER(10) CHECK(Order_Quantity>0),
 CONSTRAINT FK_Product_in_details FOREIGN KEY (Product_Id) REFERENCES Product(Product_Id) ON DELETE CASCADE,
 CONSTRAINT FK_Orders_in_details FOREIGN KEY (Order_Id) REFERENCES Orders(Order_Id) ON DELETE CASCADE
);


INSERT INTO Product VALUES('P_101', 'ASUS-ZENBOOK', 'ELECTRONICS', '100000', 20);
INSERT INTO Product VALUES('P_102', 'MACBOOK', 'ELECTRONICS', '200000', 10);

INSERT INTO Customer VALUES('C_101', 'Jhon', 'Doe', '111-9990012345', 'testDoe@gmail.com');
INSERT INTO Customer VALUES('C_102', 'Jane', 'Snow', '111-9990054321', 'testSnow@gmail.com');

INSERT INTO Orders(Order_Id, Customer_Id, Total_Amount)   VALUES('O_101', 'C_102', 1000000);
INSERT INTO Orders(Order_Id, Customer_Id, Total_Amount)   VALUES('O_102', 'C_101', 1000000);

INSERT INTO ORDER_Details(Billing_Id, Order_Id, Product_Id, Order_Quantity, Item_Price) VALUES ('B_100', 'O_101', 'P_101', 5, 10000); 

