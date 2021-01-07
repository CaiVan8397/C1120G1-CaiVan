package access_modifier.thuc_hanh.b;

//public class B {
    // default
//    public static void main(String args[]){
//
//        A obj = new A();//Compile Time Error
//
//        obj.msg();//Compile Time Error
//
//    }

    //Protected
//    public void msg(){System.out.println("Hello");}

//}

import access_modifier.thuc_hanh.a.A;

public class B{

    public static void main(String args[]){

        A obj = new A();

        obj.msg();

    }

}
