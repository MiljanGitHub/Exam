package lambdas;

 record Animal(String species, boolean canHop, boolean canSwim) { }
 interface CheckTrait {
    boolean test(Animal a);
}
public class Test {

    public static void main(String[] args) {
        CheckTrait checkTrait = a -> { return a.canHop(); };
    }



}