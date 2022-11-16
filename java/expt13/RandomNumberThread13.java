import java.util.Random;
public class RandomNumberThread13 extends Thread{
    

    int n;
    RandomNumberThread13(int i){
        n=i;
    }
    public void run(){
        Random random=new Random();
        for (int i=0;i<n;i++){
            int randint=random.nextInt(100);
            System.out.println("The Number is : "+randint);
            if((randint%2) == 0) {
                SquareThread13 sThread = new SquareThread13(randint);
                sThread.start();
            }
            else{
                CubeThread13 cThread=new CubeThread13(randint);
                cThread.start();
            }
            try {
                Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                System.out.println(e);
                }
    }
}
}

