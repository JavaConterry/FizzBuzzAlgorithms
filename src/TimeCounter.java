public class TimeCounter {
    private double startTime;
    private double endTime;

    public TimeCounter(){
    }

    public void StartToCount(){
        startTime = System.nanoTime()/1e9;
    }

    public void FinishToCount(){
        endTime = System.nanoTime()/1e9;
    }

    public double GetCountedTime(){
        try{
            double CalculatedTime = endTime - startTime;
            return CalculatedTime;
        }
        catch (Exception e){
            System.out.println("You forgot to start or finish counter");
        }
        return 0;
    }
}
