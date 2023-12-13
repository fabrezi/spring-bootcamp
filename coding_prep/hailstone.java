public class hailstone {

    public static int Seq(int initial_value){
        //int [] arr = new int[100];

        while(initial_value != 1) {
            if (initial_value % 2 == 0) {
                initial_value = initial_value / 2;
            } else {
                initial_value = (3 * initial_value) + 1;
            }
        }
        return initial_value;

    }


    public static void main(String[] args){
        int initial_value = 10;
        System.out.println(Seq(initial_value));
    }

}
