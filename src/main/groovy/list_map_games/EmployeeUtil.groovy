package list_map_games

/**
 * @author Evgeny Borisov
 */
class EmployeeUtil {
    static Map<Seniority, Integer> groupBySeniority(List<Employee> employees) {
       return employees.countBy  {Seniority.bySalary(it.salary)}
    }

    public static void main(String[] args) {
        def employee = new Employee()
        employee.printSalary()
        employee.metaClass.printSalary={
            println(1200)
        }

        employee.printSalary()



    }

}
