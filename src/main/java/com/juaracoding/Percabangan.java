package com.juaracoding;

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        //jika user belum register//


        String email = "admin@juaracoding.com";
        String password = "Indonesia";

        String inEmail = "admin@juaracoding.com";
        String inPassword = "Indonesia";

        if (email.equals(inEmail) && password.equals(inPassword)) {
            System.out.println("Login Berhasil, Redirect dashboard");
        } else {
            System.out.println("Invalid Login");
        }

        int grade = 70;
        String keterangan = grade >= 75 ? "Lulus" : "Belum Lulus";
        System.out.println(keterangan);

        String phoneNumber = "08123456789";
        boolean isRegistered = false;
        boolean isOTPExpired = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input email / no HP: ");
        String inEmailOrPhoneNumber = scanner.next();

        if (email.equals(inEmailOrPhoneNumber) || phoneNumber.equals(inEmailOrPhoneNumber)) {
            isRegistered = true;
            if (isRegistered) {

                isOTPExpired = true;
                if (isOTPExpired) {
                    System.out.println("Silahkan input OTP");
                    isOTPExpired = false;
                    if (isOTPExpired) {
                        System.out.println("Redirect ke Dashboard");
                    } else {
                        System.out.println("OTP Expired");
                    }
                } else {
                    System.out.println("Kirim ulang OTP");
                }

            }

        } else {
            System.out.println("Email / Nomor HP belum terdaftar");
        }


    }
}