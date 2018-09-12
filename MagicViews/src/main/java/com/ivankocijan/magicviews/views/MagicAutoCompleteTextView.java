package com.ivankocijan.magicviews.views;

import com.ivankocijan.magicviews.R;
import com.ivankocijan.magicviews.interfaces.MagicView;
import com.ivankocijan.magicviews.utils.FontUtils;
import com.ivankocijan.magicviews.utils.AttrsUtils;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

/**
 * @author Koc
 *         ivan.kocijan@infinum.hr
 * @since 23.05.15.
 */
public class MagicAutoCompleteTextView extends AppCompatAutoCompleteTextView implements MagicView {

    public MagicAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MagicAutoCompleteTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.autoCompleteTextViewStyle);
    }

    public MagicAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
