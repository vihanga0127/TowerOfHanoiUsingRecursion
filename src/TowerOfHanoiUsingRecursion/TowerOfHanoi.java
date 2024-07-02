package TowerOfHanoiUsingRecursion;

public class TowerOfHanoi {
	
	// Method to solve Tower of Hanoi problem
    // n: number of disks
    // source: rod from which disks are moved
    // destination: rod to which disks are moved
    // auxiliary: rod used for temporary storage
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: if there is only one disk to move, just move it from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary using destination as temporary storage
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination using source as temporary storage
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'X', 'Y', 'Z'); // X, Y and Z are names of rods
    }
}


