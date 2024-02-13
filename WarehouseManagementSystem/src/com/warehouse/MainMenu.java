package com.warehouse;


import java.util.Scanner;

import static com.warehouse.UserManagement.registration;

public class MainMenu extends MainMethod
{

 MainMenu(){

    System.out.println("\n<<<<< Main Menu >>>>>\n");
    System.out.println("1.Inventory Management ");
    System.out.println("2.User Management");
//    System.out.println("3.Order Management");
//    System.out.println("4.Warehouse Operation");
//    System.out.println("5.Supplier Management");
    System.out.println("0.Logout/Exit");
    System.out.print("Select your choice (number only) : ");
    int select=sc.nextInt();
    switch (select){
       case 1://Inventory Management
          //System.out.println("\nInventory Management ");
          new InventoryManagement();

          break;
       case 2://user management
         // System.out.println("User Management ");
          registration();
          break;
//       case 3:
//          System.out.println("Order Management");
//          new OrderManagement();
//          break;
//       case 4:
//          System.out.println("switch 4");
//          break;
//       case 5:
//          System.out.println("switch 5");
//          break;
       case 0:
          System.out.println("\n******Thank you******");
          return;

    }



}
}
