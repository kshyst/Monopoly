package edu.sharif.monoplytest.model.Tiles;

public class GO  extends Tile {
    private int salary ;
    private String name;

    public GO(int tilePosition , int salary , String name) {
        super(tilePosition, "GO");
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
