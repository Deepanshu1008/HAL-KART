# HAL-KART
![HAL_kart_carousel](https://github.com/Deepanshu1008/HAL-KART-Frontend/blob/main/frontend/src/images/carousel_1.png)

## Features

**Software Used:**

- STS or Eclipse Ide (Backend)

- VS Code (Frontend)

- MySQL Workbench (Database)

​Note: If you want to use another IDE for Backend like (IntelliJ Idea, Netbeans Ide, etc), you can use that also based on preferences.



**User Module:**

The project contains 3 Module:

- Admin

- Customer

- Delivery Person



​**Functional Modules:**

1) User Authentication Module
2) Product Module
3) Product Category Module
4) Cart Module
5) Order Module
6) Delivery Module
7) Payment Module

​

User Role-Wise Functionalities:



**Admin Role:**

1) Admin Register & Login

2) Add Product Categories.

3) View Categories

4) Remove Categories.

5) Add Products in Categories.

6) Update Products.

7) Delete Products.

8) View All Customer Orders.

9) Assign Order to Delivery Person for the Product Deliveries.



**Customer Role:​**

1) Register & Login Customers.

2) View All Products.

3) Search Products.

4) View Products based on Categories.

5) Add Products to the Cart.

6) View Cart.

7) Remove Products from Cart.

8) Order the Products.

9) Make Payment for Order.

10) View Order History.



**Delivery Person Role:**

1) Register & Login Delivery Person.

2) View Assigned Orders for Delivery.

3) Update the Delivery Status with the approximate time for delivery.



**​Project Benefits:​**

1) You will be able to understand how Spring Boot and React communicate together.

2) You will be able to understand how Spring Boot Rest APIs work at the backend.

3) You'll be able to understand how Fullstack Project works.

4) You can easily Customize the Project based on your requirements.



**Software Used:**

- STS or Eclipse Ide (Backend)
- VS Code (Frontend) 
- MySQL Workbench (Database)
- Install JDK Version 17.0.7 and above
- Install Apache-maven 3.X-bin.zip
   (Binary zip archive) (https://youtu.be/3EfvEZ_wThc)
- Node.js
  
![HAL_kart_logo](https://github.com/Deepanshu1008/HAL-KART-Frontend/blob/main/frontend/src/images/e_logo.png)

# Getting Started

1) Install Spring Tools 4 for Eclipse(STS) - 4.19.X version for Windows X86_64 (https://spring.io/tools)

2) Clone the project 
>For Frontend
- Visit [HAL-KART-Frontend](https://github.com/Deepanshu1008/HAL-KART-Frontend) for frontend repository
>For Backend
- Fork the repo
- Clone the repo
   ```sh
   git clone https://github.com/Deepanshu1008/HAL-KART-Backend
   ```
   
3) Open STS

4) Steps to setup backend server
- Click on Folder Option
- Click on Import
- Select Maven
- Open Exisitng Maven Project
- Browse the backend_file(cloned)
- [Tick] on pom.xml file

4)Wait for project to be imported successfully (Check Bottom Right)

5)Open upd online_shopping[boot]
- src/main/resources
- click on application properties

6)Enter MySQL password

7)Copy image folder path in disk.upload.basepath="EXAMPLE - C:/project_folder/images "

8)Right Click on upd online_shopping[boot] 
- then run as maven built[alt+shift+X]
- Write in Goals box "clean install" and tick(skip tests) 
- Apply and close
    
9)Right Click on upd online_shopping[boot] 
then run as Springboot Appliaction

10)Now backend server has started.Now go to frontend folder and run npm start
