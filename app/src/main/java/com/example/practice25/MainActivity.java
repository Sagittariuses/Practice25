package com.example.practice25;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;
    int chek = 0;
    int fin = 0;
    String Num1 = "";
    String Num2 = "";
    String View = "";

    Button btnAdd;
    Button btnSub;
    Button btnDiv;
    Button btnMult;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPoint;
    Button btnPercent;
    Button btnRes;
    Button btnClear;
    Button btnDelLast;

    TextView tvResult;

    char action = ' ';

    private Object MenuItem ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // находимэлементы
        /*etNum1 = (EditText) findViewById(R.id.editTextTextPersonName);
        etNum2 = (EditText) findViewById(R.id.editTextTextPersonName2);*/

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnRes = (Button) findViewById(R.id.btnRes);
        btnClear = (Button) findViewById(R.id.btnDelLast);
        btnDelLast = (Button) findViewById(R.id.btnDelLast);
        tvResult = (TextView) findViewById(R.id.tvResult);

        // прописываемобработчик
        btnMult.setOnClickListener(this::onClick);
        btnDiv.setOnClickListener(this::onClick);
        btnAdd.setOnClickListener(this::onClick);
        btnSub.setOnClickListener(this::onClick);
        btn0.setOnClickListener(this::onClick);
        btn1.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);
        btn4.setOnClickListener(this::onClick);
        btn5.setOnClickListener(this::onClick);
        btn6.setOnClickListener(this::onClick);
        btn7.setOnClickListener(this::onClick);
        btn8.setOnClickListener(this::onClick);
        btn9.setOnClickListener(this::onClick);
        btnPoint.setOnClickListener(this::onClick);
        btnPercent.setOnClickListener(this::onClick);
        btnRes.setOnClickListener(this::onClick);
        btnClear.setOnClickListener(this::onClick);
        btnDelLast.setOnClickListener(this::onClick);
    }

    // созданиеменю
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }*/

    // обработканажатийнапунктыменю
    /*public boolean onOptionsItemSelected(android.view.MenuItem item, MainActivity Super) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:
                // очищаемполя
                *//*etNum1.setText("");
                etNum2.setText("");*//*
                tvResult.setText("");
                break;
            default:
                // выход из приложения
                finish();
                break;
        }
        return Super.onOptionsItemSelected(item);
    }*/

    // формируемстрокувывода

    private void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        if (fin != 0)
        {
            View = " ";
            Num1 = " ";
            Num2 = " ";
            num1 = 0;
            num2 = 0;
            chek = 0;
            action = ' ';
            tvResult.setText(View);
            fin = 0;

        }
        // Проверяем поля на пустоту
