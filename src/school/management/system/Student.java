package school.management.system;

/**
 * Created by Jose Rodriguez on 9/5/2021
 * This class is responsible for keeping track of student name, id, grades, fees, and fees paid.
 *
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    /**
     *
     * @param id id for student
     * @param name name of student
     * @param grade grade of student
     */
    public Student (int id, String name, int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    // Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    // Getters


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }

    public void setFeesTotal(double feesTotal) {
        this.feesTotal = feesTotal;
    }

    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }
}
