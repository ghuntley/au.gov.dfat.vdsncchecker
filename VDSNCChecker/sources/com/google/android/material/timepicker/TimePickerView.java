package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.C0237b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Objects;
import java.util.WeakHashMap;
import p007au.gov.dfat.vdsncchecker.R;
import p058j0.C1061o;
import p058j0.C1070q;
import p102q2.C1608d;
import p102q2.C1609e;
import p102q2.C1610f;

public class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    public static final /* synthetic */ int f3067A = 0;

    /* renamed from: w */
    public final Chip f3068w;

    /* renamed from: x */
    public final Chip f3069x;

    /* renamed from: y */
    public final MaterialButtonToggleGroup f3070y;

    /* renamed from: z */
    public final View.OnClickListener f3071z;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C0782a implements View.OnClickListener {
        public C0782a() {
        }

        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.f3067A;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0782a aVar = new C0782a();
        this.f3071z = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f3070y = materialButtonToggleGroup;
        materialButtonToggleGroup.f2689h.add(new C1608d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f3068w = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3069x = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        C1610f fVar = new C1610f(this, new GestureDetector(getContext(), new C1609e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo4008s();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo4008s();
        }
    }

    /* renamed from: s */
    public final void mo4008s() {
        C0237b.C0238a aVar;
        if (this.f3070y.getVisibility() == 0) {
            C0237b bVar = new C0237b();
            bVar.mo1308c(this);
            WeakHashMap<View, C1070q> weakHashMap = C1061o.f3808a;
            char c = getLayoutDirection() == 0 ? (char) 2 : 1;
            if (bVar.f1119c.containsKey(Integer.valueOf(R.id.material_clock_display)) && (aVar = bVar.f1119c.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                switch (c) {
                    case 1:
                        C0237b.C0240b bVar2 = aVar.f1123d;
                        bVar2.f1182i = -1;
                        bVar2.f1180h = -1;
                        bVar2.f1145F = -1;
                        bVar2.f1152M = Integer.MIN_VALUE;
                        break;
                    case 2:
                        C0237b.C0240b bVar3 = aVar.f1123d;
                        bVar3.f1186k = -1;
                        bVar3.f1184j = -1;
                        bVar3.f1146G = -1;
                        bVar3.f1154O = Integer.MIN_VALUE;
                        break;
                    case 3:
                        C0237b.C0240b bVar4 = aVar.f1123d;
                        bVar4.f1190m = -1;
                        bVar4.f1188l = -1;
                        bVar4.f1147H = 0;
                        bVar4.f1153N = Integer.MIN_VALUE;
                        break;
                    case 4:
                        C0237b.C0240b bVar5 = aVar.f1123d;
                        bVar5.f1192n = -1;
                        bVar5.f1194o = -1;
                        bVar5.f1148I = 0;
                        bVar5.f1155P = Integer.MIN_VALUE;
                        break;
                    case 5:
                        C0237b.C0240b bVar6 = aVar.f1123d;
                        bVar6.f1196p = -1;
                        bVar6.f1197q = -1;
                        bVar6.f1198r = -1;
                        bVar6.f1151L = 0;
                        bVar6.f1158S = Integer.MIN_VALUE;
                        break;
                    case 6:
                        C0237b.C0240b bVar7 = aVar.f1123d;
                        bVar7.f1199s = -1;
                        bVar7.f1200t = -1;
                        bVar7.f1150K = 0;
                        bVar7.f1157R = Integer.MIN_VALUE;
                        break;
                    case 7:
                        C0237b.C0240b bVar8 = aVar.f1123d;
                        bVar8.f1201u = -1;
                        bVar8.f1202v = -1;
                        bVar8.f1149J = 0;
                        bVar8.f1156Q = Integer.MIN_VALUE;
                        break;
                    case 8:
                        C0237b.C0240b bVar9 = aVar.f1123d;
                        bVar9.f1141B = -1.0f;
                        bVar9.f1140A = -1;
                        bVar9.f1206z = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            bVar.mo1307b(this, true);
            setConstraintSet((C0237b) null);
            requestLayout();
        }
    }
}
