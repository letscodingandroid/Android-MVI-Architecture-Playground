package ir.letscodingandroid.android_mvi_architecture_playground.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000bH&J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/repository/NetworkBoundResource;", "ResponseObject", "ViewStateType", "", "()V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "getResult", "()Landroidx/lifecycle/MediatorLiveData;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse;", "handleApiSuccessResponse", "", "response", "Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiSuccessResponse;", "handleNetworkCall", "onReturnError", "message", "", "app_debug"})
public abstract class NetworkBoundResource<ResponseObject extends java.lang.Object, ViewStateType extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ViewStateType>> result = null;
    
    public NetworkBoundResource() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MediatorLiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ViewStateType>> getResult() {
        return null;
    }
    
    public final void handleNetworkCall(@org.jetbrains.annotations.NotNull()
    ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<ResponseObject> response) {
    }
    
    public final void onReturnError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public abstract void handleApiSuccessResponse(@org.jetbrains.annotations.NotNull()
    ir.letscodingandroid.android_mvi_architecture_playground.util.ApiSuccessResponse<ResponseObject> response);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<ResponseObject>> createCall();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<ViewStateType>> asLiveData() {
        return null;
    }
}