package disease;

import util.Patient;
import util.SevereLevel;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients;
    public Hospital(){

    }
    public void admit (String firstname, String lastname, String id, String disease, boolean isVacinated){

    }
    public ArrayList<Patient> getCovidPatients (SevereLevel s){

    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
}
