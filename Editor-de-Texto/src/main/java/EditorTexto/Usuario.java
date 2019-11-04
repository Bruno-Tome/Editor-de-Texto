/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorTexto;

import java.lang.reflect.Field;

/**
 *
 * @author leos_
 */
public class Usuario {
    private String user;
    private String senha;
    
    //public String loginAdm = "adm";
    //public String senhaAdm = "123";
    

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void autentica(String user, String senha){
        
    }
    
    @Override
    public boolean equals(Object obj){ 
        
        if (obj == null) return false;
        if (!(obj instanceof Usuario)) 
            return false; 
        boolean result = false;
        for (Field field : obj.getClass().getFields()) {
        try { 
             
            Object thisFieldValue = field.get(this);
             if (thisFieldValue == null) 
                result = field.get(obj) == null;
            else { 
            field.setAccessible(true);
            } 
            result = thisFieldValue.equals(field.get(obj));
            if (!result) 
            break;
     
        } catch (IllegalAccessException ex) { 
        field.setAccessible(true); 
        return result; 
    }
    }
        return false;
    
    
}
}
