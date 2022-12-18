public class Boksor {

    String name;
    int can;
    int hasar;
    int agirlik;
    double doge;

    public Boksor(String name,int can,int hasar,int agirilik,double doge){
        this.name= name;
        this.can=can;
        this.hasar=hasar;
        this.agirlik=agirilik;
        this.doge=doge;
    }
    public int vurus(Boksor foe){
        System.out.println("--------------");
        System.out.println(this.name+"=>"+foe.name+" "+this.hasar+" hasar vurdu.");

        if(foe.doge()){
            System.out.println("Gelen Hasari Savurdi");
            return foe.can;
        }
        if(foe.can-this.hasar<0){
            return  0;
        }
        return foe.can-this.hasar;
    }

    public boolean doge(){
        double randomDeger=Math.random()*100;
        return randomDeger<=this.doge;
    }

}
