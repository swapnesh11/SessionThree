package sessionThreeAssignments;

public class B {
    String instance = "String instance variable";
    static String staticInstance = "Static instance variable";
    public static void main(String[] args) {
        //System.out.println(instance);
        B obj = new B();
        staticMethod(obj);
        obj.nonStatMethod();
        System.out.println(obj instanceof B);
        System.out.println(obj.instance);
        System.out.println(staticInstance);
    }
    public void nonStatMethod(){
        System.out.println(instance);
    }
    public static void staticMethod(B obj){
        System.out.println(obj.instance);
    }
}

