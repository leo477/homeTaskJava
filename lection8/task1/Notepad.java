package com.itea.dimka.lection8.task1;

import java.util.ArrayList;

public class Notepad {

    public class Entries {
        private final ArrayList<SaveEntry> entries = new ArrayList<>();
        static int entryId = 0;
        private String entryDate;
        private String entryName;

        public void setEntryDate(String entryDate) {
            this.entryDate = entryDate;
        }

        public void setEntryName(String entryName) {
            this.entryName = entryName;
        }

        private boolean saveEntry() {
            entries.add(new SaveEntry(entryDate, entryName));
            entryId++;
            return true;
        }

        public void entriesInDB() {
            for (Object entry : entries) {
                System.out.println(entry);
            }
        }

        @Override
        public String toString() {
            if (saveEntry() != false) {
                return "Entry" + entryId + " was added";
            } else {
                return "Entry" + entryId + " wasn't added";
            }
        }
    }

    private class SaveEntry {
        String entryDate;
        String entryName;

        public SaveEntry(String entryDate, String entryName) {
            this.entryDate = entryDate;
            this.entryName = entryName;
        }

        @Override
        public String toString() {
            return "SaveEntry{" +
                    "entryDate=" + entryDate +
                    ", entryName='" + entryName + '\'' +
                    '}';
        }
    }
}
