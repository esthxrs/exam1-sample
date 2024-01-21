package logic;

public class Person {
    private String name;
    private int ID;

    public Person(String name, int ID){
    this.name = name;
    this.ID = Math.max(ID,1);
    }

    public void setID(int ID){
        this.ID = Math.max(1,ID);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
