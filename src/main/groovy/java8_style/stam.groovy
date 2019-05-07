package java8_style

/**
 * @author Evgeny Borisov
 */

def services = [new MyService()]
def service = new SomeService()
services.add(service)
services.each {it.printX()}