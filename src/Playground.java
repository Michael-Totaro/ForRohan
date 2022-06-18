/*

HOW TO RUN THIS PROGRAM: Read this. (Also this grey text is called a comment and doesn't do anything.)

First: Download Java
     Step 1: Go to this link -> https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html.

     Step 2: Create an account with Oracle and sign in.

     Step 3: Look up "macOS x64 DMG Installer" using command f. (If you're using a mac which I'm assuming you are)

     Step 4: To the right of the text that says "200.31 MB" click on the blue .dmg file link.

     Step 5: Check the box saying you reviewed and accept the License agreement. Press the green download button

     Step 6: Just keep going with downloading the file and stuff. I'm not 100% sure what you do after step 5, but
             I think it should be pretty straight foward.

     Step 7: Go to LaunchPad (It should look like a bunch of apps within an app in the dock where all the
             apps are) and look up "terminal" in the search bar. It should look like a black app icon with
             a a white arrow thing that looks like > and a white dash in the top left/middle corner. Click on it.

    Step 8: In your terminal simply type "java" without quotations and press enter. If anything other than
            "command not found" is printed to your terminal you should be good.



Second: Download a text editor: Atom
     Step 1: Go to this link -> https://atom.io/

     Step 2: Click the yellow button that says "Download" under the macOS version.

     Step 3: I'm not 100% sure what you do after step 2. But I think it should be pretty straight foward.

     Step 4: Go to LaunchPad and look up "Atom". It should be a green app icon with a white drawing that looks
             like an atom.

     Step 5: More info on how to setup Atom if you're having issues -> https://www.geeksforgeeks.org/how-to-setup-atom-editor-with-all-the-required-packages/


Third: Create the project on your computer.
     Step 1: Go to your terminal and type (copy and paste) the following command:

             pwd

            The command above should output the following
            /Users/rohankothadia

            (or /Users/whatever your username is)

    Step 2: Once your in the directory listed above copy and paste the following commands
            in your terminal (One by one, hit enter after each one. Make sure to copy and
            paste in the following order. Don't close the terminal while doing this.).

            mkdir ForRohan
            cd ForRohan
            mkdir bin
            mkdir src
            cd src
            touch Playground.java
            touch Rohan.java
            touch RohanException.java
            cd ~
            open -a "Atom" ForRohan

            After doing this your computer should take you to the Atom text editor.
            A folder titled "ForRohan" should be located in the column on the left
            hand side under text that says "Project" click on this than drop down
            options should appear. One of the the options should be titled "src".
            Click on the "src" folder and open each file. Note that the files
            should just be blank right now with nothing in them.

            If (and only if) you can't figure how to open the files once your in
            Atom, exit out of Atom and go back to your terminal and type the following
            commands. Again if you figured out how to open the blank files these
            commands aren't necessary and you should just move on to step 3.

            cd ~
            cd ForRohan
            cd src
            open -a "Atom" Playground.java
            open -a "Atom" Rohan.java
            open -a "Atom" RohanException.java

            * Note that the open command might take a second to open the file.

     Step 3: Open this Github link -> https://github.com/Michael-Totaro/ForRohan. Go to
             the src folder and open and copy and paste the code in the java files into their corresponding
             files in Atom. Make sure to save all the files in atom after your done copying and pasting.

             Note that to save a file go up to the very top Apple menu bar (above Atom, not in Atom)
             and next to the apple logo and text that says "Atom" select "File" and then select
             "Save" a blue dot should disapper next to your file name in atom after doing this.

Fourth: Compiling the programs.
     Step 1: Go to your terminal and type (copy and paste) the following command:

             pwd

            The command above should print the following to your console/terminal
            /Users/rohankothadia

            (or /Users/whatever your username is)

     Step 2: Type the following command into your terminal: cd ForRohan

             (If you type "pwd" it should now say /Users/rohankothadia/ForRohan)

     Step 3: Type (copy and paste) the following commands into your terminal in the following order.
             Note that these commands aren't going to produce any output and you only have to type these
             once since they're just for compiling, not running, the program. Make sure to copy and paste
             in following order or the files won't compile.:

             javac -d bin -cp bin src/RohanException.java
             javac -d bin -cp bin src/Rohan.java
             javac -d bin -cp bin src/Playground.java

Fifth: Running the file

    Step 1: Type the following command in your terminal, press enter, and compare output:

             pwd

             Should Output the following (the middle doesn't have to be rohankothadia
                                          just whatever your Apple username is)
             /Users/rohankothadia/ForRohan


    Step 2: To run the file type the following command into your terminal:
            java -cp bin Playground

    Step 3: Text should be printed to the console and you should see a prompt saying
            "What is Rohan's school: ". Answer correctly and the program should not
            throw an error.

    Step 4: You can delete this enormous comment from the "Playground.java" file once
            your done completing the steps. It's lines  1 - 133

    Step 5: Enjoy.
*/

import java.util.Scanner;

public class Playground {

    /**
     * Constructs a Rohan object named "r" than prints a message to the console about Rohans information by
     * calling methods in the "Rohan" class.
     *
     * Then calls the r2 method in this class to print the other objects information.
     *
     * Creates a Scanner object called "console" so the user can enter information using their terminal.
     *
     * User will be asked to enter Rohans school, current date, school mascot, and favorite sport.
     *
     * After all questions are asked the user can decide to attempt to create the object by pressing '1' or
     * Press '0' to avoid getting an exception message.
     *
     * If the user presses '1' the information on the third object is printed to the terminal
     *
     */
    public static void main(String[] args) throws RohanException {
        Rohan r = new Rohan("the University of South Carolina", "5/26/2022", "gamecock", "golf");

        System.out.println("\nRohan is a student at " + r.getSchool() + ". He is " + r.getAge() + " years old. " +
                            "His school's mascot is a " + r.getMascot() + ". His favorite sport is " + r.getSport() + ".\n");



        System.out.println("Rohan is a student at " + r2().getSchool() + ". He is " + r2().getAge() + " years old. " +
                           "His school's mascot is a " + r2().getMascot() + ". His favorite sport is " + r2().getSport() + ".\n");

        Scanner console = new Scanner(System.in);

        System.out.print("What is Rohan's school: ");
        String school = console.nextLine();

        System.out.print("\nWhat is today's date (Format MM/DD/YYYY): ");
        String date = console.next();

        System.out.print("\nWhat is Rohans schools mascot: ");
        String mascot = console.next();

        System.out.print("\nWhat is Rohans favorite sport: ");
        String sport = console.next();

        System.out.print("\nPress '0' to print information about Rohan. Press '1' to have no chance of an exception being thrown. : ");
        int num = console.nextInt();

        if (num == 0) {
            Rohan r3 = new Rohan(school, date, mascot, sport);

            System.out.println("\nRohan is a student at " + r3.getSchool() + ". He is " + r3.getAge() + " years old. " +
                            "His school's mascot is a " + r3.getMascot() + ". His favorite sport is " + r3.getSport() + ".\n");
        } else {
            System.out.println("\nYou didn't want an exception to be thrown. Object creation canceled.\n");
        }


    }

    /**
     * Constructs and returns a second Rohan object.
     * @return New Rohan object.
     * @throws RohanException If school or sport is wrong.
     */
    public static Rohan r2() throws RohanException {
        return new Rohan("USC", "4/20/2021", "chicken thing", "football");
    }
}
