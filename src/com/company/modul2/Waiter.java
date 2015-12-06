package com.company.modul2;

/**
 * Created by User on 06.12.2015.
 */
public class Waiter  implements Runnable{
    private Restaurant r;

    public void makeServe() throws InterruptedException {
        synchronized (r) {
            r.notifyAll();
            while(r.orderMadeByClient==false)
                r.wait();
            System.out.println("Почніть порядку відбування");
            Thread.sleep(1000);
            r.putOrder(r.getOrderMadeByClient());
            while(r.orderReady==false)
                r.wait();
            r.putOrderReceived(r.getFood());
            System.out.println("Кінець порядку відбування ");
        }
    }

    public Waiter(Restaurant r) {
        this.r=r;
    }

    @Override
    public void run() {
        try {
            makeServe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
