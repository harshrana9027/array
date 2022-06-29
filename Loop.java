/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrana
 */
import java.util.Scanner;

public class Loop {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number : ");
        Integer number = s.nextInt();

        for (int i = 1; i < 11; i++)
        {
            System.out.println(number*i);

        }

    }

}
