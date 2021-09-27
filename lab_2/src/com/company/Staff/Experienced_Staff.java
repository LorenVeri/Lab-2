package com.company.Staff;

import com.company.Staff.Certificate.Certificate;

public class Experienced_Staff extends Employee implements Certificate {
    private int expInYear;
    private String proSkill;

    public Experienced_Staff() {
        super();
    }

    public Experienced_Staff(int id, String fullName, String birthDay, int phone, String email, int employeeType, int employeeCount, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType, employeeCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Số năm kinh nghiệm: " +this.expInYear);
        System.out.println("Kỹ năng: " +this.proSkill);
    }

    @Override
    public String toString() {
        return "Experienced_Staff{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", employeeCount=" + employeeCount +
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
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
