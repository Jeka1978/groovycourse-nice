package closures

/**
 * @author Evgeny Borisov
 */
class TrollBuilder {

   static Closure getClosureForBuildingTroll() {
       println('my method is tarting to prepare closure...')

       return {

           println("very haavy creature was created...")
           return new Troll()
       }

    }


}
