
class computer
{
    public void Playmusic()
 {
    System.out.println("music is playing");
 }

 public  String getMeApen(int cost)
 {
   if(cost >=10)
           return "pen";
    else
      return "no pen";
 }
}
  
public class object
{
   public static void main(String args[])
 {
    computer obj = new computer();
    obj.Playmusic();
    String str = obj.getMeApen(2); 
    System.out.println(str);
 

  }
    
}
