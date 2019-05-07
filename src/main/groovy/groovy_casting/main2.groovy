package groovy_casting

/**
 * @author Evgeny Borisov
 */

def nameAndAge(){
    [age:"Jack",name:30]
}

Person person = nameAndAge()

println person