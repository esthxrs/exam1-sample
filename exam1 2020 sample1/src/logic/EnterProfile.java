package logic;

public class EnterProfile {
    private Person person;
    private int bodyTemperature;

    public EnterProfile(Person person, int bodyTemperature){
        this.person = person;
        setBodyTemperature(bodyTemperature);
    }

    public boolean hasFever(){
        if(bodyTemperature >= 37){
            return true;
        }
        else {
            return false;
        }
    }

    public void setBodyTemperature (int bodyTemperature){
        this.bodyTemperature = Math.max(35, Math.min(42,bodyTemperature));
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }
}
