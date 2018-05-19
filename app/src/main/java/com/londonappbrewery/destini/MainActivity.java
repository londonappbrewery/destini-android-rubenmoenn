package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mBottomButtton;
    Button mTopButton;
    TextView mStoryTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mBottomButtton = (Button) findViewById(R.id.buttonBottom);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the Bottom button:
        mBottomButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButtton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButtton.setVisibility(View.GONE);
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButtton.setVisibility(View.GONE);
                } else if (mStoryIndex == 4) {
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButtton.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the Top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButtton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButtton.setVisibility(View.GONE);
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButtton.setText(R.string.T3_Ans2);
                    mStoryIndex = 4;
                } else if (mStoryIndex == 4) {
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButtton.setVisibility(View.GONE);
                }

            }
        });



    }


}
