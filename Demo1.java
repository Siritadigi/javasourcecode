public class Demo1
{
    public static void main(String args[])
    {
        int x=9;
        int y=8;
        int a=7;
        int b=5;
        boolean result1= x < y || a > b;
        boolean result2= x > y && a < b;
        System.out.println(result1);
        System.out.println(result2);
    }
}