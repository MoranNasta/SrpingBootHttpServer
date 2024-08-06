package com.example.demo.http.greetings.model;

public class User {
    private String firstName;
    private String lastName;

    public User() {
    }

    private int id;
    private String address;
    private int phoneNumber;
    private String  email;
    private boolean passed;
    private String  language;
    private String  fullName;
    private String  middleName;
    private String  month;
    private boolean alive;
    private boolean smart;
    private int time;
    private String  type;
    private String  country;
    private boolean haveHouse;
    private boolean religious;
    private boolean  first;
    private boolean finished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public boolean isReligious() {
        return religious;
    }

    public void setReligious(boolean religious) {
        this.religious = religious;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean isHaveHouse() {
        return haveHouse;
    }

    public void setHaveHouse(boolean haveHouse) {
        this.haveHouse = haveHouse;
    }

    public User(String firstName, String lastName, int id, String address, int phoneNumber, String email, boolean passed, String language, String fullName, String middleName, String month, boolean alive, boolean smart, int time, String type, String country, boolean haveHouse, boolean religious, boolean first, boolean finished) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passed = passed;
        this.language = language;
        this.fullName = fullName;
        this.middleName = middleName;
        this.month = month;
        this.alive = alive;
        this.smart = smart;
        this.time = time;
        this.type = type;
        this.country = country;
        this.haveHouse = haveHouse;
        this.religious = religious;
        this.first = first;
        this.finished = finished;
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
}
