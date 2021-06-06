/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String firstQ = sc.next().toLowerCase();
        if(firstQ.equals("yes")){
            System.out.print("Are the battery terminals corroded? ");
            String firstQA = sc.next().toLowerCase();
            if(firstQA.equals("yes")){
                System.out.print("Clean terminals and try starting again.");
            }
            else if (firstQA.equals("no")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if (firstQ.equals("no")){
            System.out.print("Does the car make a clicking noise?");
            String firstQB = sc.next().toLowerCase();
            if(firstQB.equals("yes")){
                System.out.print("Replace the battery.");
            }
            else if(firstQB.equals("no")){
                System.out.print("Does the car crank up but fail to start?");
                String firstQC = sc.next().toLowerCase();
                if(firstQC.equals("yes")){
                    System.out.print("Check spark plug connection.");
                }
                else if(firstQC.equals("no")){
                    System.out.print("Does the engine start then die?");
                    String firstQD = sc.next().toLowerCase();
                    if(firstQD.equals("yes")){
                        System.out.print("Does your car have fuel injection? ");
                        String firstQE = sc.next().toLowerCase();
                        if(firstQE.equals("yes")){
                            System.out.print("Get it in for service.");
                        }
                        else if (firstQE.equals("no")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else if(firstQD.equals("no")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }

    }
}
