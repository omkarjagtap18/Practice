import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        ArrayList <String> Name = new ArrayList <String>();
        Name.add("Virat");
        Name.add("Rohit");
        Name.add("Shubman");
        System.out.println(Name);

        Name.remove(1);
        System.out.println(Name);

        Name.add(0,"Omkar");
        System.out.println(Name);

        Name.set(2,"Surya");
        System.out.println(Name);

        System.out.println(Name.get(0));

        Name.clear();
        System.out.println(Name);
    }
}
