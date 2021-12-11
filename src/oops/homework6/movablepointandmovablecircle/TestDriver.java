package oops.homework6.movablepointandmovablecircle;

public class TestDriver {
	public static void main(String[] args) {
		 MovablePoint mp = new MovablePoint(2,4,6,8);
	        System.out.println(mp);
	        mp.moveUp();
	        System.out.println(mp);
	        mp.moveDown();
	        System.out.println(mp);
	        mp.moveRight();
	        System.out.println(mp);
	        mp.moveLeft();
	        System.out.println(mp);

	        MovableCircle mc = new MovableCircle(5,10,15,20, 3);
	        System.out.println(mc);
	        mc.moveUp();
	        System.out.println(mc);
	        mc.moveDown();
	        System.out.println(mc);
	        mc.moveRight();
	        System.out.println(mc);
	        mc.moveLeft();
	        System.out.println(mc);
	}
}
