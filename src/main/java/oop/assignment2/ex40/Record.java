package oop.assignment2.ex40;
import java.util.Date;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shobith Bandaru
 */
public class Record
{
    String firstName;

    String lastName;

    String position;

    Date seperationDate;

    public Record(String firstName, String lastName, String position, Date seperationDate)
    {
        this.firstName = firstName;

        this.lastName = lastName;

        this.position = position;

        this.seperationDate = seperationDate;
    }
}
