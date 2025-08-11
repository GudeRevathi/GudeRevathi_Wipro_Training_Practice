package Collections;
import java.util.*;
public class ListInteeface {
    public static void main(String[] args){
        List<String>names=new ArrayList<>();
        names.add("Revathi");
        names.add("Gude");
        names.set(1,"Reva");
        System.out.println(names);
        names.add("Lilly");
        names.add("Lally");
        names.add("Mark");
        names.add("Subman");
        names.remove("Reva");
        Collections.sort(names);
        System.out.println("After the Sorting: " + names);
        System.out.println(names.contains("Revathi"));
        System.out.println(names.get(2));
        System.out.println(names.subList(1,3));
        System.out.println(names);
        System.out.println(names.indexOf("Revathi"));
        System.out.println(names.size());
        names.clear();
        System.out.println(names.isEmpty());


    }
}
