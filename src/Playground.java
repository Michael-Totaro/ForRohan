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

     Step 7: Go to LaunchPad and look up "terminal". It should look like a black app icon with a triangle and dash in
             the top right corner.

    Step 8: In your terminal simply type "java" without parenthesis. If anything other than "command not found" is
            printed to your terminal you should be good.



Second: Download a text editor: Atom
     Step 1: Go to this link -> https://atom.io/

     Step 2: Click the yellow download button under the macOS version.

     Step 3: I'm not 100% sure what you do after step 2. But I think it should be pretty straight foward.

     Step 4: Go to LaunchPad and look up "Atom". It should be a green app icon with a white drawing that looks
             like an atom.

     Step 5: More info on how to setup Atom if you're having issues -> https://www.geeksforgeeks.org/how-to-setup-atom-editor-with-all-the-required-packages/


Third: Pull the project from GitHub and copy it on to your own computer
     Step 1: Go to your terminal and type (copy and paste) the following command: pwd

            /Users/rohankothadia (or Users/whatever your username is) should be printed to
            your console.

     Step 2: Type the following command into your terminal: git clone git://github.com/Michael-Totaro/ForRohan.git

     Step 3: Open Atom and select the "Open a Project" button. It's in the same bar as the apple logo.

     Step 4: Under rohankothadia (or whatever your username is) in your finder click on ForRohan and open it in Atom. You should see it appear
             in the text editor and the left hand side under "Project"

     Step 5: In the left hand side drop down click "Playground.java" and continue to read this comment

Fourth: Compiling the programs.
     Step 1: Go to your terminal and type (copy and paste) the following command: pwd
            /Users/rohankothadia (or Users/whatever your username is) should be printed to
            your console.

     Step 2: Type the following command into your terminal: cd ForRohan

             (If you type "pwd" it should now say /Users/rohankothadia/ForRohan)

     Step 3: Type (or copy and paste) the following commands into your terminal in the following order.
             Note that these commands aren't going to produce any output and you only have to type these
             once since they're just for compiling, not running, the program:

             javac -d bin -cp bin src/RohanException.java
             javac -d bin -cp bin src/Rohan.java
             javac -d bin -cp bin src/Playground.java

Fifth: Running the file
    Step 1: To run the file type the following command into your terminal:

            cd src
            java Playground

    Step 2: Text should be printed to the console and you should see a prompt saying
            "What is Rohan's school: ". Answer correctly and the program should not
            throw an error.

    Step 3: Enjoy.
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
        Rohan rohanTwo = new Rohan("USC", "4/20/2021", "chicken thing", "football");
        return rohanTwo;
    }
}
