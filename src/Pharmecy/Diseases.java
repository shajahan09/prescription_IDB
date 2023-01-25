/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmecy;


public class Diseases {
    private int id;
    private String diseases;
    private String test;
    private int numberTablet;
    private int dose;
    private String sideEffect;

    public Diseases(int id,String diseases, String test, int numberTablet, int dose, String sideEffect) {
        this.id = id;
        this.test = test;
        this.numberTablet = numberTablet;
        this.dose = dose;
        this.sideEffect = sideEffect;
        this.diseases=diseases;
    }

    public int getId() {
        return id;
    }

    public String getDiseases() {
        return diseases;
    }

    public String getTest() {
        return test;
    }

    public int getNumberTablet() {
        return numberTablet;
    }

    public int getDose() {
        return dose;
    }

    public String getSideEffect() {
        return sideEffect;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public void setNumberTablet(int numberTablet) {
        this.numberTablet = numberTablet;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public void setSideEffect(String sideEffect) {
        this.sideEffect = sideEffect;
    }
    
}
