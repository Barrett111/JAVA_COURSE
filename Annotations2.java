@interface myAnno{  //to define userdefined annotation
String name();
String Class();
int roll();
String Dept() default "Information Technology"; //default values can be changed or not mentioned at time of annotation declaration

}



@myAnno(name="Ruhsi",Class="TE",roll=10)
public class Annotations2 {
    
    @myAnno(name="Radhika",Class="BE",roll=4,Dept="CS")
    int c=10;
}
