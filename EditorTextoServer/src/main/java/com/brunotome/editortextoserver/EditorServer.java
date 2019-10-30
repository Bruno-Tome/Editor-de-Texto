/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brunotome.editortextoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author brunorosa
 */
public class EditorServer {
    
    EditorServer(){
    this.connectionSocket = connectToServer();
    this.iostrm = new IOStream(connectionSocket); 
    
    
    }
    private Socket connectionSocket;
    private IOStream iostrm;   
    
    
    public static Socket connectToServer(){
    
      try(ServerSocket serverSocket = new ServerSocket(9991)) {
        Socket connectionSocket = serverSocket.accept();
        return connectionSocket;
      }catch(IOException e){
          System.out.println(e);
          return (Socket)null;
      }}
    
}
