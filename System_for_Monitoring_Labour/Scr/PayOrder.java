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




class PayOrder implements Comparator<Person> {
    public int compare(Person p1, Person p2)
    {
        if (p1.getPay()>p2.getPay())
            return 1;
        else
        {
            if (p1.getPay()<p2.getPay())
                return -1;
            else
                return 0;
        }
        //try this -- return p1.getPay() - p2.getPay();
    }

}

