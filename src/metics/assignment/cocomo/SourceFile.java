package metics.assignment.cocomo;

public class SourceFile{

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getCode() {
        return code;
    }

    public int getSingleLineCommentSize() {
        return singleLineCommentSize;
    }

    public int getMultiLineCommentSize() {
        return multiLineCommentSize;
    }

    public int getBlankLineSize() {
        return blankLineSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public double getEffortNeeded() {
        return effortNeeded;
    }

    public double getTimeNeeded() {
        return timeNeeded;
    }

    public double getProductivity() {
        return productivity;
    }

    public double getNumberOfDeveloperNeeded() {
        return numberOfDeveloperNeeded;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSingleLineCommentSize(int singleLineCommentSize) {
        this.singleLineCommentSize = singleLineCommentSize;
    }

    public void setMultiLineCommentSize(int multiLineCommentSize) {
        this.multiLineCommentSize = multiLineCommentSize;
    }

    public void setBlankLineSize(int blankLineSize) {
        this.blankLineSize = blankLineSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public void setEffortNeeded(double effortNeeded) {
        this.effortNeeded = effortNeeded;
    }

    public void setTimeNeeded(double timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public void setNumberOfDeveloperNeeded(double numberOfDeveloperNeeded) {
        this.numberOfDeveloperNeeded = numberOfDeveloperNeeded;
    }
   
    private String name;
    private String path;
    private String code;

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
    
    
            private double definitionPhase;
            private double  businessRequirement;
            private double  functionalSpecification;
            private double  deliveryPhase;
            private double detailedDesign;
            private double codeAndUnitTest;
            private double systemTesting;
            private double userAcceptanceTesting;
    
    private int singleLineCommentSize;
    private int multiLineCommentSize;
    private int blankLineSize;    
    private int totalSize;
    
    private double effortNeeded;
    private double timeNeeded;
    private double productivity;
    private double numberOfDeveloperNeeded;
    private String projectType;

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }
                                                 
    
    
}