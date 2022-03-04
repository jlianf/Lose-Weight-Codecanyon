package com.common.view.shadowView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b.\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0085\u0001B\'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020IH\u0014J\u0012\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MJ\u0018\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u0015H\u0016J\b\u0010R\u001a\u00020KH\u0014J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0005H\u0016J\u0010\u0010S\u001a\u00020I2\u0006\u0010V\u001a\u00020IH\u0014J\b\u0010W\u001a\u00020XH\u0016J\n\u0010Y\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010Z\u001a\u00020\u0007H\u0016J\b\u0010[\u001a\u00020\u0007H\u0002J\u0006\u0010\\\u001a\u00020\u0007J\u0006\u0010]\u001a\u00020\u0007J\b\u0010^\u001a\u00020\u0007H\u0002J\b\u0010_\u001a\u00020\u0015H\u0002J\b\u0010`\u001a\u00020KH\u0016J0\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020)H\u0002J\u0012\u0010g\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J0\u0010h\u001a\u00020K2\u0006\u0010i\u001a\u00020)2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0014J\u0018\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u0007H\u0014J(\u0010m\u001a\u00020K2\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u0007H\u0014J&\u0010r\u001a\u00020K2\u0006\u0010s\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020\u00152\u0006\u0010v\u001a\u00020\u0015J\u0012\u0010w\u001a\u00020K2\b\u0010x\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010y\u001a\u00020K2\u0006\u0010z\u001a\u00020\u0007H\u0016J&\u0010{\u001a\u00020K2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007J\b\u0010|\u001a\u00020)H\u0016J\b\u0010}\u001a\u00020KH\u0002J\b\u0010~\u001a\u00020KH\u0002J+\u0010~\u001a\u00020K2\u0006\u0010\u007f\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0082\u0001\u001a\u00020\u0007H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020)2\u0007\u0010\u0084\u0001\u001a\u00020\'H\u0014R\u000e\u0010\t\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R$\u0010#\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R$\u00102\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R$\u00105\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R$\u00108\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R$\u0010;\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010\u0011R$\u0010>\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R$\u0010A\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R&\u0010D\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/common/view/shadowView/ShadowView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleInt", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_CHILD_GRAVITY", "SIZE_DEFAULT", "SIZE_UNSET", "value", "backgroundClr", "getBackgroundClr", "()I", "setBackgroundClr", "(I)V", "bgPaint", "Landroid/graphics/Paint;", "cornerRadiusBL", "", "getCornerRadiusBL", "()F", "setCornerRadiusBL", "(F)V", "cornerRadiusBR", "getCornerRadiusBR", "setCornerRadiusBR", "cornerRadiusTL", "getCornerRadiusTL", "setCornerRadiusTL", "cornerRadiusTR", "getCornerRadiusTR", "setCornerRadiusTR", "foregroundColor", "getForegroundColor", "setForegroundColor", "foregroundDraw", "Landroid/graphics/drawable/Drawable;", "foregroundDrawBoundsChanged", "", "foregroundDrawGravity", "foregroundDrawInPadding", "overlayBounds", "Landroid/graphics/Rect;", "selfBounds", "shadowColor", "getShadowColor", "setShadowColor", "shadowDx", "getShadowDx", "setShadowDx", "shadowDy", "getShadowDy", "setShadowDy", "shadowMarginBottom", "getShadowMarginBottom", "setShadowMarginBottom", "shadowMarginLeft", "getShadowMarginLeft", "setShadowMarginLeft", "shadowMarginRight", "getShadowMarginRight", "setShadowMarginRight", "shadowMarginTop", "getShadowMarginTop", "setShadowMarginTop", "shadowRadius", "getShadowRadius", "setShadowRadius", "checkLayoutParams", "p", "Landroid/view/ViewGroup$LayoutParams;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawForeground", "drawableHotspotChanged", "x", "y", "drawableStateChanged", "generateLayoutParams", "Lcom/common/view/shadowView/ShadowView$LayoutParams;", "attrs", "lp", "getAccessibilityClassName", "", "getForeground", "getForegroundGravity", "getPaddingBottomWithForeground", "getPaddingLeftWithForeground", "getPaddingRightWithForeground", "getPaddingTopWithForeground", "getShadowMarginMax", "jumpDrawablesToCurrentState", "layoutChildren", "left", "top", "right", "bottom", "forceLeftGravity", "onDraw", "onLayout", "changed", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "setCornerRadius", "tl", "tr", "br", "bl", "setForeground", "drawable", "setForegroundGravity", "foregroundGravity", "setShadowMargin", "shouldDelayChildPressedState", "updateForegroundColor", "updatePaintShadow", "radius", "dx", "dy", "color", "verifyDrawable", "who", "LayoutParams", "app_debug"})
public class ShadowView extends android.view.ViewGroup {
    private final int DEFAULT_CHILD_GRAVITY = 8388659;
    private int SIZE_UNSET = -1;
    private int SIZE_DEFAULT = 0;
    private android.graphics.drawable.Drawable foregroundDraw;
    private final android.graphics.Rect selfBounds = null;
    private final android.graphics.Rect overlayBounds = null;
    private int foregroundDrawGravity = android.view.Gravity.FILL;
    private boolean foregroundDrawInPadding = true;
    private boolean foregroundDrawBoundsChanged = false;
    private final android.graphics.Paint bgPaint = null;
    private int shadowColor = 0;
    private int foregroundColor = 0;
    private int backgroundClr = 0;
    private float shadowRadius = 0.0F;
    private float shadowDx = 0.0F;
    private float shadowDy = 0.0F;
    private float cornerRadiusTL;
    private float cornerRadiusTR;
    private float cornerRadiusBL;
    private float cornerRadiusBR;
    private int shadowMarginTop = 0;
    private int shadowMarginLeft = 0;
    private int shadowMarginRight = 0;
    private int shadowMarginBottom = 0;
    private java.util.HashMap _$_findViewCache;
    
