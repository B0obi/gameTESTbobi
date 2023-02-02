package proba;

public class ProbaClass {

    public static void  main(String[] args) {

        System.out.println("Hello world");
        seyHello( "Ivana");

<<<<<<< HEAD
        System.out.println("Bobi");
        System.out.println("proba2");
        System.out.println("proba3");



=======
>>>>>>> parent of 164253b (promena 2/2/2023 update ProbaClass)
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
