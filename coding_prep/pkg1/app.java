package pkg1;

class GrandFather{
    int grandFatherAge;

    public GrandFather(int grandFatherAge){
        this.grandFatherAge=grandFatherAge;
    }
    public  void showGrandFatherAge(){
        System.out.println("grand father age is" + this.grandFatherAge);

    }

}

class Parent extends GrandFather {
    int fatherAge;
    public Parent(int fatherAge){
        super(fatherAge+30);
        this.fatherAge = fatherAge;
    }
    public void showFatherAge(){
        showGrandFatherAge();
        System.out.println("father age" + this.fatherAge);
    }

}

class Son extends Parent{
    int sonAge;
    public Son(int sonAge){
        super(sonAge+30);
        this.sonAge = sonAge;
    }
    public void showsonAge(){
        showFatherAge();
        System.out.println("son age is " + this.sonAge);
    }
}

public class app{
    public static void main(String [] args){
        Son son = new Son(20);
        son.showsonAge();
    }
}
