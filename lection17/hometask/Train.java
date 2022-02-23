package com.itea.dimka.lection17.hometask;

public class Train extends Thread {
    private int capacity;
    private int maxCapacity;
    private final int idTrain;
    private int entranceId;
    private Entrance entrance;
    private int option = 0;

    public Train(int capacity, int idTrain, int maxCapacity) {
        this.capacity = capacity;
        this.idTrain = idTrain;
    }

    public Train(int capacity, int idTrain, int option, int maxCapacity) {
        this.capacity = capacity;
        this.idTrain = idTrain;
        this.option = option;
        this.maxCapacity = maxCapacity;
    }

    public void setEntranceId(int entrenceId) {
        this.entranceId = entrenceId;
    }

    public void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }


    @Override
    public void run() {
        switch (option) {
            case 0:
                System.out.println("Train #" + idTrain + " is arrived to entrance #" + entranceId + " - > " + entrance.loadCargo(capacity,"Metal") + " - > " + entrance.toString());
                capacity = 0;
                break;
            case 1:
                System.out.println("Load Metal to train(" + capacity + " - > "+ maxCapacity +") #" + idTrain + " in entrance #" + entranceId + " value = " + entrance.uploadCargo(maxCapacity - capacity,"Metal") +
                        " - > " + entrance.toString());
                break;
            case 2:
                System.out.println("Train #" + idTrain + " is arrived to entrance #" + entranceId + " - > " + entrance.loadCargo(capacity, "Metal") + " - > " + entrance.toString());
                capacity = 0;
                System.out.println("Load Metal to train(" + capacity + " - > "+ maxCapacity +") #" + idTrain + " in entrance #" + entranceId + " value = " + entrance.uploadCargo(maxCapacity - capacity,"Metal") +
                        " - > " + entrance.toString());
                break;
            case 3:
                System.out.println("Train #" + idTrain + " is arrived to entrance #" + entranceId + " - > " + entrance.loadCargo(capacity,"Product") + " - > " + entrance.toString());
                capacity = 0;
                break;
        }
        entrance.setBusy(false);
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
