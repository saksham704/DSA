public class Arrayargument {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10; // This will NOT affect main (pass by value)

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // This WILL affect main (array reference)
        }
    }

    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;

        update(marks, nonChangeable);

        System.out.println(nonChangeable); // still 5

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

