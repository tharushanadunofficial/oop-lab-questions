/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amarajeewa M.K.T.N
 */



public class Lab04Main {
    public static void main(String[] args) {

        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        Lecturer l1 = new Lecturer("Kamal", "L001", "IT", 2, 40000);
        Lecturer l2 = new Lecturer("Nimal", "L002", "CS", 3, 50000);
        LabAssistant la1 = new LabAssistant("Sunil", "A001", "SE", 100, 500);

        l1.changeDepartment("Engineering");

        System.out.println("\n--- Lecturer 1 ---");
        l1.displayLecturerDetails();
        double s1 = l1.calculateMonthlyPayment();

        System.out.println("\n--- Lecturer 2 ---");
        l2.displayLecturerDetails();
        double s2 = l2.calculateMonthlyPayment();

        System.out.println("\n--- Lab Assistant ---");
        la1.displayLabAssistantDetails();
        double s3 = la1.calculateMonthlyPayment();

        double total = s1 + s2 + s3;

        System.out.println("\nTotal Payment: " + total);
        System.out.println("Total Staff: " + StaffMember.getStaffCount());

        System.out.println("\n--- Notices ---");
        l1.showCommonNotice();
        l2.showCommonNotice();
        la1.showCommonNotice();
    }
}

