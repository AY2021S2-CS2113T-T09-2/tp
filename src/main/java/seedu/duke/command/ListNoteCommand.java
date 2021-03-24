package seedu.duke.command;

import seedu.duke.DailyRoute;
import seedu.duke.History;
import seedu.duke.NotesManager;
import seedu.duke.routing.Map;
import seedu.duke.routing.Router;
import seedu.duke.UiManager;

public class ListNoteCommand extends Command {
    public ListNoteCommand(String userInput) {
        super(userInput);
    }

    @Override
    public void execute(Map nusMap, UiManager ui, History history,
                        NotesManager notesManager, DailyRoute dailyRoute) {
        notesManager.parseListNotesCommandAndListNotes(userInput);;
    }
}
