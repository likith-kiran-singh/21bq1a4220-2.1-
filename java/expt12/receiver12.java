import java.io.IOException;
import java.io.PipedReader;

class receiver extends Thread{
    PipedReader fibr,primer;
    public receiver(fibonacci fib,prime pr)throws IOException{
        fibr=new PipedReader(fib.getwrite());
        primer=new PipedReader(pr.getwrite());
    }
    public void run() {
        int p=0,f=0;
        try{
            p=primer.read();
            f=fibr.read();
        }
        catch(IOException e){}
        while(true)  {
            try {    
                if(p==f){
                    System.out.println (p);
                    p=primer.read();
                    f=fibr.read();
                }
                else if(f<p)
                    f=fibr.read();
                else
                    p=primer.read();
            }catch(IOException e){
                System.exit(-1);
            }
        }
    }
}
