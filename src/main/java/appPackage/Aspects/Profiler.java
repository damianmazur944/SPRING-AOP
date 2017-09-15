package appPackage.Aspects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Profiler {
    private long startTime = 0;


    @Before("@annotation(TimeMessure)")
    public void setStartTime(){
        startTime = System.nanoTime();
    }
    @After(value = "@annotation(TimeMessure)")
    public void logExecutiontime(JoinPoint joinPoint) {
        long executionTime =  System.nanoTime()-startTime;
        System.out.println("Execution time of method "+joinPoint.getSignature() +"->" +executionTime );
        startTime = 0;
    }
}
