class Solution {
  
  public String getWrongAnswers(int N, String C) {
    // Write your code here
    StringBuilder sb = new StringBuilder(C);
    //String S = sb.toString();
    for(int i=0; i < N; i++){
     if(C.charAt(i) == 'A'){
       sb.replace(i,N,"B");
     }else if(C.charAt(i) == 'B'){
       sb.replace(i,N,"A");
     }
    }
    String S = sb.toString();
    return S;
  }
  
}


