/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package EditorTexto;
import java.util.*;
/**
 *
 * @author brunorosa
 * 
 * @version 1.0000001
 */
public class main {
    Login ini ;
    InterfaceServer inter ;
    EditorServer server ;
    public static void main(String [] args){
        
            Login ini = new Login();
            ini.setVisible(true);
            InterfaceServer inter =  new InterfaceServer();
            inter.setVisible(true);
            EditorServer server = new EditorServer(inter);
            server.init();
            
        
            /**
             * Inicia a tela de login, cujo a qual faz o link para as outras telas e funcionalidades.
             * 
             */
            
    
    
    }
} 
