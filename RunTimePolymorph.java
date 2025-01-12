class parent {

    public void display() {
        System.out.println("This is parent");
    }
}

class child extends parent {

    public void display() {
        System.out.println("This is child");
    }
}

public class RunTimePolymorph {

    public static void main(String[] args) {

        // here the reference is parent and object is made of parent class itself
        parent dis = new parent(); // at the time of object creation, decided which class method to execute
        dis.display(); //So this will call parent class display method

        // here refernece is parent and object is made of child class
        parent show = new child(); // this is dynamic method dispatch && //at the time of object creation, decided
                                   // which class method to execute
        show.display(); //So this will call child class display method

        /*
         * In run-time polymorphism the object decides which class method to execute not
         * reference
         */

    }
}
