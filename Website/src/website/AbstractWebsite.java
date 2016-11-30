package website;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Whisu
 */
class AbstractWebsite implements I_AbstractWebsite {

    protected String[] sWebsite;
    protected String src;
    protected E_WebSite type;

    @Override
    public E_WebSite getType() {
        return type;
    }

    @Override
    public void getSource() {
        for (int i = 0; i != sWebsite.length; i++) {
            System.out.println(sWebsite[i]);
        }

    }

    @Override
    public String getSRC() {
        return src;
    }

    @Override
    public String toString() {
        return "Type of website: " + type + "\nWebsite saved in " + "src: " + src;
    }
    
    @Override
    public String[] getSourcee(){
        return sWebsite;
    }

}
