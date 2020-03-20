package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Date;

public class Food {

    String name;
    short price;
    int quantity;
    int expirationDate;
    boolean stockAvailability;

    LocalDate newDate = LocalDate.now().plusMonths(3);
    //daca e okey oare cum pot sa il printez ?!
}
