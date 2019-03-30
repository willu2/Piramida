import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Create piramid from string symbols*/
public class Piramid {

    public static void main(String[] args)
    {
        String name = null;
        String piramid = "";

        System.out.println("Input text:");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   //get strig data
        try {
            name = in.readLine();
            name = name.replaceAll("\\s+","");   // replace all spaces
            for(int i = 0; i <= name.length()-1; i++){
                piramid += name.charAt(i);    //builds piramide
                System.out.println(piramid);
                 }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
