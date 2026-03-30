package Recursion;

// Tower of Hanoi Algorithm

// The Tower of Hanoi is a classic mathematical puzzle involving three rods (A, B, and C) and n disks of different sizes. Initially, all disks are stacked on rod A in decreasing order of diameter - the largest disk at the bottom and the smallest at the top.
// Goal is to move the entire stack to another rod (rod C) while following these rules:

// Move only one disk at a time.
// At each step, you can take the top disk from any rod and place it on another rod.
// A disk can only be moved if it is the topmost disk of a rod.
// No larger disk may be placed on top of a smaller disk.

public class Tower_of_Honoi {
    public static void main(String[] args) {
        int n=3;
        TOH(n,"A", "B","C");
    }
    public static void TOH(int n, String src, String hlp, String des ) {
        if(n==0){
            return;
        }
        TOH(n-1, src, des,hlp);
        System.out.println("Move " + n + "th from " + src + " to " + des);
        TOH(n-1,hlp,src,des);
    }
}
