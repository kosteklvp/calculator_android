package pl.kosteklvp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final EditText editText = findViewById(R.id.editText);
    final Button button = findViewById(R.id.button1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText.setKeyListener(null);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
    }

    private void addActionListeners() {

    }

}
