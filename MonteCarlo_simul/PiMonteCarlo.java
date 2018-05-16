import java.util.Random;

public class PiMonteCarlo
{
    public static final int CIRCLE_RADIUS = 1;
    
    public static double getRandomCoordinate()
    {
        return new Random().nextDouble() * CIRCLE_RADIUS;        
    }

    public static double doCalculate(double totalPointsCount)
    {
        long circlePointsCount = 0;
        for (int i = 0; i < totalPointsCount; i++ ) 
        {
            //double x = new Random().nextDouble() * CIRCLE_RADIUS;
            //double y = new Random().nextDouble() * CIRCLE_RADIUS;
            double x = getRandomCoordinate();
            double y = getRandomCoordinate();

            if (Math.pow(x, 2) + Math.pow(y, 2) <= CIRCLE_RADIUS)
            {
                circlePointsCount++;
            }
        }

        return 4.0 * circlePointsCount/totalPointsCount;
    }
    
      
    /*--------MAIN--------*/
    public static void main(String[] args)
    {
        System.out.println("PI calc = " + PiMonteCarlo.doCalculate(1000000000));
        System.out.println("PI real = " + Math.PI);
        //byte zero = 0;
        //String output = "W" + zero + "W";
        //System.out.println(output);
        //System.out.println(0123 + 3210);
        // System.out.println("EDU02 - Hello, World!");

    }
}