package com.example.yngvi.inclasslistdemo;

import java.io.Serializable;


public class Record implements Serializable {

    private String m_name;
    private boolean m_cool;

    Record(String name, boolean cool) {
        m_name = name;
        m_cool = cool;
    }

    String getName() {
        return m_name;
    }

    boolean getCool() {
        return m_cool;
    }

    @Override
    public String toString() {
        return m_name + " " + m_cool;
    }
}