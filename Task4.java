import java.util.ArrayList;

public class Task4 {
public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    int result=0;
    String reversed="";
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");
    System.out.println(list);
    result=list.size();
    for(int i=result-1;i>=0;i--){
reversed=reversed+list.get(i)+" ";
    }
    System.out.println(reversed);






}




    
}



