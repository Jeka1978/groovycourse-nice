package reflections

import org.junit.Test

/**
 * @author Evgeny Borisov
 */
class TestRunner {





    public static void runAllTestForClass(String className){
        def testClass = Class.forName(className)
        def testObject = testClass.newInstance()
        runAllTestMethods(testObject)


    }


    public static runAllTestMethods(Object o) {
        o.getClass().getMethods()
        .each {
            if (it.isAnnotationPresent(Test)||it.getName().startsWith("run")) {
                it.invoke(o)
            }
        }
    }



}
