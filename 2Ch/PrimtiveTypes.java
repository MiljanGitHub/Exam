public class PrimitiveTypes {

    public static void main(String[] args) {
       // System.out.println( Double.MAX_VALUE);
        double d = Double.MAX_VALUE+1;
        double ff = .02f;
        //System.out.println(d);
        // char d = -23; doesn't compile since it is a integral 'positive only' values //it is like short 16bit
        //byte x = 129;
        //System.out.println(x);

        //valid and invalid formats of values;
	
	double ddd = 1_000.0;
//double ddd1 = 1_00_.0;
//double ddd1 = 1_000._0;
//double ddd1 = 1_000.0_;

double ddd1 = 1_00_______0.0;

double ddd12 = 1_000;

//double ddd222 = 1$00000;



//var x = {12,13}; //DOES NOT COMPILE (array initializer needs an explicit target-type)

int ffff = (byte)(-32768-1);

int two =  0x123E15;

//int twoS = 0XabcdH;


int x1 = 0765; //Octal constant

//int anInt3 = 0B101E05;
boolean _alsoOK1d3ntifi3r_;




System.out.println( "ok");

    }
void paintFence() {
int i1 = 33, i2, i3 = 0, i4=i3; //  The initialization of i3 only applies to i3. It doesn’t have anything to do with i1 or i2 despite being in the same statement.
}
}