
package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author manuel
 */

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name, email;

    protected User() {}

    public User(String name, String email) {
    this.name = name;
    this.email = email;
  }
    
    @Override
    public String toString() {
        return String.format("User[id=%d, name='%s', email='%s']",
        id, name, email);
    }
    
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    } 
}
