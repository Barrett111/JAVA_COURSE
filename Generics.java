public class Generics <T> {


   // T data[] =(T[]) new Object[3];

    private T obj;

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj;
    }

    public static void main(String[] args) {
       
       
        
        /*
        obj=new String("Hello"); 
        obj= new Integer(10);
        String str=(String)obj;
        */
    //   Object obj[]=new Object[3]; //this array should be capable of storing all types of data 

      // obj[0]="hii";
      // obj[1]="bye";
      // obj[2]=new Integer(10); //storing integer 

      // String str; //assuming the object array holds only string type values
//so taking reference from string class


     //  for(int i=0;i<3;i++){  //accesing the object array
       // str=(String)obj[i];  //typecasting the all values in object array as string
      //  System.out.println(str);
     //  }

       //This will give Runtime Error, at compile time it will not give error, which is not optimal code

/* 
       Generics g = new Generics();

       g.data[0]="hi";
       g.data[1]=10;
       g.data[2]="Number";

       System.out.println(g.data[0]);
       System.out.println(g.data[1]);
       System.out.println(g.data[2]);

        */


      Generics<String> gi =new Generics<>();

       

       gi.setData(new String("10"));
      gi.setData("Hello");
      gi.setData("Nice");

      System.out.println(gi.getData());

       


    }
}
