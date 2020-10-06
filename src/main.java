import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void Main(String[] args) {
        //random number generator
        Random rnd=new Random();
        rnd.setSeed(-10);

        //list of quadrilaterals
        ArrayList<IsoscelesTrapezoid> list=new ArrayList<>();
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));
        list.add(new IsoscelesTrapezoid(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()));


        //printing quadrilaterals with max Area
        System.out.println("Quadrilaterals with Maximum area :");
        for (var item:Functions.quadrilateralsWithMaxArea(list)) {
            System.out.println(item.toString());
        }
        System.out.println("Quadrilaterals with minimum area :");
        for (var item:Functions.quadrilateralsWithMinArea(list)) {
            System.out.println(item.toString());
        }

        System.out.println("number of Quadrilaterals with maximum area :");
        System.out.println(Functions.numberOfQuadrilateralWithMaxArea(list));

        //trapezoid with the smallest diagonal.
        System.out.println("trapezoid with the smallest diagonal.:");
        System.out.println(Functions.trapezoidWithSmallestDiagonal(list));
         }
}
