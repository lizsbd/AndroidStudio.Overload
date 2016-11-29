package com.example.qnd238.overload;

        import android.content.Context;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.qnd238.overload.Calculator;
        import java.util.ArrayList;

public class Main extends AppCompatActivity {
    TextView header, header1;
    EditText input, integer;
    Button sum, average, fatorial, product, add;
    ArrayList<Double> doubledata = new ArrayList<>();
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        header = (TextView) findViewById(R.id.header);
        header1 = (TextView) findViewById(R.id.header1);

        input = (EditText) findViewById(R.id.input);
        integer = (EditText) findViewById(R.id.integer);

        sum = (Button) findViewById(R.id.sum);
        add = (Button) findViewById(R.id.add);
        average = (Button) findViewById(R.id.average);
        product = (Button) findViewById(R.id.product);
        fatorial = (Button) findViewById(R.id.fatorial);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = input.getText().toString();
                if(data.trim().length() >0){
                    doubledata.add(Double.parseDouble(data));

                }

                }

        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text ="The sum is of first 2 number is  " + Calculator.sum(doubledata.);;
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text , duration);
                toast.show();




                }
            }
        });
    }
}
