package ir.letscodingandroid.android_mvi_architecture_playground.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/DataStateListener;", "", "onDataStateChange", "", "dataState", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "app_debug"})
public abstract interface DataStateListener {
    
    public abstract void onDataStateChange(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<?> dataState);
}