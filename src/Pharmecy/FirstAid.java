
package Pharmecy;


class FirstAid {
    int id;
    String diseasesName;
    String disesesExtension;
    String test;
    String medicine;

    public FirstAid() {
    }

    public FirstAid(int id, String diseasesName, String disesesExtension, String test, String medicine) {
        this.id = id;
        this.diseasesName = diseasesName;
        this.disesesExtension = disesesExtension;
        this.test = test;
        this.medicine = medicine;
    }

    public int getId() {
        return id;
    }

    public String getDiseasesName() {
        return diseasesName;
    }

    public String getDisesesExtension() {
        return disesesExtension;
    }

    public String getTest() {
        return test;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiseasesName(String diseasesName) {
        this.diseasesName = diseasesName;
    }

    public void setDisesesExtension(String disesesExtension) {
        this.disesesExtension = disesesExtension;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
}
