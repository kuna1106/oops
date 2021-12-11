package oops.homework4.ballandplayer;

public class TestDriver {
	public static void main(String[] args) {
        // Test Ball
        Ball ball1 = new Ball(5.0f, 10.0f, 15.0f);
        System.out.println(ball1);

        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        System.out.println(ball1.getZ());

        ball1.setXYZ(3.0f, 6.0f, 9.0f);
        System.out.println(ball1);

        System.out.println();

        // Test Player
        Player player1 = new Player(7, 10.0f, 10.0f);
        System.out.println(player1);

        player1.move(5f,7f);
        player1.jump(3f);
        player1.kick(ball1);
        System.out.println(ball1);
        System.out.println(player1.near(ball1));
        System.out.println(player1);
    }	
}
