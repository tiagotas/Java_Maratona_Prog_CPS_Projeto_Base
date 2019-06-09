/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_maratona_prog_cps_projeto_base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Tiago Silva
 */
public class Java_Maratona_Prog_CPS_Projeto_Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
                
        String linha = "";
        
        BufferedReader entrada;
        
        try {
            
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            ArrayList<String> resposta = new ArrayList<String>();
            
            while( (linha = entrada.readLine()) != null ) {
                
                
                
                
                
            }  
        } catch(Exception e) {
            System.out.println("Erro na leitura \n" + e.getMessage());
        }   
    }
}
