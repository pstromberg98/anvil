package trikita.anvil.recyclerview.v7;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;
import android.view.View;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Void;
import trikita.anvil.Anvil;
import trikita.anvil.BaseDSL;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateRecyclerViewv7DSL}.
 * It contains views and their setters from the library recyclerview-v7.
 * Please, don't edit it manually unless for debugging.
 */
public final class RecyclerViewv7DSL extends BaseRecyclerView{
  public static BaseDSL.ViewClassResult recyclerView() {
    return BaseDSL.v(RecyclerView.class);
  }

  public static Void recyclerView(Anvil.Renderable r) {
    return BaseDSL.v(RecyclerView.class, r);
  }

  public static Void accessibilityDelegateCompat(RecyclerViewAccessibilityDelegate arg) {
    return BaseDSL.attr(AccessibilityDelegateCompatFunc5d243db4.instance, arg);
  }

  public static Void adapter(RecyclerView.Adapter arg) {
    return BaseDSL.attr(AdapterFunc9c6158c0.instance, arg);
  }

  public static Void childDrawingOrderCallback(RecyclerView.ChildDrawingOrderCallback arg) {
    return BaseDSL.attr(ChildDrawingOrderCallbackFunc8f7418a2.instance, arg);
  }

  public static Void hasFixedSize(boolean arg) {
    return BaseDSL.attr(HasFixedSizeFunc148d6054.instance, arg);
  }

  public static Void itemAnimator(RecyclerView.ItemAnimator arg) {
    return BaseDSL.attr(ItemAnimatorFunc2b975049.instance, arg);
  }

  public static Void itemViewCacheSize(int arg) {
    return BaseDSL.attr(ItemViewCacheSizeFunc8567756a.instance, arg);
  }

  public static Void layoutFrozen(boolean arg) {
    return BaseDSL.attr(LayoutFrozenFunc148d6054.instance, arg);
  }

  public static Void layoutManager(RecyclerView.LayoutManager arg) {
    return BaseDSL.attr(LayoutManagerFuncbb50c5d4.instance, arg);
  }

  public static Void nestedScrollingEnabled(boolean arg) {
    return BaseDSL.attr(NestedScrollingEnabledFunc148d6054.instance, arg);
  }

  public static Void recycledViewPool(RecyclerView.RecycledViewPool arg) {
    return BaseDSL.attr(RecycledViewPoolFuncf2dc961.instance, arg);
  }

  public static Void recyclerListener(RecyclerView.RecyclerListener arg) {
    return BaseDSL.attr(RecyclerListenerFunc33e333c2.instance, arg);
  }

  public static Void scrollingTouchSlop(int arg) {
    return BaseDSL.attr(ScrollingTouchSlopFunc8567756a.instance, arg);
  }

  public static Void viewCacheExtension(RecyclerView.ViewCacheExtension arg) {
    return BaseDSL.attr(ViewCacheExtensionFuncd98d0ad1.instance, arg);
  }

  private static final class AccessibilityDelegateCompatFunc5d243db4 implements Anvil.AttrFunc<RecyclerViewAccessibilityDelegate> {
    public static final AccessibilityDelegateCompatFunc5d243db4 instance = new AccessibilityDelegateCompatFunc5d243db4();

    public void apply(View v, final RecyclerViewAccessibilityDelegate arg, final RecyclerViewAccessibilityDelegate old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setAccessibilityDelegateCompat(arg);
      }
    }
  }

  private static final class AdapterFunc9c6158c0 implements Anvil.AttrFunc<RecyclerView.Adapter> {
    public static final AdapterFunc9c6158c0 instance = new AdapterFunc9c6158c0();

    public void apply(View v, final RecyclerView.Adapter arg, final RecyclerView.Adapter old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setAdapter(arg);
      }
    }
  }

  private static final class ChildDrawingOrderCallbackFunc8f7418a2 implements Anvil.AttrFunc<RecyclerView.ChildDrawingOrderCallback> {
    public static final ChildDrawingOrderCallbackFunc8f7418a2 instance = new ChildDrawingOrderCallbackFunc8f7418a2();

    public void apply(View v, final RecyclerView.ChildDrawingOrderCallback arg, final RecyclerView.ChildDrawingOrderCallback old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setChildDrawingOrderCallback(arg);
      }
    }
  }

  private static final class HasFixedSizeFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HasFixedSizeFunc148d6054 instance = new HasFixedSizeFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setHasFixedSize(arg);
      }
    }
  }

  private static final class ItemAnimatorFunc2b975049 implements Anvil.AttrFunc<RecyclerView.ItemAnimator> {
    public static final ItemAnimatorFunc2b975049 instance = new ItemAnimatorFunc2b975049();

    public void apply(View v, final RecyclerView.ItemAnimator arg, final RecyclerView.ItemAnimator old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setItemAnimator(arg);
      }
    }
  }

  private static final class ItemViewCacheSizeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ItemViewCacheSizeFunc8567756a instance = new ItemViewCacheSizeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setItemViewCacheSize(arg);
      }
    }
  }

  private static final class LayoutFrozenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final LayoutFrozenFunc148d6054 instance = new LayoutFrozenFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setLayoutFrozen(arg);
      }
    }
  }

  private static final class LayoutManagerFuncbb50c5d4 implements Anvil.AttrFunc<RecyclerView.LayoutManager> {
    public static final LayoutManagerFuncbb50c5d4 instance = new LayoutManagerFuncbb50c5d4();

    public void apply(View v, final RecyclerView.LayoutManager arg, final RecyclerView.LayoutManager old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setLayoutManager(arg);
      }
    }
  }

  private static final class NestedScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final NestedScrollingEnabledFunc148d6054 instance = new NestedScrollingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setNestedScrollingEnabled(arg);
      }
    }
  }

  private static final class RecycledViewPoolFuncf2dc961 implements Anvil.AttrFunc<RecyclerView.RecycledViewPool> {
    public static final RecycledViewPoolFuncf2dc961 instance = new RecycledViewPoolFuncf2dc961();

    public void apply(View v, final RecyclerView.RecycledViewPool arg, final RecyclerView.RecycledViewPool old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setRecycledViewPool(arg);
      }
    }
  }

  private static final class RecyclerListenerFunc33e333c2 implements Anvil.AttrFunc<RecyclerView.RecyclerListener> {
    public static final RecyclerListenerFunc33e333c2 instance = new RecyclerListenerFunc33e333c2();

    public void apply(View v, final RecyclerView.RecyclerListener arg, final RecyclerView.RecyclerListener old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setRecyclerListener(arg);
      }
    }
  }

  private static final class ScrollingTouchSlopFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollingTouchSlopFunc8567756a instance = new ScrollingTouchSlopFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setScrollingTouchSlop(arg);
      }
    }
  }

  private static final class ViewCacheExtensionFuncd98d0ad1 implements Anvil.AttrFunc<RecyclerView.ViewCacheExtension> {
    public static final ViewCacheExtensionFuncd98d0ad1 instance = new ViewCacheExtensionFuncd98d0ad1();

    public void apply(View v, final RecyclerView.ViewCacheExtension arg, final RecyclerView.ViewCacheExtension old) {
      if (v instanceof RecyclerView) {
        ((RecyclerView) v).setViewCacheExtension(arg);
      }
    }
  }
}