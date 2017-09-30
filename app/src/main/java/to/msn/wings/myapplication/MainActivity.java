package to.msn.wings.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;
    float value1;
    float value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonSum.setOnClickListener(this);

        Button buttonMin = (Button) findViewById(R.id.buttonMin);
        buttonMin.setOnClickListener(this);

        Button buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonMul.setOnClickListener(this);

        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        String mEditText1 = editText1.getText().toString();
        String mEditText2 = editText2.getText().toString();

        value1 = Float.parseFloat(mEditText1);
        value2 = Float.parseFloat(mEditText2);

        float calc = 0;
        if (v.getId()==R.id.buttonSum){
            calc = value1 + value2;
        } else if (v.getId()==R.id.buttonMin){
            calc = value1 - value2;
        } else if (v.getId()==R.id.buttonMul){
            calc = value1 * value2;
        } else if (v.getId()==R.id.buttonDiv) {
            calc = value1 / value2;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Result", calc);
        startActivity(intent);
    }
}
