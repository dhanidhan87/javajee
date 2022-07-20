public class Hello {

    int a;
    static int b;

    Hello() {

    }

    Hello(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Hello(){
        System.out.println("M");
    }

    {
        System.out.println("IB");
    }

    static
    {
        System.out.println("SIB");
    }

    public static void main (String[] args){

        Hello h1 = new Hello();
        //System.out.println("h1.a=" + h1.a);

        //System.out.println("h1.b=" + h1.b);
        //System.out.println("b=" + b);
        //System.out.println("Hello.b=" + Hello.b);

        Hello h2 = new Hello(a:1,b:2);

        {
            int a = 5;
        }
        //int a = 5;
        //System.out.println(a);

    }
}
