enum Dept{
    CS("Rushikesh","1"),
    IT("Vishal","2"),
    CIVIL("Sudip","3"),
    ECE("Prathamesh","4"); //These identifiers are by default final, so by java name conventions it should be declared in capital case always.
                //They are actual value, so not need to initialize.
/*if values are assigned to the identifiers then it is must to create parameterised construtor */
String Name,roll;

private Dept(String Name, String roll){
                    
                    this.Name=Name;
                    this.roll=roll;
                }

                public String getStudName(){
                    return Name;
                }

                public String getRollNo(){
                    return roll;
                }

                
}


public class Enum {

    public static void main(String[] args) {
       
/* 
        d=Dept.CS;

        System.out.println(d.ordinal());//this gives index of identifier in enum
        System.out.println(d.name()); //gives name of enum
        System.out.println(Dept.valueOf("IT"));
        System.out.println(d);

        Dept arr[]=Dept.values(); //this will give all values in enum

        for(Dept x:arr){
            System.out.println(x);
        }
        
*/
Dept d =Dept.CS;
System.out.print(d.getRollNo()+" ");
System.out.println(d.getStudName());

        
        
    }
    
}
