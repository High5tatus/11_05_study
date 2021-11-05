package com.example.a11_05_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.ch05_01);
        //setContentView(R.layout.ch05_02);
        //setContentView(R.layout.ch05_03);
        //setContentView(R.layout.ch05_04);
        //setContentView(R.layout.ch05_04_1);
//        setContentView(R.layout.ch05_05);
        //setContentView(R.layout.ch05_06);
//        setContentView(R.layout.ch05_07);
        //setContentView(R.layout.ch05_07_1);
        //setContentView(R.layout.ch05_18);
        setContentView(R.layout.ch05_19);

/*
        //ch05_08
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

        //ch05_09
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"코드로 생성한 버튼입니다.",Toast.LENGTH_SHORT).show();

            }
        });
*/

        //계산기~~
        /*
        setContentView(R.layout.ch05_14_cal);
        EditText et1, et2;
        Button btnAdd, btnSub, btnMul, btnDiv, btnRe;
//        Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
        Button[] numButtons = new Button[10];
        Integer[] numBtnIDs = {R.id.btnNum0, R.id.btnNum1, R.id.btnNum2, R.id.btnNum3, R.id.btnNum4, R.id.btnNum5, R.id.btnNum6, R.id.btnNum7, R.id.btnNum8, R.id.btnNum9};
        int i;
        TextView tv1, tv2;

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnRe = (Button) findViewById(R.id.btnRe);
//        btn0 = (Button) findViewById(R.id.btnNum0);
//        btn1 = (Button) findViewById(R.id.btnNum1);
//        btn2 = (Button) findViewById(R.id.btnNum2);
//        btn3 = (Button) findViewById(R.id.btnNum3);
//        btn4 = (Button) findViewById(R.id.btnNum4);
//        btn5 = (Button) findViewById(R.id.btnNum5);
//        btn6 = (Button) findViewById(R.id.btnNum6);
//        btn7 = (Button) findViewById(R.id.btnNum7);
//        btn8 = (Button) findViewById(R.id.btnNum8);
//        btn9 = (Button) findViewById(R.id.btnNum9);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);

        //포커스 활성화화
        et1.requestFocus();

        et1.setInputType(0); //키보드 오프
        et2.setInputType(0); //키보드 오프



        //숫자키 작동 부분
        for (i = 0; i < numBtnIDs.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        for(i = 0; i < numBtnIDs.length ; i++){
            final  int index; //주의!! 꼭 해야함
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(et1.isFocused() == true){
                        String num1 = et1.getText().toString() + numButtons[index].getText().toString();
                        et1.setText(num1);;
                    } else if(et2.isFocused() == true){
                        String num2 = et2.getText().toString() + numButtons[index].getText().toString();
                        et2.setText(num2);;
                    }
                }
            });
        }


         //무식한 방법

//        btn0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "0";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "0";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "1";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "1";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "2";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "2";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "3";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "3";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "4";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "4";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "5";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "5";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "6";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "6";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "7";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "7";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "8";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "8";
//                    et2.setText(num);
//                }
//            }
//        });
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(et1.hasFocus()==true){
//                    String num = et1.getText().toString();
//                    num += "9";
//                    et1.setText(num);
//                }else if(et2.hasFocus()==true){
//                    String num = et2.getText().toString();
//                    num += "9";
//                    et2.setText(num);
//                }
//            }
//        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Double result = Double.parseDouble(num1)
                            + Double.parseDouble(num2);
                    tv1.setText("계산 결과 : " + result.toString());
                    tv2.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Double result = Double.parseDouble(num1)
                            - Double.parseDouble(num2);
                    tv1.setText("계산 결과 : " + result.toString());
                    tv2.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Double result = Double.parseDouble(num1)
                            * Double.parseDouble(num2);
                    tv1.setText("계산 결과 : " + result.toString());
                    tv2.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = et1.getText().toString();
                String num2 = et2.getText().toString();
                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Double result = Double.parseDouble(num1)
                            / Double.parseDouble(num2);
                    Double result2 = Double.parseDouble(num1)
                            % Double.parseDouble(num2);
                    tv1.setText("계산 결과 : " + result.toString());
                    tv2.setText("나머지 : " + result2.toString());
                }
            }
        });

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    et1.setText("");
                    et2.setText("");
                    tv1.setText("");
                    tv2.setText("");
            }
        });
         */


    }
}