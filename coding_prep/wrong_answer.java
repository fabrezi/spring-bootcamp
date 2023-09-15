public class wrong_answer {

    public static String wrong(int N, String C){
        StringBuilder str = new StringBuilder(C);

        for(int i=0; i < N; i++){
            if(C.charAt(i)=='A'){
                str.replace(i,N,"B");
            } else if(C.charAt(i)=='B'){
                str.replace(i,N,"A");
            }
        }
        String str1 = str.toString();
        return str1;
    }

    public static void main(String[] args){
        int N = 3;
        String C = "AAA";

        System.out.println(wrong(N,C));
    }

}

