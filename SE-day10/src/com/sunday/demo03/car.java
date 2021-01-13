package com.sunday.demo03;

public class car extends testClass01 {
    private String name = "外部";

    public String getName() {
        return name;
    }

    public void test02() {
        System.out.println("test02调用了");
    }
    @Override
    public void test() {
        System.out.println("testing");

        class testClass {

            private String name = "方法内部类";

            public String getName() {
                return this.name;
            }

            public void print() {
                System.out.println("测试成员方法内部类");
            }

            public void test(){
                System.out.println(car.this.getName());
            }
        }
        testClass t = new testClass();
        t.print();
        t.test();
        System.out.println(t.getName());
    }


    public class engine {
        public String name = "内部";

        public String getName() {
            return name;
        }

        public void start() {
            System.out.println("engine starting");
        }

        public void waibuL() {
            //访问外部类的成员变量，需要 外部类名.this.成员变量/方法
            System.out.println(car.this.getName());
            car.this.test02();
            System.out.println(this.getName());
            this.test();
        }
//        @Override这里没有重写到testClass的test方法
        public void test(){
            System.out.println("重名方法");
        }
    }
}
