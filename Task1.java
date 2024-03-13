package Task;


public class Task1 {
    public static void main(String[] args) {


        Manali obj=new Manali();
        System.out.println();
        obj.location("Himachal Pradesh");
        obj.famousFor("cool climate");
        obj.display();



        Mussoorie obj1=new Mussoorie();
        System.out.println();
        obj1.location("Dehradun.");
        obj1.famousFor("Hill Station");
        obj1.display();



        Gulmarg obj2=new Gulmarg();
        System.out.println();
        obj2.location("Jammu & Kashmir");
        obj2.famousFor(" snowboarding");
        obj2.display();

        
    }
}


public interface Hillstation{
    void  location(String str);
    void famousFor(String str);
}

public class Manali implements Hillstation {
      String location;
      String famousFor;
    @Override public  void location(String newlocation){
        location=newlocation;
      }
      @Override public void famousFor(String newFamousfor){
        famousFor=newFamousfor;
      }

      public void display(){
        System.out.println("Manali:");
        System.out.println("Location of manali: "+location);
        System.out.println("Famous for  manali: "+famousFor);
      }
    
}
public class Mussoorie implements Hillstation {
      String location;
      String famousFor;
    @Override public  void location(String newlocation){
        location=newlocation;
      }
      @Override public void famousFor(String newFamousfor){
        famousFor=newFamousfor;
      }

      public void display(){
        System.out.println("Mussoorie:");
        System.out.println("Location of manali: "+location);
        System.out.println("Famous for  manali: "+famousFor);
      }
    
}



public class Gulmarg implements Hillstation {
      String location;
      String famousFor;
    @Override public  void location(String newlocation){
        location=newlocation;
      }
      @Override public void famousFor(String newFamousfor){
        famousFor=newFamousfor;
      }

      public void display(){
        System.out.println("Gulmarg:");
        System.out.println("Location of manali: "+location);
        System.out.println("Famous for  manali: "+famousFor);
      }
    
}







