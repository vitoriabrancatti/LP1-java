public class At02 {
    public static void main(String[] args){

        /*EXERCICIO A*/
        System.out.println("Exercicio A");
        exA();

        /*EXERCICIO B*/
        System.out.println("\n\nExercio B");
        exB();

        /*EXERCICIO C*/
        System.out.println("\n\nEXERCICIO C");
        exC();

        /*EXERCICIO D*/
        System.out.println("\n\nEXERCICIO D");
        exD();

        /*EXERCICIO E*/
        System.out.println("\n\nEXERCICIO E");
        exE();

        /*EXERCICIO F*/
        System.out.println("\n\nEXERCICIO F");
        exF();

    }
    public static void exA(){
        int a = 10;
        int b= 20;
        System.out.println("B = "+b);
        b = 5;
        System.out.println("A = "+a+"\nB = "+b);
    }
    public static void exB(){
        int a = 30;
        int b = 20;
        int c = a+b;
        System.out.println("C = "+c);
        b = 10;
        System.out.println("B = "+b+"\nC = "+c);
        c = a+b;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exC(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exD(){
        int a = 10;
        int b = a+1;
        a = b+1;
        b = a+1;
        System.out.println("A = "+a);
        a = b+1;
        System.out.println("A = "+a+"\nB = "+b);
    }
    public static void exE(){
        int a = 10;
        int b = 5;
        int c = a+b;
        b = 20;
        a = 10;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exF(){
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println("Z = "+z);
        x = 5;
        y = x+z;
        System.out.println("X = "+x+"\nY = "+y+"\nZ = "+z);
    }
}
