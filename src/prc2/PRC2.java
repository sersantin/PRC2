/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc2;

import java.net.*;
import java.io.*;

/**
 *
 * @author Sergio
 */
public class PRC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dataset url = new Dataset ("oxford");
        
        url.print_tmax();
        
        /*
        for(int i = 0; i < url.tmax.size();i++)
        {
            System.out.println(url.tmax.get(i));
            System.out.println("----");
        }
        */
        
        
        
    }
}
