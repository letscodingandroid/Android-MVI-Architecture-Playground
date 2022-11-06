package ir.letscodingandroid.android_mvi_architecture_playground.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0002J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/DataStateListener;", "()V", "mainViewModel", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/MainViewModel;", "handleDataStateChange", "", "dataState", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDataStateChange", "showMainFragment", "showProgressBar", "isVisible", "", "showToast", "message", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements ir.letscodingandroid.android_mvi_architecture_playground.ui.DataStateListener {
    private ir.letscodingandroid.android_mvi_architecture_playground.ui.main.MainViewModel mainViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showMainFragment() {
    }
    
    @java.lang.Override()
    public void onDataStateChange(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<?> dataState) {
    }
    
    private final void handleDataStateChange(ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<?> dataState) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void showProgressBar(boolean isVisible) {
    }
}