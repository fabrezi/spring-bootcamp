public class wrong_answer {

    //Meta Interview Prep

    //Input: ABABA
    //ALGO: Convert the String into opposite characters
    //Output: BABAB


    public static void main(String [] args){
        String C = "BBB";
        int N = 3;
        //String newname = C.substring(0,1) + 'x' + C.substring(2);
        //System.out.println(newname);

        StringBuilder sb = new StringBuilder(C);
        //sb.append("Hoola");

        //System.out.println(sb);
        //System.out.println(N);

        for(int i =0; i < N; i++){
            if (C.charAt(i) == 'A') {
                //sb.append('B');
                sb.replace(i,N,"B");
            } else if(C.charAt(i)  == 'B'){
                sb.replace(i,N,"A");
            }
            //System.out.println(sb);
        }

        System.out.println(sb);


        }

    }


