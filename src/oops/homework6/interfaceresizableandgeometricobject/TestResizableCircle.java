package oops.homework6.interfaceresizableandgeometricobject;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(3);
		System.out.println(rc);
		rc.resize(50);
		System.out.println(rc);
	}
}
