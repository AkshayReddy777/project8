package com.company;

import lms.db.DBHelper;
import lms.users.User;


public class Library {

    private Library() {

    }

    public static void addBook(Book book) {
        System.out.println("About to add a book " +  book.getTitle() +" to library.");
        DBHelper.dbInsertBook(book);
    }


    public static boolean removeBook(String bookID) {
        System.out.println("removing a book with book id" +  bookID +" from library.");
        return false;
    }
    public static void issueBook(String bookID, String userID){
        System.out.println("Issuing a book, book id: " +  bookID + ", to user id: " + userID +" from library.");
    }
    public static void returnBook(String bookID) {
        System.out.println("Returning a book, book id: " +  bookID + ", to library.");
    }

    public static void listAllBooks() {

    }

//    public static void addUser(User user) {
//        System.out.println("About to Signup a user " +  user.getFirstName() + " " + user.getLastName() + " .");
//        DBHelper.dbInsertUser(user);
//    }

    public static boolean checkUserLoginCredentials(String email, String password) {

        DBHelper.dbVerifyUserCredentials(email, password);
        return true;
    }

}
