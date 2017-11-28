package Pages;

public class AddReport extends HeaderPage {
    //private String entity; //html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[1]/h4/div
    //private String subjinfo; //html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[2]/h4
    //private String identifiers; //html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[3]/h4/div

        public void addReportEntity() {   // "//div[@title='Entity']"
        System.out.println("Add Report - Entity");
    }
    public void addReportSubjInfo() {   // "//div[@title='Subject Information']"
        System.out.println("Add Report - Subject information");
    }
    public void addReportIdentifiers() {    //div[@title="Identifiers"]
        System.out.println("Add Report - Identifiers");
    }
    public void addReportIdInformation() {  //div[@title="Id Information"]
        System.out.println("Add Report - Id information");
    }
    public void addReportGangMembership() {
        System.out.println("Add Report - Gang Memebership");
    }
    public void addReportVehicle() {
        System.out.println("Add Report - vehicle");
    }
    public void addReportPhotos() {
        System.out.println("Add Report - photos");
    }
    public void addReportPreview() {
        System.out.println("Add Report - preview");
    }
}