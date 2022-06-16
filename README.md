Rohan go to the folder titled "src" and click on the java program titled "Playground.java" and read the comment or you can read what the comment says right here.

HOW TO RUN THIS PROGRAM: Read this. 

**First**: Download Java

     Step 1: Go to this link -> [link]([url](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html))

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



**Second**: Download a text editor: Atom

     Step 1: Go to this link -> https://atom.io/

     Step 2: Click the yellow button that says "Download" under the macOS version.

     Step 3: I'm not 100% sure what you do after step 2. But I think it should be pretty straight foward.

     Step 4: Go to LaunchPad and look up "Atom". It should be a green app icon with a white drawing that looks
             like an atom.

     Step 5: More info on how to setup Atom if you're having issues -> https://www.geeksforgeeks.org/how-to-setup-atom-editor-with-all-the-required-packages/


**Third**: Create the project on your computer.

     Step 1: Go to your terminal and type (copy and paste) the following command:

             pwd

            The command above should output the following
            /Users/rohankothadia

            (or /Users/whatever your username is)

    Step 2: Once your in the directory listed above copy and paste the following commands
            in your terminal (One by one, hit enter after each one).

            mkdir ForRohan
            cd ForRohan
            mkdir src
            mkdir bin
            cd src
            touch Playground.java
            touch Rohan.java
            touch RohanException.java

     Step 3: Open the Atom application and open the ForRohan folder you created in step 2.

     Step 4: Open all the blank java files in the src folder in the Atom text editor.

     Step 5: Open this Github link -> https://github.com/Michael-Totaro/ForRohan. Go to
             the src folder and open and copy and paste the code in the java files into their corresponding
             files in Atom. Make sure to save all the files in atom after your done copying and pasting.

             Note that to save a file go up to the very top Apple menu bar (above Atom, not in Atom)
             and next to the apple logo and text that says "Atom" select "File" and then select
             "Save" a blue dot should disapper next to your file name in atom after doing this.

**Fourth**: Compiling the programs.

     Step 1: Go to your terminal and type (copy and paste) the following command:

             pwd

            The command above should print the following to your console/terminal
            /Users/rohankothadia

            (or /Users/whatever your username is)

     Step 2: Type the following command into your terminal: cd ForRohan

             (If you type "pwd" it should now say /Users/rohankothadia/ForRohan)

     Step 3: Type (copy and paste) the following commands into your terminal in the following order.
             Note that these commands aren't going to produce any output and you only have to type these
             once since they're just for compiling, not running, the program:

             javac -d bin -cp bin src/RohanException.java
             javac -d bin -cp bin src/Rohan.java
             javac -d bin -cp bin src/Playground.java

**Fifth**: Running the file

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

    Step 4: Enjoy.
