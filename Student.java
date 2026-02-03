class Student
{
     String StudentID;
     String StudentName;
     int Mark1;
     int Mark2;
     int Mark3;
  public void show()
     {
        System.out.println("StudentID is: " + StudentID); 
        System.out.println("StudentName is:" + StudentName);
        System.out.println("Mark1 is:" + Mark1);
         System.out.println("Mark2 is:" + Mark2); 
         System.out.println("Mark3 is:"+ Mark3);
     }
     public void display()
     {
        int Total = Mark1+Mark2+Mark3;
        int avg = (Total/3);
        System.out.println("Average is:"+ avg);
        if(avg>=40)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
     }

       public class Demo
     {
        public static void main(String [] args)
        {
            Student obj = new Student();
            obj.StudentID = "23S11A05ET";
            obj.StudentName="Sreevidhya Tadigi";
            obj.Mark1=55;
            obj.Mark2=99;
            obj.Mark3=89;
            obj.show();
            obj.display();
        }  
    }
}
