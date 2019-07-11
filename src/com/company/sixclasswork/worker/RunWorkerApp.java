package com.company.sixclasswork.worker;

public class RunWorkerApp {

    public static void main(String[] args) {
        Worker[] workers = new Worker[10];

        workers[0] = new Worker(45, 7);
        workers[0].setFirstName("Ivan");
        workers[0].setLastName("Petrov");
        workers[1] = new Worker(30, 8);
        workers[1].setFirstName("Maria");
        workers[1].setLastName("Ivanova");
        workers[2] = new Worker(21, 5);
        workers[2].setFirstName("Petar");
        workers[2].setLastName("Grigorov");
        workers[3] = new Worker(16, 12);
        workers[3].setFirstName("Iva");
        workers[3].setLastName("Ivanova");
        workers[4] = new Worker(89, 16);
        workers[4].setNames("Boyan", "Nikolov");
        workers[5] = new Worker(120, 4);
        workers[5].setNames("Marian", "Todorov");
        workers[6] = new Worker(47, 10);
        workers[6].setNames("Mariela", "Rangelova");
        workers[7] = new Worker(50, 9);
        workers[7].setNames("Todor", "Nikolov");
        workers[8] = new Worker(30.50, 4);
        workers[8].setNames("Bojidar", "Pavlov");
        workers[9] = new Worker(34.20, 8);
        workers[9].setNames("Ginka", "Nikolova");

        for (Worker worker : workers) {
            worker.printWorkerInfo();
        }

    }


}
