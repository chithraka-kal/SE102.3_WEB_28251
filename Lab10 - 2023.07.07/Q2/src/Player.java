public class Player extends Movements{

    Player(int i){
        this.Sp = i;
    }
    @Override
    public void Right(){
        System.out.println("Player moved RIGHT by "+this.Sp+" spaces.");
    }
    @Override
    public void Left(){
        System.out.println("Player moved LEFT by "+this.Sp+" spaces.");
    }
    @Override
    public void Down(){
        System.out.println("Player moved DOWN by "+this.Sp+" spaces.");
    }
    @Override
    public void Up(){
        System.out.println("Player moved UP by "+this.Sp+" spaces.");
    }
}
