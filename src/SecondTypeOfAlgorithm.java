public class SecondTypeOfAlgorithm {

    //Our output repeat every 15 steps so we use seample string...
    //I use timer to show speed of algorithm. I take average 1000 attempts.
    public static void main(String[] args) {
        double SumOfTimes = 0;
        for (int j = 0; j < 1000; j++) {

            TimeCounter timer = new TimeCounter();
            timer.StartToCount();

            for (double i = 0; i < 10000 / 15; i += 1) {

                System.out.println(1 + 15 * i);
                System.out.println(2 + 15 * i);
                System.out.println("fizz");
                System.out.println(4 + 15 * i);
                System.out.println("buzz");
                System.out.println(6 + 15 * i);
                System.out.println(7 + 15 * i);
                System.out.println(8 + 15 * i);
                System.out.println("fizz");
                System.out.println("buzz");
                System.out.println(11 + 15 * i);
                System.out.println("fizz");
                System.out.println(13 + 15 * i);
                System.out.println(14 + 15 * i);
                System.out.println("fizz buzz");

            }
            timer.FinishToCount();
            SumOfTimes += timer.GetCountedTime();

        }
        System.out.println("Average time = " + SumOfTimes / 1000); // Average time = 0.015....... (in my processor)
    }
}