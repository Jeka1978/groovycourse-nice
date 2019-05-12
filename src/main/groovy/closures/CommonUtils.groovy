package closures

/**
 * @author Evgeny Borisov
 */
class CommonUtils {

    static Employee reduce(List<Employee> list, Closure c) {


        Employee employee = new Employee()
        if (c.maximumNumberOfParameters == 2) {
            list.each {
                employee = c(employee, it)
            }
        } else {
            def fieldName = c()
            list.each {
                employee = new Employee("$fieldName": employee[fieldName] + it[fieldName])
            }
        }
        employee
        1.times {}
    }

    public static void main(String[] args) {
        def employees = [
                new Employee(salary: 10, age: 50),
                new Employee(salary: 20, age: 30),
                new Employee(salary: 10, age: 40)
        ]

        def employee = reduce(employees) { "age" }
        println(employee)


    }
}


