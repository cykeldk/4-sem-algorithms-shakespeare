package dk.cphbusiness.Shakespear;

/**
 *
 * @author Nicklas Molving
 */
public class Stopwatch {
    
    private long startTime;
    private long stopTime;
//    private long elapsedTime;
    
    public void start(){
        startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        stopTime = System.currentTimeMillis();
    }
    
    public long timeElapsed(){
        return stopTime-startTime;
    }
    
    
}
