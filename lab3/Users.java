package lab3;
//WAP to create a class User with fields: id, name, email. take input from user to initialize 5 user object and write to file. Write a program to display the data as well. Make sure that previously stored data are not lost.

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

// Serializable class for User
class User implements Serializable {
    int id;
    String name;
    String email;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Display user details
    public void displayUser() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}

public class Users {

    // Method to write a list of users to a file
    public static void writeUsersToFile(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
            out.writeObject(users); // Serialize the entire list of users
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read and display users from the file
    // @SuppressWarnings("unchecked")
    public static List<User> readUsersFromFile() {
        List<User> users = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.dat"))) {
            users = (List<User>) in.readObject(); // Deserialize the list of users
        } catch (FileNotFoundException e) {
            System.out.println("No previous user data found.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = readUsersFromFile(); // Load existing users

        // Input data for 5 new users
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for User " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            // Create User object and add it to the list
            User user = new User(id, name, email);
            users.add(user);
        }

        // Write all users (new + previously stored) to the file
        writeUsersToFile(users);

        // Display users stored in the file
        System.out.println("\nStored User Data:");
        for (User user : users) {
            user.displayUser();
        }
    }
}
