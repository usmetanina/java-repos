

class Date {
    public int x = 0;
    public int count = 0;
}

public class  Ex8Lucky {
    int globalCount=0;
    Date date = new Date();

    class LuckyThread extends Thread {

        public void run() {
            while (date.x < 999999) {
                synchronized (date) {
                    date.x++;
                    if ((date.x % 10) + (date.x / 10) % 10 + (date.x / 100) % 10 == (date.x / 1000)
                        % 10 + (date.x / 10000) % 10 + (date.x / 100000) % 10) {
                        System.out.println(date.x);
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
