
package website;

import java.util.Random;

/**
 *
 * @author Whisu
 */
public class Graf extends AbstractWebsite{


    public Graf() {
       Random r = new Random();
       int liczba = r.nextInt(3)+1;
       this.sWebsite = new String[9]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite[1] = "<html>";
       this.sWebsite[2] = "<head>";
       this.sWebsite[3] = "<title> Strona do wrzucania obrazkow</title>";
       this.sWebsite[4] = "</head>";
       this.sWebsite[5] = "<body>";
       this.sWebsite[6] = "<img src="+liczba+".png"+" alt=\"Tu podaj tekst alternatywny\" />";
       this.sWebsite[7] = "</body>";
       this.sWebsite[8] = "</html>";
       this.src = "index.html";
       this.type = E_WebSite.GRAF_WEBSITE;
        
    }
    
}
