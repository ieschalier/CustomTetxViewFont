package com.igor13127.customtextviewfontmodule;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by igoreschalier on 05/04/16.
 */
public class CustomTetxViewFont extends TextView {

    private String assertFontName;

    public CustomTetxViewFont(Context context) {
        super(context);
    }

    public CustomTetxViewFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.CustomTetxViewFont);
        CharSequence fontName = arr.getString(R.styleable.CustomTetxViewFont_font);
        if (fontName != null) {
            assertFontName = fontName.toString();
            // Do something with foo_cs.toString()
        }
        arr.recycle();  // Do this when done.
        try {
            Typeface font = Typeface.createFromAsset(context.getAssets(), assertFontName);
            setTypeface(font);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public CustomTetxViewFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.CustomTetxViewFont);
        CharSequence fontName = arr.getString(R.styleable.CustomTetxViewFont_font);
        if (fontName != null) {
            assertFontName = fontName.toString();
            // Do something with foo_cs.toString()
        }
        arr.recycle();  // Do this when done.
        try {
            Typeface font = Typeface.createFromAsset(context.getAssets(), assertFontName);
            setTypeface(font);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomTetxViewFont(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public String getAssertFontName() {
        return assertFontName;
    }

    public void setAssertFontName(String assertFontName) {
        this.assertFontName = assertFontName;
    }
}
