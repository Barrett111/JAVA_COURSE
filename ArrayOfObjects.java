import java.util.Arrays;
class Student{
    int rollNo;
    String name;
    String dept;
    String subjects [];

    public Student(int rollNo,String name,String [] subjects){
        this.rollNo=rollNo;
        this.name=name;
        this.subjects=subjects;
    }

    public String toString(){
        return "\nRollNo: "+rollNo+"\nName: "+name+"\nSubject: "+Arrays.toString(subjects);
    }

}

class Subject{
    String SubID;
    String name;
    int maxMarks;
    int marksObtain;

    public Subject(String SubID,String name,int maxMarks){
        this.SubID=SubID;
        this.name=name;
        this.maxMarks=maxMarks;  
    }
/* 
    public String getSubID() {
        return SubID;
    }

    public String getname(){
        return name;
    }

    public int getmaxMarks(){
        return maxMarks;
    }

    public int getmarksObtain(){
        return marksObtain;
    }

    public void setmaxMarks(int Mmarks){
        maxMarks=Mmarks;
    }

    public void setmarksObatain(int marksObt){
        marksObtain=marksObt;
    }

    public boolean isQualified(int m){
            return m>=maxMarks/10*4;     
    }*/

    public String toString(){
        return "\nSubject ID: "+SubID+"\nname: "+name+"\nMarksObtained: "+marksObtain;
    }

}
public class ArrayOfObjects {
    public static void main(String args[]){
       /*  Subject subs[]=new Subject[3];    //Array of Object 

        subs[0]=new Subject("Sub1","DSA",150);
        subs[1]=new Subject("Sub2","OOP",150);
        subs[2]=new Subject("Sub3","DAA",130);

        //Display

       for(Subject s :subs){
        System.out.println(s);
       }
       */
        String sub[]={"Maths","DSA","OOP"};
       Student data[]=new Student[3];

       data[0]=new Student(01,"Rushikesh", sub);
       data[1]=new Student(02,"Radha", sub);
       data[2]=new Student(03,"Rajesh", sub);

       for(Student s : data){
        System.out.println(s);
       }

    }
}
