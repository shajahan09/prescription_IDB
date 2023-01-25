/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmecy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author java2
 */
class DiseasesRepository {

    private int result;

    public DiseasesRepository() {
        try {
            //Class.forName("spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("class not found " + e.getMessage());
        }

    }

    public ArrayList<Diseases> loadDiseases() {
        ArrayList<Diseases> deseases = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine", "root", "root");

            Statement stmt = con.createStatement();

            ResultSet result = stmt.executeQuery("Select id,diseases,test,numberTablet,dose,sideEffect From Diseases");
            while (result.next()) {
                deseases.add(new Diseases(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getString(6)));

            }
            stmt.close();
            con.close();

        } catch (Exception ex) {

            System.out.println("Eror load dises" + ex.getMessage());
        }

        return deseases;
    }

}
