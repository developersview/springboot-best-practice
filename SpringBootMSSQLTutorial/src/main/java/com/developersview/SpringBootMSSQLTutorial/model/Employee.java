package com.developersview.SpringBootMSSQLTutorial.model;

import javax.persistence.*;

/**
 * @author pranoy.chakraborty
 * @Date 13/07/22
 */

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "emailid", nullable = false)
    private String emailID;

    public Employee() {

    }

    public Employee(long id, String firstName, String lastName, String emailID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}
