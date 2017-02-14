
import java.util.ArrayList;

public class App {

    public String ListOfNames ( ) {

        ArrayList <String> list = new ArrayList<String>();

        list.add("Ania");
        list.add("Tomek");
        list.add ("Mariia");

        StringBuilder sb = new StringBuilder();
        for (String name:list) {
            sb.append("Hello " + name + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

App a = new App();
System.out.println(a.ListOfNames());
        }
    }

