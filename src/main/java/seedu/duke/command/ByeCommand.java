package seedu.duke.command;

import seedu.duke.History;
import seedu.duke.NotesManager;
import seedu.duke.routing.Router;

public class ByeCommand extends Command {
    public ByeCommand(String userInput) {
        super(userInput);
    }

    @Override
    public boolean isExit() {
        return true;
    }

    @Override
    public void execute(Router router, UiManager ui, History history, NotesManager notesManager) {
        ui.showByeMessage();
    }
}