    public final int getShadowColor() {
        return 0;
    }
    
    public final void setShadowColor(int value) {
    }
    
    public final int getForegroundColor() {
        return 0;
    }
    
    public final void setForegroundColor(int value) {
    }
    
    public final int getBackgroundClr() {
        return 0;
    }
    
    public final void setBackgroundClr(int value) {
    }
    
    public final float getShadowRadius() {
        return 0.0F;
    }
    
    public final void setShadowRadius(float value) {
    }
    
    public final float getShadowDx() {
        return 0.0F;
    }
    
    public final void setShadowDx(float value) {
    }
    
    public final float getShadowDy() {
        return 0.0F;
    }
    
    public final void setShadowDy(float value) {
    }
    
    public final float getCornerRadiusTL() {
        return 0.0F;
    }
    
    public final void setCornerRadiusTL(float p0) {
    }
    
    public final float getCornerRadiusTR() {
        return 0.0F;
    }
    
    public final void setCornerRadiusTR(float p0) {
    }
    
    public final float getCornerRadiusBL() {
        return 0.0F;
    }
    
    public final void setCornerRadiusBL(float p0) {
    }
    
    public final float getCornerRadiusBR() {
        return 0.0F;
    }
    
    public final void setCornerRadiusBR(float p0) {
    }
    
    public final int getShadowMarginTop() {
        return 0;
    }
    
    public final void setShadowMarginTop(int value) {
    }
    
    public final int getShadowMarginLeft() {
        return 0;
    }
    
    public final void setShadowMarginLeft(int value) {
    }
    
    public final int getShadowMarginRight() {
        return 0;
    }
    
    public final void setShadowMarginRight(int value) {
    }
    
    public final int getShadowMarginBottom() {
        return 0;
    }
    
    public final void setShadowMarginBottom(int value) {
    }
    
    private final void updatePaintShadow() {
    }
    
    private final void updatePaintShadow(float radius, float dx, float dy, int color) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    private final void layoutChildren(int left, int top, int right, int bottom, boolean forceLeftGravity) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    private final float getShadowMarginMax() {
        return 0.0F;
    }
    
    public final void drawForeground(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.graphics.drawable.Drawable getForeground() {
        return null;
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override()
    public int getForegroundGravity() {
        return 0;
    }
    
    @java.lang.Override()
    public void setForegroundGravity(int foregroundGravity) {
    }
    
    @java.lang.Override()
    protected boolean verifyDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable who) {
        return false;
    }
    
    @java.lang.Override()
    public void jumpDrawablesToCurrentState() {
    }
    
    @java.lang.Override()
    protected void drawableStateChanged() {
    }
    
    @java.lang.Override()
    public void setForeground(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    private final void updateForegroundColor() {
    }
    
    @java.lang.Override()
    public void drawableHotspotChanged(float x, float y) {
    }
    
    public final void setShadowMargin(int left, int top, int right, int bottom) {
    }
    
    public final void setCornerRadius(float tl, float tr, float br, float bl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.common.view.shadowView.ShadowView.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    @java.lang.Override()
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    @java.lang.Override()
    protected boolean checkLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams lp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getAccessibilityClassName() {
        return null;
    }
    
    public final int getPaddingLeftWithForeground() {
        return 0;
    }
    
    public final int getPaddingRightWithForeground() {
        return 0;
    }
    
    private final int getPaddingTopWithForeground() {
        return 0;
    }
    
    private final int getPaddingBottomWithForeground() {
        return 0;
    }
    
    public ShadowView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet, int defStyleInt) {
        super(null);
    }
    
    public ShadowView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    public ShadowView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/common/view/shadowView/ShadowView$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "gravity", "", "getGravity", "()I", "setGravity", "(I)V", "Companion", "app_debug"})
    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private int gravity;
        private static final int UNSPECIFIED_GRAVITY = -1;
        public static final com.common.view.shadowView.ShadowView.LayoutParams.Companion Companion = null;
        
        public final int getGravity() {
            return 0;
        }
        
        public final void setGravity(int p0) {
        }
        
        public LayoutParams(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.Nullable()
        android.util.AttributeSet attrs) {
            super(null, null);
        }
        
        public LayoutParams(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup.LayoutParams source) {
            super(null, null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/common/view/shadowView/ShadowView$LayoutParams$Companion;", "", "()V", "UNSPECIFIED_GRAVITY", "", "getUNSPECIFIED_GRAVITY", "()I", "app_debug"})
        public static final class Companion {
            
            public final int getUNSPECIFIED_GRAVITY() {
                return 0;
            }
            
            private Companion() {
                super();
            }
        }
    }
}