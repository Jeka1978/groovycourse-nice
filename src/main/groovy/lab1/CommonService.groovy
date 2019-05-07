package lab1

/**
 * @author Evgeny Borisov
 */
class CommonService {
    def printStuff(Object x) {
        switch (x) {
            case Animal: println("this is animal")
                break
            case Employee: println("maskoret = $x.maskoret")
                break
            case Dog: println("gav gav")
        }
    }
}
