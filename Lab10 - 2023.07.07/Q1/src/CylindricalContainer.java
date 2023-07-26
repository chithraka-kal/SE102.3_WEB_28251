public class CylindricalContainer extends Container{

    private double Height;
    private double Radius;

    public CylindricalContainer(double Height, double Radius){
        this.Height = Height;
        this.Radius = Radius;
    }
    @Override
    public double volume() {
        return Math.PI*Radius*Radius*Height;
    }

}
