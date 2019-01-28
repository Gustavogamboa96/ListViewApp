package com.cangrejo.listview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ListView listView=(ListView)findViewById(R.id.listView);

       final String[] Names = {"1.Examen físico", "2.Generalidades de fracturas", "3.Generalidades en imagenologia ortopedica", "4.Semilogia de hombro", "5.Semilogia de cadera","6.Semiologia de rodilla","7.Semiologia de pie y tobillo","8.Luxaciones","9.Fracturas abiertas","10.Sindrome compartimental", "11.Inmovilizaciones"};
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Names){
           public View getView(int position, View convertView, ViewGroup parent){
               /// Get the Item from ListView
               View view = super.getView(position, convertView, parent);

               TextView tv = (TextView) view.findViewById(android.R.id.text1);

               // Set the text size 25 dip for ListView each item
               tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,32);

               // Return the view
               return view;
           }
       };
       listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               //String mynames = names[position];
               if(position == 0){
                   startActivity(new Intent(MainActivity.this, FirstItemActivity.class));
                   overridePendingTransition(R.anim.leftright, R.anim.leftright);
               }
               if(position == 1){
                   startActivity(new Intent(MainActivity.this, SecondItemActivity.class));
                   overridePendingTransition(R.anim.leftright, R.anim.leftright);
               }
               if(position == 2){
                   startActivity(new Intent(MainActivity.this, ThirdItemActivity.class));
                   overridePendingTransition(R.anim.leftright, R.anim.leftright);
               }
               if(position == 3){
                   startActivity(new Intent(MainActivity.this, FourthItemActivity.class));
                   overridePendingTransition(R.anim.leftright, R.anim.leftright);
               }
               if(position == 9){
                   startActivity(new Intent(MainActivity.this, TenthItemActivity.class));
                   overridePendingTransition(R.anim.leftright, R.anim.leftright);
               }
           }
       });

    }
}
