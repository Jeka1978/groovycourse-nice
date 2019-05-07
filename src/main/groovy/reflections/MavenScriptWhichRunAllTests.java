package reflections;

/**
 * @author Evgeny Borisov
 */
public class MavenScriptWhichRunAllTests {
    public static void main(String[] args) {
        TestRunner.runAllTestForClass("reflections.MyTest1");
    }
}
