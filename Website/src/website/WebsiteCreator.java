package website;

/**
 *
 * @author Whisu
 */
class WebsiteCreator implements I_WebsiteCreator {



        
        
 @Override
 public I_AbstractWebsite create(E_WebSite websitetype) {
     I_AbstractWebsite web ;
     switch(websitetype){
         case GRAF_WEBSITE:
             Graf grafweb = new Graf();
             web = grafweb;
             
            break;
         case INF_WEBSITE:
             Inf infweb = new Inf();
             web = infweb;
             break;
         case KONT_WEBSITE:
             Kont kontweb = new Kont();
             web = kontweb;
             break;
         case AKT_WEBSITE:
             Akt aktweb = new Akt();
             web = aktweb;
             break;
         default:
                 web = null;
     }
            return web;
        }

    }

