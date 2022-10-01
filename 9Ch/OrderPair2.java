public class OrderedPair2<K, V>{

    public <K, V> OrderedPair2(K value , V v) {} //DOES COMPILE;
    //public <K, V> OrderedPair2(K value , V v) {} //DOES NOT COMPILE; overloaded constructor;
    //public <K, V> OrderedPair2(K value , V v, X x) {} //DOES NOT COMPILE; generic type not mentioned in "formal type parameter"
    public <K, V> OrderedPair2(K value , V v, StringBuilder x) {}  //DOES COMPILE;

    public static void main(String[] args) {
        new OrderedPair<Integer, String>(1, "", new StringBuilder());
    }
}