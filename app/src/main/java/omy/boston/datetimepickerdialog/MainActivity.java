package omy.boston.datetimepickerdialog;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import omy.boston.datetimepickerdialog.PickerFragment.DatePickerFragment;
import omy.boston.datetimepickerdialog.PickerFragment.TimePickerFragment;

public class MainActivity extends AppCompatActivity {
    TextView tksDate;
    TextView tksTime;
    Button btnDate;
    Button btnTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tksDate = (TextView) findViewById(R.id.tksDate);
        tksTime = (TextView) findViewById(R.id.tksTime);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerFragment datePF = new DatePickerFragment();
                datePF.show(getFragmentManager(), "Date picker");
            }
        });

        btnTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TimePickerFragment timePF = new TimePickerFragment();
                timePF.show(getFragmentManager(), "Time picker");
            }
        });
    }

    public void setDatum(String datum){
        tksDate.setText(datum);
    }

    public void setVrijeme(String vrijeme){
        tksTime.setText(vrijeme);
    }
}
