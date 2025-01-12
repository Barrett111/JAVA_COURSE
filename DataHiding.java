class Rectangle{
    

    private int length=10;
    private int breadth=111;

   public int getLength(){ //Get method to read length
        return length;
   }

   public int getBreadth(){ //Get method to read breadth
        return breadth;
   }

   public void setLength(int l){ //set method to set length
    length=l;
   }

   public void setBreadth(int b){   //set method to set breadth
    breadth=b;
   }

    public int area() {
        return length * breadth;
    }
    
 }




class DataHiding {

    public static void main(String args[]){
        System.out.println("Hello java World");

        Rectangle d=new Rectangle();

      d.setBreadth(10);
      d.setLength(20);

       System.out.println(d.area());


    /*public static void main(String args[]) {
        System.out.println("Hello java World");



    }*/
}
}

