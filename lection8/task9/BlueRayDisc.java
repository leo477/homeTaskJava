package com.itea.dimka.lection8.task9;

import java.util.ArrayList;

public class BlueRayDisc {

    protected class DiscInfo {
        private ArrayList<Catalog> catalogs = new ArrayList<>();
        private static int i = 0;

        public DiscInfo() {
            catalogs.add(new Catalog("Catalog" + i));
            i++;
        }

        public void printRes() {
            for (Catalog catalog : catalogs) {
                System.out.println(catalog.name);
                for (Catalog.SubCatalog subCatalog : catalog.getSubCatalogs()) {
                    System.out.println(subCatalog.name);
                    for (Catalog.SubCatalog.Entries entries : subCatalog.getEntries()) {
                        System.out.println(entries.name);
                    }
                }
            }
        }


        private class Catalog {
            private ArrayList<SubCatalog> subCatalogs = new ArrayList<>();
            private String name;

            public ArrayList<SubCatalog> getSubCatalogs() {
                return subCatalogs;
            }

            public Catalog(String name) {
                this.name = name;
                for (int i=95; i<100; i++)
                subCatalogs.add(new SubCatalog("SubCatalog" + (i + 10)));
            }

            private class SubCatalog {
                private String name;
                private ArrayList<Entries> entries = new ArrayList<>();

                public ArrayList<Entries> getEntries() {
                    return entries;
                }

                public SubCatalog(String name) {
                    this.name = name;
                    for (int i = 0; i < 5; i++)
                        entries.add(new Entries("Entry" + (i + 100)));
                }

                private class Entries {
                    private String name;

                    public Entries(String name) {
                        this.name = name;
                    }
                }

            }
        }
    }
}
