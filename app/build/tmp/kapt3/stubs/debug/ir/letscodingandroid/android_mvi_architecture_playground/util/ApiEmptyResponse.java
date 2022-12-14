package ir.letscodingandroid.android_mvi_architecture_playground.util;

import java.lang.System;

/**
 * separate class for HTTP 204 responses so that we can make ApiSuccessResponse's body non-null.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lir/letscodingandroid/android_mvi_architecture_playground/util/ApiEmptyResponse;", "T", "Lir/letscodingandroid/android_mvi_architecture_playground/util/GenericApiResponse;", "()V", "app_debug"})
public final class ApiEmptyResponse<T extends java.lang.Object> extends ir.letscodingandroid.android_mvi_architecture_playground.util.GenericApiResponse<T> {
    
    public ApiEmptyResponse() {
        super();
    }
}