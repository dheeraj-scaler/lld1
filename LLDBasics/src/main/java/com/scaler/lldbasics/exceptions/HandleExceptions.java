//package com.scaler.lldbasics.exceptions;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class HandleExceptions {
//
//    public static void main(String[] args) {
//        System.out.println("Before");
//        func();
//        System.out.println("After");
//    }
//
//    static void func() {
//        try {
////            File f = new File("abc.txt");
////            FileReader fr = new FileReader(f);
////            fr.read();
//            System.out.println("Scanner input");
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            System.exit(0);
//
//
//            int b = sc.nextInt();
//            System.out.println("Scanner output");
//
//            System.out.println(a / b);
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("File not Found");
//        } catch (IOException io) {
//            System.out.println("IO exception occured");
//        }
//        catch (InputMismatchException input) {
//            System.out.println("Input mismatch occured");
//        } catch (ArithmeticException arth) {
//            System.out.println("Arithmetic exception occured");
//        } catch (Exception e) {
//            System.out.println("All exception parent");
//        } finally {
//            System.out.println("Inside the final block");
//        }
//
//        System.out.println("We are done with the exception handling code");
//
//
//    }
//}
