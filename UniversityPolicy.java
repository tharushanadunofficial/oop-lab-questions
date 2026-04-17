/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amarajeewa M.K.T.N
 */
final class UniversityPolicy {

    public static final String UNIVERSITY_NAME = "ABC University";
    public static final double BONUS_RATE = 0.10;

    public static void showPolicyHeader() {
        System.out.println("---- University Policy ----");
    }

    public static double calculateBonus(double salary) {
        return salary * BONUS_RATE;
    }
}

