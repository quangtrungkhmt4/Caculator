package com.example.admin.caculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvBang,tvCong,tvTru,tvNhan,tvChia, tvCan, tv1ChiaX, tvMu, tvPhanTram;
    private Button btnPhanTram, btnMu, btnCan, btnChia, btn7
            ,btn8, btn9, btnNhan, btnC, btn4, btn5, btn6, btnTru, btnAC
            ,btn1, btn2, btn3, btnCong, btn0, btn00, btnPhay, btnBang, btnMoNgoac, btnDongNgoac;

    private EditText edtDisplay;

    private boolean isCong = false,isTru = false,isNhan = false,isChia = false
            , isCan = false, is1ChiaX = false, isMu = false, isPhanTram = false;

    private String numberToLeftOfOperator = "";
    private String numberToRightOfOperator = "";
    private String resultPreOperator = "null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();
        initViews();
        clickEvent();
    }

    private void findId() {
        edtDisplay = findViewById(R.id.edtHienThi);

        tvBang = findViewById(R.id.tvBang);
        tvCong = findViewById(R.id.tvCong);
        tvTru = findViewById(R.id.tvTru);
        tvNhan = findViewById(R.id.tvNhan);
        tvChia = findViewById(R.id.tvChia);
        tvCan = findViewById(R.id.tvCan);
        tv1ChiaX = findViewById(R.id.tv1ChiaX);
        tvMu = findViewById(R.id.tvMu);
        tvPhanTram = findViewById(R.id.tvPhanTram);

        btnPhanTram = findViewById(R.id.btnPhanTram);
        btnMu = findViewById(R.id.btnMu);
        btnMoNgoac = findViewById(R.id.btnMoNgoac);
        btnDongNgoac = findViewById(R.id.btnDongNgoac);
        btnCan = findViewById(R.id.btnCan);
        btnChia = findViewById(R.id.btnChia);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnNhan = findViewById(R.id.btnNhan);
        btnC = findViewById(R.id.btnC);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnTru = findViewById(R.id.btnTru);
        btnAC = findViewById(R.id.btnAC);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnCong = findViewById(R.id.btnCong);
        btn0 = findViewById(R.id.btn0);
        btn00 = findViewById(R.id.btn00);
        btnPhay = findViewById(R.id.btnPhay);
        btnBang = findViewById(R.id.btnBang);
    }

    private void initViews() {
        tvBang.setVisibility(View.INVISIBLE);
        tvCong.setVisibility(View.INVISIBLE);
        tvTru.setVisibility(View.INVISIBLE);
        tvNhan.setVisibility(View.INVISIBLE);
        tvChia.setVisibility(View.INVISIBLE);
        tvCan.setVisibility(View.INVISIBLE);
        tv1ChiaX.setVisibility(View.INVISIBLE);
        tvMu.setVisibility(View.INVISIBLE);
        tvPhanTram.setVisibility(View.INVISIBLE);
    }

    private void clickEvent() {
        btnPhanTram.setOnClickListener(this);
        btnMu.setOnClickListener(this);
        btnMoNgoac.setOnClickListener(this);
        btnDongNgoac.setOnClickListener(this);
        btnCan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn00.setOnClickListener(this);
        btnPhay.setOnClickListener(this);
        btnBang.setOnClickListener(this);
    }

    private void reset(){
        if (!resultPreOperator.equalsIgnoreCase("null")){
            deleteAllString();
            numberToLeftOfOperator = "";
            numberToRightOfOperator = "";
            resultPreOperator = "null";
            tvBang.setVisibility(View.INVISIBLE);
            tvCong.setVisibility(View.INVISIBLE);
            tvTru.setVisibility(View.INVISIBLE);
            tvNhan.setVisibility(View.INVISIBLE);
            tvChia.setVisibility(View.INVISIBLE);
            tvCan.setVisibility(View.INVISIBLE);
            tv1ChiaX.setVisibility(View.INVISIBLE);
            tvMu.setVisibility(View.INVISIBLE);
            tvPhanTram.setVisibility(View.INVISIBLE);
            isCong = false;
            isTru = false;
            isNhan = false;
            isChia = false;
            isPhanTram = false;
            isCan = false;
            isMu = false;
            is1ChiaX = false;
        }
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn00:
                reset();
                addTextIntoEdtDisplay("00");
                break;
            case R.id.btn0:
                reset();
                addTextIntoEdtDisplay("0");
                break;
            case R.id.btn1:
                reset();
                addTextIntoEdtDisplay("1");
                break;
            case R.id.btn2:
                reset();
                addTextIntoEdtDisplay("2");
                break;
            case R.id.btn3:
                reset();
                addTextIntoEdtDisplay("3");
                break;
            case R.id.btn4:
                reset();
                addTextIntoEdtDisplay("4");
                break;
            case R.id.btn5:
                reset();
                addTextIntoEdtDisplay("5");
                break;
            case R.id.btn6:
                reset();
                addTextIntoEdtDisplay("6");
                break;
            case R.id.btn7:
                reset();
                addTextIntoEdtDisplay("7");
                break;
            case R.id.btn8:
                reset();
                addTextIntoEdtDisplay("8");
                break;
            case R.id.btn9:
                reset();
                addTextIntoEdtDisplay("9");
                break;
            case R.id.btnCong:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("+");
                break;
            case R.id.btnTru:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("-");
                break;
            case R.id.btnNhan:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("*");
                break;
            case R.id.btnChia:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("/");
                break;
            case R.id.btnPhanTram:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("%");
                break;
            case R.id.btnMu:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("^");
                break;
            case R.id.btnCan:
                if (!resultPreOperator.equalsIgnoreCase("null")){
                    numberToLeftOfOperator = resultPreOperator;
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                }
                checkOperator("u221a");
                break;
            case R.id.btnPhay:
                reset();
                addTextIntoEdtDisplay(".");
                break;
            case R.id.btnBang:
                if (!numberToLeftOfOperator.equalsIgnoreCase("")
                        && numberToRightOfOperator.equalsIgnoreCase("")){
                    numberToRightOfOperator = edtDisplay.getText().toString();
                    if (!numberToRightOfOperator.equalsIgnoreCase("")){
                        String[] arr = numberToRightOfOperator.split("\\.");
                        if (arr.length > 2){
                            edtDisplay.setText("Syntax Error");
                            return;
                        }
                    }
                }


                if (!numberToLeftOfOperator.equalsIgnoreCase("")
                        && !numberToRightOfOperator.equalsIgnoreCase("")){
                    double no1 = Double.parseDouble(numberToLeftOfOperator);
                    double no2 = Double.parseDouble(numberToRightOfOperator);

                    if (isCong) edtDisplay.setText("" + (no1+no2));
                    else if (isTru) edtDisplay.setText("" + (no1-no2));
                    else if (isNhan) edtDisplay.setText("" + (no1*no2));
                    else if (isChia) edtDisplay.setText("" + (no1/no2));
                    else if (isMu) edtDisplay.setText("" + (Math.pow(no1,no2)));

                    resultPreOperator = edtDisplay.getText().toString();

                    tvBang.setVisibility(View.VISIBLE);
                    tvCong.setVisibility(View.INVISIBLE);
                    tvTru.setVisibility(View.INVISIBLE);
                    tvNhan.setVisibility(View.INVISIBLE);
                    tvChia.setVisibility(View.INVISIBLE);
                    tvCan.setVisibility(View.INVISIBLE);
                    tv1ChiaX.setVisibility(View.INVISIBLE);
                    tvMu.setVisibility(View.INVISIBLE);
                    tvPhanTram.setVisibility(View.INVISIBLE);
                    isCong = false;
                    isTru = false;
                    isNhan = false;
                    isChia = false;
                    isPhanTram = false;
                    isCan = false;
                    isMu = false;
                    is1ChiaX = false;
                }
                break;
            case R.id.btnAC:
                    deleteAllString();
                    numberToLeftOfOperator = "";
                    numberToRightOfOperator = "";
                    resultPreOperator = "null";
                    tvBang.setVisibility(View.INVISIBLE);
                    tvCong.setVisibility(View.INVISIBLE);
                    tvTru.setVisibility(View.INVISIBLE);
                    tvNhan.setVisibility(View.INVISIBLE);
                    tvChia.setVisibility(View.INVISIBLE);
                    tvCan.setVisibility(View.INVISIBLE);
                    tv1ChiaX.setVisibility(View.INVISIBLE);
                    tvMu.setVisibility(View.INVISIBLE);
                    tvPhanTram.setVisibility(View.INVISIBLE);
                    isCong = false;
                    isTru = false;
                    isNhan = false;
                    isChia = false;
                    isPhanTram = false;
                    isCan = false;
                    isMu = false;
                    is1ChiaX = false;

                break;
            case R.id.btnC:
                deleteAChar();
                break;
//            case R.id.btnMoNgoac:
//                addTextIntoEdtDisplay("(");
//                break;
//            case R.id.btnDongNgoac:
//                addTextIntoEdtDisplay(")");
//                break;
        }
    }


    @SuppressLint("SetTextI18n")
    private void addTextIntoEdtDisplay(String newStr){
        if (newStr.equals("u221a")){
            newStr = getString(R.string.square_root_symbol)+"(";
        }
        String existsStr = edtDisplay.getText().toString();
        edtDisplay.setText(existsStr+newStr);
    }

    private void deleteAChar(){
        String str = edtDisplay.getText().toString();
        if (str.length() > 0)
            edtDisplay.setText(str.substring(0,str.length() - 1));
    }

    private void deleteAllString(){
        edtDisplay.setText("");
    }

    @SuppressLint("SetTextI18n")
    private void checkOperator(String operator){
        switch (operator){
            case "+":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.INVISIBLE);
                tvCong.setVisibility(View.VISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = true;
                isTru = false;
                isNhan = false;
                isChia = false;
                isPhanTram = false;
                isCan = false;
                isMu = false;
                is1ChiaX = false;
                deleteAllString();
                break;
            case "-":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }
                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.INVISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.VISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = true;
                isNhan = false;
                isChia = false;
                isPhanTram = false;
                isCan = false;
                isMu = false;
                is1ChiaX = false;
                deleteAllString();
                break;
            case "*":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.INVISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.VISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = false;
                isNhan = true;
                isChia = false;
                isPhanTram = false;
                isCan = false;
                isMu = false;
                is1ChiaX = false;
                deleteAllString();
                break;
            case "/":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.INVISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.VISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = false;
                isNhan = false;
                isChia = true;
                isPhanTram = false;
                isCan = false;
                isMu = false;
                is1ChiaX = false;
                deleteAllString();
                break;
            case "%":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.VISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = false;
                isNhan = false;
                isChia = false;
                isPhanTram = true;
                isCan = false;
                isMu = false;
                is1ChiaX = false;
                double rs = Double.parseDouble(edtDisplay.getText().toString()) / 100;
                edtDisplay.setText("" + rs);
                resultPreOperator = rs+"";
                break;
            case "u221a":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.VISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.INVISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = false;
                isNhan = false;
                isChia = false;
                isPhanTram = false;
                isCan = true;
                isMu = false;
                is1ChiaX = false;
                double r = Math.sqrt(Double.parseDouble(edtDisplay.getText().toString()));
                edtDisplay.setText("" + r);
                resultPreOperator = r+"";
                break;
            case "^":
                if (numberToLeftOfOperator.equalsIgnoreCase("")){
                    numberToLeftOfOperator = edtDisplay.getText().toString();
                }

                if (!numberToLeftOfOperator.equalsIgnoreCase("")){
                    String[] arr = numberToLeftOfOperator.split("\\.");
                    if (arr.length > 2){
                        edtDisplay.setText("Syntax Error");
                        return;
                    }
                }

                tvBang.setVisibility(View.INVISIBLE);
                tvCong.setVisibility(View.INVISIBLE);
                tvTru.setVisibility(View.INVISIBLE);
                tvNhan.setVisibility(View.INVISIBLE);
                tvChia.setVisibility(View.INVISIBLE);
                tvCan.setVisibility(View.INVISIBLE);
                tv1ChiaX.setVisibility(View.INVISIBLE);
                tvMu.setVisibility(View.VISIBLE);
                tvPhanTram.setVisibility(View.INVISIBLE);
                isCong = false;
                isTru = false;
                isNhan = false;
                isChia = false;
                isPhanTram = false;
                isCan = false;
                isMu = true;
                is1ChiaX = false;
                deleteAllString();
                break;
        }
    }
}
