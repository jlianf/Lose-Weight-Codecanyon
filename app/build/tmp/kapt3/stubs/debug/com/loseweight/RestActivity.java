package com.loseweight;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020.H\u0016J\u0012\u00102\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020.H\u0014J\b\u00106\u001a\u00020.H\u0014J\u0006\u00107\u001a\u00020.J\u0006\u00108\u001a\u00020.J\u0006\u00109\u001a\u00020.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006;"}, d2 = {"Lcom/loseweight/RestActivity;", "Lcom/loseweight/BaseActivity;", "()V", "binding", "Lcom/loseweight/databinding/ActivityRestBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityRestBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityRestBinding;)V", "nextExercise", "Lcom/loseweight/objects/HomeExTableClass;", "getNextExercise", "()Lcom/loseweight/objects/HomeExTableClass;", "setNextExercise", "(Lcom/loseweight/objects/HomeExTableClass;)V", "nextPos", "", "getNextPos", "()I", "setNextPos", "(I)V", "restTime", "", "getRestTime", "()J", "setRestTime", "(J)V", "timeCountDown", "getTimeCountDown", "setTimeCountDown", "timer", "Lcom/loseweight/utils/CountDownTimerWithPause;", "getTimer", "()Lcom/loseweight/utils/CountDownTimerWithPause;", "setTimer", "(Lcom/loseweight/utils/CountDownTimerWithPause;)V", "totalEx", "getTotalEx", "setTotalEx", "workoutProgressIndicatorAdapter", "Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter;", "getWorkoutProgressIndicatorAdapter", "()Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter;", "setWorkoutProgressIndicatorAdapter", "(Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter;)V", "countDownRest", "", "init", "initIntentParam", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "pauseTimer", "resumeTimer", "stopTimer", "ClickHandler", "app_debug"})
public final class RestActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private com.loseweight.databinding.ActivityRestBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.loseweight.utils.CountDownTimerWithPause timer;
    private int nextPos = 0;
    private int totalEx = 0;
    private long timeCountDown = 0L;
    private long restTime = 20L;
    @org.jetbrains.annotations.Nullable()
    private com.loseweight.objects.HomeExTableClass nextExercise;
    @org.jetbrains.annotations.Nullable()
    private com.loseweight.adapter.WorkoutProgressIndicatorAdapter workoutProgressIndicatorAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.loseweight.databinding.ActivityRestBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.loseweight.databinding.ActivityRestBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.loseweight.utils.CountDownTimerWithPause getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.Nullable()
    com.loseweight.utils.CountDownTimerWithPause p0) {
    }
    
    public final int getNextPos() {
        return 0;
    }
    
    public final void setNextPos(int p0) {
    }
    
    public final int getTotalEx() {
        return 0;
    }
    
    public final void setTotalEx(int p0) {
    }
    
    public final long getTimeCountDown() {
        return 0L;
    }
    
    public final void setTimeCountDown(long p0) {
    }
    
    public final long getRestTime() {
        return 0L;
    }
    
    public final void setRestTime(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.loseweight.objects.HomeExTableClass getNextExercise() {
        return null;
    }
    
    public final void setNextExercise(@org.jetbrains.annotations.Nullable()
    com.loseweight.objects.HomeExTableClass p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.loseweight.adapter.WorkoutProgressIndicatorAdapter getWorkoutProgressIndicatorAdapter() {
        return null;
    }
    
    public final void setWorkoutProgressIndicatorAdapter(@org.jetbrains.annotations.Nullable()
    com.loseweight.adapter.WorkoutProgressIndicatorAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void countDownRest() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void stopTimer() {
    }
    
    public final void resumeTimer() {
    }
    
    public final void pauseTimer() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public RestActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/loseweight/RestActivity$ClickHandler;", "", "(Lcom/loseweight/RestActivity;)V", "onExerciseInfoClick", "", "onPlusTimeClick", "onSkipClick", "app_debug"})
    public final class ClickHandler {
        
        public final void onSkipClick() {
        }
        
        public final void onPlusTimeClick() {
        }
        
        public final void onExerciseInfoClick() {
        }
        
        public ClickHandler() {
            super();
        }
    }
}