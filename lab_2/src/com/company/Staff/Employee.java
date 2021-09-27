package com.company.Staff;

public abstract class Employee {
    protected int id;
    protected String fullName;
    protected String birthDay;
    protected int phone;
    protected String email;
    protected int employeeType;
    protected int employeeCount = 0;

    public Employee() {
    }


    public Employee(int id, String fullName, String birthDay, int phone, String email, int employeeType, int employeeCount) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.employeeCount = employeeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void showInfo() {
        System.out.println("Mã nhân viên: " +this.id);
        System.out.println("Tên nhân viên: " +this.fullName);
        System.out.println("Số điện thoại: " +this.phone);
        System.out.println("Địa chỉ email: " +this.email);
    }

    protected abstract void Certificate();

}
