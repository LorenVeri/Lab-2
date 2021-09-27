package com.company.Staff;

import com.company.Staff.Certificate.Certificate;

public class Intern_Staff extends Employee implements Certificate {
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern_Staff() {
        super();
    }

    public Intern_Staff(int id, String fullName, String birthDay, int phone, String email, int employeeType, int employeeCount, String majors, String semester, String university_name) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Chuyên ngành đang học: " +this.Majors);
        System.out.println("Học kì đang học: " +this.Semester);
        System.out.println("Trường đang học: " +this.University_name);
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
