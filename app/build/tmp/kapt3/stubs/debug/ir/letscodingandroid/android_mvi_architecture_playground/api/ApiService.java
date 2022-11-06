package ir.letscodingandroid.android_mvi_architecture_playground.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/api/ApiService;", "", "getPosts", "Landroidx/lifecycle/LiveData;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse;", "", "Lir/letscodingandroid/android_mvi_architecture_playground/model/PostBean;", "getUser", "Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;", "userId", "", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts")
    public abstract androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean>>> getPosts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{userId}")
    public abstract androidx.lifecycle.LiveData<ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean>> getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String userId);
}