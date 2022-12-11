public class WalkingZombie extends Zombie {
    
    WalkingZombie(int health , int level){
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal(){
        if(level == 1){
            health += (health * 0.2);
        }else if(level == 2){
            health += (health * 0.3);
        }else if (level == 3){
            health += (health * 0.4);
        }
    }

    @Override
    public void destroyed(){
        health -= (health * 0.02);
    }

    @Override
    public String getZombieInfo(){
        System.out.println("Infoo Zombie Walking : ");
        return super.getZombieInfo();
    }
}
