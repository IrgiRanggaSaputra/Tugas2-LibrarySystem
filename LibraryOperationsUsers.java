package com.mycompany.librarysystem;


public interface LibraryOperationsUsers {
    void addUsers (Users users);
    void viewUsers ();
    void updateUsers ();
    void borrowUsers(int bookId, int userId);
    void returnUsers(int bookId);
    
}
