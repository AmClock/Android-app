package com.example.to_play;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class EditTest extends AppCompatEditText implements View.OnFocusChangeListener {

    private OnFocusChangeListener onFocusChangeListener;

    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListener = onFocusChangeListener;
    }

    public EditTest(Context context) {
        super(context);
        init();
    }

    public EditTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
       String test = hasFocus == true ? "true":"false";
        Log.i("test 값은 ", "onFocusChange: " + test);
    }

    @Override
    public CharSequence getHint() {
        return super.getHint();
    }

    private void init(){
/*

        1) text view is Dynamic allocation

        TextView tx = new TextView(getContext());
        tx.setText(getHint());
        tx.setTextAppearance(getContext(),R.style.label_txt2);

*/
        super.setOnFocusChangeListener(this);
    }

}
