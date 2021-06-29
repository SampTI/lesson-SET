/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import entities.User;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in).useLocale(Locale.US);
        Set<User> userlist = new HashSet<>();
        System.out.print("How many studants for course A?: ");
        int nstudant = tc.nextInt();
        for (int i = 1; i <= nstudant; i++) {
            System.out.println("Codigo do aluno #" + i);
            int code = tc.nextInt();
            userlist.add(new User(code));
        }
        System.out.println();
        System.out.print("How many studants for course B?: ");
        nstudant = tc.nextInt();
        for (int i = 1; i <= nstudant; i++) {
            System.out.println("Codigo do aluno #" + i);
            int code = tc.nextInt();
            userlist.add(new User(code));
        }
        System.out.println();
        System.out.print("How many studants for course C?: ");
        nstudant = tc.nextInt();
        for (int i = 1; i <= nstudant; i++) {
            System.out.println("Codigo do aluno #" + i);
            int code = tc.nextInt();
            userlist.add(new User(code));
        }
        System.out.println();
        System.out.println("Total Studants: " + userlist.size());
    }

}
