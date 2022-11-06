package ir.letscodingandroid.android_mvi_architecture_playground.util;

import java.lang.System;

/**
 * Copied from Architecture components google sample:
 * https://github.com/googlesamples/android-architecture-components/blob/master/GithubBrowserSample/app/src/main/java/com/android/example/github/api/ApiResponse.kt
 */
@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse;", "T", "", "()V", "Companion", "Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiEmptyResponse;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiErrorResponse;", "Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiSuccessResponse;", "app_debug"})
public abstract class GenericApiResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    public static final ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse.Companion Companion = null;
    private static final java.lang.String TAG = "AppDebug";
    
    private GenericApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00020\tJ \u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\n\"\u0004\b\u0001\u0010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse$Companion;", "", "()V", "TAG", "", "create", "Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiErrorResponse;", "T", "error", "", "Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse;", "response", "Lretrofit2/Response;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.ApiErrorResponse<T> create(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<T> create(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> response) {
            return null;
        }
    }
}