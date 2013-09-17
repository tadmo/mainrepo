/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.dpsa.edis.web.navigation;

/**
 *
 * @author tebogom
 */
import java.io. Serializable ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean. ManagedBean ;
import javax.faces.bean. ManagedProperty ;
import javax.faces.bean. RequestScoped ;
@ManagedBean(name = "navigationController" , eager = true)
@RequestScoped
public class NavigationController implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(NavigationController.class.getName());
    
    
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
    public String moveToPage2() {
        return "page2";
    }
    
    public String moveToPage1() {
        return "page1";
    }

    public String moveToHomePage() {
        return "home";
    }
    
    public String processPage1() {
        return "page";
    }
    
    public String processPage2() {
        return "page";
    }
    
    public String showPage(){
        System.out.println(">>>>  Page ID is: " + pageId);
        log.log(Level.INFO, "Pageid is " + pageId);
        if(pageId == null){
            return "home" ;
        } 
//        if(pageId.equals( "1" )){
//            return "classNav1" ;
//        }else if(pageId.equals( "2" )){
//            return "classNav2" ;
//        }else{
//            return "home" ;
//        }
        
        String retValue;   
        switch (pageId) {
            case "1":
                retValue = "page1";
                break;
            case "2":
                retValue = "page2";
                break;
            default:
                retValue = "home";
                break;    
        } 
        return retValue;
    }
    
}
