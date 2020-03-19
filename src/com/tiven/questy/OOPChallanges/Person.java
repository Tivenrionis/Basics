package com.tiven.questy.OOPChallanges;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) this.age = 0;
        else this.age = age;
    }

    public boolean isTeen() {
        return getAge() > 12 && getAge() < 20;

    }

    public String getFullName() {
        if (this.getLastName().isEmpty() && this.getFirstName().isEmpty()) return "";
        else if (this.getLastName().isEmpty()) return getFirstName();
        else if (this.getFirstName().isEmpty()) return getLastName();
        else return getFirstName() +" "+ getLastName();

    }


}
