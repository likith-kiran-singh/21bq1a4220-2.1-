public class Expt14 {
    public class Main {
        public static void main(String args[]) {
            Q14 q=new Q14();
            new Producer14(q);
            new Consumer14(q);
            System.out.println("press control c to stop");
        }
    }
    
}
