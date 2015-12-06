package com.company.modul2;

/**
 * Created by User on 06.12.2015.
 */
public class Client implements Runnable{
private Restaurant r;

        public void makeOrder() throws InterruptedException {
            synchronized (r) {
                r.notifyAll();
                System.out.println("Почніть замовлення ");
                Thread.sleep(1000);
                r.putOrderMadeByClient(r.orderId);
                System.out.println("Кінець замовлення");
                while(r.orderReceived==false)
                    r.wait();
                r.getOrderReceived();
            }
        }

        public Client(Restaurant r) {
            this.r=r;
        }

        public void run() {
            try {
                makeOrder();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

