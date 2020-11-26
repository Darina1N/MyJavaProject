package sk.kosickaakademia.kolesarova.myjavaproject;

public class People extends Napoje implements Drink{
    private String rola;

    public People (String name,String rozdelenie,String rola){
        super(name, rozdelenie);
        this.rola=rola;
    }

    public String getRola() {
        return rola;
    }

    @Override
    public void drink() {
        if(getRozdelenie()=="nevhodné"){
            System.out.println("čaj");
        }else System.out.println("káva");
    }
}