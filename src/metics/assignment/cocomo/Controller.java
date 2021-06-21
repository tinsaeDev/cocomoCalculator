/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metics.assignment.cocomo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ListModel;

/**
 *
 * @author sazx
 */
public class Controller {
 
    private int totalLineCount=0;

    public void setTotalLineCount(int totalLineCount) {
        this.totalLineCount = totalLineCount;
    }

    public void setTotalEffort(double totalEffort) {
        this.totalEffort = totalEffort;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public void setTotalDevelopers(double totalDevelopers) {
        this.totalDevelopers = totalDevelopers;
    }

    public void setTotalProductivity(double totalProductivity) {
        this.totalProductivity = totalProductivity;
    }

    public double getTotalEffort() {
        return totalEffort;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public double getTotalDevelopers() {
        return totalDevelopers;
    }

    public double getTotalProductivity() {
        return totalProductivity;
    }

            private double totalEffort;
            private double totalTime;
            private double totalDevelopers;
            private double totalProductivity;
            private String totalProjectType;

    public void setDefinitionPhase(double definitionPhase) {
        this.definitionPhase = definitionPhase;
    }

    public void setBusinessRequirement(double businessRequirement) {
        this.businessRequirement = businessRequirement;
    }

    public void setFunctionalSpecification(double functionalSpecification) {
        this.functionalSpecification = functionalSpecification;
    }

    public void setDeliveryPhase(double deliveryPhase) {
        this.deliveryPhase = deliveryPhase;
    }

    public void setDetailedDesign(double detailedDesign) {
        this.detailedDesign = detailedDesign;
    }

    public void setCodeAndUnitTest(double codeAndUnitTest) {
        this.codeAndUnitTest = codeAndUnitTest;
    }

    public void setSystemTesting(double systemTesting) {
        this.systemTesting = systemTesting;
    }

    public void setUserAcceptanceTesting(double userAcceptanceTesting) {
        this.userAcceptanceTesting = userAcceptanceTesting;
    }

    public double getDefinitionPhase() {
        return definitionPhase;
    }

    public double getBusinessRequirement() {
        return businessRequirement;
    }

    public double getFunctionalSpecification() {
        return functionalSpecification;
    }

    public double getDeliveryPhase() {
        return deliveryPhase;
    }

    public double getDetailedDesign() {
        return detailedDesign;
    }

    public double getCodeAndUnitTest() {
        return codeAndUnitTest;
    }

    public double getSystemTesting() {
        return systemTesting;
    }

    public double getUserAcceptanceTesting() {
        return userAcceptanceTesting;
    }
            
            
            
            private double definitionPhase;
            private double  businessRequirement;
            private double  functionalSpecification;
            private double  deliveryPhase;
            private double detailedDesign;
            private double codeAndUnitTest;
            private double systemTesting;
            private double userAcceptanceTesting;

    public void setTotalProjectType(String totalProjectType) {
        this.totalProjectType = totalProjectType;
    }

    public String getTotalProjectType() {
        return totalProjectType;
    }
    
    public int getTotalLineCount() {
        return totalLineCount;
    }
    private final OpenedDirectory selectedDirectory;

    private String seledctedDirectoryPath;

    public String getSeledctedDirectoryPath() {
        return seledctedDirectoryPath;
    }
    public OpenedDirectory getSelectedDirectory() {
        return selectedDirectory;
    }
    private final ArrayList<File> machedFiles; 
    
    private static Controller instance;
    
    private ArrayList<SourceFile> sourceFiles;
    
    // get from the directory
    // add the files to list
    // calculate comment lines
    // calculate total lines
    // calculate all cocomo
    
    
    public static Controller getController(){
     
      return instance;
                
    }
    
    public static Controller getController(File selectedFolder){
      
           instance = new Controller(selectedFolder);          
            
            return instance;
        
        
    } 
    
    private Controller(File selectedFolder){          
            this.selectedDirectory = new OpenedDirectory(selectedFolder);
            
           seledctedDirectoryPath = selectedFolder.getAbsolutePath();
            machedFiles = selectedDirectory.getFiles("java");
            sourceFiles = new ArrayList<>();
            
            
                                // for each matched files, open the files, count the lines

                              for(int i=0;i<machedFiles.size();i++){

                                    try {
                                            
                                FileReader fr = new FileReader( machedFiles.get(i).getAbsolutePath() );
                                BufferedReader br = new BufferedReader(fr);

                                String str = "";
                                String tmp;
                                            try {
                                                while( (tmp = br.readLine() )!=null ){
                                                    str +=tmp+"\n";
                                                }           } catch (IOException ex) {
                                                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                                            }


                                    str = str.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","\r");
                                    str = str.replaceAll("(?m)^[ \t]*\r?\n", "");

                                        int lineCount=0;
                                        for(int j=0;j<str.length();j++){
                                            if ( str.charAt(j)=='\n'  ) {
                                                lineCount++;
                                            }
                                        }
                                        
                                        totalLineCount+=lineCount;

                                 SourceFile sf = new SourceFile();
                                            sf.setCode(str);
                                            sf.setName( machedFiles.get(i).getName() );
                                            sf.setPath( machedFiles.get(i).getAbsolutePath() );

                                            int lineNumber = lineCount;

                                            sf.setTotalSize(lineNumber);

                                                double ab = 0 ;
                                                double bb = 0;
                                                double cb = 0 ;
                                                double db = 0;

                                            if( lineNumber<50000 ){
                                                 ab = 2.4 ;
                                                 bb = 1.05;
                                                 cb = 2.5 ;
                                                 db = 0.38;
                                                 sf.setProjectType("Organic");
                                            }
                                            else if(lineNumber<300000  ){
                                                 ab = 3.0 ;
                                                 bb = 1.12;
                                                 cb = 2.5 ;
                                                 db = 0.35;
                                                 sf.setProjectType("Organic");

                                            }
                                            else {
                                                 ab = 3.6 ;
                                                 bb = 1.20 ;
                                                 cb = 2.5 ;
                                                 db = 0.32;
                                                 sf.setProjectType("Organic");
                                            }

                                            double killoLine = (double)lineNumber/1000.00;
                                            double effort = Math.pow( ab *killoLine , bb ) ;
                                            double time = Math.pow( cb *(effort) , db);
                                            double numberOfDevelopers = effort/time;
                                            double productivity = killoLine/effort;

                                            sf.setEffortNeeded( effort );
                                            sf.setTimeNeeded(time);
                                            sf.setNumberOfDeveloperNeeded(numberOfDevelopers);
                                            sf.setProductivity(productivity);
                                                    
                                            sourceFiles.add(sf);



                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                    
                }
            
     
    }
  
    
    public ListModel getListModel(){
       
       ListModel listModel = new AbstractListModel() {
                                            
                       @Override
                        public int getSize() {
                            return machedFiles.size();
                        }

                        @Override
                        public Object getElementAt(int i) {
                               return machedFiles.get(i).getName();
                        }
                  };
       
       return listModel;
       }
    
    public ArrayList<SourceFile> getSourceFile(){
        
    return sourceFiles;
    }
    
}