class Calculation{
    public int add(int x, int y){
        int c=x+y;
        return c;
    }

    public int add(int x, int y, int z){
        int c=x+y+z;
        return c;
    }


}


public class CompileTimePolymorph {

    public static void main(String[] args) {
        Calculation sum = new Calculation();
        int z=sum.add(10,20);     //defining at compile time which method to call
       int p= sum.add(20,10,20); //defining at compile time which method to call

       System.out.println(z);
       System.out.println(p);
    }
}

