import static p1.Park.Ride.m1;

public class Park {
    static  class Ride {
        private int price = 6;

        void t(){

        }

        static void m1(){}


        private int k(){
            return 1;
        }
    }

    void m(){
        //k(); //DOES NOT COMPILE
        //t(); //DOES NOT COMPILE
        m1();

    }

    static  void  m2(){
        m1();
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price); //DOES COMPILE
    } }