package theads.hho;

public class Main {
    public static void main(String[] args) {
        H2O h2O = new H2O();
        new Thread(()->{
            try {
                h2O.hydrogen(()->{
                    System.out.print("H");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
