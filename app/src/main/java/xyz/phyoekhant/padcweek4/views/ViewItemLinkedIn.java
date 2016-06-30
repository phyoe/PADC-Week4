package xyz.phyoekhant.padcweek4.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.TextView;

import xyz.phyoekhant.padcweek4.R;

import static xyz.phyoekhant.padcweek4.R.id.tv_profile;

/**
 * Created by User on 3/6/2016.
 */
public class  ViewItemLinkedIn extends CardView {

    private TextView tvProfile;

    public ViewItemLinkedIn(Context context) {
        super(context);
    }

    public ViewItemLinkedIn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewItemLinkedIn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tvProfile = (TextView) findViewById(tv_profile);
    }

    public void setData() {
        tvProfile.setText("aaaaa");
    }
}