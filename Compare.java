package org.example;

public class Compare {
    double line1;
    double line2;
    void comparision(Double l1 , Double l2){
        this.line1 = l1;
        System.out.println(line1);
        this.line2 = l2;
        System.out.println(line2);
        if (line1 == line2){
            System.out.println("Both line are Equal");
        } else {
            System.out.println("Both line are not Equal");
        }
    }
}
