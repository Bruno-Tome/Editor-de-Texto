/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brunotome.editortextoserver;

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
import javax.swing.JOptionPane;

/**
 *
 * @author brunorosa
 */
public class EditorServer {
    
    
    EditorServer(InterfaceServerProto moth){
        this.inter = moth;
    
    }
    public void init(){
        try{
    this.connectionSocket = connectToServer();
    this.iostrm = new IOStream(connectionSocket); 
    this.inputToServer = connectionSocket.getInputStream();
    this.outputFromServer = connectionSocket.getOutputStream();
    Salvar();
    
    }catch(IOException e){
        e.printStackTrace();
    
    }
    
    
    
    }
    private InterfaceServerProto inter;
    OutputStream outputFromServer;
    InputStream inputToServer = null;
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
       public void Salvar(){
           
        try{ 
            
            Scanner scanner = new Scanner(inputToServer, "UTF-8");
            PrintWriter serverPrintOut = new PrintWriter(new OutputStreamWriter(outputFromServer, "UTF-8"), true);

            serverPrintOut.println("Hello World! Enter Peace to exit.");

            //Have the server take input from the client and echo it back
            //This should be placed in a loop that listens for a terminator text e.g. bye
            boolean done = false;

            while(!done && scanner.hasNextLine()) {
                String line = scanner.nextLine();
                this.inter.atualizaTxtf(line);
                serverPrintOut.println("Echo from bruno's Server: " + line);

                if(line.toLowerCase().trim().equals("peace")) {
                    done = true;
                }
            }
            
            
            
            
            /*
      //String str = txtPainel.getText(); //string que contem o arquivo
       String fname = JOptionPane.showInputDialog("Qual o nome do arquivo que você deseja salvar?");
       File f = new File(fname); // Specify the filename
       if(f.exists()){
           int input = JOptionPane.showConfirmDialog(rootPane, "Arquivo já existe. \n Deseja sobrescrever ?", "arquivo já existe", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
           if(input == 0){}else{throw new IOException("Usuario não sobrescreveu arquivo");};
       }else{};
       FileWriter myw = new FileWriter(f.getName());
       myw.write(str);
       myw.close();
       System.out.println("Arquivo Salvo.");
            */
      }
       catch (IOException e) {
      System.out.println("An error occurred.");
      System.out.print(e);
      e.printStackTrace();}
       
       
       
       }
    
    
}
