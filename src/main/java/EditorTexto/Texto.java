/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorTexto;
import java.util.*;  

/**
 *
 * @author brunorosa
 */
public class Texto {
    ArrayList <String> texto = new <String>ArrayList();
    
    Texto(){
              
    }
    public void adicionachar(int col,int lin, char ch){
        String str;
        String substr1 ,substr2 ;
        str = this.texto.get(lin);
        substr1 = str.substring(0, col-1);
        substr2 = str.substring(col, str.length());
        substr1 += ch;
        substr1.concat(substr2);
        this.texto.add(lin, substr1);
        this.texto.remove(lin+1);
        
    }
    
}
