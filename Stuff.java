//Abby Bruskin
//9/10/25
//This code gets the next nothing and puts it back into the url until it reaches the end


package stuff;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Stuff {



    public static String regex(String line, String pattern){
        System.out.println(line);
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(line);
        String m = "";
        String output = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=";
        while(matcher.find()){
            m+=matcher.group(1);
            if(line.contains("Divide")){
            int integerValue = Integer.parseInt(m);
            integerValue/=2;
            output+=integerValue;
        }
        else {
            output+=m;
        }
        }

        
        return output;

    }

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=12345");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = reader.readLine();

        while(true){
                reader = new BufferedReader(new InputStreamReader(url.openStream()));
                line = reader.readLine();
                url = new URL(regex(line, "the next nothing is ([0-9]+)"));

                if(line.contains("peak")){
                    System.out.println("done");
                    break;
                }
        }

      }
       
     }

