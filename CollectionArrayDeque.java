import java.util.ArrayDeque;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <String> Name = new ArrayDeque<String>();  //FIFO
        Name.add("Gold");
        Name.add("Platinum");
        Name.add("Silver");
        System.out.println(Name);

        Name.remove();
        System.out.println(Name);
    }
}
