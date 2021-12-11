package oops.homework6.interfacemovableandcircle;

public class TestDirver {
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 6, 10, 15);    // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovablePoint(1, 2, 3, 4); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        MovableRectangle mr = new MovableRectangle(5, 10, 15, 20, 30, 30);
        System.out.println(mr);
        mr.moveRight();
        System.out.println(mr);

        MovableCircle mc = new MovableCircle(22,44,6,8,10);
        System.out.println(mc);
        mc.moveUp();
        System.out.println(mc);
	}
}
