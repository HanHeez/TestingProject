package com.gtv.hanhee.testingproject.ui.framework.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.gtv.hanhee.testingproject.R;


public class BubbleTextView extends AppCompatTextView {
    /* renamed from: b */
    private float f16620b;
    /* renamed from: c */
    private float f16621c;
    /* renamed from: d */
    private int f16622d;
    /* renamed from: e */
    private int f16623e;

    public BubbleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();

    }

    public BubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);

    }

    public BubbleTextView(Context context) {
        this(context, null);

    }

    /* renamed from: a */
    private void initViews() {
        this.f16622d = getResources().getDimensionPixelSize(R.dimen.length_16);
        this.f16623e = Color.parseColor("#FFFFFF");
        setBackgroundResource(R.drawable.bubble_shape_bg);
        m24785b();
    }

    /* renamed from: b */
    private void m24785b() {
        Typeface typeface = getTypeface();
        int i = 0;
        if (typeface != null) {
            i = typeface.getStyle();
        }
        if (i == 0) {
            if (ClassC.method6_C() != null) {
                setTypeface(ClassC.method6_C());
            }
            setLineSpacing(0.0f, 1.1f);
        } else if (i == 1) {
            Typeface e = ClassC.method7_C();
            if (e != null) {
                setTypeface(e);
            }
            setLineSpacing(0.0f, 0.9f);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                this.f16620b = (float) this.f16622d;
                break;
            case 0:
            case 1073741824:
                this.f16620b = (float) size;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                this.f16621c = (float) this.f16622d;
                break;
            case 0:
            case 1073741824:
                this.f16621c = (float) size2;
                break;
        }
        setMeasuredDimension((int) Math.ceil((double) this.f16620b), (int) Math.ceil((double) this.f16621c));
    }

    protected void onDraw(Canvas canvas) {
        Paint paint = getPaint();
        paint.setColor(this.f16623e);
        paint.setTextSize(m24786c());
        canvas.drawText(getText().toString(), ((float) (getWidth() / 2)) - (m24787d() / 2.0f), ((float) (getHeight() / 2)) - (m24788e() / 2.0f), paint);
    }

    /* renamed from: c */
    private float m24786c() {
        switch (getText().toString().length()) {
            case 1:
                return (float) getResources().getDimensionPixelSize(R.dimen.textsize_10);
            case 2:
                return (float) getResources().getDimensionPixelSize(R.dimen.textsize_8);
            default:
                return (float) getResources().getDimensionPixelSize(R.dimen.textsize_6);
        }
    }

    /* renamed from: d */
    private float m24787d() {
        return getPaint().measureText(getText().toString());
    }

    /* renamed from: e */
    private float m24788e() {
        return getPaint().getFontMetrics().descent + getPaint().getFontMetrics().ascent;
    }
}
