package com.tf.flowlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private FlowLayout mFlowLayout;
    private String[] mStrings = {"apple", "百度CEO", "阿里巴巴", "绩效股", "中国股市", "美团", "google", "淘宝", "雷军 小米公司", "大疆无人机"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.flowLayout);
        mFlowLayout.setData(mStrings);
    }
}
