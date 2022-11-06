package ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainViewState;", "", "posts", "", "Lir/letscodingandroid/android_mvi_architecture_playground/model/PostBean;", "user", "Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;", "(Ljava/util/List;Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;)V", "getPosts", "()Ljava/util/List;", "setPosts", "(Ljava/util/List;)V", "getUser", "()Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;", "setUser", "(Lir/letscodingandroid/android_mvi_architecture_playground/model/UserBean;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class MainViewState {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> posts;
    @org.jetbrains.annotations.Nullable()
    private ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean user;
    
    @org.jetbrains.annotations.NotNull()
    public final ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainViewState copy(@org.jetbrains.annotations.Nullable()
    java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> posts, @org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean user) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MainViewState() {
        super();
    }
    
    public MainViewState(@org.jetbrains.annotations.Nullable()
    java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> posts, @org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean user) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.Nullable()
    java.util.List<ir.letscodingandroid.android_mvi_architecture_playground.model.PostBean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.model.UserBean p0) {
    }
}