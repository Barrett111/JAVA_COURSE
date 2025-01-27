public class stringBufferBuilder {
    public static void main(String[] args) {
        String s1=new String("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");

s1.concat("World"); //it will just concat and create a new object, but s1 will return the original string.

//s2.append("world");
s3.append("world");

       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);

       System.out.println(s1.concat("World"));//this will return the total string of new object
    System.out.println(s2.capacity());
    }
}
