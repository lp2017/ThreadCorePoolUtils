package ThreadTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor extends ThreadPoolExecutor {
    private static final Logger log = LogManager.getLogger(TestThreadPoolExecutor.class);

    public TestThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

//    @Override
//    protected void beforeExecute(Thread t, Runnable r) {
//        Date date = new Date();
//        t.setName(r.toString());
//        log.info(String.format("Thread(%s, %s) Begin: %s|Task[%s,%s]|Date[%s,%s]", getActiveCount(),
//                getQueue().size(), t.toString(), r.hashCode(), r.toString(), date.getTime(), date.toString()));
//        super.beforeExecute(t, r);
//    }
//
//    @Override
//    protected void afterExecute(Runnable r, Throwable t) {
//        Date date = new Date();
//        log.info(String.format("Thread(%s, %s) Finish: Task[%s,%s]|Date[%s,%s]", getActiveCount(),
//                getQueue().size(), r.hashCode(), r.toString(), date.getTime(), date.toString()));
//        super.afterExecute(r, t);
//    }
}
