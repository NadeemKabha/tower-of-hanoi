import java.util.*;  

public class TowerOfHanoi {
    
    static void towerOfHanoi(int size, char from, char help, char to)
{
    // size: num of disks, from: the current rod,to: the destination rod, help: the remaining rod
    if (size == 1)
    {
        System.out.println("Move a disk from "+from+ " to "+ to);
        return;
    }
    towerOfHanoi(size - 1, from, to, help);
    System.out.println("Move a disk from "+from+ " to "+ to);
    towerOfHanoi(size - 1, help, from, to);
}
public static void main(String[] args)
{
    int size = 1;
    Scanner sc=new Scanner(System.in);  
    while (size!=0)
    {

        System.out.print("Please enter the desired number of disks (0 for exit): ");
        size= sc.nextInt();  

        if (size==0)
        System.out.println("End!");
        else if (size < 0)
        System.out.println("Wrong input please try again!");
        else
            towerOfHanoi(size, 'A', 'B', 'C');
    }
    sc.close();
}
}
