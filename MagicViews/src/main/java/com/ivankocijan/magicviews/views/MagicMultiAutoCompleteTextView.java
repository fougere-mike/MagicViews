package com.ivankocijan.magicviews.views;

import com.ivankocijan.magicviews.R;
import com.ivankocijan.magicviews.interfaces.MagicView;
import com.ivankocijan.magicviews.utils.FontUtils;
import com.ivankocijan.magicviews.utils.AttrsUtils;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;

/**
 * @author Koc
 *         ivan.kocijan@infinum.hr
 * @since 23.05.15.
 */
public class MagicMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView implements MagicView {

    public MagicMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MagicMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.autoCompleteTextViewStyle);
    }

    public MagicMultiAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
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
