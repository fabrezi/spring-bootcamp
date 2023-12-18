import java.util.ArrayList;
import java.util.List;

public class hailstone {

    public static List<Integer> Seq(int n, int initial_value, int [] arr){
        //int [] arr = new int [n];
        //int counter = 0;
        List<Integer> list = new ArrayList<Integer>();

        while(initial_value != 1) {
            if (initial_value % 2 == 0) {
                initial_value = initial_value / 2;
                 //counter = counter + 1;
                //arr.insert(initial_value) ;
            } else {
                initial_value = (3 * initial_value) + 1;
            }
        }
        return initial_value;

    }


    public static void main(String[] args){
        int n = 10;
        int initial_value = 11;
        int [] arr = new int [2];
        //List<Integer> list = new ArrayList<Integer>();//initialization of an arraylist.
        System.out.println(Seq(n, initial_value, arr));
    }

}
