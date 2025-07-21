import java.util.LinkedList;
import java.util.Queue;


class BarberShop{
    private final int chairs;
    private final Queue<Costumer> waitingQueue;
    private boolean BarberSleeping = true;

    public BarberShop(int chairs){
        this.chairs = chairs;
        this.waitingQueue = new LinkedList<>();
    }

    public synchronized goToSleep(){
        while(waitingQueue.isEmpty()){
            BarberSleeping = true;
            wait();
        }
    }   

    public synchronized goCutHair(){
        
    }

    public synchronized callACustomer(){
        
    }

    public synchronized ReceivePayment(){
        
    }
}