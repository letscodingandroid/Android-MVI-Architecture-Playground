package ir.letscodingandroid.android_mvi_architecture_playground.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB3\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u00c6\u0003J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "T", "", "message", "Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;", "", "loading", "", "data", "(Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;ZLir/letscodingandroid/android_mvi_architecture_playground/util/Event;)V", "getData", "()Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;", "setData", "(Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;)V", "getLoading", "()Z", "setLoading", "(Z)V", "getMessage", "setMessage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_debug"})
public final class DataState<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> message;
    private boolean loading;
    @org.jetbrains.annotations.Nullable()
    private ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> data;
    @org.jetbrains.annotations.NotNull()
    public static final ir.letscodingandroid.android_mvi_architecture_playground.util.DataState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<T> copy(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> message, boolean loading, @org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> data) {
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
    
    public DataState() {
        super();
    }
    
    public DataState(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> message, boolean loading, @org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> data) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> p0) {
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState$Companion;", "", "()V", "data", "Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "T", "message", "", "(Ljava/lang/String;Ljava/lang/Object;)Lir/letscodingandroid/android_mvi_architecture_playground/util/DataState;", "error", "loading", "isLoading", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<T> loading(boolean isLoading) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.DataState<T> data(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
    }
}