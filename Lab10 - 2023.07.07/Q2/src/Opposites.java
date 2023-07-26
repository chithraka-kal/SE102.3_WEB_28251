public abstract class Opposites extends Movements{
    Opposites(int i){
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
}
