package word_count_and_streams
/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        String text = "java a java a java groovy groovy"
        String i = text.toLowerCase().replaceAll("([^A-Za-z0-9']|\\B'|'\\B)", " ")
        def map = i.findAll(/[\w']+/).count() { it }
//        def map = i.findAll(/[\w']+/).groupBy { it }
        print(map)
        def string = text.split(" ").toList().stream().filter { it != 'a' }.filter{it!=" "}.collect()
        println "string = $string"
        print(string.class)
    }
}
