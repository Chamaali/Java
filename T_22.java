public class T_22{
    public static void main(String[] args) {


        firstMeth();
        //calling to a static methods.

        T_22 obj_1 = new T_22();
        obj_1.secondMeth();
        //calling to a non-static methods.

    }

    public static void firstMeth(){
        System.out.println("This is first class. ");
    }

    public void secondMeth(){
        System.out.println("This is Second class.");
    }
}