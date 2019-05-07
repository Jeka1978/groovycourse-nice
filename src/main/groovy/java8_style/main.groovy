package java8_style

def employees = [
        new Employee(name: 'jeka',salary: 32),
        new Employee(name: 'john',salary: 22),
        new Employee(name: 'james',salary: 12),
        new Employee(name: 'jane',salary: 32),
        new Employee(name: 'gorge',salary: 2)
]

employees.groupBy {Maturity.bySalary(it.salary)}.each {println(it)}