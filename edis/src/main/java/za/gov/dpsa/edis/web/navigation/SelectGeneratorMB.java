/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.dpsa.edis.web.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author tebogom
 */
@ManagedBean(name="selectGenerator")
@SessionScoped
public class SelectGeneratorMB {
    
    public String defaultC = "b";

    public String getDefaultC() {
        return defaultC;
    }


    private static Map<String,Object> colorsMap;
	static{
		colorsMap = new LinkedHashMap<>();
                colorsMap.put("Red", "r"); //label, value
		colorsMap.put("Green", "g");
		colorsMap.put("Blue", "b");
	}
        
     
    public Map getColorMap() {
        return colorsMap;
    }
    //////
    public String defaultCoffee = "";
    private static Map<String,Object> coffeeMap;
	static{
		coffeeMap = new LinkedHashMap<>();
                coffeeMap.put("Latte", "l"); //label, value
		coffeeMap.put("Mocca", "m");
		coffeeMap.put("Espresso", "e");
	}

    public Map<String, Object> getCoffeeMap() {
        return coffeeMap;
    }

    public String getDefaultCoffee() {
        return defaultCoffee;
    }
    
}
