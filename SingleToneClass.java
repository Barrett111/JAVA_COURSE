class SingleTone{
    private static SingleTone variable=null; //Declaring instance variable of class as private

    public String s; 


    private SingleTone(){           //Declaring construtor as private
        s="Hello This is Private Constructor";
    }

    public static SingleTone getInstance(){ //must create this public static method of class getInstance() is used for accesing private construtor 
        if(variable == null)
        variable = new SingleTone();

        return variable;
    }
}


public class SingleToneClass {
    public static void main(String[] args) {

        SingleTone x = SingleTone.getInstance();
       System.out.println(x.hashCode());
       SingleTone y = SingleTone.getInstance();
       System.out.println(y.hashCode());

       System.out.println(x.s);//Accesing constructor
    }
}
