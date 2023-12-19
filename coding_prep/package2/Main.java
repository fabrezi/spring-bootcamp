package package2;

class ShoppingPortal{

    public void Pay(String username, String password){
        System.out.println("make the pay");
    }

    public void Pay(int name, int data){
        System.out.println("drop the pay");
    }

}

public class Main {

    public static void main(String [] args){
        ShoppingPortal sp = new ShoppingPortal();
        sp.Pay("bob", "roe");
        sp.Pay(10,11);


    }
}
