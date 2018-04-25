package aneto.com.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnGenerate;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGenerate = findViewById(R.id.generateButtonId);

        resultText = findViewById(R.id.resultId);


        btnGenerate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int number = random.nextInt(10);

                resultText.setText("Número gerado: " + number);
            }
        });

    }
}
