package com.sunday.demo02;

public class ProductBaoZi implements Runnable{
    private final BaoZi bz;

    public ProductBaoZi(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步锁
            synchronized (bz){
                if (bz.getFlag()%2==1){
                    bz.setFlag(bz.getFlag()+1);
                    System.out.println("正在购买："+bz.getName()+",价格为："+bz.getPrice());
                }
                try {
                    bz.notify();
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
