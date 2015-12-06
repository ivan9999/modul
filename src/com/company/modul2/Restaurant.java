package com.company.modul2;

/**
 * Created by User on 06.12.2015.
 */
public class Restaurant {
    boolean orderMadeByClient;
    boolean orderTaken;
    boolean orderReady;
    boolean orderReceived;
    long orderId;

    public Restaurant() {
    }

    public void makeRestaurant() {
        Client cl = new Client(this);
        Chef ch = new Chef(this);
        Waiter w = new Waiter(this);
        Thread t1 = new Thread(cl);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(ch);

        t1.start();
        t2.start();
        t3.start();
    }

    synchronized long getOrderMadeByClient() {
        while (!orderMadeByClient) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderMadeByClient = false;
        notifyAll();
        System.out.println("отримати замовлення від клієнта " + orderId);
        return orderId;
    }

    synchronized void putOrderMadeByClient(long l) {
        while (orderMadeByClient) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderMadeByClient = true;
        this.orderId = l;
        notifyAll();
        System.out.println("помістити клієнта замовлення " + l);
    }

    synchronized long getOrder() {
        while (!orderTaken) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderTaken = false;
        notifyAll();
        System.out.println("отримати замовлення від офіціанта" + orderId);
        return orderId;
    }

    synchronized void putOrder(long l) {
        while (orderTaken) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderTaken = true;
        this.orderId = l;
        notifyAll();
        System.out.println("навести порядок, щоб приготувати " + l);
    }

    synchronized long getFood() {
        while (!orderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderReady = false;
        notifyAll();
        System.out.println("отримати замовлення офіціанта " + orderId);
        return orderId;
    }

    synchronized void putFood(long n) {
        while (orderReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderReady = true;
        this.orderId = n;
        notifyAll();
        System.out.println("покласти замовлення кухарям " + n);
    }

    synchronized long getOrderReceived() {
        while (!orderReceived) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderReceived = false;
        notifyAll();
        System.out.println("отримати замовлення клієнта " + orderId);
        return orderId;
    }

    synchronized void putOrderReceived(long l) {
        while (orderReceived) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        orderReceived = true;
        this.orderId = l;
        notifyAll();
        System.out.println("покласти замовлення з офіціантам" + l);
    }
}
