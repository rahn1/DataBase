package org.overlake.mat803.databaseexample.database;

import androidx.room.PrimaryKey;

public class User {
    @PrimaryKey
    public int sisId;
    public String firstName;
    public String lastName;

    public User(int sisId, String firstName, String lastName) {
        this.sisId = sisId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
