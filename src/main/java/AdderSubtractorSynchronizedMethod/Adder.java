package AdderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;
public class Adder implements Callable<Void> {
    Count count;
    Adder(Count count){
        this.count = count;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100; i++){
            count.increasedCountByX(i);
        }
        return null;
    }
}
