package fr.utt.if26.michel_tp04;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView nom, prenom;
    Button b01, b02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = (TextView)findViewById(R.id.view_nom);
        prenom = (TextView)findViewById(R.id.view_prenom);
        b01 = (Button)findViewById(R.id.b01);
        b02 = (Button)findViewById(R.id.b02);
        b01.setBackgroundColor(Color.RED);
        b02.setBackgroundColor(Color.RED);
        b01.setOnClickListener(this);
        b02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id_temp = v.getId();
        switch (id_temp) {
            case R.id.b01 :
                if(b01.isSelected()){
                    b01.setSelected(false);
                    b01.setBackgroundColor(Color.RED);
                }
                else {
                    b01.setSelected(true);
                    b01.setBackgroundColor(Color.GREEN);
                }
                break;
            case R.id.b02 :
                if(b02.isSelected()){
                    b02.setSelected(false);
                    b02.setBackgroundColor(Color.RED);
                }
                else {
                    b02.setSelected(true);
                    b02.setBackgroundColor(Color.GREEN);
                }
                break;
        }
    }
}
