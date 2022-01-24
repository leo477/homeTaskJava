package com.itea.dimka.lection8.task1;

public class NotepadRunner {
    public static void main(String[] args) {
        int[][] arr = {{1, 2},{2, 2},{3, 2}};
        //Notepad.Entries entries = new Notepad().new Entries(arr);
        Notepad.Entries entries= new Notepad().new Entries();
        entries.setEntryDate("2021-01-01");
        entries.setEntryName("Name");
        System.out.println(entries);

        entries.setEntryDate("2021-01-01");
        entries.setEntryName("Name2");
        System.out.println(entries);
        entries.entriesInDB();
    }


}
