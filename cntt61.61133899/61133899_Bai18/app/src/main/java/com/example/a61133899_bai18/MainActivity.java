package com.example.a61133899_bai18;

import android.content.Context;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private String[] listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    TextView selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listData = context.getResources().getStringArray(R.array.ListViewActivity);

        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);

        setListAdapter(adapter);

        selection=(TextView) findViewById(R.id.selection);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        String txt="postion = "+position +"; value ="+listData[position];
        selection.setText(txt);
    }
}