/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brunotome.editortextoserver;
import java.io.*;
import java.net.Socket;

/**
 *
 * @author brunorosa
 */
public class IOStream {
    private InputStream inpStrm;
    private OutputStream outStrm;
    
    IOStream(Socket contSckt){
    try{
    this.inpStrm = contSckt.getInputStream();
    this.outStrm = contSckt.getOutputStream();
    
    
    }catch(IOException e){
        
      
        
    }
    
    
}
