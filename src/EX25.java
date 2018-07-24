import java.util.ArrayList;

public class EX25
{

    public static void main(String[] args)
    {
        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("Bob");
        squadList.add("John");
        squadList.add("Kenn");
        squadList.add("Kevin");
        squadList.remove(2);
        System.out.println(squadList);
        System.out.println(squadList.size());
        if (squadList.contains("Kevin")) {
            System.out.println("Kevin is in the squad.");
        } else {
            System.out.println("Kevin is not in the squad. ");
        }
    }
}
