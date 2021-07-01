public class FirstTypeOfAlgorithm {
    //simple algorithm where every third enumerator will be fizz and fifth will be buzz or "fizz buzz" every 15
    //I use timer to show speed of algorithm. I take average 10 attempts.
    public static void main(String[] args) {
        double SumOfTimes = 0;
        for(int j=0; j<100; j++) {

            TimeCounter timer = new TimeCounter();
            timer.StartToCount();

            for (int i = 1; i <= 100000; i++) {
                if (i % 3 == 0) {
                    System.out.print("fizz ");
                }
                if (i % 5 == 0) {
                    System.out.print("buzz");
                }
                if (i % 3 != 0 && i % 5 != 0) {
                    System.out.print(i);
                }
                System.out.println();
            }

            timer.FinishToCount();
            SumOfTimes+=timer.GetCountedTime();

        }
        System.out.println("Average time = "+SumOfTimes/100); // Average time = 0.318....... (in my processor)
    }
}
