package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //You are to create a program that can store login information. It should also allow users to "login"

        //Your program needs to do the following:

        //Ask the user if they want to "create an account" or "login"
        //If they select create account you should prompt them for a username
        //If the username already exists in the system have them re enter a different user name.
        //After they have a username ask for for a password.
        //Your program should save this information and go back to asking if they would like to "create an account" or "login"
        //If they choose to login, ask for a username and password and see if there is an account that matches the credentials.
        //If it matches, print "welcome, " + username  and close the program
        //If it does not match print "sorry account does not match records" and return to asking if they would like to "create an account" or "login"


        // PseudoCode--------------------------------------------------------------------------------------------------------------------------------------------


        // System.out.print("Welcome. Would you like to login or create an account?");
        // Get input from user, put it into a variable.
        // If they enter "Create an account", print ("Enter a username for your account.")
        // Have the application check if the username already exists. If it does, have them make a new username.
        // System.out.println("Now make a password: ")
        // Once they make a password, print("Your account has been successfully created.")
        // Re-ask if they want to make an account or login, get more input
        // If they choose "login", get user input by asking for their username and password
        // Have it check if the username and password exist and match in the array/list
        // If it does, print("Welcome, " + username) then close the program
        // If it does not match, System.out.print("Your username or password do not match records")
        // Go back to asking if they want to make an account or login


        //-------------------------------------------------------------------------------------------------------------------------------------------------------




        Scanner console = new Scanner(System.in);
        String createOrLogin;
        System.out.println("Welcome.  Would you like to create an account or login?");
        //createOrLogin =

















    }
}

































































































































        //EXAMPLES:
                //Input          	Output
                //Would you like to (create account) or (login)?
                //login
                //Enter Username:
                //Bob
                //Enter Password:
                //Ross
                //sorry account does match records
                //Would you like to (create account) or (login)?
                //create account
                //Enter Username:
                //Bob
                //Enter Password:
                //Ross
                //Would you like to (create account) or (login)?
                //create account
                //Enter Username:
                //JamesBond007
                //Enter Password:
                //GoldenGun
                //Would you like to (create account) or (login)?
                //login
                //Enter Username:
                //Bob
                //Enter Password:
                //GoldenGun
                //sorry account does not match records
                //Would you like to (create account) or (login)?
                //login
                //Enter Username:
                //Bob
                //Enter Password:
                //Ross
                //welcome, Bob














