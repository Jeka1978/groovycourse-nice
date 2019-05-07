package reflections

import org.junit.Test

/**
 * @author Evgeny Borisov
 */
class MyTest1 {

    void something(){
        println "someting happens"
    }

    @Test
    void test1() {
        println("11111111111")
    }

    @Test
    void test2() {
        println("22222222")
    }

    void test3() {
        println("333333333")
    }

    void test4() {
        println("444444444")
    }
}
