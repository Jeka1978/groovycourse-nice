package list_map_games

/**
 * @author Evgeny Borisov
 */
class Main2 {
    public static void main(String[] args) {
        def employees=[
                new Employee(name: 'Moshe',salary: 100),
                new Employee(name: 'MISHAAAA',salary: 200),
                new Employee(name: 'MASHA',salary: 150)
        ]
//        def text = employees.collect{it.name}.join(",")
        def text = employees.collect{it.name}.inject{s1,s2->s1+','+s2}
//        def text = employees.inject("") {em1,em2->em1.name+","+em2.name}
        println(text)
        employees.collect{it.name}.findAll{it==it.toUpperCase()}.sort{it.size()}.each {println(it)}

        employees.collectEntries{[(it.name.toUpperCase()):it.salary*12]}.each {println(it)}














    }
}
