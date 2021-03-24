package seedu.duke.command;

import seedu.duke.DailyRoute;
import seedu.duke.History;
import seedu.duke.NotesManager;
import seedu.duke.UiManager;
import seedu.duke.routing.Map;
import seedu.duke.routing.Router;

public class ShowHistoryCommand extends Command {
    public ShowHistoryCommand(String userInput) {
        super(userInput);
    }

    @Override
    public void execute(Map nusMap, UiManager ui, History history,
                        NotesManager notesManager, DailyRoute dailyRoute) {
        ui.showHistory(history);
    }
}
