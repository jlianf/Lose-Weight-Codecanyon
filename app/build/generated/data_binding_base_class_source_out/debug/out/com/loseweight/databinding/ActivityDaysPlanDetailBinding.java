// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.common.view.CBTextView;
import com.common.view.CTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.loseweight.DaysPlanDetailActivity;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDaysPlanDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final ImageView imgCover;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final LinearLayout llChangePlan;

  @NonNull
  public final LinearLayout llTopTitle;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final ProgressBar pbDay;

  @NonNull
  public final RecyclerView rvDays;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CTextView tvDaysLeft;

  @NonNull
  public final CBTextView tvTitle;

  @NonNull
  public final CBTextView tvTitleText;

  @Bindable
  protected DaysPlanDetailActivity.ClickHandler mHandler;

  protected ActivityDaysPlanDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      AppCompatImageView imgBack, ImageView imgCover, RelativeLayout llAdView,
      LinearLayout llAdViewFacebook, LinearLayout llChangePlan, LinearLayout llTopTitle,
      CoordinatorLayout mainContent, NestedScrollView nestedScrollView, ProgressBar pbDay,
      RecyclerView rvDays, Toolbar toolbar, CTextView tvDaysLeft, CBTextView tvTitle,
      CBTextView tvTitleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.imgBack = imgBack;
    this.imgCover = imgCover;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.llChangePlan = llChangePlan;
    this.llTopTitle = llTopTitle;
    this.mainContent = mainContent;
    this.nestedScrollView = nestedScrollView;
    this.pbDay = pbDay;
    this.rvDays = rvDays;
    this.toolbar = toolbar;
    this.tvDaysLeft = tvDaysLeft;
    this.tvTitle = tvTitle;
    this.tvTitleText = tvTitleText;
  }

  public abstract void setHandler(@Nullable DaysPlanDetailActivity.ClickHandler handler);

  @Nullable
  public DaysPlanDetailActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityDaysPlanDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_days_plan_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDaysPlanDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDaysPlanDetailBinding>inflateInternal(inflater, R.layout.activity_days_plan_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDaysPlanDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_days_plan_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDaysPlanDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDaysPlanDetailBinding>inflateInternal(inflater, R.layout.activity_days_plan_detail, null, false, component);
  }

  public static ActivityDaysPlanDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityDaysPlanDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDaysPlanDetailBinding)bind(component, view, R.layout.activity_days_plan_detail);
  }
}
