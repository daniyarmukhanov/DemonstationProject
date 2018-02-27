package kz.method.demonstationproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    EditText usernameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pressButton = findViewById(R.id.press_button);
        usernameEditText = findViewById(R.id.username_et);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "";
                username = usernameEditText.getText().toString();
                Toast.makeText(MainActivity.this, getString(R.string.your_name_is) + username, Toast.LENGTH_LONG).show();
            }
        });
    }
}
