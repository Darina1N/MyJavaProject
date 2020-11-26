package sk.kosickaakademia.kolesarova.myjavaproject;

public abstract class Napoje {

    private String name;
    private String rozdelenie;

    public Napoje(String name,String rozdelenie){
        this.name=name;
        this.rozdelenie=rozdelenie;
    }

    public String getName() {
        return name;
    }

    public String getRozdelenie() {
        return rozdelenie;
    }
}