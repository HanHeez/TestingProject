package com.gtv.hanhee.testingproject.ui.framework.widget;

import android.graphics.Typeface;

public class ClassC {
    /* renamed from: a */
    private static InterfaceA interfaceA;
    /* renamed from: b */
    private static InterfaceB interfaceB;

    public ClassC() {
    }

    /* renamed from: a */
    public static void method1_C(InterfaceA interfaceA) {
        interfaceA = interfaceA;
    }

    /* renamed from: a */
    public static void method2_C(InterfaceB interfaceB) {
        interfaceB = interfaceB;
    }

    /* renamed from: a */
    public static boolean method3_C() {
        return interfaceA != null && interfaceA.methodA();
    }

    /* renamed from: b */
    public static boolean method4_C() {
        return interfaceA != null && interfaceA.methodB();
    }

    /* renamed from: c */
    public static int method5_C() {
        if (interfaceA != null) {
            return interfaceA.methodC();
        }
        return 0;
    }

    /* renamed from: d */
    public static Typeface method6_C() {
        if (interfaceB != null) {
            return interfaceB.methodA();
        }
        return null;
    }

    /* renamed from: e */
    public static Typeface method7_C() {
        if (interfaceB != null) {
            return interfaceB.methodB();
        }
        return null;
    }
}

