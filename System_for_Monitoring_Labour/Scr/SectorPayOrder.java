package Scr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.text.NumberFormat;
import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.text.NumberFormat;
import java.io.*;





class SectorPayOrder implements Comparator<Person> {

    public int compare(Person p1, Person p2)
    {
        // First, compare by sector
        return p1.getSector().compareTo(p2.getSector());

    }
}