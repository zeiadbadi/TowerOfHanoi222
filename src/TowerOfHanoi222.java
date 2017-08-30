import java.util.Scanner;

public class TowerOfHanoi222 {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of disks.");
        int n = keyboard.nextInt();
        TowerOfHanoi222 myObject = new TowerOfHanoi222();


        System.out.println("The moves are: ");
        myObject.moveDisks(n, 'A', 'B', 'C');
        System.out.println("The total number of moves is " + myObject.getCount());


    }



    private int count = 0;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int moveDisks(int n, char fromTower, char toTower, char auxTower){
        count++;
        if (n==1)
            System.out.println("Move disk " +n+ " from " + fromTower + " to " + toTower);
        else{
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " +n+ " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
        return count;
    }
}

