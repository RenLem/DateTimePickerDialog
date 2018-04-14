package omy.boston.datetimepickerdialog.PickerFragment;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

import omy.boston.datetimepickerdialog.MainActivity;

/**
 * Created by LosFrancisco on 17-Jan-17.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar ura =  Calendar.getInstance();
        int sat = ura.get(Calendar.HOUR_OF_DAY);
        int minuta = ura.get(Calendar.MINUTE);
        TimePickerDialog tpd = new TimePickerDialog(getActivity(), this, sat, minuta, true);
        return tpd;
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minuteOfHour) {
        String vrijeme = hourOfDay + ":" + minuteOfHour;
        MainActivity ma = (MainActivity) getActivity();
        ma.setVrijeme(vrijeme);

    }
}
