package com.upgrad.oop2;

class StudentV1 {
    private final String name;
    private int year;
    private static final int annualFees = 10000;

    public StudentV1(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public int getFees() {
        return StudentV1.annualFees * this.year;
    }

    public String getDetails() {
        String studentRecord = "Student name: " + this.name + "\n" +
                "Student Fees: " + this.getFees() + "\n";

        return studentRecord;
    }

}

class ResearchStudentV1 extends StudentV1 {
    private String researchArea;

    public ResearchStudentV1(String name, int year, String researchArea) {
        super(name, year);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return this.researchArea;
    }

    public String getDetails() {
        String researchStRecord = super.getDetails();
        researchStRecord += "Student researchArea: " + this.researchArea;

        return researchStRecord;

    }

}


class PhDStudentV1 extends ResearchStudentV1 {
    private String thesis;

    public PhDStudentV1(String name, int year, String researchArea, String thesis) {
        super(name, year, researchArea);
        this.thesis = thesis;
    }

    public String getThesis() {
        return this.thesis;
    }

    public String getDetails() {
        String PhdStrecord = super.getDetails();
        PhdStrecord += "\nPhd Student thesis: " + this.thesis;
        return PhdStrecord;
    }

}


public class StudentImpl {

    public static void main(String[] args) {
        ResearchStudentV1 r1 = new ResearchStudentV1("mavixk", 3, "Software development");
        System.out.println(r1.getDetails());

        PhDStudentV1 phd1 = new PhDStudentV1("casper", 2, "Devops",
                "Cloud devops techniques");

        System.out.println(phd1.getDetails());

    }
}

