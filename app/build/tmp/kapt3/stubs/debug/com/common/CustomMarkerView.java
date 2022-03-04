package com.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/common/CustomMarkerView;", "Lcom/github/mikephil/charting/components/MarkerView;", "context", "Landroid/content/Context;", "layoutResource", "", "(Landroid/content/Context;I)V", "mOffset", "Lcom/github/mikephil/charting/utils/MPPointF;", "tvContent", "Landroid/widget/TextView;", "getOffset", "refreshContent", "", "e", "Lcom/github/mikephil/charting/data/Entry;", "highlight", "Lcom/github/mikephil/charting/highlight/Highlight;", "app_debug"})
public final class CustomMarkerView extends com.github.mikephil.charting.components.MarkerView {
    private android.widget.TextView tvContent;
    private com.github.mikephil.charting.utils.MPPointF mOffset;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void refreshContent(@org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.data.Entry e, @org.jetbrains.annotations.NotNull()
    com.github.mikephil.charting.highlight.Highlight highlight) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        return null;
    }
    
    public CustomMarkerView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int layoutResource) {
        super(null, 0);
    }
}