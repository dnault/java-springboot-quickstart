package org.couchbase.quickstart.models;

import java.util.UUID;

public class ProfileRequest {

    private String firstName, lastName, email, password;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName =  firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }

    public ProfileRequest() { }

    public ProfileRequest(String firstName, String lastName, String email, String password){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Profile getProfile() {
        return new Profile(UUID.randomUUID().toString(), firstName, lastName, email, password);
    }
}
