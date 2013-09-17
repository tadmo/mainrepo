/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.dpsa.edis.web.bean;

/**
 *
 * @author tebogom
 */
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import java.util.logging.Logger;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "greetings", eager = true)
@RequestScoped
public class GreetingBean {
    private static final long serialVersionUID = 1L;

    private static final Logger log = Logger.getLogger(GreetingBean.class.getName());
    
    @ManagedProperty(value = "#{message}")
    private MessageBBean messageBean;
    
    private String message ;
    
    public GreetingBean() {
        log.log(Level.INFO, "Started eager = {0}", GreetingBean.class.getAnnotation(ManagedBean.class).toString());
        //System.out.println("Greetings loaded....");
    }
        
    public String getMessage() {
    if(messageBean != null){
        message = messageBean.getMessage();
    }
        return message;
    }
    
    public void setMessageBean(MessageBBean message) {
        this.messageBean = message;
    }
    
    
}
