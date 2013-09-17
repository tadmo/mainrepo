/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.dpsa.edis.web.bean;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tebogom
 */
public class MessageBBean {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MessageBBean.class.getName());
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public MessageBBean() {
        message = "Hello JSF from " + this.getClass().getSimpleName();
        log.log(Level.INFO, "Started eager");
    }
    
    
}
