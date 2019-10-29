package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double money = 1.0, interest_rate = 1.0;
	int month = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng vay: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất theo tỉ lệ phần trăm");
        interest_rate = sc.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i ++){
            total_interset = money * (interest_rate/100)/12*3;
        }
        System.out.println("Tổng số tiền lãi là: " + total_interset);
    }
}
