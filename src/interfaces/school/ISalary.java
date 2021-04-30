package interfaces.school;

public interface ISalary {

    int BASE_HOURS_SET = 18;
    int TEACHER_COUNCELOR = 1;
    int TEACHER_TUTOR = 2;
    double FOR_TC_PER_WEEK = 50;
    double HOURLY_WAGE_PER_TEACHER = 40;
    double TAX_PERCENTAGE = 30.00/100.00;

    double getBaseSalary();
    double getSalaryPerMonth();
    double getSalary();

    default double getTaxesPerMonth(){
        return getSalaryPerMonth() * TAX_PERCENTAGE;
    };
}
