/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.managedbeans;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import javax.ejb.Stateful;
import javax.faces.context.FacesContext;
import javax.inject.Named;


/**
 *
 * @author thoma
 */
@Stateful
@Named(value = "localeBean")
public class LocaleBean implements Serializable{

    private FacesContext ctx = FacesContext.getCurrentInstance();
    private Locale locale = ctx.getViewRoot().getLocale();

    public Locale getLocale() {
       
        return locale;
    }

    public void setLocale(Locale locale) {
       
        this.locale = locale;
    }

    public String getLanguage() {
        Locale newlocale = null;
       
        String lang = locale.getLanguage();
        Map map = ctx.getExternalContext().getSessionMap();
        if (map.containsKey("locale")) {
            newlocale = (Locale) map.get("locale");
        }
        if (!(newlocale == null)) {
            String newlang = newlocale.getLanguage();
            if (!newlang.equals(lang)) {
                return newlang;
            }
        }
        return lang;
    }

    public void setLanguage(String language) {      
        locale = new Locale(language);
        ctx.getViewRoot().setLocale(locale);
    }


    
    

   }
