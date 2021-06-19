package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(); {
            boss.setHealth(600);
            boss.setDamage(40);
            boss.setWeapon(new Weapon("firearms","revolver"));
            System.out.println(boss.getHealth() + " "
                    + boss.getDamage() + " "
                    + boss.weapon.getType() + " "
                    + boss.weapon.getType());
            

        }}}