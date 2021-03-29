package seedu.duke.exception;

import static seedu.duke.ui.UiManager.getListOfLocations;

public class NoLocationForNotesCommandException extends NotesException {
    @Override
    public String getMessage() {
        return "Please add a location to the command before the notes. :))"
                + System.lineSeparator()
                + "\"List of locations: \""
                + System.lineSeparator()
                + getListOfLocations();
    }
}
