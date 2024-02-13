package com.warehouse;


import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static com.warehouse.UserManagement.registration;

public class UserManagement extends MainMethod
{
static Scanner sc=new Scanner(System.in);

private static String[] usernames=new String[100];
private static String[] passwords=new String[100];
private static int userCount=0;


UserManagement()

    {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Welcome to Warehouse Management System +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1.Add User");
//        System.out.println("2.User List");
        System.out.println("0.Exit");

        System.out.print("Select your choice (number only) : ");


        int select=sc.nextInt();

        switch (select)
        {
            case 1://Add User
                //System.out.println("Add User");
                addUser();
                break;
            case 2://User List

                //System.out.println("\nUser List\n");

                break;
            case 0:
                System.out.println("Thank You");
                return;

        }
    }

    static void registration(){

    System.out.println("\n<<<<< Inventory Management >>>>>");
        System.out.println("1.Add User");
        System.out.println("2.User List");
        System.out.println("3.Delete User");//delete user setup later
        System.out.println("4.Main Menu");

        int select=sc.nextInt();

        switch (select){
            case 1://Add User
                //System.out.println("Add User");
                addUser();
                break;
            case 2://User List
               // System.out.println("\nUser List\n");
                userList();
                break;
            case 3:
                System.out.println("Delete User");

                break;
            case 4://Main menu
                //System.out.println("Main menu");
                new MainMenu();
                break;
            case 0:
                System.out.println("Thank You");
                return;

        }
    }

static void UserLogin()

{
    System.out.println("\n<<<<<Inventory Management>>>>>");
    System.out.println("1.Add User");
    System.out.println("2.User List");
    System.out.println("3.Delete User");
    System.out.println("4.Main Menu");

    int select=sc.nextInt();

    switch (select){
        case 1:
            System.out.println("Add User");
            addUser();
            break;
        case 2:
            System.out.println("\nUser List\n");

            break;
        case 3:
            System.out.println("Delete User");

            break;
        case 4:
            System.out.println("Main menu");
            new MainMenu();
            break;
        case 0:
            System.out.println("Thank You");
            return;

        }
    }
    static void addUser(){
        System.out.println("\n<<<<< Welcome to user Registration >>>>>\n");

        System.out.print("Enter Username : ");
        String username=sc.next();

        if (usernameExists(username)){
            System.out.println("Username already Exists. please try again.");
            return;

        }
        System.out.print("enter Password: ");
        String password1=sc.next();

        System.out.print("Confirm password: ");
        String password2=sc.next();

        if (password1.equals(password2)){
            usernames[userCount] =username;
            passwords[userCount]=password1;
            userCount++;
            System.out.println("Registration Successful !");
            login();

        }else {
            System.out.println("password do not match. Registration failed ");
            addUser();

        }

    }
    static void login(){
        System.out.println("\n<<<<< Welcome to user login >>>>>\n");

        System.out.print("Enter Username : ");
        String inputUsername=sc.next();

        System.out.print("Enter Password : ");
        String inputPassword=sc.next();

        for (int i=0; i< userCount;i++)
        {
            if (inputUsername.equals(usernames[i] )&& inputPassword.equals(passwords[i])){
                System.out.println("Login Successful!!");
                new MainMenu();
                return;
            }
            System.out.println("Invalid Username or Password. Login failed.");
            login();
        }
    }
    private static boolean usernameExists(String username) {
        for (int i = 0; i < userCount; i++) {
            if (username.equals(usernames[i])) {
                return true;
            }
        }
        return false;
    }

static void userList(){
    System.out.println("\n<<<<< User List >>>>>");
//    ArrayList<String> list=new ArrayList<String>();
   for (int i=0; i<userCount;i++)
   {
       System.out.println(usernames[i]);
   }
    System.out.println("Select 1: for User Management");
    System.out.println("Select 2: for Main Menu");
    System.out.println("Select 0: for exit");

    int select = sc.nextInt();
    switch (select) {
        case 1:
            registration();
        case 2:
            new MainMenu();
        case 3:
            System.out.println("Thank you");
            return;


    }

}
}





