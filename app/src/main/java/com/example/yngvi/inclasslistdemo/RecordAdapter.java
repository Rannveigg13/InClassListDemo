package com.example.yngvi.inclasslistdemo;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Yngvi on 07/09/15.
 */
public class RecordAdapter extends ArrayAdapter<Record> {

    private final Context context;
    private final List<Record> values;

    public RecordAdapter(Context context, List<Record> objects) {
        super(context, -1, objects);
        this.context = context;
        this.values = objects;
    }
}
