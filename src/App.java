import java.io.File;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        
        Scanner sc = new Scanner(new File("2024 QS World University Rankings 1.1 (For qs.com).csv"));
        sc.useDelimiter(",|\\R");
       while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
    }
    
}
