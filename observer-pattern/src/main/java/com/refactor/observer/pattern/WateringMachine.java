package com.refactor.observer.pattern;

public class WateringMachine {

    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void start() {
        this.status = true;
    }
}
