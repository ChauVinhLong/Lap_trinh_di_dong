package com.example.a61133899_bai19;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView selection;
    String items[]={"Ha noi","Hue","spa","con son","vung tau","da nang"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selection=(TextView) findViewById(R.id.selection);
        setListAdapter(new MyArrAdapter(this));
    }
    protected void onListItemClick(ListView 1, View v,int positon,long id){
        super.onListItemClick(1,v, positon,id);
        selection.setText(items[positon]);
    }

    public class MyArrayAdapter extends ArrayAdapter<String>{
        private Activity context;
        public MyArrayAdapter(Activity context) {
            super(context, R.layout.item_row, items);
            this.context=context;
        }
        public View getView(int position, View contextView, ViewGroup parent){
            LayoutInflater inflater=this.context.getLayoutInflater();
            View row=inflater.inflate(R.layout.item_row, null);
            TextView txtdisplay= (TextView) row.findViewById(R.id.textView1);
            ImageView imgdisplay= (ImageView) row.findViewById(R.id.imageView1);
            txtdisplay.setText(items[position]);
            if (items[position].length()>=5) {
                imgdisplay.setImageResource(R.drawable.img_lvi1);
            }else {
                imgdisplay.setImageResource(R.drawable.img_lvi2);
            }
            return row;

            }
        }
    }
}