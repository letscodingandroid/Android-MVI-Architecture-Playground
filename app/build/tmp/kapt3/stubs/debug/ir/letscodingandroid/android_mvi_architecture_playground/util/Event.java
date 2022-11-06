package ir.letscodingandroid.android_mvi_architecture_playground.util;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0010B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\r\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "toString", "", "Companion", "app_debug"})
public final class Event<T extends java.lang.Object> {
    private final T content = null;
    private boolean hasBeenHandled = false;
    @org.jetbrains.annotations.NotNull()
    public static final ir.letscodingandroid.android_mvi_architecture_playground.util.Event.Companion Companion = null;
    
    public Event(T content) {
        super();
    }
    
    public final boolean getHasBeenHandled() {
        return false;
    }
    
    /**
     * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    /**
     * Returns the content, even if it's already been handled.
     */
    public final T peekContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t\u00a8\u0006\u000b"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/Event$Companion;", "", "()V", "dataEvent", "Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;", "T", "data", "(Ljava/lang/Object;)Lir/letscodingandroid/android_mvi_architecture_playground/util/Event;", "messageEvent", "", "message", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.Event<T> dataEvent(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final ir.letscodingandroid.android_mvi_architecture_playground.util.Event<java.lang.String> messageEvent(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            return null;
        }
    }
}