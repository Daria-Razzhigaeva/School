package interfaces.school;

public final class Teacher extends BasePerson implements ISalary {

    private String subject;
    private int set;
    private double code;

    public Teacher(String firstName, String lastName, char gender, int age, String status, String subject, int sets, double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = sets;
        this.code = code;
    }

    public String getSubject() {
        return subject;
    }

    public void printTeacher(){
        System.out.println(
                "school.Teacher: " + getFirstName() + " " + getLastName() + ", subkect " + getSubject()
        );
    }

    @Override
    public double getBaseSalary(){
        return set * BASE_HOURS_SET * HOURLY_WAGE_PER_TEACHER;
    }

    @Override
    public double getSalaryPerMonth(){
        double salaryPerMonth = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return salaryPerMonth;
    }

    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getTaxesPerMonth();
    }
}
