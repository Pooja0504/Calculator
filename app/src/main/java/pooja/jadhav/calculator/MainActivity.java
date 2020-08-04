package pooja.jadhav.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    long input1 = 0, input2 = 0,res;
    boolean Add, Sub, Mul, Div, Rem;
    Button one, two, three, four, five, six, seven, eight, nine, zero, double_zero, decimal1, mul, div, minus, plus, per, equal, clr, braces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        one = findViewById(R.id.b1);
        two = findViewById(R.id.b2);
        three = findViewById(R.id.b3);
        four = findViewById(R.id.b4);
        five = findViewById(R.id.b5);
        six = findViewById(R.id.b6);
        seven = findViewById(R.id.b7);
        eight = findViewById(R.id.b8);
        nine = findViewById(R.id.b9);
        zero = findViewById(R.id.zero);
        double_zero = findViewById(R.id.dzero);
        decimal1 = findViewById(R.id.dec);
        per = findViewById(R.id.bper);
        plus = findViewById(R.id.bplus);
        minus = findViewById(R.id.bmin);
        mul = findViewById(R.id.bmul);
        div = findViewById(R.id.bdiv);
        clr = findViewById(R.id.bclr);
        braces = findViewById(R.id.bbrc);
        equal = findViewById(R.id.beql);
        edt1 = findViewById(R.id.ed1);

     one.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        edt1.setText(edt1.getText() + "1");
    }
    });

        two.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "2");
    }
    });

        three.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "3");
    }
    });

        four.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "4");
    }
    });

        five.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "5");
    }
    });

        six.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "6");
    }
    });

        seven.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "7");
    }
    });

        eight.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "8");
    }
    });

        nine.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "9");
    }
    });

        zero.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        edt1.setText(edt1.getText() + "0");
    }
    });
        decimal1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                edt1.setText(edt1.getText() + ".");
            }
        });
        double_zero.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                edt1.setText(edt1.getText() + "00");
            }
        });

        plus.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (edt1.getText().length() != 0) {

            input1 =Integer.parseInt(edt1.getText() + "");
            Add = true;
            edt1.setText(null);
        } else {
            edt1.setText("ERROR");
        }
    }
    });

        minus.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (edt1.getText().length() != 0) {
            input1 = Integer.parseInt(edt1.getText() + "");
            Sub = true;
            edt1.setText(null);
        } else {
            edt1.setText("ERROR");


        }
    }
    });

        mul.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (edt1.getText().length() != 0) {
            input1 = Integer.parseInt(edt1.getText() + "");
            Mul = true;
            edt1.setText(null);
        } else {
            edt1.setText("ERROR");


        }
    }
    });

        div.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (edt1.getText().length() != 0) {
            input1 =Integer.parseInt(edt1.getText() + "");
            Div = true;
            edt1.setText(null);
        } else {
            edt1.setText("ERROR");


        }
    }
    });

        per.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (edt1.getText().length() != 0) {
            input1 =Integer.parseInt(edt1.getText() + "");
            Rem = true;
            edt1.setText(null);
        } else {
            edt1.setText("ERROR");


        }
    }
    });

        equal.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        if (Add || Sub || Mul || Div ||Rem) {
            input2 = Integer.parseInt(edt1.getText() + "");
        }
        if (Add) {
            edt1.setText(input1 +" + "+ input2 + "\n" + (input1 + input2) + "\n");
            Add = false;
        }
        if (Sub) {
            edt1.setText(input1 +" - "+ input2 + "\n" + (input1 - input2) + "\n");
            Sub = false;
        }
        if (Mul) {
            edt1.setText(input1 +" * "+ input2 + "\n" + (input1 * input2) + "\n");
            Mul= false;
        }
        if (Div) {
            if(input2!=0) {
                edt1.setText(input1 + " / " + input2 + "\n" + (input1 / input2) + "\n");
                Div = false;
            }
            else{
                edt1.setText(input1 + " / " + input2 + "\n" +"Can't divide by zero");
            }
        }
        if (Rem) {
            edt1.setText(input1 +" % "+ input2 + "\n" + (input1 % input2) + "\n");
            Rem = false;
        }
    }
    });

        clr.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        edt1.setText("");
        input1 = 0;
        input2 = 0;
    }
    });

    }



}