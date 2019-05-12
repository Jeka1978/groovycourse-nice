package list_map_games

/**
 * @author Evgeny Borisov
 */
class Main {
    public static void main(String[] args) {
        def list = ['java', 'c++', 'scala', 'pascal', 'groovy', 'ruby']
        Map<Integer, List<String>> map = list.groupBy { it.size() }
        println(map)
        Map<Boolean, Integer> map1 = list.countBy { it.contains('j') }
        println(map1)
        def map2 = list.collectEntries { [(it): it.size()] }
        println(map2)
    }
}
