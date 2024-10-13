package neetcode;

public class anagram {

    public static boolean ana(String s, String t){

        int[] store = new int[26];

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;

        }
        System.out.println(store);
        for(int n : store){
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "race";
        String t = "acer";
        //System.out.println(store);
        System.out.println("Is this an anagram:==>" + ana(s,t));

    }
}
