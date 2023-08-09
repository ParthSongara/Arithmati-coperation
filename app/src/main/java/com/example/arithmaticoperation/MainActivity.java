package com.example.arithmaticoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Subtract,Multiplication,Division,Addition;
    EditText edit1,edit2;
    TextView textView;
    float n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition=findViewById(R.id.add);
        Subtract=findViewById(R.id.sub);
        Multiplication=findViewById(R.id.mul);
        Division=findViewById(R.id.div);
        edit1=findViewById(R.id.e1);
        edit2=findViewById(R.id.e2);
        textView=findViewById(R.id.ans);

        Addition.setOnClickListener(this);
        Multiplication.setOnClickListener(this);
        Subtract.setOnClickListener(this);
        Division.setOnClickListener(this);
    }
public int getIntFormEditText(EditText editText ){
    if (editText.getText().toString().equals(""))
    {
        Toast.makeText(this,"Enter Number",Toast.LENGTH_SHORT).show();
   return 0;
    }
    else {
        return Integer.parseInt(editText.getText().toString());
    }
}
    @Override
    public void onClick(View view) {
        n1=getIntFormEditText(edit1);
        n2=getIntFormEditText(edit2);
        switch (view.getId()){
            case R.id.add:
                textView.setText(""+((float) n1+(float) n2));
                Toast.makeText(this,"Addition is  " + textView.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.sub:
                textView.setText(""+((float) n1-(float) n2));
                Toast.makeText(this,"Subtraction is  " + textView.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.mul:
                textView.setText(""+((float) n1*(float) n2));
                Toast.makeText(this,"Multiplication is  " + textView.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.div:
                textView.setText(""+((float) n1/(float) n2));
                Toast.makeText(this,"Division is  " + textView.getText().toString(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}