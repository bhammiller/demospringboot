package com.example.demospringboot;

import java.util.Scanner;

public class Fence {
    public String fencing(){
        Double tax_rate = .06;
        Double permit_cost = 50.00;
        Double wood_cost = 25.00;
        Double chain_cost = 15.00;
        Double gate_cost = 150.00;
        Integer number_gates = 1;
        Double perimeter_cost = 0.00;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter type of fencing material: wooden or chain");
        String fence_type = keyboard.nextLine();
        System.out.println("please enter length of fence perimeter");
        Double fence_footage = keyboard.nextDouble();
        System.out.println("please enter number of gates");
        number_gates = keyboard.nextInt();
        while ((number_gates <= 1) || (number_gates >= 3)) {
            System.out.println("please enter between 1 and 3 gates");
            number_gates = keyboard.nextInt();
        }
        Double total_gate_cost = gate_cost * number_gates;
        if (fence_type == "wooden") {
            perimeter_cost = wood_cost * fence_footage;
        }
        else {
            perimeter_cost = chain_cost * fence_footage;
        }
        Double total_tax = (total_gate_cost + perimeter_cost) * tax_rate;
        Double total_cost = total_gate_cost + perimeter_cost + total_tax + permit_cost;
        System.out.println("the total cost is $ " + total_cost);
        return "the total cost is $ " + total_cost;
    }
}
