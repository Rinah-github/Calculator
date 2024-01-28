package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

 public Button btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnclr,btnsub,btnadd,btnmulti,btndiv,btnpercent,btnequal,btnminus,btndecimal;


public TextView answer, hidden, charr, main;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button13);
        btn2=findViewById(R.id.button16);
        btn3=findViewById(R.id.button15);
        btn4=findViewById(R.id.button9);
        btn5=findViewById(R.id.button10);
        btn6=findViewById(R.id.button11);
        btn7=findViewById(R.id.button5);
        btn8=findViewById(R.id.button6);
        btn9=findViewById(R.id.button7);
        btn0=findViewById(R.id.button17);
        btndecimal=findViewById(R.id.button18);
        btnequal=findViewById(R.id.button19);
        btnsub=findViewById(R.id.button14);
        btnadd=findViewById(R.id.button12);
        btnequal=findViewById(R.id.button19);
        btnmulti=findViewById(R.id.button8);
        btndiv=findViewById(R.id.button4);
        btnpercent=findViewById(R.id.button3);
        btnminus=findViewById(R.id.button2);
        btnclr=findViewById(R.id.button);
       answer=findViewById(R.id.textView2);
       hidden = findViewById(R.id.hidden);
        charr = findViewById(R.id.charr);
        main = findViewById(R.id.main);

        int num1;
        int num2 = 0;
        int answered = 0;




       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String snum1 = answer.getText().toString();
               String sset_t = "1";
              // num1 = Integer.parseInt(snum1);
               snum1 += sset_t;
               answer.setText(snum1);

           }
       });

       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            String snum1 = answer.getText().toString();
            String sset_o = "2";
           // num1 = Integer.parseInt(snum1);
            snum1 += sset_o;
            answer.setText(snum1);

           }
       });

       btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String snum1 = answer.getText().toString();
               String sset ="3";
               snum1 += sset;
               answer.setText(snum1);

           }
       });

       btn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String snum1 = answer.getText().toString();
               String set ="4";
               snum1 += set;
               answer.setText(snum1);

           }
       });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String five ="5";
                snum1 += five;
                answer.setText(snum1);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set ="6";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set ="7";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set ="8";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set ="9";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set ="0";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                String set =".";
                snum1 += set;
                answer.setText(snum1);

            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                if(answer.getText() != ""){
                    hidden.setText(snum1);
                    charr.setText("-");
                    answer.setText("");
                }
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                if (answer.getText() !=""){
                    hidden.setText(snum1);
                    charr.setText("x");
                    answer.setText("");
                }
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 = answer.getText().toString();
                if (answer.getText() !=""){
                    hidden.setText(snum1);
                    charr.setText("+");
                    answer.setText("");
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 =answer.getText().toString();
                if (answer.getText() !=""){
                    hidden.setText(snum1);
                    charr.setText("/");
                    answer.setText("");
                }
            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum1 =answer.getText().toString();
                if (answer.getText() !=""){
                    hidden.setText(snum1);
                    charr.setText("%");
                    answer.setText("");
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText("");
                hidden.setText("");
                charr.setText("");
                main.setText("");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setText(answer.getText());
                calculator();
            }
        });


    }

    public void calculator(){
//        hidden.setText(answer.getText().toString());
//        charr.setText(answer.getText().toString());
        int num1 = Integer.parseInt(hidden.getText().toString());
        int num2 =Integer.parseInt(answer.getText().toString());
        String operator = charr.getText().toString();
        float operation = 0;
        if(operator == "+"){
            operation = num1 + num2;
            String string_answer = String.valueOf(operation);
            answer.setText(string_answer);

        } else if (operator=="-") {
            operation= num1 - num2;
            String string_answer= String.valueOf(operation);
            answer.setText(string_answer);

        } else if (operator=="x") {
            operation= num1 * num2;
            String string_answer= String.valueOf(operation);
            answer.setText(string_answer);

        } else if (operator=="/") {
            operation= num1 / num2;
            String string_answer= String.valueOf(operation);
            answer.setText(string_answer);
        } else if (operator=="%") {
            operation= num1 % num2;
            String string_answer= String.valueOf(operation);
            answer.setText(string_answer);
        }

    }

}