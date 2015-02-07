package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extra = getIntent().getExtras();
        String value = extra.getString("yourKey");
        TextView text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(value);
    }



    @Override
    public void finish() {

        // TODO 1 create new Intent
        Intent data = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText text = (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String value = text.getText().toString();

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        data.putExtra("returnKey", value);
        setResult(RESULT_OK, data);

        super.finish();
    }

}