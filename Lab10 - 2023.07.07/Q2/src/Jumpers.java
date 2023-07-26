public class Jumpers extends Player{
    public Jumpers(int i){
        super(i);
    }
    public void CrouchDown(){
        System.out.println("Crouched Player moved Down by "+(this.Sp-3)+" spaces");
    }
    public void CrouchUp(){
        System.out.println("Crouched Player moved Down by "+(this.Sp-3)+" spaces");
    }
}
