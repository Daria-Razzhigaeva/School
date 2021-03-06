package interfaces.school;
import static interfaces.school.ISalary.FOR_TC_PER_WEEK;
import static interfaces.school.test.Assert.aAssert;

public class School {

    private static final String LINE = "______________________________________________________";
    private static final double EXPECTED_BASE_SALARY = 1440;
    private static final double EXPECTED_PAY_CHECK = 4172;

    public static void main(String[] args) {

        Student student1 = new Student("Masha", "Ivanova", 'F', 10,
                "school.Student", 5);

        Student student2 = new Student("Vova", "Sidorov", 'M', 14,
                "school.Student", 8);


        Parent parent1 = new Parent("Petr", "Ivanov", 'M', 45, "school.Parent",
                12345678911L, student1);

        Parent parent2 = new Parent("Elena", "Ivanova", 'F', 40, "school.Parent",
                12345678912L, student1);

        Parent parent3 = new Parent("Andrey", "Sidorov", 'M', 35, "school.Parent",
                12345675555L, student2);


        Teacher teacher1 = new Teacher("Maria Ivanovna", "Petrova", 'F', 35,
                "school.Teacher", "Russian Literature", 2, FOR_TC_PER_WEEK);

        ISalary salaryForTeacher1 = teacher1;

        ISalary salaryForTeacher2 = new Teacher("Ivan Petrovich", "Petrov", 'M', 55,
                "teacher", "Math", 1, FOR_TC_PER_WEEK);

        Parent[] parents = new Parent[]{parent1, parent2};

        parent1.printParent();
        parent2.printParent();
        parent3.printParent();

        System.out.println(LINE);

        student1.printParent(parents);

        System.out.println(LINE);

        teacher1.printTeacher();

        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());
        aAssert(EXPECTED_PAY_CHECK, teacher1.getSalary());
    }
}