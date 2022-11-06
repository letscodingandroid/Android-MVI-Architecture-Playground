package ir.letscodingandroid.android_mvi_architecture_playground.repository.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/repository/main/MainRepository;", "", "()V", "getPosts", "Landroidx/lifecycle/LiveData;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainViewState;", "getUser", "userId", "", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    public static final ir.letscodingandroid.android_mvi_architecture_playground.repository.main.MainRepository INSTANCE = null;
    
    private MainRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState>> getPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState>> getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
}