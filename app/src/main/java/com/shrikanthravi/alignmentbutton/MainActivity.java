package com.shrikanthravi.alignmentbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.line1) View line1;
    @BindView(R.id.line2) View line2;
    @BindView(R.id.line3) View line3;
    @BindView(R.id.line1L) View line1L;
    @BindView(R.id.line2L) View line2L;
    @BindView(R.id.line3L) View line3L;
    @BindView(R.id.line1R) View line1R;
    @BindView(R.id.line2R) View line2R;
    @BindView(R.id.line3R) View line3R;
    @BindView(R.id.line1C) View line1C;
    @BindView(R.id.line2C) View line2C;
    @BindView(R.id.line3C) View line3C;


    @BindView(R.id.leftAlignLL) LinearLayout leftAlignLL;
    @BindView(R.id.rightAlignLL) LinearLayout rightAlignLL;
    @BindView(R.id.centerAlignLL) LinearLayout centerAlignLL;

    int currentPosition=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.leftAlignLL)
    public void leftAlignLLClicked(View view){
        if(currentPosition!=0){
            if(currentPosition==1){

                line1.animate().translationX(leftAlignLL.getLeft()).setDuration(300);
                line2.animate().translationX(leftAlignLL.getLeft()).setDuration(400);
                line3.animate().translationX(leftAlignLL.getLeft()).setDuration(500);
                currentPosition=0;
            }
            else {
                if(currentPosition==2){

                    line1.animate().translationX(leftAlignLL.getLeft()).setDuration(300);
                    line2.animate().translationX(leftAlignLL.getLeft()).setDuration(400);
                    line3.animate().translationX(leftAlignLL.getLeft()).setDuration(500);
                    currentPosition=0;
                }
            }
        }
    }

    @OnClick(R.id.centerAlignLL)
    public void centerAlignLLClicked(View view){
        if(currentPosition!=1){
            if(currentPosition==0){
                line1.animate().translationX(centerAlignLL.getPivotX()+line1C.getWidth()).setDuration(400);
                line2.animate().translationX(centerAlignLL.getPivotX()+line2C.getWidth()).setDuration(400);
                line3.animate().translationX(centerAlignLL.getPivotX()+line3C.getWidth()*2).setDuration(500);
                currentPosition=1;
            }
            else {
                if(currentPosition==2){

                    line1.animate().translationX(centerAlignLL.getPivotX()+line1C.getWidth()).setDuration(400);
                    line2.animate().translationX(centerAlignLL.getPivotX()+line2C.getWidth()).setDuration(400);
                    line3.animate().translationX(centerAlignLL.getPivotX()+line3C.getWidth()*2).setDuration(500);
                    currentPosition=1;
                }
            }
        }
    }

    @OnClick(R.id.rightAlignLL)
    public void rightAlignLLClicked(View view){
        if(currentPosition!=2){
            if(currentPosition==0){
                line1.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()).setDuration(300);
                line2.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()).setDuration(400);
                line3.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()*2).setDuration(500);
                currentPosition=2;
            }
            else {
                if(currentPosition==1){

                    line1.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()).setDuration(300);
                    line2.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()).setDuration(400);
                    line3.animate().translationX(rightAlignLL.getLeft()+rightAlignLL.getPaddingLeft()*2).setDuration(500);
                    currentPosition=2;
                }
            }
        }
    }




}
