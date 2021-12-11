package oops.homework6.movableinterface;

public class TestMovable {
	public static void main(String[] args) {
		MovablePoint mp = new MovablePoint(2, 4, 6, 6);
        System.out.println(mp);
        mp.moveUp();
        System.out.println(mp);
        mp.moveDown();
        System.out.println(mp);
        mp.moveRight();
        System.out.println(mp);
        mp.moveLeft();
        System.out.println(mp);
	}
}
