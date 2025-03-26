public class MethodCallStackDemo {

public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA(0);  // 0 para ex Xxx 1 para ex Yyy
        methodA(1);
        methodA(2);
        System.out.println("Exit main()");
    }
    public static void methodA(int msg) {
        System.out.println("Enter methodA()");
        methodB(msg);
        System.out.println("Exit methodA()");
    }
    public static void methodB(int msg) {
        System.out.println("Enter methodB()");
        methodC(msg);
        System.out.println("Exit methodB()");
    }
    public static void methodC(int msg) {
        System.out.println("Enter methodC()");
        try {
            methodD(msg);
        }
        catch (XxxException ex){
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Finally methodC()");
        }
        System.out.println("Exit methodC()");
    }
    public static void methodD(int msg) throws XxxException, YyyException  {
         System.out.println("Enter methodD()");
         if (msg == 1){
            throw new YyyException("Except y");
            }
        if (msg == 0){
            throw new XxxException("Except x");
        }
         System.out.println("Exit methodD()");
    }

}
