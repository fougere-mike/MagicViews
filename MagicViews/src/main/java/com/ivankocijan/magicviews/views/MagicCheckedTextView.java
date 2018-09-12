package com.ivankocijan.magicviews.views;

import com.ivankocijan.magicviews.R;
import com.ivankocijan.magicviews.interfaces.MagicView;
import com.ivankocijan.magicviews.utils.FontUtils;
import com.ivankocijan.magicviews.utils.AttrsUtils;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckedTextView;

/**
 * Created by ivankocijan on 19.05.2014..
 */
public class MagicCheckedTextView extends AppCompatCheckedTextView implements MagicView {

    public MagicCheckedTextView(Context context) {
        this(context, null);
    }

    public MagicCheckedTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkedTextViewStyle);
    }

    public MagicCheckedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);
    }


    private void init(AttributeSet attrs) {
        if (!isInEditMode()) {
            AttrsUtils.setAttributes(getContext(), attrs, this);
        }
    }

    @Override
    public void setFont(String fontName) {
        if (!isInEditMode()) {
            FontUtils.setTypeface(getContext(), fontName, this);
        }
    }

}
