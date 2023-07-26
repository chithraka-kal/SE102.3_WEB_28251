public class Life {
    public static void main(String[] args) {
        Player player = new Player(1);
        player.Up();
        player.Down();
        player.Right();
        player.Left();

        Jumpers jumpers = new Jumpers(5);
        jumpers.Up();
        jumpers.Down();
        jumpers.Right();
        jumpers.Left();
        jumpers.CrouchDown();
    }
}