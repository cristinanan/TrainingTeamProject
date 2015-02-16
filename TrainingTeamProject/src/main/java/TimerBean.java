import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Stateless
public class TimerBean {
    @Resource
    protected static TimerService timerService;

    @Timeout
    public void timeoutHandler(Timer timer) {
        String name = timer.getInfo().toString();
        System.out.println("Timer name=" + name);
    }

    public static  void startTimer(long initialExpiration, long interval, String name){      
        TimerConfig config = new TimerConfig();
        config.setInfo(name);
        config.setPersistent(false);
        timerService.createIntervalTimer(initialExpiration, interval, config);
    }
    
    public static void main(String args[]){
    	
    	startTimer(12,20,"timer1");
    }
}