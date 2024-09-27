import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    //2. Beispiel
    List<String> stringList = new ArrayList<>();
    public void showWithForEach()
    {
        //forEach mit ausprogrammierter Schleife
        for(int i = 0; i<stringList.size(); i++)
        {
            System.out.println(stringList.get(i));
        }
    }
    public void showWithMethodForEach()
    {
        //forEach Methode vom Interface List
        stringList.forEach(System.out::println);
    }

}
