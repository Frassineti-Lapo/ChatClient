package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Ascolto extends Thread{

Socket s;

     public Ascolto(Socket s){
        this.s = s;
     }

    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String messaggio;
            while (!isInterrupted() && (messaggio = in.readLine()) != null) {
                // Visualizza il messaggio ricevuto
                System.out.println(messaggio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }//finally {
            // Assicurati di chiudere le risorse quando il thread è interrotto
            //try {
            //    s.close();
            //} catch (IOException e) {
              //  e.printStackTrace();
            //}
    }
}
