public class JumpingZombie extends Zombie {

    JumpingZombie(int health , int level){
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal(){
        if(level == 1){
            health += (health * 0.3);
        }else if(level == 2){
             health += (health * 0.4);               
        }else if(level == 3){
            health += (health * 0.5);
        }
    }

    @Override
    public void destroyed(){
        health -= (health * 0.1);
    }

    @Override
    public String getZombieInfo(){
        System.out.println("infoo Jumping Zombie : ");
        return super.getZombieInfo();
    }


}
