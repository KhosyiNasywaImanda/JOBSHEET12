public class Plants {

    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
        }else if(d instanceof Barier){
            Barier b = (Barier) d;
            b.destroyed();
        }
    }

}
