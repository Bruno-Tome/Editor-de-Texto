/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorTexto;

import java.lang.reflect.Field;
import java.util.ArrayList;

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
     * ArrayList para guardar os cadastros de usuarios
     */
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    
    /**
     * Definicao dos dois construtores que precisamos, um que recebe parametros para inicializacao, e outro que so cria um objeto
     * @param user
     * @param senha 
     */
    public Usuario(String user, String senha){
        this.setSenha(senha);
        this.setUser(user);
    }
    public Usuario(){
        
    }

    
    
    /**
     * Metodo para criar um novo usuario, um novo objeto do tipo usuario, que eh guardado na ArryList
     * @param user2
     * @param senha2 
     */
    public void creatUser(String user2, String senha2){
        usuarios.add(new Usuario(user2, senha2));
    }
    
    public boolean autentica(String entradaUser, String entradaSenha){
        for(Usuario usuario : usuarios){
            if(entradaUser != usuario.user){
                return false;
            }else if(entradaSenha != usuario.senha){
                return false;
            }else{
            return true;
        }
    }
        
    }
    
    
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
    
    
    /**
     * Override do metodo equals, definindo as igualdades necessarias
     * @param obj 
     * @return 
     */
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
