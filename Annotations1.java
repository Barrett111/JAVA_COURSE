class annotation{
    public void display(){
        System.out.println("This is display from annot");
    }

    @Deprecated
    public void deprecate(){
        System.out.println("This is depricated method, it should not be used");
    }
}

class annot extends annotation{

    @Override
    public void display(){
        System.out.println("This is display from child");
    }


}

@FunctionalInterface
interface dept{

    abstract void write();
   // abstract void read(); gives error as soon as more than one method is created

}

class My<T>{
    @SafeVarargs //this avoids checked and uncheck warnings
    private void show(T...arg){ //the generic method takes variable args, which are unsafe
        for(T x:arg){
            System.out.println(x);
        }
    }
}



public class Annotations1 {
    @SuppressWarnings("deprecation") //this will stop the warning related to deprecation
public static void main(String[] args) {
    
    annotation an = new annotation();
    annot a = new annot();
    //a.display();
   
    an.deprecate(); 
    //this calls the method with warning
}
}
