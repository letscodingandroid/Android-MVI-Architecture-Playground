package ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent;", "", "()V", "GetPostsEvent", "GetUserEvent", "None", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$GetPostsEvent;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$GetUserEvent;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$None;", "app_debug"})
public abstract class MainStateEvent {
    
    private MainStateEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$GetPostsEvent;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent;", "()V", "app_debug"})
    public static final class GetPostsEvent extends ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent {
        
        public GetPostsEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$GetUserEvent;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent;", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "app_debug"})
    public static final class GetUserEvent extends ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userId = null;
        
        public GetUserEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserId() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent$None;", "Lir/letscodingandroid/android_mvi_architecture_playground/ui/main/state/MainStateEvent;", "()V", "app_debug"})
    public static final class None extends ir.letscodingandroid.android_mvi_architecture_playground.ui.main.state.MainStateEvent {
        
        public None() {
            super();
        }
    }
}