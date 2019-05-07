package tdd

import spock.lang.Specification

/**
 * @author Evgeny Borisov
 */
class CalcTest extends Specification {
    def "WithMaam"() {
        def mock = Mock(MaamResolver) { getMaam() >> 0.1 }
        def calc = new Calc(maamResolver: mock)
        when:
        def withMaam = calc.withMaam(100)
        then:
        withMaam==110
    }
}
