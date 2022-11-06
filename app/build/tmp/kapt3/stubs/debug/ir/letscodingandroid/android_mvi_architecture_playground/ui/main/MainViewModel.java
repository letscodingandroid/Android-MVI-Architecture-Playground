package ir.letscodingandroid.android_mvi_architecture_playground.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_stateEvent", "Landroidx/lifecycle/MutableLiveData;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent;", "_viewState", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainViewState;", "dataState", "Landroidx/lifecycle/LiveData;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "getDataState", "()Landroidx/lifecycle/LiveData;", "viewState", "getViewState", "getCurrentViewStateOrNew", "handleMainStateEvent", "mainStateEvent", "setPostListData", "", "blogPosts", "", "Lir/letscodingandroid/android_mvi_architecture_playground/model/PostBean;", "setStateEvent", "event", "setUser", "user", "Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent> _stateEvent = null;
    private final androidx.lifecycle.MutableLiveData<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState> _viewState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState>> dataState = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState>> getDataState() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState>> handleMainStateEvent(ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent mainStateEvent) {
        return null;
    }
    
    public final void setPostListData(@org.jetbrains.annotations.NotNull()
    java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> blogPosts) {
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean user) {
    }
    
    private final ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState getCurrentViewStateOrNew() {
        return null;
    }
    
    public final void setStateEvent(@org.jetbrains.annotations.NotNull()
    ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent event) {
    }
}