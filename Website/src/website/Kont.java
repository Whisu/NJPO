
package website;

/**
 *
 * @author Whisu
 */
class Kont extends AbstractWebsite {
    
    public Kont() {
       this.sWebsite = new String[10]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite = new String[9]; 
       this.sWebsite[0] = "Source:"; 
       this.sWebsite[1] = "<html>";
       this.sWebsite[2] = "<head>";
       this.sWebsite[3] = "<title> Strona do wrzucania obrazkow</title>";
       this.sWebsite[4] = "</head>";
       this.sWebsite[5] = "<body>";
       this.sWebsite[6] = "Janusz Walnik<br>januszwalnik@o2.pl<br>tel. 421432423";
       this.sWebsite[7] = "</body>";
       this.sWebsite[8] = "</html>";
       this.src = "index.html";
       this.type = E_WebSite.KONT_WEBSITE;
        
    }
}
