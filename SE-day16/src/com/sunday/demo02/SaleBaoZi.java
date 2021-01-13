package com.sunday.demo02;

public class SaleBaoZi implements Runnable {

    private final BaoZi bz;

    public SaleBaoZi(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        Integer index=0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步锁
            synchronized (bz){
                if (bz.getFlag()%2==0){
                    if (index%3==1){
                        bz.setName("肉包子");
                        bz.setPrice(1.0);
                    }else if (index%3==2){
                        bz.setName("咸菜包");
                        bz.setPrice(0.5);
                    }else{
                        bz.setName("豆沙包");
                        bz.setPrice(0.8);
                    }
                    //做不同的包子
                    index++;
                    //改变状态
                    bz.setFlag(bz.getFlag()+1);
                    System.out.println("正在生产"+bz.getName()+"，价格为："+bz.getPrice());

                    try {
                        //先唤醒再等待
                        bz.notify();
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
