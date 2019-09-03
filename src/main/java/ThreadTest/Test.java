package ThreadTest;

public final class Test {

//    public static long s;
//    public static long s2;
//    public static long max;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 5 == 0) {

                ThreadPoolUtil.instance().addTask(new MyTask(i), true);
            } else {

                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ThreadPoolUtil.instance().addTask(new MyTask(i));
            }
        }
    }
}


class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    int n = 0;

    @Override
    public void run() {
        long s = System.currentTimeMillis();

        try {
            if (taskNum < 6) {
                Thread.sleep(1500);
            } else {
                Thread.sleep(200);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        long s2 = System.currentTimeMillis();

        long tim = (s2 - s);
        System.out.println("taskNum:" + taskNum+" time:"+tim);
//        Test.sb2(String.valueOf(tim));


    }
}