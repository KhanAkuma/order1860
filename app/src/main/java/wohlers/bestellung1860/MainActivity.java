package wohlers.bestellung1860;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
         * Reihe 01
         */

        final Spinner spinner_row01_1 = (Spinner) findViewById(R.id.spinner_row01_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row01_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row01_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row01_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row01_1 != null) {
            spinner_row01_1.setAdapter(adapter_row01_1);
        }

        final Spinner spinner_row01_2 = (Spinner) findViewById(R.id.spinner_row01_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row01_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row01_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row01_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row01_2 != null) {
            spinner_row01_2.setAdapter(adapter_row01_2);
        }

        /*
         * Reihe 02
         */

        final Spinner spinner_row02_1 = (Spinner) findViewById(R.id.spinner_row02_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row02_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row02_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row02_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row02_1 != null) {
            spinner_row02_1.setAdapter(adapter_row02_1);
        }

        final Spinner spinner_row02_2 = (Spinner) findViewById(R.id.spinner_row02_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row02_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row02_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row02_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row02_2 != null) {
            spinner_row02_2.setAdapter(adapter_row02_2);
        }

        /*
         * Reihe 03
         */

        final Spinner spinner_row03_1 = (Spinner) findViewById(R.id.spinner_row03_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row03_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row03_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row03_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row03_1 != null) {
            spinner_row03_1.setAdapter(adapter_row03_1);
        }

        final Spinner spinner_row03_2 = (Spinner) findViewById(R.id.spinner_row03_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row03_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row03_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row03_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row03_2 != null) {
            spinner_row03_2.setAdapter(adapter_row03_2);
        }


        /*
         * Reihe 04
         */

        final Spinner spinner_row04_1 = (Spinner) findViewById(R.id.spinner_row04_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row04_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row04_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row04_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row04_1 != null) {
            spinner_row04_1.setAdapter(adapter_row04_1);
        }

        final Spinner spinner_row04_2 = (Spinner) findViewById(R.id.spinner_row04_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row04_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row04_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row04_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row04_2 != null) {
            spinner_row04_2.setAdapter(adapter_row04_2);
        }


        /*
         * Reihe 05
         */

        final Spinner spinner_row05_1 = (Spinner) findViewById(R.id.spinner_row05_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row05_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row05_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row05_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row05_1 != null) {
            spinner_row05_1.setAdapter(adapter_row05_1);
        }

        final Spinner spinner_row05_2 = (Spinner) findViewById(R.id.spinner_row05_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row05_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row05_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row05_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row05_2 != null) {
            spinner_row05_2.setAdapter(adapter_row05_2);
        }


        /*
         * Reihe 06
         */

        final Spinner spinner_row06_1 = (Spinner) findViewById(R.id.spinner_row06_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row06_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row06_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row06_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row06_1 != null) {
            spinner_row06_1.setAdapter(adapter_row06_1);
        }

        final Spinner spinner_row06_2 = (Spinner) findViewById(R.id.spinner_row06_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row06_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row06_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row06_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row06_2 != null) {
            spinner_row06_2.setAdapter(adapter_row06_2);
        }


        /*
         * Reihe 07
         */

        final Spinner spinner_row07_1 = (Spinner) findViewById(R.id.spinner_row07_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row07_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row07_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row07_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row07_1 != null) {
            spinner_row07_1.setAdapter(adapter_row07_1);
        }

        final Spinner spinner_row07_2 = (Spinner) findViewById(R.id.spinner_row07_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row07_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row07_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row07_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row07_2 != null) {
            spinner_row07_2.setAdapter(adapter_row07_2);
        }


        /*
         * Reihe 08
         */

        final Spinner spinner_row08_1 = (Spinner) findViewById(R.id.spinner_row08_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row08_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row08_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row08_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row08_1 != null) {
            spinner_row08_1.setAdapter(adapter_row08_1);
        }

        final Spinner spinner_row08_2 = (Spinner) findViewById(R.id.spinner_row08_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row08_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row08_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row08_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row08_2 != null) {
            spinner_row08_2.setAdapter(adapter_row08_2);
        }


        /*
         * Reihe 10
         */

        final Spinner spinner_row10_1 = (Spinner) findViewById(R.id.spinner_row10_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row10_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row10_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row10_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row10_1 != null) {
            spinner_row10_1.setAdapter(adapter_row10_1);
        }

        final Spinner spinner_row10_2 = (Spinner) findViewById(R.id.spinner_row10_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row10_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row10_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row10_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row10_2 != null) {
            spinner_row10_2.setAdapter(adapter_row10_2);
        }


        /*
         * Reihe 11
         */

        final Spinner spinner_row11_1 = (Spinner) findViewById(R.id.spinner_row11_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row11_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row11_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row11_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row11_1 != null) {
            spinner_row11_1.setAdapter(adapter_row11_1);
        }

        final Spinner spinner_row11_2 = (Spinner) findViewById(R.id.spinner_row11_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row11_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row11_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row11_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row11_2 != null) {
            spinner_row11_2.setAdapter(adapter_row11_2);
        }


        /*
         * Reihe 13
         */

        final Spinner spinner_row13_1 = (Spinner) findViewById(R.id.spinner_row13_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row13_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row13_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row13_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row13_1 != null) {
            spinner_row13_1.setAdapter(adapter_row13_1);
        }

        final Spinner spinner_row13_2 = (Spinner) findViewById(R.id.spinner_row13_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row13_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row13_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row13_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row13_2 != null) {
            spinner_row13_2.setAdapter(adapter_row13_2);
        }


        /*
         * Reihe 14
         */

        final Spinner spinner_row14_1 = (Spinner) findViewById(R.id.spinner_row14_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row14_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row14_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row14_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row14_1 != null) {
            spinner_row14_1.setAdapter(adapter_row14_1);
        }

        final Spinner spinner_row14_2 = (Spinner) findViewById(R.id.spinner_row14_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row14_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row14_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row14_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row14_2 != null) {
            spinner_row14_2.setAdapter(adapter_row14_2);
        }


        /*
         * Reihe 15
         */

        final Spinner spinner_row15_1 = (Spinner) findViewById(R.id.spinner_row15_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row15_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row15_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row15_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row15_1 != null) {
            spinner_row15_1.setAdapter(adapter_row15_1);
        }

        final Spinner spinner_row15_2 = (Spinner) findViewById(R.id.spinner_row15_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row15_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row15_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row15_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row15_2 != null) {
            spinner_row15_2.setAdapter(adapter_row15_2);
        }


        /*
         * Reihe 16
         */

        final Spinner spinner_row16_1 = (Spinner) findViewById(R.id.spinner_row16_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row16_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row16_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row16_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row16_1 != null) {
            spinner_row16_1.setAdapter(adapter_row16_1);
        }

        final Spinner spinner_row16_2 = (Spinner) findViewById(R.id.spinner_row16_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row16_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row16_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row16_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row16_2 != null) {
            spinner_row16_2.setAdapter(adapter_row16_2);
        }


        /*
         * Reihe 17
         */

        final Spinner spinner_row17_1 = (Spinner) findViewById(R.id.spinner_row17_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row17_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row17_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row17_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row17_1 != null) {
            spinner_row17_1.setAdapter(adapter_row17_1);
        }

        final Spinner spinner_row17_2 = (Spinner) findViewById(R.id.spinner_row17_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row17_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row17_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row17_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row17_2 != null) {
            spinner_row17_2.setAdapter(adapter_row17_2);
        }


        /*
         * Reihe 18
         */

        final Spinner spinner_row18_1 = (Spinner) findViewById(R.id.spinner_row18_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row18_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row18_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row18_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row18_1 != null) {
            spinner_row18_1.setAdapter(adapter_row18_1);
        }

        final Spinner spinner_row18_2 = (Spinner) findViewById(R.id.spinner_row18_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row18_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row18_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row18_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row18_2 != null) {
            spinner_row18_2.setAdapter(adapter_row18_2);
        }


        /*
         * Reihe 19
         */

        final Spinner spinner_row19_1 = (Spinner) findViewById(R.id.spinner_row19_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row19_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row19_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row19_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row19_1 != null) {
            spinner_row19_1.setAdapter(adapter_row19_1);
        }

        final Spinner spinner_row19_2 = (Spinner) findViewById(R.id.spinner_row19_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row19_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row19_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row19_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row19_2 != null) {
            spinner_row19_2.setAdapter(adapter_row19_2);
        }


        /*
         * Reihe 20
         */

        final Spinner spinner_row20_1 = (Spinner) findViewById(R.id.spinner_row20_1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row20_1 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row20_1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row20_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row20_1 != null) {
            spinner_row20_1.setAdapter(adapter_row20_1);
        }

        final Spinner spinner_row20_2 = (Spinner) findViewById(R.id.spinner_row20_2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_row20_2 = ArrayAdapter.createFromResource(this,
                R.array.spinner_row20_2, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_row20_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        if (spinner_row20_2 != null) {
            spinner_row20_2.setAdapter(adapter_row20_2);
        }

        /*
         * Spinner laden
         */

        prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        if (spinner_row01_1 != null) {
            spinner_row01_1.setSelection(prefs.getInt("spinner01_1", 0));
        }
        if (spinner_row01_2 != null) {
            spinner_row01_2.setSelection(prefs.getInt("spinner01_2", 0));
        }

        if (spinner_row02_1 != null) {
            spinner_row02_1.setSelection(prefs.getInt("spinner02_1", 0));
        }
        if (spinner_row02_2 != null) {
            spinner_row02_2.setSelection(prefs.getInt("spinner02_2", 0));
        }

        if (spinner_row03_1 != null) {
            spinner_row03_1.setSelection(prefs.getInt("spinner03_1", 0));
        }
        if (spinner_row03_2 != null) {
            spinner_row03_2.setSelection(prefs.getInt("spinner03_2", 0));
        }

        if (spinner_row04_1 != null) {
            spinner_row04_1.setSelection(prefs.getInt("spinner04_1", 0));
        }
        if (spinner_row04_2 != null) {
            spinner_row04_2.setSelection(prefs.getInt("spinner04_2", 0));
        }

        if (spinner_row05_1 != null) {
            spinner_row05_1.setSelection(prefs.getInt("spinner05_1", 0));
        }
        if (spinner_row05_2 != null) {
            spinner_row05_2.setSelection(prefs.getInt("spinner05_2", 0));
        }

        if (spinner_row06_1 != null) {
            spinner_row06_1.setSelection(prefs.getInt("spinner06_1", 0));
        }
        if (spinner_row06_2 != null) {
            spinner_row06_2.setSelection(prefs.getInt("spinner06_2", 0));
        }

        if (spinner_row07_1 != null) {
            spinner_row07_1.setSelection(prefs.getInt("spinner07_1", 0));
        }
        if (spinner_row07_2 != null) {
            spinner_row07_2.setSelection(prefs.getInt("spinner07_2", 0));
        }

        if (spinner_row08_1 != null) {
            spinner_row08_1.setSelection(prefs.getInt("spinner08_1", 0));
        }
        if (spinner_row08_2 != null) {
            spinner_row08_2.setSelection(prefs.getInt("spinner08_2", 0));
        }

        if (spinner_row10_1 != null) {
            spinner_row10_1.setSelection(prefs.getInt("spinner10_1", 0));
        }
        if (spinner_row10_2 != null) {
            spinner_row10_2.setSelection(prefs.getInt("spinner10_2", 0));
        }

        if (spinner_row11_1 != null) {
            spinner_row11_1.setSelection(prefs.getInt("spinner11_1", 0));
        }
        if (spinner_row11_2 != null) {
            spinner_row11_2.setSelection(prefs.getInt("spinner11_2", 0));
        }

        if (spinner_row13_1 != null) {
            spinner_row13_1.setSelection(prefs.getInt("spinner13_1", 0));
        }
        if (spinner_row13_2 != null) {
            spinner_row13_2.setSelection(prefs.getInt("spinner13_2", 0));
        }

        if (spinner_row14_1 != null) {
            spinner_row14_1.setSelection(prefs.getInt("spinner14_1", 0));
        }
        if (spinner_row14_2 != null) {
            spinner_row14_2.setSelection(prefs.getInt("spinner14_2", 0));
        }

        if (spinner_row15_1 != null) {
            spinner_row15_1.setSelection(prefs.getInt("spinner15_1", 0));
        }
        if (spinner_row15_2 != null) {
            spinner_row15_2.setSelection(prefs.getInt("spinner15_2", 0));
        }

        if (spinner_row16_1 != null) {
            spinner_row16_1.setSelection(prefs.getInt("spinner16_1", 0));
        }
        if (spinner_row16_2 != null) {
            spinner_row16_2.setSelection(prefs.getInt("spinner16_2", 0));
        }

        if (spinner_row17_1 != null) {
            spinner_row17_1.setSelection(prefs.getInt("spinner17_1", 0));
        }
        if (spinner_row17_2 != null) {
            spinner_row17_2.setSelection(prefs.getInt("spinner17_2", 0));
        }

        if (spinner_row18_1 != null) {
            spinner_row18_1.setSelection(prefs.getInt("spinner18_1", 0));
        }
        if (spinner_row18_2 != null) {
            spinner_row18_2.setSelection(prefs.getInt("spinner18_2", 0));
        }

        if (spinner_row19_1 != null) {
            spinner_row19_1.setSelection(prefs.getInt("spinner19_1", 0));
        }
        if (spinner_row19_2 != null) {
            spinner_row19_2.setSelection(prefs.getInt("spinner19_2", 0));
        }

        if (spinner_row20_1 != null) {
            spinner_row20_1.setSelection(prefs.getInt("spinner20_1", 0));
        }
        if (spinner_row20_2 != null) {
            spinner_row20_2.setSelection(prefs.getInt("spinner20_2", 0));
        }


        /*
         * Spinner zuruecksetzen
         */

        Button button = (Button) findViewById(R.id.reset_button);

        if (button != null) {
            button.setOnClickListener(
                    new Button.OnClickListener() {
                        public void onClick(View v) {
                            if (spinner_row01_1 != null) {
                                spinner_row01_1.setSelection(0);
                            }
                            if (spinner_row01_2 != null) {
                                spinner_row01_2.setSelection(0);
                            }
                            if (spinner_row02_1 != null) {
                                spinner_row02_1.setSelection(0);
                            }
                            if (spinner_row02_2 != null) {
                                spinner_row02_2.setSelection(0);
                            }
                            if (spinner_row03_1 != null) {
                                spinner_row03_1.setSelection(0);
                            }
                            if (spinner_row03_2 != null) {
                                spinner_row03_2.setSelection(0);
                            }
                            if (spinner_row04_1 != null) {
                                spinner_row04_1.setSelection(0);
                            }
                            if (spinner_row04_2 != null) {
                                spinner_row04_2.setSelection(0);
                            }
                            if (spinner_row05_1 != null) {
                                spinner_row05_1.setSelection(0);
                            }
                            if (spinner_row05_2 != null) {
                                spinner_row05_2.setSelection(0);
                            }
                            if (spinner_row06_1 != null) {
                                spinner_row06_1.setSelection(0);
                            }
                            if (spinner_row06_2 != null) {
                                spinner_row06_2.setSelection(0);
                            }
                            if (spinner_row07_1 != null) {
                                spinner_row07_1.setSelection(0);
                            }
                            if (spinner_row07_2 != null) {
                                spinner_row07_2.setSelection(0);
                            }
                            if (spinner_row08_1 != null) {
                                spinner_row08_1.setSelection(0);
                            }
                            if (spinner_row08_2 != null) {
                                spinner_row08_2.setSelection(0);
                            }
                            if (spinner_row10_1 != null) {
                                spinner_row10_1.setSelection(0);
                            }
                            if (spinner_row10_2 != null) {
                                spinner_row10_2.setSelection(0);
                            }
                            if (spinner_row11_1 != null) {
                                spinner_row11_1.setSelection(0);
                            }
                            if (spinner_row11_2 != null) {
                                spinner_row11_2.setSelection(0);
                            }
                            if (spinner_row13_1 != null) {
                                spinner_row13_1.setSelection(0);
                            }
                            if (spinner_row13_2 != null) {
                                spinner_row13_2.setSelection(0);
                            }
                            if (spinner_row14_1 != null) {
                                spinner_row14_1.setSelection(0);
                            }
                            if (spinner_row14_2 != null) {
                                spinner_row14_2.setSelection(0);
                            }
                            if (spinner_row15_1 != null) {
                                spinner_row15_1.setSelection(0);
                            }
                            if (spinner_row15_2 != null) {
                                spinner_row15_2.setSelection(0);
                            }
                            if (spinner_row16_1 != null) {
                                spinner_row16_1.setSelection(0);
                            }
                            if (spinner_row16_2 != null) {
                                spinner_row16_2.setSelection(0);
                            }
                            if (spinner_row17_1 != null) {
                                spinner_row17_1.setSelection(0);
                            }
                            if (spinner_row17_2 != null) {
                                spinner_row17_2.setSelection(0);
                            }
                            if (spinner_row18_1 != null) {
                                spinner_row18_1.setSelection(0);
                            }
                            if (spinner_row18_2 != null) {
                                spinner_row18_2.setSelection(0);
                            }
                            if (spinner_row19_1 != null) {
                                spinner_row19_1.setSelection(0);
                            }
                            if (spinner_row19_2 != null) {
                                spinner_row19_2.setSelection(0);
                            }
                            if (spinner_row20_1 != null) {
                                spinner_row20_1.setSelection(0);
                            }
                            if (spinner_row20_2 != null) {
                                spinner_row20_2.setSelection(0);
                            }
                        }
                    }
            );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static final String PREFS_KEY = "AOP_PREFS_String";

    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = prefs.edit();

        editor.clear();

        Spinner spinner01_1 = (Spinner) findViewById(R.id.spinner_row01_1);
        if (spinner01_1 != null) {
            editor.putInt("spinner01_1", spinner01_1.getSelectedItemPosition());
        }
        Spinner spinner01_2 = (Spinner) findViewById(R.id.spinner_row01_2);
        if (spinner01_2 != null) {
            editor.putInt("spinner01_2", spinner01_2.getSelectedItemPosition());
        }

        Spinner spinner02_1 = (Spinner) findViewById(R.id.spinner_row02_1);
        if (spinner02_1 != null) {
            editor.putInt("spinner02_1", spinner02_1.getSelectedItemPosition());
        }
        Spinner spinner02_2 = (Spinner) findViewById(R.id.spinner_row02_2);
        if (spinner02_2 != null) {
            editor.putInt("spinner02_2", spinner02_2.getSelectedItemPosition());
        }

        Spinner spinner03_1 = (Spinner) findViewById(R.id.spinner_row03_1);
        if (spinner03_1 != null) {
            editor.putInt("spinner03_1", spinner03_1.getSelectedItemPosition());
        }
        Spinner spinner03_2 = (Spinner) findViewById(R.id.spinner_row03_2);
        if (spinner03_2 != null) {
            editor.putInt("spinner03_2", spinner03_2.getSelectedItemPosition());
        }

        Spinner spinner04_1 = (Spinner) findViewById(R.id.spinner_row04_1);
        if (spinner04_1 != null) {
            editor.putInt("spinner04_1", spinner04_1.getSelectedItemPosition());
        }
        Spinner spinner04_2 = (Spinner) findViewById(R.id.spinner_row04_2);
        if (spinner04_2 != null) {
            editor.putInt("spinner04_2", spinner04_2.getSelectedItemPosition());
        }

        Spinner spinner05_1 = (Spinner) findViewById(R.id.spinner_row05_1);
        if (spinner05_1 != null) {
            editor.putInt("spinner05_1", spinner05_1.getSelectedItemPosition());
        }
        Spinner spinner05_2 = (Spinner) findViewById(R.id.spinner_row05_2);
        if (spinner05_2 != null) {
            editor.putInt("spinner05_2", spinner05_2.getSelectedItemPosition());
        }

        Spinner spinner06_1 = (Spinner) findViewById(R.id.spinner_row06_1);
        if (spinner06_1 != null) {
            editor.putInt("spinner06_1", spinner06_1.getSelectedItemPosition());
        }
        Spinner spinner06_2 = (Spinner) findViewById(R.id.spinner_row06_2);
        if (spinner06_2 != null) {
            editor.putInt("spinner06_2", spinner06_2.getSelectedItemPosition());
        }

        Spinner spinner07_1 = (Spinner) findViewById(R.id.spinner_row07_1);
        if (spinner07_1 != null) {
            editor.putInt("spinner07_1", spinner07_1.getSelectedItemPosition());
        }
        Spinner spinner07_2 = (Spinner) findViewById(R.id.spinner_row07_2);
        if (spinner07_2 != null) {
            editor.putInt("spinner07_2", spinner07_2.getSelectedItemPosition());
        }

        Spinner spinner08_1 = (Spinner) findViewById(R.id.spinner_row08_1);
        if (spinner08_1 != null) {
            editor.putInt("spinner08_1", spinner08_1.getSelectedItemPosition());
        }
        Spinner spinner08_2 = (Spinner) findViewById(R.id.spinner_row08_2);
        if (spinner08_2 != null) {
            editor.putInt("spinner08_2", spinner08_2.getSelectedItemPosition());
        }

        Spinner spinner10_1 = (Spinner) findViewById(R.id.spinner_row10_1);
        if (spinner10_1 != null) {
            editor.putInt("spinner10_1", spinner10_1.getSelectedItemPosition());
        }
        Spinner spinner10_2 = (Spinner) findViewById(R.id.spinner_row10_2);
        if (spinner10_2 != null) {
            editor.putInt("spinner10_2", spinner10_2.getSelectedItemPosition());
        }

        Spinner spinner11_1 = (Spinner) findViewById(R.id.spinner_row11_1);
        if (spinner11_1 != null) {
            editor.putInt("spinner11_1", spinner11_1.getSelectedItemPosition());
        }
        Spinner spinner11_2 = (Spinner) findViewById(R.id.spinner_row11_2);
        if (spinner11_2 != null) {
            editor.putInt("spinner11_2", spinner11_2.getSelectedItemPosition());
        }

        Spinner spinner13_1 = (Spinner) findViewById(R.id.spinner_row13_1);
        if (spinner13_1 != null) {
            editor.putInt("spinner13_1", spinner13_1.getSelectedItemPosition());
        }
        Spinner spinner13_2 = (Spinner) findViewById(R.id.spinner_row13_2);
        if (spinner13_2 != null) {
            editor.putInt("spinner13_2", spinner13_2.getSelectedItemPosition());
        }

        Spinner spinner14_1 = (Spinner) findViewById(R.id.spinner_row14_1);
        if (spinner14_1 != null) {
            editor.putInt("spinner14_1", spinner14_1.getSelectedItemPosition());
        }
        Spinner spinner14_2 = (Spinner) findViewById(R.id.spinner_row14_2);
        if (spinner14_2 != null) {
            editor.putInt("spinner14_2", spinner14_2.getSelectedItemPosition());
        }

        Spinner spinner15_1 = (Spinner) findViewById(R.id.spinner_row15_1);
        if (spinner15_1 != null) {
            editor.putInt("spinner15_1", spinner15_1.getSelectedItemPosition());
        }
        Spinner spinner15_2 = (Spinner) findViewById(R.id.spinner_row15_2);
        if (spinner15_2 != null) {
            editor.putInt("spinner15_2", spinner15_2.getSelectedItemPosition());
        }

        Spinner spinner16_1 = (Spinner) findViewById(R.id.spinner_row16_1);
        if (spinner16_1 != null) {
            editor.putInt("spinner16_1", spinner16_1.getSelectedItemPosition());
        }
        Spinner spinner16_2 = (Spinner) findViewById(R.id.spinner_row16_2);
        if (spinner16_2 != null) {
            editor.putInt("spinner16_2", spinner16_2.getSelectedItemPosition());
        }

        Spinner spinner17_1 = (Spinner) findViewById(R.id.spinner_row17_1);
        if (spinner17_1 != null) {
            editor.putInt("spinner17_1", spinner17_1.getSelectedItemPosition());
        }
        Spinner spinner17_2 = (Spinner) findViewById(R.id.spinner_row17_2);
        if (spinner17_2 != null) {
            editor.putInt("spinner17_2", spinner17_2.getSelectedItemPosition());
        }

        Spinner spinner18_1 = (Spinner) findViewById(R.id.spinner_row18_1);
        if (spinner18_1 != null) {
            editor.putInt("spinner18_1", spinner18_1.getSelectedItemPosition());
        }
        Spinner spinner18_2 = (Spinner) findViewById(R.id.spinner_row18_2);
        if (spinner18_2 != null) {
            editor.putInt("spinner18_2", spinner18_2.getSelectedItemPosition());
        }

        Spinner spinner19_1 = (Spinner) findViewById(R.id.spinner_row19_1);
        if (spinner19_1 != null) {
            editor.putInt("spinner19_1", spinner19_1.getSelectedItemPosition());
        }
        Spinner spinner19_2 = (Spinner) findViewById(R.id.spinner_row19_2);
        if (spinner19_2 != null) {
            editor.putInt("spinner19_2", spinner19_2.getSelectedItemPosition());
        }

        Spinner spinner20_1 = (Spinner) findViewById(R.id.spinner_row20_1);
        if (spinner20_1 != null) {
            editor.putInt("spinner20_1", spinner20_1.getSelectedItemPosition());
        }
        Spinner spinner20_2 = (Spinner) findViewById(R.id.spinner_row20_2);
        if (spinner20_2 != null) {
            editor.putInt("spinner20_2", spinner20_2.getSelectedItemPosition());
        }

        editor.apply();


    }

}
