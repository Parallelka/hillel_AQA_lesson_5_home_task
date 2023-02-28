package com.hillel.kuchmii.lessons.lesson5;

public class Dynasty {
    public static void main(String[] args) {

        int gen_value_attack_li;
        int gen_value_attack_min;

        int quantity_warrior = 860;

        int value_li_warrior = 13;
        int value_li_archer = 24;
        int value_li_rider = 46;

        int value_min_warrior = 9;
        int value_min_archer = 35;
        int value_min_rider = 12;

        gen_value_attack_li = (value_li_warrior + value_li_archer + value_li_rider) * quantity_warrior;
        gen_value_attack_min = (int) Math.floor((value_min_warrior + value_min_archer + value_min_rider) * quantity_warrior * 1.5);
        System.out.println("The value of the general attack Li: " + gen_value_attack_li);
        System.out.println("The value of the general attack Min: " + gen_value_attack_min);

    }

}
