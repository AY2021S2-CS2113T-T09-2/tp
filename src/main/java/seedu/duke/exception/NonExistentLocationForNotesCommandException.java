package seedu.duke.exception;

import static seedu.duke.ui.UiManager.getListOfLocations;

public class NonExistentLocationForNotesCommandException extends NotesException {
    @Override
    public String getMessage() {
        return "Location does not exists. :(( Please key in a valid location."
                + System.lineSeparator()
                + "\"List of locations: \""
                + System.lineSeparator()
                + getListOfLocations();
    }
}
