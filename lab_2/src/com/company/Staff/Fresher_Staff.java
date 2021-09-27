package com.company.Staff;

import com.company.Staff.Certificate.Certificate;

public class Fresher_Staff extends Employee implements Certificate{
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher_Staff() {
        super();
    }

    public Fresher_Staff(int id, String fullName, String birthDay, int phone, String email, int employeeType, int employeeCount, String graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Tốt nghiệp: " +this.Graduation_date);
        System.out.println("Xếp loại: " +this.Graduation_rank);
        System.out.println("Trường: " +this.Graduation_rank);
    }

    @Override
    public void Certificate() {

    }

    @Override
    public void input() {

    }

    @Override
    public void output() {

    }
}
