public class Employee {
    public static void main(String args[]){
//        System.out.println("hello world");
//        char ch = 97;
//        System.out.println(ch);//prints a
//        int integerValue = 129;//-127 to 128
//        byte byteValue = (byte) integerValue;
//        System.out.println(byteValue);
//        float floatValue = 0.7f;
//        System.out.println((double)floatValue);//0.699999988079071
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);//checks the memory addresss
        System.out.println(s1.equals(s2));
        String s3 = new String("hello");
        System.out.println(s1 == s3);
        System.out.println(s3.equals(s2));
    }
}
