/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metics.assignment.cocomo.experiment;

import java.io.File;

/**
 *
 * @author sazx
 */
public class NewClass {
        
    public static void main(String[] args){
        
        File ff = new File( System.getProperty("user.home")+"/Downloads" );
             
            showAllFile(ff);
             

    }
    
    
    public static void showAllFile(File f){
        
        File directoryChildren[] = f.listFiles();
            
        for( int i=0; i<directoryChildren.length ;i++ ){
            if( directoryChildren[i].isDirectory() ){
                showAllFile( directoryChildren[i] );
            }
            else{
                System.out.println( directoryChildren[i].getName() );
            }
        }
        
    }
    
    
    
}
