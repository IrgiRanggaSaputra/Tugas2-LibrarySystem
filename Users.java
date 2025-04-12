package com.mycompany.librarysystem;

public class Users extends LibraryEntity {
    private String name;
    private String email;

    public Users(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String getDetails() {
        return "User [ID=" + getId() + ", Name=" + name + ", Email=" + email + "]";
    }
}