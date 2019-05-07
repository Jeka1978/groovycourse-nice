package solutions

/**
 * @author Evgeny Borisov
 */
class Main {
    static double calcTaxes(List<Integer> salaries, Closure closure) {
        double totalTaxes = 0
        salaries.collect { int salary -> totalTaxes += closure(salary) }.sum() as Double
    }

    public static void main(String[] args) {
        //new URL('http://rate-exchange-1.appspot.com/currency?from=USD&to=ILS').getText().find("[^{\\}]+(?=})").split(",").findAll{it.contains("from")}.get(0).split(":")[1]
        def salaries = [1, 2, 1, 2, 3,1]
        println calcTaxes(salaries){it*0.18}

    }
}
