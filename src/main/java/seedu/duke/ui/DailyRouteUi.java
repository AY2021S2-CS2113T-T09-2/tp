package seedu.duke.ui;

import seedu.duke.data.NusMap;
import seedu.duke.exception.InvalidBlockException;
import seedu.duke.exception.InvalidIndexException;

import java.util.ArrayList;

public class DailyRouteUi extends UiManager {

    public ArrayList<String> getScheduleInfo() throws InvalidBlockException {
        showMessage("Enter Location of the first activity of the day: ");
        ArrayList<String> dailyBlocks = new ArrayList<>();
        String schedule = getUserInput().toUpperCase();
        while (!isEnd(schedule)) {
            dailyBlocks.add(schedule);
            showMessage("Enter Location of the next activity of the day: ");
            schedule = getUserInput().toUpperCase();
        }
        showMessage(CommonMessage.DIVIDER);
        return dailyBlocks;
    }

    public boolean isEnd(String schedule) throws InvalidBlockException {
        NusMap nusMap = new NusMap();
        if (schedule.equals("END")) {
            return true;
        } else if (nusMap.getBlock(schedule) == null) {
            throw new InvalidBlockException();
        }
        return false;
    }

    public int getDayEntryForAdd(ArrayList<String> validDays) throws InvalidIndexException {
        showListOfDays(validDays);
        showMessage("SELECT ENTRY TO ADD:");
        int dayIndex = getEntryFromUser(validDays);
        showMessage(CommonMessage.DIVIDER);
        return dayIndex;
    }

    public int getDayEntryForShow(ArrayList<String> selectableDays) throws InvalidIndexException {
        showListOfDays(selectableDays);
        showMessage("SELECT ENTRY TO VIEW:");
        int dayIndex =  getEntryFromUser(selectableDays);
        showMessage(CommonMessage.DIVIDER);
        return dayIndex;
    }

    public void showListOfDays(ArrayList<String> days) {
        showMessage("Here are the available days:");
        for (int i = 0; i < days.size(); i++) {
            showMessage((i + 1) + ". " + days.get(i));
        }
        showMessage(CommonMessage.DIVIDER);
    }

    public int getEntryFromUser(ArrayList<String> days) throws InvalidIndexException {
        try {
            int dayEntry = Integer.parseInt(getUserInput()) - 1;
            if (dayEntry < 0 || dayEntry > days.size() - 1) {
                throw new InvalidIndexException();
            }
            return dayEntry;
        } catch (NumberFormatException e) {
            throw new InvalidIndexException();
        }
    }
}