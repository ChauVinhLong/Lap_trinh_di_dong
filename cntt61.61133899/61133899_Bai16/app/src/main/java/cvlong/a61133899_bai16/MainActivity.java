package cvlong.a61133899_bai16;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private String[] listData;
    private ArrayAdapter<String> adapter;
    private Context context;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        listData = context.getResources().getStringArray(R.array.ListViewActivity);

        ListView lv=(ListView) findViewById(R.id.lvperson);

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);

        lv.setAdapter(adapter);
        final TextView txt=(TextView) findViewById(R.id.txtselection);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                txt.setText("position :"+arg2+" ; value ="+listData[arg2]);
            }
        });
    }
}