/*        if (TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }*/

        // читаем EditText и заполняем переменные числами
        /*num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());*/

        // определяем нажатую кнопку и выполняем соответствующую операцию
        // в oper пишем операцию, потом будем использовать в выводе
        if (chek == 0)
        {
            switch (v.getId()) {
                case R.id.btnAdd:
                    action = '+';
                    View = View + action;
                    tvResult.setText(View);
                    chek++;

                    break;
                case R.id.btnSub:
                    action = '-';
                    View = View + action;
                    tvResult.setText(View);
                    chek++;
                    break;
                case R.id.btnMult:
                    action = '*';
                    View = View + action;
                    tvResult.setText(View);
                    chek++;
                    break;
                case R.id.btnDiv:
                    action = '/';
                    View = View + action;
                    tvResult.setText(View);
                    chek++;
                    break;
                case R.id.btn1:
                    Num1 = Num1 + '1';
                    View = View + '1';
                    tvResult.setText(View);
                    break;
                case R.id.btn2:
                    Num1 = Num1 + '2';
                    View = View + '2';
                    tvResult.setText(View);
                    break;
                case R.id.btn3:
                    Num1 = Num1 + '3';
                    View = View + '3';
                    tvResult.setText(View);
                    break;
                case R.id.btn4:
                    Num1 = Num1 + '4';
                    View = View + '4';
                    tvResult.setText(View);
                    break;
                case R.id.btn5:
                    Num1 = Num1 + '5';
                    View = View + '5';
                    tvResult.setText(View);
                    break;
                case R.id.btn6:
                    Num1 = Num1 + '6';
                    View = View + '6';
                    tvResult.setText(View);
                    break;
                case R.id.btn7:
                    Num1 = Num1 + '7';
                    View = View + '7';
                    tvResult.setText(View);
                    break;
                case R.id.btn8:
                    Num1 = Num1 + '8';
                    View = View + '8';
                    tvResult.setText(View);
                    break;
                case R.id.btn9:
                    Num1 = Num1 + '9';
                    View = View + '9';
                    tvResult.setText(View);
                    break;
                case R.id.btnPoint:
                    Num1 = Num1 + '.';
                    View = View + '.';
                    tvResult.setText(View);
                    break;
                case R.id.btnClear:
                    Num1 = " ";
                    Num2 = " ";
                    num1 = 0;
                    num2 = 0;
                    chek = 0;
                    View = " ";
                    action = ' ';
                    tvResult.setText(View);
                    break;
                case R.id.btnDelLast:
                    if (Num1 != "")
                    {
                        View = View.substring(0,View.length()-1);
                        Num1 = Num1.substring(0,Num1.length()-1);
                        tvResult.setText(View);
                    }
                    break;
                default:
                    break;
            }
        }
        if (v.getId() == R.id.btnPercent){
            View = View + '%' + '=';
            if (Num1 != " "){
                num1 = Float.parseFloat(Num1);
                result = num1/100;
            }
            View = View + result;
            tvResult.setText(View);
            fin++;
        }
        if (chek > 0)
        {
            switch (v.getId()) {
                case R.id.btn0:
                    Num2 = Num2 + '0';
                    View = View + '0';
                    tvResult.setText(View);
                    break;
                case R.id.btn1:
                    Num2 = Num2 + '1';
                    View = View + '1';
                    tvResult.setText(View);
                    break;
                case R.id.btn2:
                    Num2 = Num2 + '2';
                    View = View + '2';
                    tvResult.setText(View);
                    break;
                case R.id.btn3:
                    Num2 = Num2 + '3';
                    View = View + '3';
                    tvResult.setText(View);
                    break;
                case R.id.btn4:
                    Num2 = Num2 + '4';
                    View = View + '4';
                    tvResult.setText(View);
                    break;
                case R.id.btn5:
                    Num2 = Num2 + '5';
                    View = View + '5';
                    tvResult.setText(View);
                    break;
                case R.id.btn6:
                    Num2 = Num2 + '6';
                    View = View + '6';
                    tvResult.setText(View);
                    break;
                case R.id.btn7:
                    Num2 = Num2 + '7';
                    View = View + '7';
                    tvResult.setText(View);
                    break;
                case R.id.btn8:
                    Num2 = Num2 + '8';
                    View = View + '8';
                    tvResult.setText(View);
                    break;
                case R.id.btn9:
                    Num2 = Num2 + '9';
                    View = View + '9';
                    tvResult.setText(View);
                    break;
                case R.id.btnPoint:
                    Num2 = Num2 + '.';
                    View = View + '.';
                    tvResult.setText(View);
                    break;
                case R.id.btnClear:
                    Num1 = " ";
                    Num2 = " ";
                    num1 = 0;
                    num2 = 0;
                    chek = 0;
                    View = " ";
                    action = ' ';
                    tvResult.setText(View);
                    break;
                case  R.id.btnDelLast:
                    View = View.substring(0,View.length()-1);
                    if (Num2 != "")
                    {
                        Num2 = Num2.substring(0,Num2.length()-1);
                        tvResult.setText(View);
                    }
                    break;
                default:
                    break;
            }
        }
        if(v.getId() == R.id.btnRes)
        {
            if (Num1 != " " && Num2 != " ")
            {
                num1 = Float.parseFloat(Num1);
                num2 = Float.parseFloat(Num2);
                if (action == '+'){
                    result = num1 + num2;
                } if (action == '-'){
                    result = num1 - num2;
                } if (action == '*'){
                    result = num1 * num2;
                } if (action == '/'){
                    result = num1 / num2;
                }
                    View = View + '=' + result;
                    tvResult.setText(View);
                    fin++;
                }
            }





        /*tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);*/
    }

}
// Контрольные вопросы //
/*
Toast - системное всплывающее (снизу) уведоление.
*/