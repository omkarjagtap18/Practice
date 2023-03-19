import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack <String> Name = new Stack<>();   //LIFO
        Name.push("Tiger");               //push = add
        Name.push("Lion");
        Name.push("Horse");
        System.out.println(Name);

        Name.pop();
        System.out.println(Name);             //pop = remove
    }
}
