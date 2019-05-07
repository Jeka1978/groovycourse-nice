package solutions

import groovy.transform.Canonical

/**
 * @author Evgeny Borisov
 */
@Canonical
class Money {
    String curr
    double amount

    Money plus(Money other){
        double modifier=1
        if(curr!=other.curr){
            def json = new URL("http://rate-exchange-1.appspot.com/currency?from=${curr}&to=${other.curr}").getText()
            modifier = json.find("[^{\\}]+(?=})").split(",").findAll{it.contains("rate")}[0].split(":")[1].toDouble()
        }
        new Money(curr: curr,amount: amount+other.amount/modifier)
    }

    public static void main(String[] args) {
        /*def money = new Money(curr: 'ILS', amount: 100)
        def money2 = new Money(curr: 'USD', amount: 200)
        println(money+money2)*/
        println((int)'5'.grep())
    }

}
