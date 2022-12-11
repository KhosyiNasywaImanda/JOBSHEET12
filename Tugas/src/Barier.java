public class Barier implements Destroyable{
    private int strength;

    Barier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed(){
        strength -= 10 ;
    }

    public String getBarrierInfo(){
        String info = "";
        info += "Strength Barrier: " + strength;
        return info;
    }

        
    

}
