package proba;

public class ProbaClass {

    public static void  main(String[] args) {

        System.out.println("Hello world");
        seyHello( "Ivana");

        System.out.println("Bobi proba");
        System.out.println("proba1106");
        System.out.println("new commit");
        System.out.println("CACItest");

        

    }

    String a;


    public int getAge() {
        return age;
    }

    public ProbaClass(int age) {
        this.age = age;
    }

    private int age = 15 ;

    //this test will e ran once BUG-565 is fixed
   public static void seyHello(String name) {
        // TODO: Add support for multiple users
        System.out.println("Hello " + name);
   }

}
