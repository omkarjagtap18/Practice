import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList <String> Name = new LinkedList<String>();
        Name.add("Egale");
        Name.add("Thunderbird");
        System.out.println(Name);

        Name.addFirst("Peacock");
        System.out.println(Name);

        Name.add(1,"Hen");
        System.out.println(Name);
        
        Name.remove();                //element remove from first
        System.out.println(Name);

        Name.removeLast();            //element remove from last
        System.out.println(Name);

        Name.add("Owl");
        for (String str : Name) {      //foreach loop use for printing elemeny one by one
            System.out.println(str);
        }
        


    }
}
