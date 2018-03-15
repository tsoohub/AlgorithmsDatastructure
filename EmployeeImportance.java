import java.util.ArrayList;
import java.util.List;

public class EmployeeImportance {

    public int getImportance(List<Employee> employees, int id) {

        int importance = 0;
        for(Employee emp : employees) {
            if(emp.id == id) {
                importance = importanceHelper(employees, emp);
            }
        }
        return importance;
    }

    private int importanceHelper(List<Employee> employees, Employee employee) {
        int importance = employee.importance;
        for(int i : employee.subordinates) {

            for(Employee emp : employees) {
                if(emp.id == i) {
                    importance += emp.importance + importanceHelper(employees, emp);
                }
            }
        }
        return importance;
    }

    public static void main(String[] args) {
        EmployeeImportance emp = new EmployeeImportance();

        List<Integer> subs = new ArrayList<>();
        subs.add(2);
        subs.add(3);
        Employee one = new Employee();
        one.id = 1;
        one.importance = 15;
        one.subordinates = subs;


    }
}
