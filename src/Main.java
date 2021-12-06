import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    List<String> movement = Collections.emptyList();
    // It seems like the submarine can take a series of commands like forward 1, down 2, or up 3:

    //forward X increases the horizontal position by X units.
    //down X increases the depth by X units.
    //up X decreases the depth by X units.

    public static void main(String[] args) throws FileNotFoundException {

        Main main = new Main();
        main.calcPosition();

    }

    public void calcPosition() throws FileNotFoundException {

        Read reader = new Read();
        movement = reader.readMeasurement();
        String []direction;

        int horizontal, depth;
        horizontal = 0;
        depth = 0;
        // Your horizontal position and depth both start at 0.
        // The steps above would then modify them as follows:
        //
        //forward 5 adds 5 to your horizontal position, a total of 5.
        //down 5 adds 5 to your depth, resulting in a value of 5.
        //forward 8 adds 8 to your horizontal position, a total of 13.
        //up 3 decreases your depth by 3, resulting in a value of 2.
        //down 8 adds 8 to your depth, resulting in a value of 10.
        //forward 2 adds 2 to your horizontal position, a total of 15.
        for (String s : movement) {
            direction = s.split(" ", 2);
            switch (direction[0]) {
                case "forward":
                    horizontal += Integer.parseInt(direction[1]);
                    break;
                case "down":
                    depth += Integer.parseInt(direction[1]);
                    break;
                case "up":
                    depth -= Integer.parseInt(direction[1]);
                    break;

                default:
                    break;
            }
        }

        getPosition(horizontal,depth);

        //After following these instructions, you would have a horizontal position of 15 and a depth of 10.
        // (Multiplying these together produces 150.)
        //
        //Calculate the horizontal position and depth you would have after following the planned course.
        // What do you get if you multiply your final horizontal position by your final depth?


    }

    public void getPosition(int horizontal, int depth) {
        System.out.println("Horizontal: " + horizontal);
        System.out.println("Depth: " + depth);

        System.out.println("Final Multiple: " + horizontal*depth);
    }




}
