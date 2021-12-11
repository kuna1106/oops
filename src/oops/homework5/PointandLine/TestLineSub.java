package oops.homework5.PointandLine;

public class TestLineSub {
	public static void main(String[] args) {
		Point startPoint = new Point(5,10);
        Point finishPoint = new Point(12,14);

        LineSub l1 = new LineSub(2 ,4,6,8);
        System.out.println(l1);

        l1.setBegin(startPoint);
        l1.setEnd(finishPoint);
        System.out.println(l1.getBegin());
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEnd());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        LineSub l2 = new LineSub(startPoint,finishPoint);
        System.out.println(l2);

        l2.setBeginX(16);
        l2.setBeginY(17);
        l2.setEndX(18);
        l2.setEndY(19);
        System.out.println(l2);
        l2.setBeginXY(28,29);
        l2.setEndXY(44,44);
        System.out.println(l2);

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
	}
}
