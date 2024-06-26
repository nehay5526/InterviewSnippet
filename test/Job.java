public class Job extends Thread{
    private int counter;

    public void run(){
        synchronized(this){
            for(int i =0;i<100000;i++){
                counter++;
                this.notifyAll();
                System.out.println("Completing Counting....");
            }
        }
    }
    public static void main(String... args) throws InterruptedException{
        Job job = new Job();
        job.start();
        Thread.sleep(10000);
          System.out.println("Waiting to get End....");
          synchronized(job){
            job.wait();
          }
          System.out.println(job.counter);
    }
    
}
