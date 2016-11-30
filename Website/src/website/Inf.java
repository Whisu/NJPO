
package website;
import de.svenjacobs.loremipsum.LoremIpsum;
import java.util.Random;
/**
 *
 * @author Whisu
 */
class Inf extends AbstractWebsite {
      
    
    public Inf() {
       LoremIpsum tekst = new LoremIpsum();
       Random r = new Random();
       int losowo = r.nextInt(10000);
       this.sWebsite = new String[10]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite = new String[9]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite[1] = "<html>";
       this.sWebsite[2] = "<head>";
       this.sWebsite[3] = "<title> Strona do wrzucania obrazkow</title>";
       this.sWebsite[4] = "</head>";
       this.sWebsite[5] = "<body>";
       this.sWebsite[6] = "<b>"+tekst.getWords( losowo ) +"<b>";
       this.sWebsite[7] = "</body>";
       this.sWebsite[8] = "</html>";
       this.src = "index.html";
       this.type = E_WebSite.INF_WEBSITE;
        
    }
}
