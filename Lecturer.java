/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amarajeewa M.K.T.N
 */

class Lecturer extends StaffMember {

    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department,
                     int courseCount, double paymentPerCourse) {

        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails() {
        displayBasicDetails();
        System.out.println("Courses: " + courseCount);
    }
}

