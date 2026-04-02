package com.example.mobileact1;  // ← fixed

import java.util.Arrays;
import java.util.List;

public class TireDA {

    public List<Tire> getTires() {
        return Arrays.asList(
                new Tire("Michelin",    "Pilot Sport 3",    "225/45R17", "Sport"),
                new Tire("Bridgestone", "Turanza T005",     "205/55R16", "Touring"),
                new Tire("Goodyear",    "Eagle F1",         "235/40R18", "Sport"),
                new Tire("Continental", "PremiumContact 6", "215/50R17", "Touring"),
                new Tire("Pirelli",     "P Zero",           "245/35R19", "Sport"),
                new Tire("Dunlop",      "Sport Maxx RT2",   "225/40R18", "Sport")
        );
    }
}