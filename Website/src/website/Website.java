
package website;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 *
 * @author Whisu
 */
public class Website {

   
    public static void main(String[] args) throws FileNotFoundException {
        ZapisDoPliku zapis = new ZapisDoPliku();
        WebsiteCreator websiteCreator = new WebsiteCreator();
        Random r = new Random();
        int losowy = r.nextInt(4)+1;
        switch(losowy){
            case 1:
                I_AbstractWebsite website =  websiteCreator.create(E_WebSite.GRAF_WEBSITE);
        System.out.println(website);
        website.getSource();
        zapis.zapisDoPliku(website.getSourcee(), website.getSRC());
        
                break;
            case 2:
                I_AbstractWebsite website2 =  websiteCreator.create(E_WebSite.INF_WEBSITE);
        System.out.println(website2);
        website2.getSource();
        zapis.zapisDoPliku(website2.getSourcee(), website2.getSRC());
        
                break;
            case 3:
                I_AbstractWebsite website3 =  websiteCreator.create(E_WebSite.AKT_WEBSITE);
        System.out.println(website3);
        website3.getSource();
        zapis.zapisDoPliku(website3.getSourcee(), website3.getSRC());
        
                break;
            case 4:
                I_AbstractWebsite website4 =  websiteCreator.create(E_WebSite.KONT_WEBSITE);
        System.out.println(website4);
        website4.getSource();
        zapis.zapisDoPliku(website4.getSourcee(), website4.getSRC());
        
                break;
        }
               
              
    }

    
    
}