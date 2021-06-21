package metics.assignment.cocomo;


import java.io.File;
import java.util.ArrayList;

class OpenedDirectory{

    private ArrayList<File> fileList;

    
    public OpenedDirectory(File directory){
        
        fileList = new ArrayList<>();
        fetchFiles(directory);
        
    }
    
    
    private  void fetchFiles(File f){
       
        File directoryChildren[] = f.listFiles();
        System.out.println("files size : "+directoryChildren.length);

        for( int i=0; i<directoryChildren.length ;i++ ){
            if( directoryChildren[i].isDirectory() ){
                fetchFiles( directoryChildren[i] );
            }
            else{
               fileList.add(directoryChildren[i]);
            }
        }
        

    }
    
    
    public ArrayList<File> getFiles(String extension){
            
        ArrayList<File> matchedFiles = new ArrayList<>();
                
            for(int i=0;  i < fileList.size() ; i++ ){
                
                if( fileList.get(i).getName().endsWith(extension) ){
                    matchedFiles.add(fileList.get(i));
                }
                
            }
        return matchedFiles;
    } 
}
