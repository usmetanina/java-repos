class Date {
    public int x = 0;
    public int count = 0;
}

public class  Ex8Lucky {
    int globalCount=0;
    Date date = new Date();

    class LuckyThread extends Thread {
        int currentX=0;

        public void run() {
            while (currentX < 999999) {

                synchronized (date) {
                    currentX=date.x;
                    date.x++;
                }

                if ((currentX % 10) + (currentX / 10) % 10 + (currentX / 100) % 10 == (currentX / 1000)
                            % 10 + (currentX / 10000) % 10 + (currentX / 100000) % 10) {
                    System.out.println(date.x);

                    synchronized (date) {
                        date.count++;
                    }
                }
            }
            globalCount = date.count;
        }
    }

    void start() throws InterruptedException
    {
        Thread t1 = new LuckyThread();
        Thread t2 = new LuckyThread();
        Thread t3 = new LuckyThread();
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Total: " + globalCount);
    }
}

class Programm {
    public static void main(String[] args) throws InterruptedException {
        new Ex8Lucky().start();
    }
}