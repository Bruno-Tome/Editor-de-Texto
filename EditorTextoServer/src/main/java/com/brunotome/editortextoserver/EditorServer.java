/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brunotome.editortextoserver;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;


/**
 *
 * @author brunorosa
 */
public class EditorServer extends Thread{
    
    
    EditorServer(InterfaceServer moth){
        this.inter = moth;
    
    }
    public void init(){
        try{
    this.connectionSocket = connectToServer();
     
    this.inputToServer = connectionSocket.getInputStream();
    this.outputFromServer = connectionSocket.getOutputStream();
        IOStream();
    }catch(IOException e){
        e.printStackTrace();
    
    }
    
    
    
    }
    private InterfaceServer inter;
    OutputStream outputFromServer;
    InputStream inputToServer = null;
    private Socket connectionSocket;

    
    
    public static Socket connectToServer(){
    
      try(ServerSocket serverSocket = new ServerSocket(9991)) {
        Socket connectionSocket = serverSocket.accept();
        return connectionSocket;
      }catch(IOException e){
          System.out.println(e);
          return (Socket)null;
      }}
    
       public void IOStream() {
           
        try{ 
            
            Scanner scanner = new Scanner(inputToServer, "UTF-8");
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"), true);

            serverPrintOut.println("Ola! Escreva \"save\" para salvar e \"sair\" para sair;");

            //Have the server take input from the client and echo it back
            //This should be placed in a loop that listens for a terminator text e.g. bye
            boolean isEditable = true;
            boolean done = false;
                String line;
                
                Runnable runnable = () -> {
                          boolean bool = salvar();
                          if(bool){serverPrintOut.println("Arquivo Salvo");
                         }else{
                        serverPrintOut.println("Um erro ocorreu, tente novamente");
                    }
                     };
            while(!done && scanner.hasNextLine() ) {
                 line = scanner.nextLine();
                
                if(line.equalsIgnoreCase("save")){
                    if(isEditable == true){ 
                    Executors.newCachedThreadPool().execute(runnable);
                }
                }
                if(line.equalsIgnoreCase("sair")){serverPrintOut.println("Até mais!");done = true; isEditable=false;}
                
                serverPrintOut.println("Echo from bruno's Server: " + line);
                this.inter.atualizaTxtf(line);
                 
                
               
            }
            
            
        }catch(IOException e){}
       }
            
            
         public boolean salvar(){
         try{
         
         String str = this.inter.txtf.getText(); //string que contem o arquivo
       String fname = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja salvar?");
       File f = new File(fname); // Specify the filename
       if(f.exists()){
             Component rootPane = this.inter.getRootPane();
           int input = JOptionPane.showConfirmDialog(rootPane, "Arquivo já existe. \n Deseja sobrescrever ?", "arquivo já existe", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
           if(input == 0){}else{throw new IOException("Usuario não sobrescreveu arquivo");};
       }else{};
       FileWriter myw = new FileWriter(f.getName());
       myw.write(str);
       myw.close();
       System.out.println("Arquivo Salvo.");
         return true;   
      }catch (IOException e) {
      System.out.println("An error occurred.");
      System.out.print(e);
      e.printStackTrace();
      return false;
      
      }
         
         
         }
            
            
       
       
       
       
       
    
    
}
