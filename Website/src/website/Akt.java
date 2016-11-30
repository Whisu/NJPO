
package website;

import java.io.IOException;

/**
 *
 * @author Whisu
 */
public class Akt extends AbstractWebsite  {
    
    public Akt() {
      this.sWebsite = new String[12]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite[1] = "<html>";
       this.sWebsite[2] = "<head>";
       this.sWebsite[3] = "<title> Strona do wrzucania obrazkow</title>";
       this.sWebsite[4] = "</head>";
       this.sWebsite[5] = "<body>";
       this.sWebsite[6] = "Janusz Walnik<br>januszwalnik@o2.pl<br>tel. 421432423<br>";
       this.sWebsite[7] = "========Wiadomosci========<br>";
       this.sWebsite[8] = "Jakies wiadomosci ...<br>";
       this.sWebsite[9] = "Jakies wiadomosci ...<br>";
       this.sWebsite[10] = "</body>";
       this.sWebsite[11] = "</html>";
       this.src = "index.html";
       this.type = E_WebSite.AKT_WEBSITE;
        
    }
}
