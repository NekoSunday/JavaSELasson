package com.sunday.demo5;

public class test {
    public static void main(String[] args) {
        //这里并只使用了test下的class进行对象的创建
        //内部类调用？
        Weapon weapon = new Weapon("屠龙刀", 999999);
        Armour armour = new Armour("麒麟甲", 10000);
        Role r = new Role();
        r.setName("team");
        r.setId(1);
        r.setBlood(100);
        r.setWeapon(weapon);
        r.setArmour(armour);
        r.attack();
        r.wear();




    }


    static class Role {
        private int id; //角色id
        private int blood; //生命值
        private String name; //生命角色
        //以下class成为成员变量进行使用
        private Weapon weapon;
        private Armour armour;



        public void attack() {
            System.out.println(name + "使用" + weapon.getName() + "武器,造成" + weapon.getHurt() + "点伤害");
        }

        public void wear() {
            System.out.println(name + "穿上了" + armour.getName() + ",生命值增加" + armour.getProtect() + "点");
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getBlood() {
            return blood;
        }

        public void setBlood(int blood) {
            this.blood = blood;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Weapon getWeapon() {
            return weapon;
        }

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public Armour getArmour() {
            return armour;
        }

        public void setArmour(Armour armour) {
            this.armour = armour;
        }
    }

    static class Weapon {
        private String name;
        private int hurt;

        public Weapon(String name, int hurt) {
            this.name = name;
            this.hurt = hurt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHurt() {
            return hurt;
        }

        public void setHurt(int hurt) {
            this.hurt = hurt;
        }
    }

    static class Armour {
        private String name; //装备名称
        private int protect; //防御值

        public Armour(String name, int protect) {
            this.name = name;
            this.protect = protect;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProtect() {
            return protect;
        }

        public void setProtect(int protect) {
            this.protect = protect;
        }
    }
}
