package safePass.userInterface;

import safePass.files.FilesFacade;

import java.io.File;

import static safePass.userInterface.CurrentState.*;

public class UserInterface {
    FilesFacade facade;

    public CurrentState state;
    public UserInterface(CurrentState state) {
        this.state = state;
    }

    void printMenu() {
        if (state == START) {
            System.out.println("1.get passwords\n" +
                            "2. Remove entry\n" +
                            "3. Create new password\n" +
                            "4.Say bye\n");
        }
        if (state == MAKING_RECORD) {
            System.out.println(facade.readFile("pass_list.txt"));
            state = START;
        }
        if(state==REMOVING_ENTRY) {
            System.out.println("Which entry do you want to remove?");
//  DODAC ENUM CHOOSING_RECORD_TO_REMOVE i funkcję usuwania
            state = START;
        }
        if (state == PRINTING_RECORDS) {

        }
    }

}

