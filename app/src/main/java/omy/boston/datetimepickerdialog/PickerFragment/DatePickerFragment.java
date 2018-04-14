package omy.boston.datetimepickerdialog.PickerFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

import omy.boston.datetimepickerdialog.MainActivity;

/**
 * Created by LosFrancisco on 17-Jan-17.
 */

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar kal = Calendar.getInstance();
        int year = kal.get(Calendar.YEAR);
        int month = kal.get(Calendar.MONTH);
        int day = kal.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(getActivity(), this, year, month, day);
        return dpd;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        String datum = day + "/" + (month + 1) + "/" + year;
        MainActivity ma = (MainActivity) getActivity();
        ma.setDatum(datum);

    }
}
