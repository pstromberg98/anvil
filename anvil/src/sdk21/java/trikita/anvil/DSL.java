package trikita.anvil;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import android.app.LocalActivityManager;
import android.app.MediaRouteButton;
import android.app.SearchableInfo;
import android.appwidget.AppWidgetHostView;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.ExtractEditText;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.MediaPlayer;
import android.media.tv.TvView;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import android.view.inputmethod.ExtractedText;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsSpinner;
import android.widget.AbsoluteLayout;
import android.widget.ActionMenuView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.CursorAdapter;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.MultiAutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.Toolbar;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Locale;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateSDK21DSL}.
 * It contains views and their setters from API level 21.
 * Please, don't edit it manually unless for debugging.
 */
public final class DSL extends BaseDSL {
  public static BaseDSL.ViewClassResult fragmentBreadCrumbs() {
    return BaseDSL.v(FragmentBreadCrumbs.class);
  }

  public static Void fragmentBreadCrumbs(Anvil.Renderable r) {
    return BaseDSL.v(FragmentBreadCrumbs.class, r);
  }

  public static BaseDSL.ViewClassResult mediaRouteButton() {
    return BaseDSL.v(MediaRouteButton.class);
  }

  public static Void mediaRouteButton(Anvil.Renderable r) {
    return BaseDSL.v(MediaRouteButton.class, r);
  }

  public static BaseDSL.ViewClassResult appWidgetHostView() {
    return BaseDSL.v(AppWidgetHostView.class);
  }

  public static Void appWidgetHostView(Anvil.Renderable r) {
    return BaseDSL.v(AppWidgetHostView.class, r);
  }

  public static BaseDSL.ViewClassResult gestureOverlayView() {
    return BaseDSL.v(GestureOverlayView.class);
  }

  public static Void gestureOverlayView(Anvil.Renderable r) {
    return BaseDSL.v(GestureOverlayView.class, r);
  }

  public static BaseDSL.ViewClassResult extractEditText() {
    return BaseDSL.v(ExtractEditText.class);
  }

  public static Void extractEditText(Anvil.Renderable r) {
    return BaseDSL.v(ExtractEditText.class, r);
  }

  public static BaseDSL.ViewClassResult keyboardView() {
    return BaseDSL.v(KeyboardView.class);
  }

  public static Void keyboardView(Anvil.Renderable r) {
    return BaseDSL.v(KeyboardView.class, r);
  }

  public static BaseDSL.ViewClassResult tvView() {
    return BaseDSL.v(TvView.class);
  }

  public static Void tvView(Anvil.Renderable r) {
    return BaseDSL.v(TvView.class, r);
  }

  public static BaseDSL.ViewClassResult gLSurfaceView() {
    return BaseDSL.v(GLSurfaceView.class);
  }

  public static Void gLSurfaceView(Anvil.Renderable r) {
    return BaseDSL.v(GLSurfaceView.class, r);
  }

  public static BaseDSL.ViewClassResult surfaceView() {
    return BaseDSL.v(SurfaceView.class);
  }

  public static Void surfaceView(Anvil.Renderable r) {
    return BaseDSL.v(SurfaceView.class, r);
  }

  public static BaseDSL.ViewClassResult textureView() {
    return BaseDSL.v(TextureView.class);
  }

  public static Void textureView(Anvil.Renderable r) {
    return BaseDSL.v(TextureView.class, r);
  }

  public static BaseDSL.ViewClassResult view() {
    return BaseDSL.v(View.class);
  }

  public static Void view(Anvil.Renderable r) {
    return BaseDSL.v(View.class, r);
  }

  public static BaseDSL.ViewClassResult viewGroup() {
    return BaseDSL.v(ViewGroup.class);
  }

  public static Void viewGroup(Anvil.Renderable r) {
    return BaseDSL.v(ViewGroup.class, r);
  }

  public static BaseDSL.ViewClassResult viewStub() {
    return BaseDSL.v(ViewStub.class);
  }

  public static Void viewStub(Anvil.Renderable r) {
    return BaseDSL.v(ViewStub.class, r);
  }

  public static BaseDSL.ViewClassResult webView() {
    return BaseDSL.v(WebView.class);
  }

  public static Void webView(Anvil.Renderable r) {
    return BaseDSL.v(WebView.class, r);
  }

  public static BaseDSL.ViewClassResult absListView() {
    return BaseDSL.v(AbsListView.class);
  }

  public static Void absListView(Anvil.Renderable r) {
    return BaseDSL.v(AbsListView.class, r);
  }

  public static BaseDSL.ViewClassResult absSeekBar() {
    return BaseDSL.v(AbsSeekBar.class);
  }

  public static Void absSeekBar(Anvil.Renderable r) {
    return BaseDSL.v(AbsSeekBar.class, r);
  }

  public static BaseDSL.ViewClassResult absSpinner() {
    return BaseDSL.v(AbsSpinner.class);
  }

  public static Void absSpinner(Anvil.Renderable r) {
    return BaseDSL.v(AbsSpinner.class, r);
  }

  public static BaseDSL.ViewClassResult absoluteLayout() {
    return BaseDSL.v(AbsoluteLayout.class);
  }

  public static Void absoluteLayout(Anvil.Renderable r) {
    return BaseDSL.v(AbsoluteLayout.class, r);
  }

  public static BaseDSL.ViewClassResult actionMenuView() {
    return BaseDSL.v(ActionMenuView.class);
  }

  public static Void actionMenuView(Anvil.Renderable r) {
    return BaseDSL.v(ActionMenuView.class, r);
  }

  public static BaseDSL.ViewClassResult adapterView() {
    return BaseDSL.v(AdapterView.class);
  }

  public static Void adapterView(Anvil.Renderable r) {
    return BaseDSL.v(AdapterView.class, r);
  }

  public static BaseDSL.ViewClassResult adapterViewAnimator() {
    return BaseDSL.v(AdapterViewAnimator.class);
  }

  public static Void adapterViewAnimator(Anvil.Renderable r) {
    return BaseDSL.v(AdapterViewAnimator.class, r);
  }

  public static BaseDSL.ViewClassResult adapterViewFlipper() {
    return BaseDSL.v(AdapterViewFlipper.class);
  }

  public static Void adapterViewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(AdapterViewFlipper.class, r);
  }

  public static BaseDSL.ViewClassResult analogClock() {
    return BaseDSL.v(AnalogClock.class);
  }

  public static Void analogClock(Anvil.Renderable r) {
    return BaseDSL.v(AnalogClock.class, r);
  }

  public static BaseDSL.ViewClassResult autoCompleteTextView() {
    return BaseDSL.v(AutoCompleteTextView.class);
  }

  public static Void autoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(AutoCompleteTextView.class, r);
  }

  public static BaseDSL.ViewClassResult button() {
    return BaseDSL.v(Button.class);
  }

  public static Void button(Anvil.Renderable r) {
    return BaseDSL.v(Button.class, r);
  }

  public static BaseDSL.ViewClassResult calendarView() {
    return BaseDSL.v(CalendarView.class);
  }

  public static Void calendarView(Anvil.Renderable r) {
    return BaseDSL.v(CalendarView.class, r);
  }

  public static BaseDSL.ViewClassResult checkBox() {
    return BaseDSL.v(CheckBox.class);
  }

  public static Void checkBox(Anvil.Renderable r) {
    return BaseDSL.v(CheckBox.class, r);
  }

  public static BaseDSL.ViewClassResult checkedTextView() {
    return BaseDSL.v(CheckedTextView.class);
  }

  public static Void checkedTextView(Anvil.Renderable r) {
    return BaseDSL.v(CheckedTextView.class, r);
  }

  public static BaseDSL.ViewClassResult chronometer() {
    return BaseDSL.v(Chronometer.class);
  }

  public static Void chronometer(Anvil.Renderable r) {
    return BaseDSL.v(Chronometer.class, r);
  }

  public static BaseDSL.ViewClassResult compoundButton() {
    return BaseDSL.v(CompoundButton.class);
  }

  public static Void compoundButton(Anvil.Renderable r) {
    return BaseDSL.v(CompoundButton.class, r);
  }

  public static BaseDSL.ViewClassResult datePicker() {
    return BaseDSL.v(DatePicker.class);
  }

  public static Void datePicker(Anvil.Renderable r) {
    return BaseDSL.v(DatePicker.class, r);
  }

  public static BaseDSL.ViewClassResult dialerFilter() {
    return BaseDSL.v(DialerFilter.class);
  }

  public static Void dialerFilter(Anvil.Renderable r) {
    return BaseDSL.v(DialerFilter.class, r);
  }

  public static BaseDSL.ViewClassResult digitalClock() {
    return BaseDSL.v(DigitalClock.class);
  }

  public static Void digitalClock(Anvil.Renderable r) {
    return BaseDSL.v(DigitalClock.class, r);
  }

  public static BaseDSL.ViewClassResult editText() {
    return BaseDSL.v(EditText.class);
  }

  public static Void editText(Anvil.Renderable r) {
    return BaseDSL.v(EditText.class, r);
  }

  public static BaseDSL.ViewClassResult expandableListView() {
    return BaseDSL.v(ExpandableListView.class);
  }

  public static Void expandableListView(Anvil.Renderable r) {
    return BaseDSL.v(ExpandableListView.class, r);
  }

  public static BaseDSL.ViewClassResult frameLayout() {
    return BaseDSL.v(FrameLayout.class);
  }

  public static Void frameLayout(Anvil.Renderable r) {
    return BaseDSL.v(FrameLayout.class, r);
  }

  public static BaseDSL.ViewClassResult gallery() {
    return BaseDSL.v(Gallery.class);
  }

  public static Void gallery(Anvil.Renderable r) {
    return BaseDSL.v(Gallery.class, r);
  }

  public static BaseDSL.ViewClassResult gridLayout() {
    return BaseDSL.v(GridLayout.class);
  }

  public static Void gridLayout(Anvil.Renderable r) {
    return BaseDSL.v(GridLayout.class, r);
  }

  public static BaseDSL.ViewClassResult gridView() {
    return BaseDSL.v(GridView.class);
  }

  public static Void gridView(Anvil.Renderable r) {
    return BaseDSL.v(GridView.class, r);
  }

  public static BaseDSL.ViewClassResult horizontalScrollView() {
    return BaseDSL.v(HorizontalScrollView.class);
  }

  public static Void horizontalScrollView(Anvil.Renderable r) {
    return BaseDSL.v(HorizontalScrollView.class, r);
  }

  public static BaseDSL.ViewClassResult imageButton() {
    return BaseDSL.v(ImageButton.class);
  }

  public static Void imageButton(Anvil.Renderable r) {
    return BaseDSL.v(ImageButton.class, r);
  }

  public static BaseDSL.ViewClassResult imageSwitcher() {
    return BaseDSL.v(ImageSwitcher.class);
  }

  public static Void imageSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ImageSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult imageView() {
    return BaseDSL.v(ImageView.class);
  }

  public static Void imageView(Anvil.Renderable r) {
    return BaseDSL.v(ImageView.class, r);
  }

  public static BaseDSL.ViewClassResult linearLayout() {
    return BaseDSL.v(LinearLayout.class);
  }

  public static Void linearLayout(Anvil.Renderable r) {
    return BaseDSL.v(LinearLayout.class, r);
  }

  public static BaseDSL.ViewClassResult listView() {
    return BaseDSL.v(ListView.class);
  }

  public static Void listView(Anvil.Renderable r) {
    return BaseDSL.v(ListView.class, r);
  }

  public static BaseDSL.ViewClassResult mediaController() {
    return BaseDSL.v(MediaController.class);
  }

  public static Void mediaController(Anvil.Renderable r) {
    return BaseDSL.v(MediaController.class, r);
  }

  public static BaseDSL.ViewClassResult multiAutoCompleteTextView() {
    return BaseDSL.v(MultiAutoCompleteTextView.class);
  }

  public static Void multiAutoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(MultiAutoCompleteTextView.class, r);
  }

  public static BaseDSL.ViewClassResult numberPicker() {
    return BaseDSL.v(NumberPicker.class);
  }

  public static Void numberPicker(Anvil.Renderable r) {
    return BaseDSL.v(NumberPicker.class, r);
  }

  public static BaseDSL.ViewClassResult progressBar() {
    return BaseDSL.v(ProgressBar.class);
  }

  public static Void progressBar(Anvil.Renderable r) {
    return BaseDSL.v(ProgressBar.class, r);
  }

  public static BaseDSL.ViewClassResult quickContactBadge() {
    return BaseDSL.v(QuickContactBadge.class);
  }

  public static Void quickContactBadge(Anvil.Renderable r) {
    return BaseDSL.v(QuickContactBadge.class, r);
  }

  public static BaseDSL.ViewClassResult radioButton() {
    return BaseDSL.v(RadioButton.class);
  }

  public static Void radioButton(Anvil.Renderable r) {
    return BaseDSL.v(RadioButton.class, r);
  }

  public static BaseDSL.ViewClassResult radioGroup() {
    return BaseDSL.v(RadioGroup.class);
  }

  public static Void radioGroup(Anvil.Renderable r) {
    return BaseDSL.v(RadioGroup.class, r);
  }

  public static BaseDSL.ViewClassResult ratingBar() {
    return BaseDSL.v(RatingBar.class);
  }

  public static Void ratingBar(Anvil.Renderable r) {
    return BaseDSL.v(RatingBar.class, r);
  }

  public static BaseDSL.ViewClassResult relativeLayout() {
    return BaseDSL.v(RelativeLayout.class);
  }

  public static Void relativeLayout(Anvil.Renderable r) {
    return BaseDSL.v(RelativeLayout.class, r);
  }

  public static BaseDSL.ViewClassResult scrollView() {
    return BaseDSL.v(ScrollView.class);
  }

  public static Void scrollView(Anvil.Renderable r) {
    return BaseDSL.v(ScrollView.class, r);
  }

  public static BaseDSL.ViewClassResult searchView() {
    return BaseDSL.v(SearchView.class);
  }

  public static Void searchView(Anvil.Renderable r) {
    return BaseDSL.v(SearchView.class, r);
  }

  public static BaseDSL.ViewClassResult seekBar() {
    return BaseDSL.v(SeekBar.class);
  }

  public static Void seekBar(Anvil.Renderable r) {
    return BaseDSL.v(SeekBar.class, r);
  }

  public static BaseDSL.ViewClassResult slidingDrawer() {
    return BaseDSL.v(SlidingDrawer.class);
  }

  public static Void slidingDrawer(Anvil.Renderable r) {
    return BaseDSL.v(SlidingDrawer.class, r);
  }

  public static BaseDSL.ViewClassResult space() {
    return BaseDSL.v(Space.class);
  }

  public static Void space(Anvil.Renderable r) {
    return BaseDSL.v(Space.class, r);
  }

  public static BaseDSL.ViewClassResult spinner() {
    return BaseDSL.v(Spinner.class);
  }

  public static Void spinner(Anvil.Renderable r) {
    return BaseDSL.v(Spinner.class, r);
  }

  public static BaseDSL.ViewClassResult stackView() {
    return BaseDSL.v(StackView.class);
  }

  public static Void stackView(Anvil.Renderable r) {
    return BaseDSL.v(StackView.class, r);
  }

  public static BaseDSL.ViewClassResult switchView() {
    return BaseDSL.v(Switch.class);
  }

  public static Void switchView(Anvil.Renderable r) {
    return BaseDSL.v(Switch.class, r);
  }

  public static BaseDSL.ViewClassResult tabHost() {
    return BaseDSL.v(TabHost.class);
  }

  public static Void tabHost(Anvil.Renderable r) {
    return BaseDSL.v(TabHost.class, r);
  }

  public static BaseDSL.ViewClassResult tabWidget() {
    return BaseDSL.v(TabWidget.class);
  }

  public static Void tabWidget(Anvil.Renderable r) {
    return BaseDSL.v(TabWidget.class, r);
  }

  public static BaseDSL.ViewClassResult tableLayout() {
    return BaseDSL.v(TableLayout.class);
  }

  public static Void tableLayout(Anvil.Renderable r) {
    return BaseDSL.v(TableLayout.class, r);
  }

  public static BaseDSL.ViewClassResult tableRow() {
    return BaseDSL.v(TableRow.class);
  }

  public static Void tableRow(Anvil.Renderable r) {
    return BaseDSL.v(TableRow.class, r);
  }

  public static BaseDSL.ViewClassResult textClock() {
    return BaseDSL.v(TextClock.class);
  }

  public static Void textClock(Anvil.Renderable r) {
    return BaseDSL.v(TextClock.class, r);
  }

  public static BaseDSL.ViewClassResult textSwitcher() {
    return BaseDSL.v(TextSwitcher.class);
  }

  public static Void textSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(TextSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult textView() {
    return BaseDSL.v(TextView.class);
  }

  public static Void textView(Anvil.Renderable r) {
    return BaseDSL.v(TextView.class, r);
  }

  public static BaseDSL.ViewClassResult timePicker() {
    return BaseDSL.v(TimePicker.class);
  }

  public static Void timePicker(Anvil.Renderable r) {
    return BaseDSL.v(TimePicker.class, r);
  }

  public static BaseDSL.ViewClassResult toggleButton() {
    return BaseDSL.v(ToggleButton.class);
  }

  public static Void toggleButton(Anvil.Renderable r) {
    return BaseDSL.v(ToggleButton.class, r);
  }

  public static BaseDSL.ViewClassResult toolbar() {
    return BaseDSL.v(Toolbar.class);
  }

  public static Void toolbar(Anvil.Renderable r) {
    return BaseDSL.v(Toolbar.class, r);
  }

  public static BaseDSL.ViewClassResult twoLineListItem() {
    return BaseDSL.v(TwoLineListItem.class);
  }

  public static Void twoLineListItem(Anvil.Renderable r) {
    return BaseDSL.v(TwoLineListItem.class, r);
  }

  public static BaseDSL.ViewClassResult videoView() {
    return BaseDSL.v(VideoView.class);
  }

  public static Void videoView(Anvil.Renderable r) {
    return BaseDSL.v(VideoView.class, r);
  }

  public static BaseDSL.ViewClassResult viewAnimator() {
    return BaseDSL.v(ViewAnimator.class);
  }

  public static Void viewAnimator(Anvil.Renderable r) {
    return BaseDSL.v(ViewAnimator.class, r);
  }

  public static BaseDSL.ViewClassResult viewFlipper() {
    return BaseDSL.v(ViewFlipper.class);
  }

  public static Void viewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(ViewFlipper.class, r);
  }

  public static BaseDSL.ViewClassResult viewSwitcher() {
    return BaseDSL.v(ViewSwitcher.class);
  }

  public static Void viewSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ViewSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult zoomButton() {
    return BaseDSL.v(ZoomButton.class);
  }

  public static Void zoomButton(Anvil.Renderable r) {
    return BaseDSL.v(ZoomButton.class, r);
  }

  public static BaseDSL.ViewClassResult zoomControls() {
    return BaseDSL.v(ZoomControls.class);
  }

  public static Void zoomControls(Anvil.Renderable r) {
    return BaseDSL.v(ZoomControls.class, r);
  }

  public static Void accessibilityDelegate(View.AccessibilityDelegate arg) {
    return BaseDSL.attr(AccessibilityDelegateFuncf6d047d4.instance, arg);
  }

  public static Void accessibilityLiveRegion(int arg) {
    return BaseDSL.attr(AccessibilityLiveRegionFunc8567756a.instance, arg);
  }

  public static Void activated(boolean arg) {
    return BaseDSL.attr(ActivatedFunc148d6054.instance, arg);
  }

  public static Void activity(Activity arg) {
    return BaseDSL.attr(ActivityFunccb86c57b.instance, arg);
  }

  public static Void adapter(Adapter arg) {
    return BaseDSL.attr(AdapterFunc1b2776e4.instance, arg);
  }

  public static Void adapter(ExpandableListAdapter arg) {
    return BaseDSL.attr(AdapterFunc9c589812.instance, arg);
  }

  public static Void addStatesFromChildren(boolean arg) {
    return BaseDSL.attr(AddStatesFromChildrenFunc148d6054.instance, arg);
  }

  public static Void adjustViewBounds(boolean arg) {
    return BaseDSL.attr(AdjustViewBoundsFunc148d6054.instance, arg);
  }

  public static Void alignmentMode(int arg) {
    return BaseDSL.attr(AlignmentModeFunc8567756a.instance, arg);
  }

  public static Void allCaps(boolean arg) {
    return BaseDSL.attr(AllCapsFunc148d6054.instance, arg);
  }

  public static Void alpha(float arg) {
    return BaseDSL.attr(AlphaFunce0893188.instance, arg);
  }

  public static Void alwaysDrawnWithCacheEnabled(boolean arg) {
    return BaseDSL.attr(AlwaysDrawnWithCacheEnabledFunc148d6054.instance, arg);
  }

  public static Void anchorView(View arg) {
    return BaseDSL.attr(AnchorViewFunc6c3617af.instance, arg);
  }

  public static Void animateFirstView(boolean arg) {
    return BaseDSL.attr(AnimateFirstViewFunc148d6054.instance, arg);
  }

  public static Void animation(Animation arg) {
    return BaseDSL.attr(AnimationFunc76cb7b50.instance, arg);
  }

  public static Void animationCacheEnabled(boolean arg) {
    return BaseDSL.attr(AnimationCacheEnabledFunc148d6054.instance, arg);
  }

  public static Void animationDuration(int arg) {
    return BaseDSL.attr(AnimationDurationFunc8567756a.instance, arg);
  }

  public static Void autoLinkMask(int arg) {
    return BaseDSL.attr(AutoLinkMaskFunc8567756a.instance, arg);
  }

  public static Void autoStart(boolean arg) {
    return BaseDSL.attr(AutoStartFunc148d6054.instance, arg);
  }

  public static Void background(Drawable arg) {
    return BaseDSL.attr(BackgroundFuncfb47464a.instance, arg);
  }

  public static Void backgroundColor(int arg) {
    return BaseDSL.attr(BackgroundColorFunc8567756a.instance, arg);
  }

  public static Void backgroundResource(int arg) {
    return BaseDSL.attr(BackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void backgroundTintList(ColorStateList arg) {
    return BaseDSL.attr(BackgroundTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void backgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(BackgroundTintModeFuncabb7a84e.instance, arg);
  }

  public static Void base(long arg) {
    return BaseDSL.attr(BaseFunc17c521d0.instance, arg);
  }

  public static Void baseline(int arg) {
    return BaseDSL.attr(BaselineFunc8567756a.instance, arg);
  }

  public static Void baselineAlignBottom(boolean arg) {
    return BaseDSL.attr(BaselineAlignBottomFunc148d6054.instance, arg);
  }

  public static Void baselineAligned(boolean arg) {
    return BaseDSL.attr(BaselineAlignedFunc148d6054.instance, arg);
  }

  public static Void baselineAlignedChildIndex(int arg) {
    return BaseDSL.attr(BaselineAlignedChildIndexFunc8567756a.instance, arg);
  }

  public static Void bottom(int arg) {
    return BaseDSL.attr(BottomFunc8567756a.instance, arg);
  }

  public static Void buttonDrawable(Drawable arg) {
    return BaseDSL.attr(ButtonDrawableFuncfb47464a.instance, arg);
  }

  public static Void buttonDrawable(int arg) {
    return BaseDSL.attr(ButtonDrawableFunc8567756a.instance, arg);
  }

  public static Void buttonTintList(ColorStateList arg) {
    return BaseDSL.attr(ButtonTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void buttonTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ButtonTintModeFuncabb7a84e.instance, arg);
  }

  public static Void cacheColorHint(int arg) {
    return BaseDSL.attr(CacheColorHintFunc8567756a.instance, arg);
  }

  public static Void calendarViewShown(boolean arg) {
    return BaseDSL.attr(CalendarViewShownFunc148d6054.instance, arg);
  }

  public static Void callback(TvView.TvInputCallback arg) {
    return BaseDSL.attr(CallbackFuncca7d3f09.instance, arg);
  }

  public static Void callbackDuringFling(boolean arg) {
    return BaseDSL.attr(CallbackDuringFlingFunc148d6054.instance, arg);
  }

  public static Void cameraDistance(float arg) {
    return BaseDSL.attr(CameraDistanceFunce0893188.instance, arg);
  }

  public static Void captionEnabled(boolean arg) {
    return BaseDSL.attr(CaptionEnabledFunc148d6054.instance, arg);
  }

  public static Void checkMarkDrawable(Drawable arg) {
    return BaseDSL.attr(CheckMarkDrawableFuncfb47464a.instance, arg);
  }

  public static Void checkMarkDrawable(int arg) {
    return BaseDSL.attr(CheckMarkDrawableFunc8567756a.instance, arg);
  }

  public static Void checkMarkTintList(ColorStateList arg) {
    return BaseDSL.attr(CheckMarkTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void checkMarkTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(CheckMarkTintModeFuncabb7a84e.instance, arg);
  }

  public static Void checked(boolean arg) {
    return BaseDSL.attr(CheckedFunc148d6054.instance, arg);
  }

  public static Void childDivider(Drawable arg) {
    return BaseDSL.attr(ChildDividerFuncfb47464a.instance, arg);
  }

  public static Void childIndicator(Drawable arg) {
    return BaseDSL.attr(ChildIndicatorFuncfb47464a.instance, arg);
  }

  public static Void choiceMode(int arg) {
    return BaseDSL.attr(ChoiceModeFunc8567756a.instance, arg);
  }

  public static Void clickable(boolean arg) {
    return BaseDSL.attr(ClickableFunc148d6054.instance, arg);
  }

  public static Void clipBounds(Rect arg) {
    return BaseDSL.attr(ClipBoundsFunc1cc93e48.instance, arg);
  }

  public static Void clipChildren(boolean arg) {
    return BaseDSL.attr(ClipChildrenFunc148d6054.instance, arg);
  }

  public static Void clipToOutline(boolean arg) {
    return BaseDSL.attr(ClipToOutlineFunc148d6054.instance, arg);
  }

  public static Void clipToPadding(boolean arg) {
    return BaseDSL.attr(ClipToPaddingFunc148d6054.instance, arg);
  }

  public static Void colorFilter(ColorFilter arg) {
    return BaseDSL.attr(ColorFilterFunc6bb7b3d7.instance, arg);
  }

  public static Void colorFilter(int arg) {
    return BaseDSL.attr(ColorFilterFunc8567756a.instance, arg);
  }

  public static Void columnCount(int arg) {
    return BaseDSL.attr(ColumnCountFunc8567756a.instance, arg);
  }

  public static Void columnOrderPreserved(boolean arg) {
    return BaseDSL.attr(ColumnOrderPreservedFunc148d6054.instance, arg);
  }

  public static Void columnWidth(int arg) {
    return BaseDSL.attr(ColumnWidthFunc8567756a.instance, arg);
  }

  public static Void completionHint(CharSequence arg) {
    return BaseDSL.attr(CompletionHintFuncc0af808b.instance, arg);
  }

  public static Void compoundDrawablePadding(int arg) {
    return BaseDSL.attr(CompoundDrawablePaddingFunc8567756a.instance, arg);
  }

  public static Void contentDescription(CharSequence arg) {
    return BaseDSL.attr(ContentDescriptionFuncc0af808b.instance, arg);
  }

  public static Void cropToPadding(boolean arg) {
    return BaseDSL.attr(CropToPaddingFunc148d6054.instance, arg);
  }

  public static Void currentHour(Integer arg) {
    return BaseDSL.attr(CurrentHourFunc8567756a.instance, arg);
  }

  public static Void currentMinute(Integer arg) {
    return BaseDSL.attr(CurrentMinuteFunc8567756a.instance, arg);
  }

  public static Void currentTab(int arg) {
    return BaseDSL.attr(CurrentTabFunc8567756a.instance, arg);
  }

  public static Void currentTabByTag(String arg) {
    return BaseDSL.attr(CurrentTabByTagFunc473e3665.instance, arg);
  }

  public static Void currentText(CharSequence arg) {
    return BaseDSL.attr(CurrentTextFuncc0af808b.instance, arg);
  }

  public static Void cursorVisible(boolean arg) {
    return BaseDSL.attr(CursorVisibleFunc148d6054.instance, arg);
  }

  public static Void customSelectionActionModeCallback(ActionMode.Callback arg) {
    return BaseDSL.attr(CustomSelectionActionModeCallbackFunc57558b70.instance, arg);
  }

  public static Void date(long arg) {
    return BaseDSL.attr(DateFunc17c521d0.instance, arg);
  }

  public static Void dateTextAppearance(int arg) {
    return BaseDSL.attr(DateTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void debugFlags(int arg) {
    return BaseDSL.attr(DebugFlagsFunc8567756a.instance, arg);
  }

  public static Void descendantFocusability(int arg) {
    return BaseDSL.attr(DescendantFocusabilityFunc8567756a.instance, arg);
  }

  public static Void digitsWatcher(TextWatcher arg) {
    return BaseDSL.attr(DigitsWatcherFuncb32320d.instance, arg);
  }

  public static Void displayedChild(int arg) {
    return BaseDSL.attr(DisplayedChildFunc8567756a.instance, arg);
  }

  public static Void displayedValues(String[] arg) {
    return BaseDSL.attr(DisplayedValuesFunc708a3c87.instance, arg);
  }

  public static Void divider(Drawable arg) {
    return BaseDSL.attr(DividerFuncfb47464a.instance, arg);
  }

  public static Void dividerDrawable(Drawable arg) {
    return BaseDSL.attr(DividerDrawableFuncfb47464a.instance, arg);
  }

  public static Void dividerDrawable(int arg) {
    return BaseDSL.attr(DividerDrawableFunc8567756a.instance, arg);
  }

  public static Void dividerHeight(int arg) {
    return BaseDSL.attr(DividerHeightFunc8567756a.instance, arg);
  }

  public static Void dividerPadding(int arg) {
    return BaseDSL.attr(DividerPaddingFunc8567756a.instance, arg);
  }

  public static Void downloadListener(DownloadListener arg) {
    return BaseDSL.attr(DownloadListenerFunc34ae5869.instance, arg);
  }

  public static Void drawSelectorOnTop(boolean arg) {
    return BaseDSL.attr(DrawSelectorOnTopFunc148d6054.instance, arg);
  }

  public static Void drawingCacheBackgroundColor(int arg) {
    return BaseDSL.attr(DrawingCacheBackgroundColorFunc8567756a.instance, arg);
  }

  public static Void drawingCacheEnabled(boolean arg) {
    return BaseDSL.attr(DrawingCacheEnabledFunc148d6054.instance, arg);
  }

  public static Void drawingCacheQuality(int arg) {
    return BaseDSL.attr(DrawingCacheQualityFunc8567756a.instance, arg);
  }

  public static Void dropDownAnchor(int arg) {
    return BaseDSL.attr(DropDownAnchorFunc8567756a.instance, arg);
  }

  public static Void dropDownBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr(DropDownBackgroundDrawableFuncfb47464a.instance, arg);
  }

  public static Void dropDownBackgroundResource(int arg) {
    return BaseDSL.attr(DropDownBackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void dropDownHeight(int arg) {
    return BaseDSL.attr(DropDownHeightFunc8567756a.instance, arg);
  }

  public static Void dropDownHorizontalOffset(int arg) {
    return BaseDSL.attr(DropDownHorizontalOffsetFunc8567756a.instance, arg);
  }

  public static Void dropDownVerticalOffset(int arg) {
    return BaseDSL.attr(DropDownVerticalOffsetFunc8567756a.instance, arg);
  }

  public static Void dropDownWidth(int arg) {
    return BaseDSL.attr(DropDownWidthFunc8567756a.instance, arg);
  }

  public static Void duplicateParentStateEnabled(boolean arg) {
    return BaseDSL.attr(DuplicateParentStateEnabledFunc148d6054.instance, arg);
  }

  public static Void eGLConfigChooser(GLSurfaceView.EGLConfigChooser arg) {
    return BaseDSL.attr(EGLConfigChooserFuncb283fdb0.instance, arg);
  }

  public static Void eGLConfigChooser(boolean arg) {
    return BaseDSL.attr(EGLConfigChooserFunc148d6054.instance, arg);
  }

  public static Void eGLContextClientVersion(int arg) {
    return BaseDSL.attr(EGLContextClientVersionFunc8567756a.instance, arg);
  }

  public static Void eGLContextFactory(GLSurfaceView.EGLContextFactory arg) {
    return BaseDSL.attr(EGLContextFactoryFunc8cdc7924.instance, arg);
  }

  public static Void eGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory arg) {
    return BaseDSL.attr(EGLWindowSurfaceFactoryFunc204911b6.instance, arg);
  }

  public static Void editableFactory(Editable.Factory arg) {
    return BaseDSL.attr(EditableFactoryFunc1efa17e2.instance, arg);
  }

  public static Void elegantTextHeight(boolean arg) {
    return BaseDSL.attr(ElegantTextHeightFunc148d6054.instance, arg);
  }

  public static Void elevation(float arg) {
    return BaseDSL.attr(ElevationFunce0893188.instance, arg);
  }

  public static Void ellipsize(TextUtils.TruncateAt arg) {
    return BaseDSL.attr(EllipsizeFunc63cb4885.instance, arg);
  }

  public static Void emptyView(View arg) {
    return BaseDSL.attr(EmptyViewFunc6c3617af.instance, arg);
  }

  public static Void ems(int arg) {
    return BaseDSL.attr(EmsFunc8567756a.instance, arg);
  }

  public static Void enabled(boolean arg) {
    return BaseDSL.attr(EnabledFunc148d6054.instance, arg);
  }

  public static Void error(CharSequence arg) {
    return BaseDSL.attr(ErrorFuncc0af808b.instance, arg);
  }

  public static Void eventsInterceptionEnabled(boolean arg) {
    return BaseDSL.attr(EventsInterceptionEnabledFunc148d6054.instance, arg);
  }

  public static Void excludeMimes(String[] arg) {
    return BaseDSL.attr(ExcludeMimesFunc708a3c87.instance, arg);
  }

  public static Void extendedSettingsClickListener(View.OnClickListener arg) {
    return BaseDSL.attr(ExtendedSettingsClickListenerFunc79a13a5e.instance, arg);
  }

  public static Void extractedText(ExtractedText arg) {
    return BaseDSL.attr(ExtractedTextFunc410b6fe0.instance, arg);
  }

  public static Void factory(ViewSwitcher.ViewFactory arg) {
    return BaseDSL.attr(FactoryFunc6a48ea48.instance, arg);
  }

  public static Void fadeEnabled(boolean arg) {
    return BaseDSL.attr(FadeEnabledFunc148d6054.instance, arg);
  }

  public static Void fadeOffset(long arg) {
    return BaseDSL.attr(FadeOffsetFunc17c521d0.instance, arg);
  }

  public static Void fadingEdgeLength(int arg) {
    return BaseDSL.attr(FadingEdgeLengthFunc8567756a.instance, arg);
  }

  public static Void fastScrollAlwaysVisible(boolean arg) {
    return BaseDSL.attr(FastScrollAlwaysVisibleFunc148d6054.instance, arg);
  }

  public static Void fastScrollEnabled(boolean arg) {
    return BaseDSL.attr(FastScrollEnabledFunc148d6054.instance, arg);
  }

  public static Void fastScrollStyle(int arg) {
    return BaseDSL.attr(FastScrollStyleFunc8567756a.instance, arg);
  }

  public static Void fillViewport(boolean arg) {
    return BaseDSL.attr(FillViewportFunc148d6054.instance, arg);
  }

  public static Void filterText(String arg) {
    return BaseDSL.attr(FilterTextFunc473e3665.instance, arg);
  }

  public static Void filterTouchesWhenObscured(boolean arg) {
    return BaseDSL.attr(FilterTouchesWhenObscuredFunc148d6054.instance, arg);
  }

  public static Void filterWatcher(TextWatcher arg) {
    return BaseDSL.attr(FilterWatcherFuncb32320d.instance, arg);
  }

  public static Void filters(InputFilter[] arg) {
    return BaseDSL.attr(FiltersFuncfb505582.instance, arg);
  }

  public static Void findListener(WebView.FindListener arg) {
    return BaseDSL.attr(FindListenerFunc28f7f5ef.instance, arg);
  }

  public static Void firstDayOfWeek(int arg) {
    return BaseDSL.attr(FirstDayOfWeekFunc8567756a.instance, arg);
  }

  public static Void fitsSystemWindows(boolean arg) {
    return BaseDSL.attr(FitsSystemWindowsFunc148d6054.instance, arg);
  }

  public static Void flipInterval(int arg) {
    return BaseDSL.attr(FlipIntervalFunc8567756a.instance, arg);
  }

  public static Void focusable(boolean arg) {
    return BaseDSL.attr(FocusableFunc148d6054.instance, arg);
  }

  public static Void focusableInTouchMode(boolean arg) {
    return BaseDSL.attr(FocusableInTouchModeFunc148d6054.instance, arg);
  }

  public static Void focusedMonthDateColor(int arg) {
    return BaseDSL.attr(FocusedMonthDateColorFunc8567756a.instance, arg);
  }

  public static Void fontFeatureSettings(String arg) {
    return BaseDSL.attr(FontFeatureSettingsFunc473e3665.instance, arg);
  }

  public static Void footerDividersEnabled(boolean arg) {
    return BaseDSL.attr(FooterDividersEnabledFunc148d6054.instance, arg);
  }

  public static Void foreground(Drawable arg) {
    return BaseDSL.attr(ForegroundFuncfb47464a.instance, arg);
  }

  public static Void foregroundGravity(int arg) {
    return BaseDSL.attr(ForegroundGravityFunc8567756a.instance, arg);
  }

  public static Void foregroundTintList(ColorStateList arg) {
    return BaseDSL.attr(ForegroundTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void foregroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ForegroundTintModeFuncabb7a84e.instance, arg);
  }

  public static Void format(String arg) {
    return BaseDSL.attr(FormatFunc473e3665.instance, arg);
  }

  public static Void format12Hour(CharSequence arg) {
    return BaseDSL.attr(Format12HourFuncc0af808b.instance, arg);
  }

  public static Void format24Hour(CharSequence arg) {
    return BaseDSL.attr(Format24HourFuncc0af808b.instance, arg);
  }

  public static Void formatter(NumberPicker.Formatter arg) {
    return BaseDSL.attr(FormatterFunc5e27b07e.instance, arg);
  }

  public static Void freezesText(boolean arg) {
    return BaseDSL.attr(FreezesTextFunc148d6054.instance, arg);
  }

  public static Void friction(float arg) {
    return BaseDSL.attr(FrictionFunce0893188.instance, arg);
  }

  public static Void gLWrapper(GLSurfaceView.GLWrapper arg) {
    return BaseDSL.attr(GLWrapperFunc9520092d.instance, arg);
  }

  public static Void gesture(Gesture arg) {
    return BaseDSL.attr(GestureFunc15eb6005.instance, arg);
  }

  public static Void gestureColor(int arg) {
    return BaseDSL.attr(GestureColorFunc8567756a.instance, arg);
  }

  public static Void gestureStrokeAngleThreshold(float arg) {
    return BaseDSL.attr(GestureStrokeAngleThresholdFunce0893188.instance, arg);
  }

  public static Void gestureStrokeLengthThreshold(float arg) {
    return BaseDSL.attr(GestureStrokeLengthThresholdFunce0893188.instance, arg);
  }

  public static Void gestureStrokeSquarenessTreshold(float arg) {
    return BaseDSL.attr(GestureStrokeSquarenessTresholdFunce0893188.instance, arg);
  }

  public static Void gestureStrokeType(int arg) {
    return BaseDSL.attr(GestureStrokeTypeFunc8567756a.instance, arg);
  }

  public static Void gestureStrokeWidth(float arg) {
    return BaseDSL.attr(GestureStrokeWidthFunce0893188.instance, arg);
  }

  public static Void gestureVisible(boolean arg) {
    return BaseDSL.attr(GestureVisibleFunc148d6054.instance, arg);
  }

  public static Void gravity(int arg) {
    return BaseDSL.attr(GravityFunc8567756a.instance, arg);
  }

  public static Void groupIndicator(Drawable arg) {
    return BaseDSL.attr(GroupIndicatorFuncfb47464a.instance, arg);
  }

  public static Void hapticFeedbackEnabled(boolean arg) {
    return BaseDSL.attr(HapticFeedbackEnabledFunc148d6054.instance, arg);
  }

  public static Void hasTransientState(boolean arg) {
    return BaseDSL.attr(HasTransientStateFunc148d6054.instance, arg);
  }

  public static Void headerDividersEnabled(boolean arg) {
    return BaseDSL.attr(HeaderDividersEnabledFunc148d6054.instance, arg);
  }

  public static Void height(int arg) {
    return BaseDSL.attr(HeightFunc8567756a.instance, arg);
  }

  public static Void highlightColor(int arg) {
    return BaseDSL.attr(HighlightColorFunc8567756a.instance, arg);
  }

  public static Void hint(int arg) {
    return BaseDSL.attr(HintFunc8567756a.instance, arg);
  }

  public static Void hint(CharSequence arg) {
    return BaseDSL.attr(HintFuncc0af808b.instance, arg);
  }

  public static Void hintTextColor(ColorStateList arg) {
    return BaseDSL.attr(HintTextColorFunc9e5e0e4e.instance, arg);
  }

  public static Void hintTextColor(int arg) {
    return BaseDSL.attr(HintTextColorFunc8567756a.instance, arg);
  }

  public static Void horizontalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr(HorizontalFadingEdgeEnabledFunc148d6054.instance, arg);
  }

  public static Void horizontalGravity(int arg) {
    return BaseDSL.attr(HorizontalGravityFunc8567756a.instance, arg);
  }

  public static Void horizontalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr(HorizontalScrollBarEnabledFunc148d6054.instance, arg);
  }

  public static Void horizontalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr(HorizontalScrollbarOverlayFunc148d6054.instance, arg);
  }

  public static Void horizontalSpacing(int arg) {
    return BaseDSL.attr(HorizontalSpacingFunc8567756a.instance, arg);
  }

  public static Void horizontallyScrolling(boolean arg) {
    return BaseDSL.attr(HorizontallyScrollingFunc148d6054.instance, arg);
  }

  public static Void hovered(boolean arg) {
    return BaseDSL.attr(HoveredFunc148d6054.instance, arg);
  }

  public static Void iconified(boolean arg) {
    return BaseDSL.attr(IconifiedFunc148d6054.instance, arg);
  }

  public static Void iconifiedByDefault(boolean arg) {
    return BaseDSL.attr(IconifiedByDefaultFunc148d6054.instance, arg);
  }

  public static Void id(int arg) {
    return BaseDSL.attr(IdFunc8567756a.instance, arg);
  }

  public static Void ignoreGravity(int arg) {
    return BaseDSL.attr(IgnoreGravityFunc8567756a.instance, arg);
  }

  public static Void imageAlpha(int arg) {
    return BaseDSL.attr(ImageAlphaFunc8567756a.instance, arg);
  }

  public static Void imageBitmap(Bitmap arg) {
    return BaseDSL.attr(ImageBitmapFuncf4654c93.instance, arg);
  }

  public static Void imageDrawable(Drawable arg) {
    return BaseDSL.attr(ImageDrawableFuncfb47464a.instance, arg);
  }

  public static Void imageLevel(int arg) {
    return BaseDSL.attr(ImageLevelFunc8567756a.instance, arg);
  }

  public static Void imageMatrix(Matrix arg) {
    return BaseDSL.attr(ImageMatrixFunc6b9f325.instance, arg);
  }

  public static Void imageResource(int arg) {
    return BaseDSL.attr(ImageResourceFunc8567756a.instance, arg);
  }

  public static Void imageTintList(ColorStateList arg) {
    return BaseDSL.attr(ImageTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void imageTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ImageTintModeFuncabb7a84e.instance, arg);
  }

  public static Void imageURI(Uri arg) {
    return BaseDSL.attr(ImageURIFunc75f430fc.instance, arg);
  }

  public static Void imeOptions(int arg) {
    return BaseDSL.attr(ImeOptionsFunc8567756a.instance, arg);
  }

  public static Void importantForAccessibility(int arg) {
    return BaseDSL.attr(ImportantForAccessibilityFunc8567756a.instance, arg);
  }

  public static Void inAnimation(ObjectAnimator arg) {
    return BaseDSL.attr(InAnimationFunc9a08bdaf.instance, arg);
  }

  public static Void inAnimation(Animation arg) {
    return BaseDSL.attr(InAnimationFunc76cb7b50.instance, arg);
  }

  public static Void includeFontPadding(boolean arg) {
    return BaseDSL.attr(IncludeFontPaddingFunc148d6054.instance, arg);
  }

  public static Void indeterminate(boolean arg) {
    return BaseDSL.attr(IndeterminateFunc148d6054.instance, arg);
  }

  public static Void indeterminateDrawable(Drawable arg) {
    return BaseDSL.attr(IndeterminateDrawableFuncfb47464a.instance, arg);
  }

  public static Void indeterminateDrawableTiled(Drawable arg) {
    return BaseDSL.attr(IndeterminateDrawableTiledFuncfb47464a.instance, arg);
  }

  public static Void indeterminateTintList(ColorStateList arg) {
    return BaseDSL.attr(IndeterminateTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void indeterminateTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(IndeterminateTintModeFuncabb7a84e.instance, arg);
  }

  public static Void inflatedId(int arg) {
    return BaseDSL.attr(InflatedIdFunc8567756a.instance, arg);
  }

  public static Void initialScale(int arg) {
    return BaseDSL.attr(InitialScaleFunc8567756a.instance, arg);
  }

  public static Void inputExtras(int arg) {
    return BaseDSL.attr(InputExtrasFunc8567756a.instance, arg);
  }

  public static Void inputType(int arg) {
    return BaseDSL.attr(InputTypeFunc8567756a.instance, arg);
  }

  public static Void interpolator(Interpolator arg) {
    return BaseDSL.attr(InterpolatorFunc805e457b.instance, arg);
  }

  public static Void is24HourView(Boolean arg) {
    return BaseDSL.attr(Is24HourViewFunc148d6054.instance, arg);
  }

  public static Void isIndicator(boolean arg) {
    return BaseDSL.attr(IsIndicatorFunc148d6054.instance, arg);
  }

  public static Void isZoomInEnabled(boolean arg) {
    return BaseDSL.attr(IsZoomInEnabledFunc148d6054.instance, arg);
  }

  public static Void isZoomOutEnabled(boolean arg) {
    return BaseDSL.attr(IsZoomOutEnabledFunc148d6054.instance, arg);
  }

  public static Void itemsCanFocus(boolean arg) {
    return BaseDSL.attr(ItemsCanFocusFunc148d6054.instance, arg);
  }

  public static Void keepScreenOn(boolean arg) {
    return BaseDSL.attr(KeepScreenOnFunc148d6054.instance, arg);
  }

  public static Void keyListener(KeyListener arg) {
    return BaseDSL.attr(KeyListenerFuncc20cfe68.instance, arg);
  }

  public static Void keyProgressIncrement(int arg) {
    return BaseDSL.attr(KeyProgressIncrementFunc8567756a.instance, arg);
  }

  public static Void keyboard(Keyboard arg) {
    return BaseDSL.attr(KeyboardFunc68284f4c.instance, arg);
  }

  public static Void labelFor(int arg) {
    return BaseDSL.attr(LabelForFunc8567756a.instance, arg);
  }

  public static Void layerPaint(Paint arg) {
    return BaseDSL.attr(LayerPaintFunc7c40a07a.instance, arg);
  }

  public static Void layoutAnimation(LayoutAnimationController arg) {
    return BaseDSL.attr(LayoutAnimationFunc97b72682.instance, arg);
  }

  public static Void layoutAnimationListener(Animation.AnimationListener arg) {
    return BaseDSL.attr(LayoutAnimationListenerFunc3ffca91a.instance, arg);
  }

  public static Void layoutDirection(int arg) {
    return BaseDSL.attr(LayoutDirectionFunc8567756a.instance, arg);
  }

  public static Void layoutInflater(LayoutInflater arg) {
    return BaseDSL.attr(LayoutInflaterFunc3f91d1f.instance, arg);
  }

  public static Void layoutMode(int arg) {
    return BaseDSL.attr(LayoutModeFunc8567756a.instance, arg);
  }

  public static Void layoutParams(ViewGroup.LayoutParams arg) {
    return BaseDSL.attr(LayoutParamsFunc613f8e8e.instance, arg);
  }

  public static Void layoutResource(int arg) {
    return BaseDSL.attr(LayoutResourceFunc8567756a.instance, arg);
  }

  public static Void layoutTransition(LayoutTransition arg) {
    return BaseDSL.attr(LayoutTransitionFuncda5a1c48.instance, arg);
  }

  public static Void left(int arg) {
    return BaseDSL.attr(LeftFunc8567756a.instance, arg);
  }

  public static Void leftStripDrawable(Drawable arg) {
    return BaseDSL.attr(LeftStripDrawableFuncfb47464a.instance, arg);
  }

  public static Void leftStripDrawable(int arg) {
    return BaseDSL.attr(LeftStripDrawableFunc8567756a.instance, arg);
  }

  public static Void letterSpacing(float arg) {
    return BaseDSL.attr(LetterSpacingFunce0893188.instance, arg);
  }

  public static Void lettersWatcher(TextWatcher arg) {
    return BaseDSL.attr(LettersWatcherFuncb32320d.instance, arg);
  }

  public static Void lines(int arg) {
    return BaseDSL.attr(LinesFunc8567756a.instance, arg);
  }

  public static Void linkTextColor(ColorStateList arg) {
    return BaseDSL.attr(LinkTextColorFunc9e5e0e4e.instance, arg);
  }

  public static Void linkTextColor(int arg) {
    return BaseDSL.attr(LinkTextColorFunc8567756a.instance, arg);
  }

  public static Void linksClickable(boolean arg) {
    return BaseDSL.attr(LinksClickableFunc148d6054.instance, arg);
  }

  public static Void listSelection(int arg) {
    return BaseDSL.attr(ListSelectionFunc8567756a.instance, arg);
  }

  public static Void logo(Drawable arg) {
    return BaseDSL.attr(LogoFuncfb47464a.instance, arg);
  }

  public static Void logo(int arg) {
    return BaseDSL.attr(LogoFunc8567756a.instance, arg);
  }

  public static Void logoDescription(int arg) {
    return BaseDSL.attr(LogoDescriptionFunc8567756a.instance, arg);
  }

  public static Void logoDescription(CharSequence arg) {
    return BaseDSL.attr(LogoDescriptionFuncc0af808b.instance, arg);
  }

  public static Void longClickable(boolean arg) {
    return BaseDSL.attr(LongClickableFunc148d6054.instance, arg);
  }

  public static Void marqueeRepeatLimit(int arg) {
    return BaseDSL.attr(MarqueeRepeatLimitFunc8567756a.instance, arg);
  }

  public static Void max(int arg) {
    return BaseDSL.attr(MaxFunc8567756a.instance, arg);
  }

  public static Void maxDate(long arg) {
    return BaseDSL.attr(MaxDateFunc17c521d0.instance, arg);
  }

  public static Void maxEms(int arg) {
    return BaseDSL.attr(MaxEmsFunc8567756a.instance, arg);
  }

  public static Void maxHeight(int arg) {
    return BaseDSL.attr(MaxHeightFunc8567756a.instance, arg);
  }

  public static Void maxLines(int arg) {
    return BaseDSL.attr(MaxLinesFunc8567756a.instance, arg);
  }

  public static Void maxValue(int arg) {
    return BaseDSL.attr(MaxValueFunc8567756a.instance, arg);
  }

  public static Void maxVisible(int arg) {
    return BaseDSL.attr(MaxVisibleFunc8567756a.instance, arg);
  }

  public static Void maxWidth(int arg) {
    return BaseDSL.attr(MaxWidthFunc8567756a.instance, arg);
  }

  public static Void measureAllChildren(boolean arg) {
    return BaseDSL.attr(MeasureAllChildrenFunc148d6054.instance, arg);
  }

  public static Void measureWithLargestChildEnabled(boolean arg) {
    return BaseDSL.attr(MeasureWithLargestChildEnabledFunc148d6054.instance, arg);
  }

  public static Void mediaController(MediaController arg) {
    return BaseDSL.attr(MediaControllerFunc727c9135.instance, arg);
  }

  public static Void mediaPlayer(MediaController.MediaPlayerControl arg) {
    return BaseDSL.attr(MediaPlayerFunc3deec331.instance, arg);
  }

  public static Void minDate(long arg) {
    return BaseDSL.attr(MinDateFunc17c521d0.instance, arg);
  }

  public static Void minEms(int arg) {
    return BaseDSL.attr(MinEmsFunc8567756a.instance, arg);
  }

  public static Void minHeight(int arg) {
    return BaseDSL.attr(MinHeightFunc8567756a.instance, arg);
  }

  public static Void minLines(int arg) {
    return BaseDSL.attr(MinLinesFunc8567756a.instance, arg);
  }

  public static Void minValue(int arg) {
    return BaseDSL.attr(MinValueFunc8567756a.instance, arg);
  }

  public static Void minWidth(int arg) {
    return BaseDSL.attr(MinWidthFunc8567756a.instance, arg);
  }

  public static Void minimumHeight(int arg) {
    return BaseDSL.attr(MinimumHeightFunc8567756a.instance, arg);
  }

  public static Void minimumWidth(int arg) {
    return BaseDSL.attr(MinimumWidthFunc8567756a.instance, arg);
  }

  public static Void mode(int arg) {
    return BaseDSL.attr(ModeFunc8567756a.instance, arg);
  }

  public static Void motionEventSplittingEnabled(boolean arg) {
    return BaseDSL.attr(MotionEventSplittingEnabledFunc148d6054.instance, arg);
  }

  public static Void movementMethod(MovementMethod arg) {
    return BaseDSL.attr(MovementMethodFunc9584901b.instance, arg);
  }

  public static Void multiChoiceModeListener(AbsListView.MultiChoiceModeListener arg) {
    return BaseDSL.attr(MultiChoiceModeListenerFunc74531ecd.instance, arg);
  }

  public static Void navigationContentDescription(int arg) {
    return BaseDSL.attr(NavigationContentDescriptionFunc8567756a.instance, arg);
  }

  public static Void navigationContentDescription(CharSequence arg) {
    return BaseDSL.attr(NavigationContentDescriptionFuncc0af808b.instance, arg);
  }

  public static Void navigationIcon(Drawable arg) {
    return BaseDSL.attr(NavigationIconFuncfb47464a.instance, arg);
  }

  public static Void navigationIcon(int arg) {
    return BaseDSL.attr(NavigationIconFunc8567756a.instance, arg);
  }

  public static Void navigationOnClickListener(View.OnClickListener arg) {
    return BaseDSL.attr(NavigationOnClickListenerFunc79a13a5e.instance, arg);
  }

  public static Void nestedScrollingEnabled(boolean arg) {
    return BaseDSL.attr(NestedScrollingEnabledFunc148d6054.instance, arg);
  }

  public static Void networkAvailable(boolean arg) {
    return BaseDSL.attr(NetworkAvailableFunc148d6054.instance, arg);
  }

  public static Void nextFocusDownId(int arg) {
    return BaseDSL.attr(NextFocusDownIdFunc8567756a.instance, arg);
  }

  public static Void nextFocusForwardId(int arg) {
    return BaseDSL.attr(NextFocusForwardIdFunc8567756a.instance, arg);
  }

  public static Void nextFocusLeftId(int arg) {
    return BaseDSL.attr(NextFocusLeftIdFunc8567756a.instance, arg);
  }

  public static Void nextFocusRightId(int arg) {
    return BaseDSL.attr(NextFocusRightIdFunc8567756a.instance, arg);
  }

  public static Void nextFocusUpId(int arg) {
    return BaseDSL.attr(NextFocusUpIdFunc8567756a.instance, arg);
  }

  public static Void numColumns(int arg) {
    return BaseDSL.attr(NumColumnsFunc8567756a.instance, arg);
  }

  public static Void numStars(int arg) {
    return BaseDSL.attr(NumStarsFunc8567756a.instance, arg);
  }

  public static Void onApplyWindowInsets(View.OnApplyWindowInsetsListener arg) {
    return BaseDSL.attr(OnApplyWindowInsetsFunc1d84af6a.instance, arg);
  }

  public static Void onBreadCrumbClick(FragmentBreadCrumbs.OnBreadCrumbClickListener arg) {
    return BaseDSL.attr(OnBreadCrumbClickFunc9216bf60.instance, arg);
  }

  public static Void onCheckedChange(CompoundButton.OnCheckedChangeListener arg) {
    return BaseDSL.attr(OnCheckedChangeFunca7ec32e6.instance, arg);
  }

  public static Void onCheckedChange(RadioGroup.OnCheckedChangeListener arg) {
    return BaseDSL.attr(OnCheckedChangeFunc9ce6f1ed.instance, arg);
  }

  public static Void onChildClick(ExpandableListView.OnChildClickListener arg) {
    return BaseDSL.attr(OnChildClickFunc41bf08ab.instance, arg);
  }

  public static Void onChronometerTick(Chronometer.OnChronometerTickListener arg) {
    return BaseDSL.attr(OnChronometerTickFunc314a7a05.instance, arg);
  }

  public static Void onClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnClickFunc79a13a5e.instance, arg);
  }

  public static Void onClose(SearchView.OnCloseListener arg) {
    return BaseDSL.attr(OnCloseFunc2f96a1d7.instance, arg);
  }

  public static Void onCompletion(MediaPlayer.OnCompletionListener arg) {
    return BaseDSL.attr(OnCompletionFunc118298c1.instance, arg);
  }

  public static Void onCreateContextMenu(View.OnCreateContextMenuListener arg) {
    return BaseDSL.attr(OnCreateContextMenuFunc657678e8.instance, arg);
  }

  public static Void onDateChange(CalendarView.OnDateChangeListener arg) {
    return BaseDSL.attr(OnDateChangeFuncd43c4991.instance, arg);
  }

  public static Void onDismiss(AutoCompleteTextView.OnDismissListener arg) {
    return BaseDSL.attr(OnDismissFuncfea72fd6.instance, arg);
  }

  public static Void onDrag(View.OnDragListener arg) {
    return BaseDSL.attr(OnDragFunc685605c6.instance, arg);
  }

  public static Void onDrawerClose(SlidingDrawer.OnDrawerCloseListener arg) {
    return BaseDSL.attr(OnDrawerCloseFunc2c932b02.instance, arg);
  }

  public static Void onDrawerOpen(SlidingDrawer.OnDrawerOpenListener arg) {
    return BaseDSL.attr(OnDrawerOpenFuncbff66a28.instance, arg);
  }

  public static Void onDrawerScroll(SlidingDrawer.OnDrawerScrollListener arg) {
    return BaseDSL.attr(OnDrawerScrollFunc44bfdd2b.instance, arg);
  }

  public static Void onEditorAction(TextView.OnEditorActionListener arg) {
    return BaseDSL.attr(OnEditorActionFuncb9b05d07.instance, arg);
  }

  public static Void onError(MediaPlayer.OnErrorListener arg) {
    return BaseDSL.attr(OnErrorFunc19f5c42b.instance, arg);
  }

  public static Void onFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr(OnFocusChangeFunca56a1dfe.instance, arg);
  }

  public static Void onGenericMotion(View.OnGenericMotionListener arg) {
    return BaseDSL.attr(OnGenericMotionFunc35b75643.instance, arg);
  }

  public static Void onGroupClick(ExpandableListView.OnGroupClickListener arg) {
    return BaseDSL.attr(OnGroupClickFunc8330a028.instance, arg);
  }

  public static Void onGroupCollapse(ExpandableListView.OnGroupCollapseListener arg) {
    return BaseDSL.attr(OnGroupCollapseFunc817eb235.instance, arg);
  }

  public static Void onGroupExpand(ExpandableListView.OnGroupExpandListener arg) {
    return BaseDSL.attr(OnGroupExpandFunccdb64d22.instance, arg);
  }

  public static Void onHierarchyChange(ViewGroup.OnHierarchyChangeListener arg) {
    return BaseDSL.attr(OnHierarchyChangeFunc7b5dc8bc.instance, arg);
  }

  public static Void onHover(View.OnHoverListener arg) {
    return BaseDSL.attr(OnHoverFuncbf544a12.instance, arg);
  }

  public static Void onInflate(ViewStub.OnInflateListener arg) {
    return BaseDSL.attr(OnInflateFuncdd97752b.instance, arg);
  }

  public static Void onInfo(MediaPlayer.OnInfoListener arg) {
    return BaseDSL.attr(OnInfoFuncfc58c853.instance, arg);
  }

  public static Void onItemClick(AdapterView.OnItemClickListener arg) {
    return BaseDSL.attr(OnItemClickFuncbe673005.instance, arg);
  }

  public static Void onItemLongClick(AdapterView.OnItemLongClickListener arg) {
    return BaseDSL.attr(OnItemLongClickFuncbc740669.instance, arg);
  }

  public static Void onItemSelected(AdapterView.OnItemSelectedListener arg) {
    return BaseDSL.attr(OnItemSelectedFuncb7923a26.instance, arg);
  }

  public static Void onKey(View.OnKeyListener arg) {
    return BaseDSL.attr(OnKeyFunce04764b5.instance, arg);
  }

  public static Void onKeyboardAction(KeyboardView.OnKeyboardActionListener arg) {
    return BaseDSL.attr(OnKeyboardActionFunc754370ed.instance, arg);
  }

  public static Void onLongClick(View.OnLongClickListener arg) {
    return BaseDSL.attr(OnLongClickFuncdc7f3c42.instance, arg);
  }

  public static Void onLongPressUpdateInterval(long arg) {
    return BaseDSL.attr(OnLongPressUpdateIntervalFunc17c521d0.instance, arg);
  }

  public static Void onMenuItemClick(ActionMenuView.OnMenuItemClickListener arg) {
    return BaseDSL.attr(OnMenuItemClickFuncc8271282.instance, arg);
  }

  public static Void onMenuItemClick(Toolbar.OnMenuItemClickListener arg) {
    return BaseDSL.attr(OnMenuItemClickFunc8ed2cccd.instance, arg);
  }

  public static Void onPrepared(MediaPlayer.OnPreparedListener arg) {
    return BaseDSL.attr(OnPreparedFuncde5b2862.instance, arg);
  }

  public static Void onQueryText(SearchView.OnQueryTextListener arg) {
    return BaseDSL.attr(OnQueryTextFunc8c880774.instance, arg);
  }

  public static Void onQueryTextFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr(OnQueryTextFocusChangeFunca56a1dfe.instance, arg);
  }

  public static Void onRatingBarChange(RatingBar.OnRatingBarChangeListener arg) {
    return BaseDSL.attr(OnRatingBarChangeFunceb1aadb8.instance, arg);
  }

  public static Void onScroll(AbsListView.OnScrollListener arg) {
    return BaseDSL.attr(OnScrollFunce14bebe4.instance, arg);
  }

  public static Void onScroll(NumberPicker.OnScrollListener arg) {
    return BaseDSL.attr(OnScrollFunca8ab482c.instance, arg);
  }

  public static Void onSearchClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnSearchClickFunc79a13a5e.instance, arg);
  }

  public static Void onSeekBarChange(SeekBar.OnSeekBarChangeListener arg) {
    return BaseDSL.attr(OnSeekBarChangeFunc11980542.instance, arg);
  }

  public static Void onSuggestion(SearchView.OnSuggestionListener arg) {
    return BaseDSL.attr(OnSuggestionFunc8020caad.instance, arg);
  }

  public static Void onSystemUiVisibilityChange(View.OnSystemUiVisibilityChangeListener arg) {
    return BaseDSL.attr(OnSystemUiVisibilityChangeFunc42302537.instance, arg);
  }

  public static Void onTabChanged(TabHost.OnTabChangeListener arg) {
    return BaseDSL.attr(OnTabChangedFunc2d645be.instance, arg);
  }

  public static Void onTimeChanged(TimePicker.OnTimeChangedListener arg) {
    return BaseDSL.attr(OnTimeChangedFuncaf1cf294.instance, arg);
  }

  public static Void onTouch(View.OnTouchListener arg) {
    return BaseDSL.attr(OnTouchFunca554ad15.instance, arg);
  }

  public static Void onUnhandledInputEvent(TvView.OnUnhandledInputEventListener arg) {
    return BaseDSL.attr(OnUnhandledInputEventFunc8283e384.instance, arg);
  }

  public static Void onValueChanged(NumberPicker.OnValueChangeListener arg) {
    return BaseDSL.attr(OnValueChangedFunc6e8a79aa.instance, arg);
  }

  public static Void onZoomInClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnZoomInClickFunc79a13a5e.instance, arg);
  }

  public static Void onZoomOutClick(View.OnClickListener arg) {
    return BaseDSL.attr(OnZoomOutClickFunc79a13a5e.instance, arg);
  }

  public static Void opaque(boolean arg) {
    return BaseDSL.attr(OpaqueFunc148d6054.instance, arg);
  }

  public static Void orientation(int arg) {
    return BaseDSL.attr(OrientationFunc8567756a.instance, arg);
  }

  public static Void outAnimation(ObjectAnimator arg) {
    return BaseDSL.attr(OutAnimationFunc9a08bdaf.instance, arg);
  }

  public static Void outAnimation(Animation arg) {
    return BaseDSL.attr(OutAnimationFunc76cb7b50.instance, arg);
  }

  public static Void outlineProvider(ViewOutlineProvider arg) {
    return BaseDSL.attr(OutlineProviderFuncc76d7ca4.instance, arg);
  }

  public static Void overScrollMode(int arg) {
    return BaseDSL.attr(OverScrollModeFunc8567756a.instance, arg);
  }

  public static Void overlay(Drawable arg) {
    return BaseDSL.attr(OverlayFuncfb47464a.instance, arg);
  }

  public static Void overscrollFooter(Drawable arg) {
    return BaseDSL.attr(OverscrollFooterFuncfb47464a.instance, arg);
  }

  public static Void overscrollHeader(Drawable arg) {
    return BaseDSL.attr(OverscrollHeaderFuncfb47464a.instance, arg);
  }

  public static Void paintFlags(int arg) {
    return BaseDSL.attr(PaintFlagsFunc8567756a.instance, arg);
  }

  public static Void persistentDrawingCache(int arg) {
    return BaseDSL.attr(PersistentDrawingCacheFunc8567756a.instance, arg);
  }

  public static Void pivotX(float arg) {
    return BaseDSL.attr(PivotXFunce0893188.instance, arg);
  }

  public static Void pivotY(float arg) {
    return BaseDSL.attr(PivotYFunce0893188.instance, arg);
  }

  public static Void popupBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr(PopupBackgroundDrawableFuncfb47464a.instance, arg);
  }

  public static Void popupBackgroundResource(int arg) {
    return BaseDSL.attr(PopupBackgroundResourceFunc8567756a.instance, arg);
  }

  public static Void popupParent(View arg) {
    return BaseDSL.attr(PopupParentFunc6c3617af.instance, arg);
  }

  public static Void popupTheme(int arg) {
    return BaseDSL.attr(PopupThemeFunc8567756a.instance, arg);
  }

  public static Void preserveEGLContextOnPause(boolean arg) {
    return BaseDSL.attr(PreserveEGLContextOnPauseFunc148d6054.instance, arg);
  }

  public static Void pressed(boolean arg) {
    return BaseDSL.attr(PressedFunc148d6054.instance, arg);
  }

  public static Void previewEnabled(boolean arg) {
    return BaseDSL.attr(PreviewEnabledFunc148d6054.instance, arg);
  }

  public static Void privateImeOptions(String arg) {
    return BaseDSL.attr(PrivateImeOptionsFunc473e3665.instance, arg);
  }

  public static Void progress(int arg) {
    return BaseDSL.attr(ProgressFunc8567756a.instance, arg);
  }

  public static Void progressBackgroundTintList(ColorStateList arg) {
    return BaseDSL.attr(ProgressBackgroundTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void progressBackgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ProgressBackgroundTintModeFuncabb7a84e.instance, arg);
  }

  public static Void progressDrawable(Drawable arg) {
    return BaseDSL.attr(ProgressDrawableFuncfb47464a.instance, arg);
  }

  public static Void progressDrawableTiled(Drawable arg) {
    return BaseDSL.attr(ProgressDrawableTiledFuncfb47464a.instance, arg);
  }

  public static Void progressTintList(ColorStateList arg) {
    return BaseDSL.attr(ProgressTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void progressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ProgressTintModeFuncabb7a84e.instance, arg);
  }

  public static Void prompt(CharSequence arg) {
    return BaseDSL.attr(PromptFuncc0af808b.instance, arg);
  }

  public static Void promptId(int arg) {
    return BaseDSL.attr(PromptIdFunc8567756a.instance, arg);
  }

  public static Void proximityCorrectionEnabled(boolean arg) {
    return BaseDSL.attr(ProximityCorrectionEnabledFunc148d6054.instance, arg);
  }

  public static Void queryHint(CharSequence arg) {
    return BaseDSL.attr(QueryHintFuncc0af808b.instance, arg);
  }

  public static Void queryRefinementEnabled(boolean arg) {
    return BaseDSL.attr(QueryRefinementEnabledFunc148d6054.instance, arg);
  }

  public static Void rating(float arg) {
    return BaseDSL.attr(RatingFunce0893188.instance, arg);
  }

  public static Void rawInputType(int arg) {
    return BaseDSL.attr(RawInputTypeFunc8567756a.instance, arg);
  }

  public static Void recyclerListener(AbsListView.RecyclerListener arg) {
    return BaseDSL.attr(RecyclerListenerFunc93ebab97.instance, arg);
  }

  public static Void remoteViewsAdapter(Intent arg) {
    return BaseDSL.attr(RemoteViewsAdapterFuncbcfa9f30.instance, arg);
  }

  public static Void renderMode(int arg) {
    return BaseDSL.attr(RenderModeFunc8567756a.instance, arg);
  }

  public static Void renderer(GLSurfaceView.Renderer arg) {
    return BaseDSL.attr(RendererFunc48532fc4.instance, arg);
  }

  public static Void right(int arg) {
    return BaseDSL.attr(RightFunc8567756a.instance, arg);
  }

  public static Void rightStripDrawable(Drawable arg) {
    return BaseDSL.attr(RightStripDrawableFuncfb47464a.instance, arg);
  }

  public static Void rightStripDrawable(int arg) {
    return BaseDSL.attr(RightStripDrawableFunc8567756a.instance, arg);
  }

  public static Void rotation(float arg) {
    return BaseDSL.attr(RotationFunce0893188.instance, arg);
  }

  public static Void rotationX(float arg) {
    return BaseDSL.attr(RotationXFunce0893188.instance, arg);
  }

  public static Void rotationY(float arg) {
    return BaseDSL.attr(RotationYFunce0893188.instance, arg);
  }

  public static Void routeTypes(int arg) {
    return BaseDSL.attr(RouteTypesFunc8567756a.instance, arg);
  }

  public static Void rowCount(int arg) {
    return BaseDSL.attr(RowCountFunc8567756a.instance, arg);
  }

  public static Void rowOrderPreserved(boolean arg) {
    return BaseDSL.attr(RowOrderPreservedFunc148d6054.instance, arg);
  }

  public static Void saveEnabled(boolean arg) {
    return BaseDSL.attr(SaveEnabledFunc148d6054.instance, arg);
  }

  public static Void saveFromParentEnabled(boolean arg) {
    return BaseDSL.attr(SaveFromParentEnabledFunc148d6054.instance, arg);
  }

  public static Void scaleType(ImageView.ScaleType arg) {
    return BaseDSL.attr(ScaleTypeFunc1c5151cb.instance, arg);
  }

  public static Void scaleX(float arg) {
    return BaseDSL.attr(ScaleXFunce0893188.instance, arg);
  }

  public static Void scaleY(float arg) {
    return BaseDSL.attr(ScaleYFunce0893188.instance, arg);
  }

  public static Void scrollBarDefaultDelayBeforeFade(int arg) {
    return BaseDSL.attr(ScrollBarDefaultDelayBeforeFadeFunc8567756a.instance, arg);
  }

  public static Void scrollBarFadeDuration(int arg) {
    return BaseDSL.attr(ScrollBarFadeDurationFunc8567756a.instance, arg);
  }

  public static Void scrollBarSize(int arg) {
    return BaseDSL.attr(ScrollBarSizeFunc8567756a.instance, arg);
  }

  public static Void scrollBarStyle(int arg) {
    return BaseDSL.attr(ScrollBarStyleFunc8567756a.instance, arg);
  }

  public static Void scrollContainer(boolean arg) {
    return BaseDSL.attr(ScrollContainerFunc148d6054.instance, arg);
  }

  public static Void scrollX(int arg) {
    return BaseDSL.attr(ScrollXFunc8567756a.instance, arg);
  }

  public static Void scrollY(int arg) {
    return BaseDSL.attr(ScrollYFunc8567756a.instance, arg);
  }

  public static Void scrollbarFadingEnabled(boolean arg) {
    return BaseDSL.attr(ScrollbarFadingEnabledFunc148d6054.instance, arg);
  }

  public static Void scroller(Scroller arg) {
    return BaseDSL.attr(ScrollerFunc7fa71345.instance, arg);
  }

  public static Void scrollingCacheEnabled(boolean arg) {
    return BaseDSL.attr(ScrollingCacheEnabledFunc148d6054.instance, arg);
  }

  public static Void searchableInfo(SearchableInfo arg) {
    return BaseDSL.attr(SearchableInfoFunc1f96c03c.instance, arg);
  }

  public static Void secondaryProgress(int arg) {
    return BaseDSL.attr(SecondaryProgressFunc8567756a.instance, arg);
  }

  public static Void secondaryProgressTintList(ColorStateList arg) {
    return BaseDSL.attr(SecondaryProgressTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void secondaryProgressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(SecondaryProgressTintModeFuncabb7a84e.instance, arg);
  }

  public static Void secure(boolean arg) {
    return BaseDSL.attr(SecureFunc148d6054.instance, arg);
  }

  public static Void selectAllOnFocus(boolean arg) {
    return BaseDSL.attr(SelectAllOnFocusFunc148d6054.instance, arg);
  }

  public static Void selected(boolean arg) {
    return BaseDSL.attr(SelectedFunc148d6054.instance, arg);
  }

  public static Void selectedDateVerticalBar(Drawable arg) {
    return BaseDSL.attr(SelectedDateVerticalBarFuncfb47464a.instance, arg);
  }

  public static Void selectedDateVerticalBar(int arg) {
    return BaseDSL.attr(SelectedDateVerticalBarFunc8567756a.instance, arg);
  }

  public static Void selectedGroup(int arg) {
    return BaseDSL.attr(SelectedGroupFunc8567756a.instance, arg);
  }

  public static Void selectedWeekBackgroundColor(int arg) {
    return BaseDSL.attr(SelectedWeekBackgroundColorFunc8567756a.instance, arg);
  }

  public static Void selection(int arg) {
    return BaseDSL.attr(SelectionFunc8567756a.instance, arg);
  }

  public static Void selector(Drawable arg) {
    return BaseDSL.attr(SelectorFuncfb47464a.instance, arg);
  }

  public static Void selector(int arg) {
    return BaseDSL.attr(SelectorFunc8567756a.instance, arg);
  }

  public static Void shifted(boolean arg) {
    return BaseDSL.attr(ShiftedFunc148d6054.instance, arg);
  }

  public static Void showDividers(int arg) {
    return BaseDSL.attr(ShowDividersFunc8567756a.instance, arg);
  }

  public static Void showSoftInputOnFocus(boolean arg) {
    return BaseDSL.attr(ShowSoftInputOnFocusFunc148d6054.instance, arg);
  }

  public static Void showText(boolean arg) {
    return BaseDSL.attr(ShowTextFunc148d6054.instance, arg);
  }

  public static Void showWeekNumber(boolean arg) {
    return BaseDSL.attr(ShowWeekNumberFunc148d6054.instance, arg);
  }

  public static Void shownWeekCount(int arg) {
    return BaseDSL.attr(ShownWeekCountFunc8567756a.instance, arg);
  }

  public static Void shrinkAllColumns(boolean arg) {
    return BaseDSL.attr(ShrinkAllColumnsFunc148d6054.instance, arg);
  }

  public static Void singleLine(boolean arg) {
    return BaseDSL.attr(SingleLineFunc148d6054.instance, arg);
  }

  public static Void smoothScrollbarEnabled(boolean arg) {
    return BaseDSL.attr(SmoothScrollbarEnabledFunc148d6054.instance, arg);
  }

  public static Void smoothScrollingEnabled(boolean arg) {
    return BaseDSL.attr(SmoothScrollingEnabledFunc148d6054.instance, arg);
  }

  public static Void soundEffectsEnabled(boolean arg) {
    return BaseDSL.attr(SoundEffectsEnabledFunc148d6054.instance, arg);
  }

  public static Void spacing(int arg) {
    return BaseDSL.attr(SpacingFunc8567756a.instance, arg);
  }

  public static Void spannableFactory(Spannable.Factory arg) {
    return BaseDSL.attr(SpannableFactoryFunc195c8c78.instance, arg);
  }

  public static Void spinnersShown(boolean arg) {
    return BaseDSL.attr(SpinnersShownFunc148d6054.instance, arg);
  }

  public static Void splitTrack(boolean arg) {
    return BaseDSL.attr(SplitTrackFunc148d6054.instance, arg);
  }

  public static Void stackFromBottom(boolean arg) {
    return BaseDSL.attr(StackFromBottomFunc148d6054.instance, arg);
  }

  public static Void stateListAnimator(StateListAnimator arg) {
    return BaseDSL.attr(StateListAnimatorFunc24d8c9cd.instance, arg);
  }

  public static Void stepSize(float arg) {
    return BaseDSL.attr(StepSizeFunce0893188.instance, arg);
  }

  public static Void streamVolume(float arg) {
    return BaseDSL.attr(StreamVolumeFunce0893188.instance, arg);
  }

  public static Void stretchAllColumns(boolean arg) {
    return BaseDSL.attr(StretchAllColumnsFunc148d6054.instance, arg);
  }

  public static Void stretchMode(int arg) {
    return BaseDSL.attr(StretchModeFunc8567756a.instance, arg);
  }

  public static Void stripEnabled(boolean arg) {
    return BaseDSL.attr(StripEnabledFunc148d6054.instance, arg);
  }

  public static Void submitButtonEnabled(boolean arg) {
    return BaseDSL.attr(SubmitButtonEnabledFunc148d6054.instance, arg);
  }

  public static Void subtitle(int arg) {
    return BaseDSL.attr(SubtitleFunc8567756a.instance, arg);
  }

  public static Void subtitle(CharSequence arg) {
    return BaseDSL.attr(SubtitleFuncc0af808b.instance, arg);
  }

  public static Void subtitleTextColor(int arg) {
    return BaseDSL.attr(SubtitleTextColorFunc8567756a.instance, arg);
  }

  public static Void suggestionsAdapter(CursorAdapter arg) {
    return BaseDSL.attr(SuggestionsAdapterFunc2f59eaee.instance, arg);
  }

  public static Void surfaceTexture(SurfaceTexture arg) {
    return BaseDSL.attr(SurfaceTextureFuncc2f30b12.instance, arg);
  }

  public static Void surfaceTextureListener(TextureView.SurfaceTextureListener arg) {
    return BaseDSL.attr(SurfaceTextureListenerFunc528d697a.instance, arg);
  }

  public static Void switchMinWidth(int arg) {
    return BaseDSL.attr(SwitchMinWidthFunc8567756a.instance, arg);
  }

  public static Void switchPadding(int arg) {
    return BaseDSL.attr(SwitchPaddingFunc8567756a.instance, arg);
  }

  public static Void switchTypeface(Typeface arg) {
    return BaseDSL.attr(SwitchTypefaceFunc53b4afb.instance, arg);
  }

  public static Void systemUiVisibility(int arg) {
    return BaseDSL.attr(SystemUiVisibilityFunc8567756a.instance, arg);
  }

  public static Void tag(Object arg) {
    return BaseDSL.attr(TagFunc3f697993.instance, arg);
  }

  public static Void text(int arg) {
    return BaseDSL.attr(TextFunc8567756a.instance, arg);
  }

  public static Void textAlignment(int arg) {
    return BaseDSL.attr(TextAlignmentFunc8567756a.instance, arg);
  }

  public static Void textColor(ColorStateList arg) {
    return BaseDSL.attr(TextColorFunc9e5e0e4e.instance, arg);
  }

  public static Void textColor(int arg) {
    return BaseDSL.attr(TextColorFunc8567756a.instance, arg);
  }

  public static Void textDirection(int arg) {
    return BaseDSL.attr(TextDirectionFunc8567756a.instance, arg);
  }

  public static Void textFilterEnabled(boolean arg) {
    return BaseDSL.attr(TextFilterEnabledFunc148d6054.instance, arg);
  }

  public static Void textIsSelectable(boolean arg) {
    return BaseDSL.attr(TextIsSelectableFunc148d6054.instance, arg);
  }

  public static Void textKeepState(CharSequence arg) {
    return BaseDSL.attr(TextKeepStateFuncc0af808b.instance, arg);
  }

  public static Void textLocale(Locale arg) {
    return BaseDSL.attr(TextLocaleFuncba8c481a.instance, arg);
  }

  public static Void textOff(CharSequence arg) {
    return BaseDSL.attr(TextOffFuncc0af808b.instance, arg);
  }

  public static Void textOn(CharSequence arg) {
    return BaseDSL.attr(TextOnFuncc0af808b.instance, arg);
  }

  public static Void textScaleX(float arg) {
    return BaseDSL.attr(TextScaleXFunce0893188.instance, arg);
  }

  public static Void threshold(int arg) {
    return BaseDSL.attr(ThresholdFunc8567756a.instance, arg);
  }

  public static Void thumb(Drawable arg) {
    return BaseDSL.attr(ThumbFuncfb47464a.instance, arg);
  }

  public static Void thumbDrawable(Drawable arg) {
    return BaseDSL.attr(ThumbDrawableFuncfb47464a.instance, arg);
  }

  public static Void thumbOffset(int arg) {
    return BaseDSL.attr(ThumbOffsetFunc8567756a.instance, arg);
  }

  public static Void thumbResource(int arg) {
    return BaseDSL.attr(ThumbResourceFunc8567756a.instance, arg);
  }

  public static Void thumbTextPadding(int arg) {
    return BaseDSL.attr(ThumbTextPaddingFunc8567756a.instance, arg);
  }

  public static Void thumbTintList(ColorStateList arg) {
    return BaseDSL.attr(ThumbTintListFunc9e5e0e4e.instance, arg);
  }

  public static Void thumbTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr(ThumbTintModeFuncabb7a84e.instance, arg);
  }

  public static Void timeZone(String arg) {
    return BaseDSL.attr(TimeZoneFunc473e3665.instance, arg);
  }

  public static Void title(int arg) {
    return BaseDSL.attr(TitleFunc8567756a.instance, arg);
  }

  public static Void title(CharSequence arg) {
    return BaseDSL.attr(TitleFuncc0af808b.instance, arg);
  }

  public static Void titleTextColor(int arg) {
    return BaseDSL.attr(TitleTextColorFunc8567756a.instance, arg);
  }

  public static Void tokenizer(MultiAutoCompleteTextView.Tokenizer arg) {
    return BaseDSL.attr(TokenizerFunc6ae2b151.instance, arg);
  }

  public static Void top(int arg) {
    return BaseDSL.attr(TopFunc8567756a.instance, arg);
  }

  public static Void touchDelegate(TouchDelegate arg) {
    return BaseDSL.attr(TouchDelegateFunc8217a01a.instance, arg);
  }

  public static Void touchscreenBlocksFocus(boolean arg) {
    return BaseDSL.attr(TouchscreenBlocksFocusFunc148d6054.instance, arg);
  }

  public static Void trackDrawable(Drawable arg) {
    return BaseDSL.attr(TrackDrawableFuncfb47464a.instance, arg);
  }

  public static Void trackResource(int arg) {
    return BaseDSL.attr(TrackResourceFunc8567756a.instance, arg);
  }

  public static Void transcriptMode(int arg) {
    return BaseDSL.attr(TranscriptModeFunc8567756a.instance, arg);
  }

  public static Void transform(Matrix arg) {
    return BaseDSL.attr(TransformFunc6b9f325.instance, arg);
  }

  public static Void transformationMethod(TransformationMethod arg) {
    return BaseDSL.attr(TransformationMethodFunc65bbcab5.instance, arg);
  }

  public static Void transitionGroup(boolean arg) {
    return BaseDSL.attr(TransitionGroupFunc148d6054.instance, arg);
  }

  public static Void transitionName(String arg) {
    return BaseDSL.attr(TransitionNameFunc473e3665.instance, arg);
  }

  public static Void translationX(float arg) {
    return BaseDSL.attr(TranslationXFunce0893188.instance, arg);
  }

  public static Void translationY(float arg) {
    return BaseDSL.attr(TranslationYFunce0893188.instance, arg);
  }

  public static Void translationZ(float arg) {
    return BaseDSL.attr(TranslationZFunce0893188.instance, arg);
  }

  public static Void typeface(Typeface arg) {
    return BaseDSL.attr(TypefaceFunc53b4afb.instance, arg);
  }

  public static Void uncertainGestureColor(int arg) {
    return BaseDSL.attr(UncertainGestureColorFunc8567756a.instance, arg);
  }

  public static Void unfocusedMonthDateColor(int arg) {
    return BaseDSL.attr(UnfocusedMonthDateColorFunc8567756a.instance, arg);
  }

  public static Void unselectedAlpha(float arg) {
    return BaseDSL.attr(UnselectedAlphaFunce0893188.instance, arg);
  }

  public static Void up(LocalActivityManager arg) {
    return BaseDSL.attr(UpFunc7b013b1f.instance, arg);
  }

  public static Void useDefaultMargins(boolean arg) {
    return BaseDSL.attr(UseDefaultMarginsFunc148d6054.instance, arg);
  }

  public static Void validator(AutoCompleteTextView.Validator arg) {
    return BaseDSL.attr(ValidatorFuncd6d080a9.instance, arg);
  }

  public static Void value(int arg) {
    return BaseDSL.attr(ValueFunc8567756a.instance, arg);
  }

  public static Void velocityScale(float arg) {
    return BaseDSL.attr(VelocityScaleFunce0893188.instance, arg);
  }

  public static Void verticalCorrection(int arg) {
    return BaseDSL.attr(VerticalCorrectionFunc8567756a.instance, arg);
  }

  public static Void verticalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr(VerticalFadingEdgeEnabledFunc148d6054.instance, arg);
  }

  public static Void verticalGravity(int arg) {
    return BaseDSL.attr(VerticalGravityFunc8567756a.instance, arg);
  }

  public static Void verticalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr(VerticalScrollBarEnabledFunc148d6054.instance, arg);
  }

  public static Void verticalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr(VerticalScrollbarOverlayFunc148d6054.instance, arg);
  }

  public static Void verticalScrollbarPosition(int arg) {
    return BaseDSL.attr(VerticalScrollbarPositionFunc8567756a.instance, arg);
  }

  public static Void verticalSpacing(int arg) {
    return BaseDSL.attr(VerticalSpacingFunc8567756a.instance, arg);
  }

  public static Void videoPath(String arg) {
    return BaseDSL.attr(VideoPathFunc473e3665.instance, arg);
  }

  public static Void videoURI(Uri arg) {
    return BaseDSL.attr(VideoURIFunc75f430fc.instance, arg);
  }

  public static Void visibility(int arg) {
    return BaseDSL.attr(VisibilityFunc8567756a.instance, arg);
  }

  public static Void webChromeClient(WebChromeClient arg) {
    return BaseDSL.attr(WebChromeClientFunc54f22bac.instance, arg);
  }

  public static Void webContentsDebuggingEnabled(boolean arg) {
    return BaseDSL.attr(WebContentsDebuggingEnabledFunc148d6054.instance, arg);
  }

  public static Void webViewClient(WebViewClient arg) {
    return BaseDSL.attr(WebViewClientFunc95cf0d57.instance, arg);
  }

  public static Void weekDayTextAppearance(int arg) {
    return BaseDSL.attr(WeekDayTextAppearanceFunc8567756a.instance, arg);
  }

  public static Void weekNumberColor(int arg) {
    return BaseDSL.attr(WeekNumberColorFunc8567756a.instance, arg);
  }

  public static Void weekSeparatorLineColor(int arg) {
    return BaseDSL.attr(WeekSeparatorLineColorFunc8567756a.instance, arg);
  }

  public static Void weightSum(float arg) {
    return BaseDSL.attr(WeightSumFunce0893188.instance, arg);
  }

  public static Void width(int arg) {
    return BaseDSL.attr(WidthFunc8567756a.instance, arg);
  }

  public static Void willNotCacheDrawing(boolean arg) {
    return BaseDSL.attr(WillNotCacheDrawingFunc148d6054.instance, arg);
  }

  public static Void willNotDraw(boolean arg) {
    return BaseDSL.attr(WillNotDrawFunc148d6054.instance, arg);
  }

  public static Void wrapSelectorWheel(boolean arg) {
    return BaseDSL.attr(WrapSelectorWheelFunc148d6054.instance, arg);
  }

  public static Void x(float arg) {
    return BaseDSL.attr(XFunce0893188.instance, arg);
  }

  public static Void y(float arg) {
    return BaseDSL.attr(YFunce0893188.instance, arg);
  }

  public static Void z(float arg) {
    return BaseDSL.attr(ZFunce0893188.instance, arg);
  }

  public static Void zOrderMediaOverlay(boolean arg) {
    return BaseDSL.attr(ZOrderMediaOverlayFunc148d6054.instance, arg);
  }

  public static Void zOrderOnTop(boolean arg) {
    return BaseDSL.attr(ZOrderOnTopFunc148d6054.instance, arg);
  }

  public static Void zoomSpeed(long arg) {
    return BaseDSL.attr(ZoomSpeedFunc17c521d0.instance, arg);
  }

  private static final class AccessibilityDelegateFuncf6d047d4 implements Anvil.AttrFunc<View.AccessibilityDelegate> {
    public static final AccessibilityDelegateFuncf6d047d4 instance = new AccessibilityDelegateFuncf6d047d4();

    public void apply(View v, final View.AccessibilityDelegate arg, final View.AccessibilityDelegate old) {
      v.setAccessibilityDelegate(arg);
    }
  }

  private static final class AccessibilityLiveRegionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final AccessibilityLiveRegionFunc8567756a instance = new AccessibilityLiveRegionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setAccessibilityLiveRegion(arg);
    }
  }

  private static final class ActivatedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ActivatedFunc148d6054 instance = new ActivatedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setActivated(arg);
    }
  }

  private static final class ActivityFunccb86c57b implements Anvil.AttrFunc<Activity> {
    public static final ActivityFunccb86c57b instance = new ActivityFunccb86c57b();

    public void apply(View v, final Activity arg, final Activity old) {
      if (v instanceof FragmentBreadCrumbs) {
        ((FragmentBreadCrumbs) v).setActivity(arg);
      }
    }
  }

  private static final class AdapterFunc1b2776e4 implements Anvil.AttrFunc<Adapter> {
    public static final AdapterFunc1b2776e4 instance = new AdapterFunc1b2776e4();

    public void apply(View v, final Adapter arg, final Adapter old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setAdapter(arg);
      }
    }
  }

  private static final class AdapterFunc9c589812 implements Anvil.AttrFunc<ExpandableListAdapter> {
    public static final AdapterFunc9c589812 instance = new AdapterFunc9c589812();

    public void apply(View v, final ExpandableListAdapter arg, final ExpandableListAdapter old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setAdapter(arg);
      }
    }
  }

  private static final class AddStatesFromChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AddStatesFromChildrenFunc148d6054 instance = new AddStatesFromChildrenFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAddStatesFromChildren(arg);
      }
    }
  }

  private static final class AdjustViewBoundsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AdjustViewBoundsFunc148d6054 instance = new AdjustViewBoundsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setAdjustViewBounds(arg);
      }
    }
  }

  private static final class AlignmentModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final AlignmentModeFunc8567756a instance = new AlignmentModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setAlignmentMode(arg);
      }
    }
  }

  private static final class AllCapsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AllCapsFunc148d6054 instance = new AllCapsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setAllCaps(arg);
      }
    }
  }

  private static final class AlphaFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final AlphaFunce0893188 instance = new AlphaFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setAlpha(arg);
    }
  }

  private static final class AlwaysDrawnWithCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AlwaysDrawnWithCacheEnabledFunc148d6054 instance = new AlwaysDrawnWithCacheEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAlwaysDrawnWithCacheEnabled(arg);
      }
    }
  }

  private static final class AnchorViewFunc6c3617af implements Anvil.AttrFunc<View> {
    public static final AnchorViewFunc6c3617af instance = new AnchorViewFunc6c3617af();

    public void apply(View v, final View arg, final View old) {
      if (v instanceof MediaController) {
        ((MediaController) v).setAnchorView(arg);
      }
    }
  }

  private static final class AnimateFirstViewFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AnimateFirstViewFunc148d6054 instance = new AnimateFirstViewFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setAnimateFirstView(arg);
      }
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setAnimateFirstView(arg);
      }
    }
  }

  private static final class AnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    public static final AnimationFunc76cb7b50 instance = new AnimationFunc76cb7b50();

    public void apply(View v, final Animation arg, final Animation old) {
      v.setAnimation(arg);
    }
  }

  private static final class AnimationCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AnimationCacheEnabledFunc148d6054 instance = new AnimationCacheEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setAnimationCacheEnabled(arg);
      }
    }
  }

  private static final class AnimationDurationFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final AnimationDurationFunc8567756a instance = new AnimationDurationFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setAnimationDuration(arg);
      }
    }
  }

  private static final class AutoLinkMaskFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final AutoLinkMaskFunc8567756a instance = new AutoLinkMaskFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setAutoLinkMask(arg);
      }
    }
  }

  private static final class AutoStartFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final AutoStartFunc148d6054 instance = new AutoStartFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AdapterViewFlipper) {
        ((AdapterViewFlipper) v).setAutoStart(arg);
      }
      if (v instanceof ViewFlipper) {
        ((ViewFlipper) v).setAutoStart(arg);
      }
    }
  }

  private static final class BackgroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final BackgroundFuncfb47464a instance = new BackgroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      v.setBackground(arg);
    }
  }

  private static final class BackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BackgroundColorFunc8567756a instance = new BackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBackgroundColor(arg);
    }
  }

  private static final class BackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BackgroundResourceFunc8567756a instance = new BackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBackgroundResource(arg);
    }
  }

  private static final class BackgroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final BackgroundTintListFunc9e5e0e4e instance = new BackgroundTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      v.setBackgroundTintList(arg);
    }
  }

  private static final class BackgroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final BackgroundTintModeFuncabb7a84e instance = new BackgroundTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      v.setBackgroundTintMode(arg);
    }
  }

  private static final class BaseFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final BaseFunc17c521d0 instance = new BaseFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof Chronometer) {
        ((Chronometer) v).setBase(arg);
      }
    }
  }

  private static final class BaselineFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BaselineFunc8567756a instance = new BaselineFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setBaseline(arg);
      }
    }
  }

  private static final class BaselineAlignBottomFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final BaselineAlignBottomFunc148d6054 instance = new BaselineAlignBottomFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setBaselineAlignBottom(arg);
      }
    }
  }

  private static final class BaselineAlignedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final BaselineAlignedFunc148d6054 instance = new BaselineAlignedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setBaselineAligned(arg);
      }
    }
  }

  private static final class BaselineAlignedChildIndexFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BaselineAlignedChildIndexFunc8567756a instance = new BaselineAlignedChildIndexFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setBaselineAlignedChildIndex(arg);
      }
    }
  }

  private static final class BottomFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final BottomFunc8567756a instance = new BottomFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setBottom(arg);
    }
  }

  private static final class ButtonDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ButtonDrawableFuncfb47464a instance = new ButtonDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonDrawable(arg);
      }
    }
  }

  private static final class ButtonDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ButtonDrawableFunc8567756a instance = new ButtonDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonDrawable(arg);
      }
    }
  }

  private static final class ButtonTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ButtonTintListFunc9e5e0e4e instance = new ButtonTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonTintList(arg);
      }
    }
  }

  private static final class ButtonTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ButtonTintModeFuncabb7a84e instance = new ButtonTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setButtonTintMode(arg);
      }
    }
  }

  private static final class CacheColorHintFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CacheColorHintFunc8567756a instance = new CacheColorHintFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setCacheColorHint(arg);
      }
    }
  }

  private static final class CalendarViewShownFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CalendarViewShownFunc148d6054 instance = new CalendarViewShownFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof DatePicker) {
        ((DatePicker) v).setCalendarViewShown(arg);
      }
    }
  }

  private static final class CallbackFuncca7d3f09 implements Anvil.AttrFunc<TvView.TvInputCallback> {
    public static final CallbackFuncca7d3f09 instance = new CallbackFuncca7d3f09();

    public void apply(View v, final TvView.TvInputCallback arg, final TvView.TvInputCallback old) {
      if (v instanceof TvView) {
        ((TvView) v).setCallback(arg);
      }
    }
  }

  private static final class CallbackDuringFlingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CallbackDuringFlingFunc148d6054 instance = new CallbackDuringFlingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setCallbackDuringFling(arg);
      }
    }
  }

  private static final class CameraDistanceFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final CameraDistanceFunce0893188 instance = new CameraDistanceFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setCameraDistance(arg);
    }
  }

  private static final class CaptionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CaptionEnabledFunc148d6054 instance = new CaptionEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TvView) {
        ((TvView) v).setCaptionEnabled(arg);
      }
    }
  }

  private static final class CheckMarkDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final CheckMarkDrawableFuncfb47464a instance = new CheckMarkDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkDrawable(arg);
      }
    }
  }

  private static final class CheckMarkDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CheckMarkDrawableFunc8567756a instance = new CheckMarkDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkDrawable(arg);
      }
    }
  }

  private static final class CheckMarkTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final CheckMarkTintListFunc9e5e0e4e instance = new CheckMarkTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkTintList(arg);
      }
    }
  }

  private static final class CheckMarkTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final CheckMarkTintModeFuncabb7a84e instance = new CheckMarkTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setCheckMarkTintMode(arg);
      }
    }
  }

  private static final class CheckedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CheckedFunc148d6054 instance = new CheckedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CheckedTextView) {
        ((CheckedTextView) v).setChecked(arg);
      }
      if (v instanceof CompoundButton) {
        ((CompoundButton) v).setChecked(arg);
      }
    }
  }

  private static final class ChildDividerFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ChildDividerFuncfb47464a instance = new ChildDividerFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setChildDivider(arg);
      }
    }
  }

  private static final class ChildIndicatorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ChildIndicatorFuncfb47464a instance = new ChildIndicatorFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setChildIndicator(arg);
      }
    }
  }

  private static final class ChoiceModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ChoiceModeFunc8567756a instance = new ChoiceModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setChoiceMode(arg);
      }
    }
  }

  private static final class ClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ClickableFunc148d6054 instance = new ClickableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setClickable(arg);
    }
  }

  private static final class ClipBoundsFunc1cc93e48 implements Anvil.AttrFunc<Rect> {
    public static final ClipBoundsFunc1cc93e48 instance = new ClipBoundsFunc1cc93e48();

    public void apply(View v, final Rect arg, final Rect old) {
      v.setClipBounds(arg);
    }
  }

  private static final class ClipChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ClipChildrenFunc148d6054 instance = new ClipChildrenFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setClipChildren(arg);
      }
    }
  }

  private static final class ClipToOutlineFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ClipToOutlineFunc148d6054 instance = new ClipToOutlineFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setClipToOutline(arg);
    }
  }

  private static final class ClipToPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ClipToPaddingFunc148d6054 instance = new ClipToPaddingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setClipToPadding(arg);
      }
    }
  }

  private static final class ColorFilterFunc6bb7b3d7 implements Anvil.AttrFunc<ColorFilter> {
    public static final ColorFilterFunc6bb7b3d7 instance = new ColorFilterFunc6bb7b3d7();

    public void apply(View v, final ColorFilter arg, final ColorFilter old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setColorFilter(arg);
      }
    }
  }

  private static final class ColorFilterFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ColorFilterFunc8567756a instance = new ColorFilterFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setColorFilter(arg);
      }
    }
  }

  private static final class ColumnCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ColumnCountFunc8567756a instance = new ColumnCountFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setColumnCount(arg);
      }
    }
  }

  private static final class ColumnOrderPreservedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ColumnOrderPreservedFunc148d6054 instance = new ColumnOrderPreservedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setColumnOrderPreserved(arg);
      }
    }
  }

  private static final class ColumnWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ColumnWidthFunc8567756a instance = new ColumnWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setColumnWidth(arg);
      }
    }
  }

  private static final class CompletionHintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final CompletionHintFuncc0af808b instance = new CompletionHintFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setCompletionHint(arg);
      }
    }
  }

  private static final class CompoundDrawablePaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CompoundDrawablePaddingFunc8567756a instance = new CompoundDrawablePaddingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setCompoundDrawablePadding(arg);
      }
    }
  }

  private static final class ContentDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final ContentDescriptionFuncc0af808b instance = new ContentDescriptionFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      v.setContentDescription(arg);
    }
  }

  private static final class CropToPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CropToPaddingFunc148d6054 instance = new CropToPaddingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setCropToPadding(arg);
      }
    }
  }

  private static final class CurrentHourFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CurrentHourFunc8567756a instance = new CurrentHourFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setCurrentHour(arg);
      }
    }
  }

  private static final class CurrentMinuteFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CurrentMinuteFunc8567756a instance = new CurrentMinuteFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setCurrentMinute(arg);
      }
    }
  }

  private static final class CurrentTabFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final CurrentTabFunc8567756a instance = new CurrentTabFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setCurrentTab(arg);
      }
      if (v instanceof TabWidget) {
        ((TabWidget) v).setCurrentTab(arg);
      }
    }
  }

  private static final class CurrentTabByTagFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final CurrentTabByTagFunc473e3665 instance = new CurrentTabByTagFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setCurrentTabByTag(arg);
      }
    }
  }

  private static final class CurrentTextFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final CurrentTextFuncc0af808b instance = new CurrentTextFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextSwitcher) {
        ((TextSwitcher) v).setCurrentText(arg);
      }
    }
  }

  private static final class CursorVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final CursorVisibleFunc148d6054 instance = new CursorVisibleFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setCursorVisible(arg);
      }
    }
  }

  private static final class CustomSelectionActionModeCallbackFunc57558b70 implements Anvil.AttrFunc<ActionMode.Callback> {
    public static final CustomSelectionActionModeCallbackFunc57558b70 instance = new CustomSelectionActionModeCallbackFunc57558b70();

    public void apply(View v, final ActionMode.Callback arg, final ActionMode.Callback old) {
      if (v instanceof TextView) {
        ((TextView) v).setCustomSelectionActionModeCallback(arg);
      }
    }
  }

  private static final class DateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final DateFunc17c521d0 instance = new DateFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setDate(arg);
      }
    }
  }

  private static final class DateTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DateTextAppearanceFunc8567756a instance = new DateTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setDateTextAppearance(arg);
      }
    }
  }

  private static final class DebugFlagsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DebugFlagsFunc8567756a instance = new DebugFlagsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setDebugFlags(arg);
      }
    }
  }

  private static final class DescendantFocusabilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DescendantFocusabilityFunc8567756a instance = new DescendantFocusabilityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setDescendantFocusability(arg);
      }
    }
  }

  private static final class DigitsWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    public static final DigitsWatcherFuncb32320d instance = new DigitsWatcherFuncb32320d();

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setDigitsWatcher(arg);
      }
    }
  }

  private static final class DisplayedChildFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DisplayedChildFunc8567756a instance = new DisplayedChildFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setDisplayedChild(arg);
      }
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setDisplayedChild(arg);
      }
    }
  }

  private static final class DisplayedValuesFunc708a3c87 implements Anvil.AttrFunc<String[]> {
    public static final DisplayedValuesFunc708a3c87 instance = new DisplayedValuesFunc708a3c87();

    public void apply(View v, final String[] arg, final String[] old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setDisplayedValues(arg);
      }
    }
  }

  private static final class DividerFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final DividerFuncfb47464a instance = new DividerFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setDivider(arg);
      }
    }
  }

  private static final class DividerDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final DividerDrawableFuncfb47464a instance = new DividerDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setDividerDrawable(arg);
      }
    }
  }

  private static final class DividerDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DividerDrawableFunc8567756a instance = new DividerDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setDividerDrawable(arg);
      }
    }
  }

  private static final class DividerHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DividerHeightFunc8567756a instance = new DividerHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ListView) {
        ((ListView) v).setDividerHeight(arg);
      }
    }
  }

  private static final class DividerPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DividerPaddingFunc8567756a instance = new DividerPaddingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setDividerPadding(arg);
      }
    }
  }

  private static final class DownloadListenerFunc34ae5869 implements Anvil.AttrFunc<DownloadListener> {
    public static final DownloadListenerFunc34ae5869 instance = new DownloadListenerFunc34ae5869();

    public void apply(View v, final DownloadListener arg, final DownloadListener old) {
      if (v instanceof WebView) {
        ((WebView) v).setDownloadListener(arg);
      }
    }
  }

  private static final class DrawSelectorOnTopFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final DrawSelectorOnTopFunc148d6054 instance = new DrawSelectorOnTopFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setDrawSelectorOnTop(arg);
      }
    }
  }

  private static final class DrawingCacheBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DrawingCacheBackgroundColorFunc8567756a instance = new DrawingCacheBackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setDrawingCacheBackgroundColor(arg);
    }
  }

  private static final class DrawingCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final DrawingCacheEnabledFunc148d6054 instance = new DrawingCacheEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setDrawingCacheEnabled(arg);
    }
  }

  private static final class DrawingCacheQualityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DrawingCacheQualityFunc8567756a instance = new DrawingCacheQualityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setDrawingCacheQuality(arg);
    }
  }

  private static final class DropDownAnchorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownAnchorFunc8567756a instance = new DropDownAnchorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownAnchor(arg);
      }
    }
  }

  private static final class DropDownBackgroundDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final DropDownBackgroundDrawableFuncfb47464a instance = new DropDownBackgroundDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownBackgroundDrawable(arg);
      }
    }
  }

  private static final class DropDownBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownBackgroundResourceFunc8567756a instance = new DropDownBackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownBackgroundResource(arg);
      }
    }
  }

  private static final class DropDownHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownHeightFunc8567756a instance = new DropDownHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownHeight(arg);
      }
    }
  }

  private static final class DropDownHorizontalOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownHorizontalOffsetFunc8567756a instance = new DropDownHorizontalOffsetFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownHorizontalOffset(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownHorizontalOffset(arg);
      }
    }
  }

  private static final class DropDownVerticalOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownVerticalOffsetFunc8567756a instance = new DropDownVerticalOffsetFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownVerticalOffset(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownVerticalOffset(arg);
      }
    }
  }

  private static final class DropDownWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final DropDownWidthFunc8567756a instance = new DropDownWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setDropDownWidth(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setDropDownWidth(arg);
      }
    }
  }

  private static final class DuplicateParentStateEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final DuplicateParentStateEnabledFunc148d6054 instance = new DuplicateParentStateEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setDuplicateParentStateEnabled(arg);
    }
  }

  private static final class EGLConfigChooserFuncb283fdb0 implements Anvil.AttrFunc<GLSurfaceView.EGLConfigChooser> {
    public static final EGLConfigChooserFuncb283fdb0 instance = new EGLConfigChooserFuncb283fdb0();

    public void apply(View v, final GLSurfaceView.EGLConfigChooser arg, final GLSurfaceView.EGLConfigChooser old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLConfigChooser(arg);
      }
    }
  }

  private static final class EGLConfigChooserFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final EGLConfigChooserFunc148d6054 instance = new EGLConfigChooserFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLConfigChooser(arg);
      }
    }
  }

  private static final class EGLContextClientVersionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final EGLContextClientVersionFunc8567756a instance = new EGLContextClientVersionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLContextClientVersion(arg);
      }
    }
  }

  private static final class EGLContextFactoryFunc8cdc7924 implements Anvil.AttrFunc<GLSurfaceView.EGLContextFactory> {
    public static final EGLContextFactoryFunc8cdc7924 instance = new EGLContextFactoryFunc8cdc7924();

    public void apply(View v, final GLSurfaceView.EGLContextFactory arg, final GLSurfaceView.EGLContextFactory old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLContextFactory(arg);
      }
    }
  }

  private static final class EGLWindowSurfaceFactoryFunc204911b6 implements Anvil.AttrFunc<GLSurfaceView.EGLWindowSurfaceFactory> {
    public static final EGLWindowSurfaceFactoryFunc204911b6 instance = new EGLWindowSurfaceFactoryFunc204911b6();

    public void apply(View v, final GLSurfaceView.EGLWindowSurfaceFactory arg, final GLSurfaceView.EGLWindowSurfaceFactory old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setEGLWindowSurfaceFactory(arg);
      }
    }
  }

  private static final class EditableFactoryFunc1efa17e2 implements Anvil.AttrFunc<Editable.Factory> {
    public static final EditableFactoryFunc1efa17e2 instance = new EditableFactoryFunc1efa17e2();

    public void apply(View v, final Editable.Factory arg, final Editable.Factory old) {
      if (v instanceof TextView) {
        ((TextView) v).setEditableFactory(arg);
      }
    }
  }

  private static final class ElegantTextHeightFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ElegantTextHeightFunc148d6054 instance = new ElegantTextHeightFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setElegantTextHeight(arg);
      }
    }
  }

  private static final class ElevationFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final ElevationFunce0893188 instance = new ElevationFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setElevation(arg);
    }
  }

  private static final class EllipsizeFunc63cb4885 implements Anvil.AttrFunc<TextUtils.TruncateAt> {
    public static final EllipsizeFunc63cb4885 instance = new EllipsizeFunc63cb4885();

    public void apply(View v, final TextUtils.TruncateAt arg, final TextUtils.TruncateAt old) {
      if (v instanceof TextView) {
        ((TextView) v).setEllipsize(arg);
      }
    }
  }

  private static final class EmptyViewFunc6c3617af implements Anvil.AttrFunc<View> {
    public static final EmptyViewFunc6c3617af instance = new EmptyViewFunc6c3617af();

    public void apply(View v, final View arg, final View old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setEmptyView(arg);
      }
    }
  }

  private static final class EmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final EmsFunc8567756a instance = new EmsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setEms(arg);
      }
    }
  }

  private static final class EnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final EnabledFunc148d6054 instance = new EnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setEnabled(arg);
    }
  }

  private static final class ErrorFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final ErrorFuncc0af808b instance = new ErrorFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setError(arg);
      }
    }
  }

  private static final class EventsInterceptionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final EventsInterceptionEnabledFunc148d6054 instance = new EventsInterceptionEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setEventsInterceptionEnabled(arg);
      }
    }
  }

  private static final class ExcludeMimesFunc708a3c87 implements Anvil.AttrFunc<String[]> {
    public static final ExcludeMimesFunc708a3c87 instance = new ExcludeMimesFunc708a3c87();

    public void apply(View v, final String[] arg, final String[] old) {
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setExcludeMimes(arg);
      }
    }
  }

  private static final class ExtendedSettingsClickListenerFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final ExtendedSettingsClickListenerFunc79a13a5e instance = new ExtendedSettingsClickListenerFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof MediaRouteButton) {
        ((MediaRouteButton) v).setExtendedSettingsClickListener(arg);
      }
    }
  }

  private static final class ExtractedTextFunc410b6fe0 implements Anvil.AttrFunc<ExtractedText> {
    public static final ExtractedTextFunc410b6fe0 instance = new ExtractedTextFunc410b6fe0();

    public void apply(View v, final ExtractedText arg, final ExtractedText old) {
      if (v instanceof TextView) {
        ((TextView) v).setExtractedText(arg);
      }
    }
  }

  private static final class FactoryFunc6a48ea48 implements Anvil.AttrFunc<ViewSwitcher.ViewFactory> {
    public static final FactoryFunc6a48ea48 instance = new FactoryFunc6a48ea48();

    public void apply(View v, final ViewSwitcher.ViewFactory arg, final ViewSwitcher.ViewFactory old) {
      if (v instanceof ViewSwitcher) {
        ((ViewSwitcher) v).setFactory(arg);
      }
    }
  }

  private static final class FadeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FadeEnabledFunc148d6054 instance = new FadeEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setFadeEnabled(arg);
      }
    }
  }

  private static final class FadeOffsetFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final FadeOffsetFunc17c521d0 instance = new FadeOffsetFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setFadeOffset(arg);
      }
    }
  }

  private static final class FadingEdgeLengthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final FadingEdgeLengthFunc8567756a instance = new FadingEdgeLengthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setFadingEdgeLength(arg);
    }
  }

  private static final class FastScrollAlwaysVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FastScrollAlwaysVisibleFunc148d6054 instance = new FastScrollAlwaysVisibleFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollAlwaysVisible(arg);
      }
    }
  }

  private static final class FastScrollEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FastScrollEnabledFunc148d6054 instance = new FastScrollEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollEnabled(arg);
      }
    }
  }

  private static final class FastScrollStyleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final FastScrollStyleFunc8567756a instance = new FastScrollStyleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFastScrollStyle(arg);
      }
    }
  }

  private static final class FillViewportFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FillViewportFunc148d6054 instance = new FillViewportFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof HorizontalScrollView) {
        ((HorizontalScrollView) v).setFillViewport(arg);
      }
      if (v instanceof ScrollView) {
        ((ScrollView) v).setFillViewport(arg);
      }
    }
  }

  private static final class FilterTextFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final FilterTextFunc473e3665 instance = new FilterTextFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFilterText(arg);
      }
    }
  }

  private static final class FilterTouchesWhenObscuredFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FilterTouchesWhenObscuredFunc148d6054 instance = new FilterTouchesWhenObscuredFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFilterTouchesWhenObscured(arg);
    }
  }

  private static final class FilterWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    public static final FilterWatcherFuncb32320d instance = new FilterWatcherFuncb32320d();

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setFilterWatcher(arg);
      }
    }
  }

  private static final class FiltersFuncfb505582 implements Anvil.AttrFunc<InputFilter[]> {
    public static final FiltersFuncfb505582 instance = new FiltersFuncfb505582();

    public void apply(View v, final InputFilter[] arg, final InputFilter[] old) {
      if (v instanceof TextView) {
        ((TextView) v).setFilters(arg);
      }
    }
  }

  private static final class FindListenerFunc28f7f5ef implements Anvil.AttrFunc<WebView.FindListener> {
    public static final FindListenerFunc28f7f5ef instance = new FindListenerFunc28f7f5ef();

    public void apply(View v, final WebView.FindListener arg, final WebView.FindListener old) {
      if (v instanceof WebView) {
        ((WebView) v).setFindListener(arg);
      }
    }
  }

  private static final class FirstDayOfWeekFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final FirstDayOfWeekFunc8567756a instance = new FirstDayOfWeekFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setFirstDayOfWeek(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setFirstDayOfWeek(arg);
      }
    }
  }

  private static final class FitsSystemWindowsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FitsSystemWindowsFunc148d6054 instance = new FitsSystemWindowsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFitsSystemWindows(arg);
    }
  }

  private static final class FlipIntervalFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final FlipIntervalFunc8567756a instance = new FlipIntervalFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterViewFlipper) {
        ((AdapterViewFlipper) v).setFlipInterval(arg);
      }
      if (v instanceof ViewFlipper) {
        ((ViewFlipper) v).setFlipInterval(arg);
      }
    }
  }

  private static final class FocusableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FocusableFunc148d6054 instance = new FocusableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFocusable(arg);
    }
  }

  private static final class FocusableInTouchModeFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FocusableInTouchModeFunc148d6054 instance = new FocusableInTouchModeFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setFocusableInTouchMode(arg);
    }
  }

  private static final class FocusedMonthDateColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final FocusedMonthDateColorFunc8567756a instance = new FocusedMonthDateColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setFocusedMonthDateColor(arg);
      }
    }
  }

  private static final class FontFeatureSettingsFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final FontFeatureSettingsFunc473e3665 instance = new FontFeatureSettingsFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextView) {
        ((TextView) v).setFontFeatureSettings(arg);
      }
    }
  }

  private static final class FooterDividersEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FooterDividersEnabledFunc148d6054 instance = new FooterDividersEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setFooterDividersEnabled(arg);
      }
    }
  }

  private static final class ForegroundFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ForegroundFuncfb47464a instance = new ForegroundFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForeground(arg);
      }
    }
  }

  private static final class ForegroundGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ForegroundGravityFunc8567756a instance = new ForegroundGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundGravity(arg);
      }
    }
  }

  private static final class ForegroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ForegroundTintListFunc9e5e0e4e instance = new ForegroundTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundTintList(arg);
      }
    }
  }

  private static final class ForegroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ForegroundTintModeFuncabb7a84e instance = new ForegroundTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setForegroundTintMode(arg);
      }
    }
  }

  private static final class FormatFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final FormatFunc473e3665 instance = new FormatFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof Chronometer) {
        ((Chronometer) v).setFormat(arg);
      }
    }
  }

  private static final class Format12HourFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final Format12HourFuncc0af808b instance = new Format12HourFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setFormat12Hour(arg);
      }
    }
  }

  private static final class Format24HourFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final Format24HourFuncc0af808b instance = new Format24HourFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setFormat24Hour(arg);
      }
    }
  }

  private static final class FormatterFunc5e27b07e implements Anvil.AttrFunc<NumberPicker.Formatter> {
    public static final FormatterFunc5e27b07e instance = new FormatterFunc5e27b07e();

    public void apply(View v, final NumberPicker.Formatter arg, final NumberPicker.Formatter old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setFormatter(arg);
      }
    }
  }

  private static final class FreezesTextFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final FreezesTextFunc148d6054 instance = new FreezesTextFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setFreezesText(arg);
      }
    }
  }

  private static final class FrictionFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final FrictionFunce0893188 instance = new FrictionFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setFriction(arg);
      }
    }
  }

  private static final class GLWrapperFunc9520092d implements Anvil.AttrFunc<GLSurfaceView.GLWrapper> {
    public static final GLWrapperFunc9520092d instance = new GLWrapperFunc9520092d();

    public void apply(View v, final GLSurfaceView.GLWrapper arg, final GLSurfaceView.GLWrapper old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setGLWrapper(arg);
      }
    }
  }

  private static final class GestureFunc15eb6005 implements Anvil.AttrFunc<Gesture> {
    public static final GestureFunc15eb6005 instance = new GestureFunc15eb6005();

    public void apply(View v, final Gesture arg, final Gesture old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGesture(arg);
      }
    }
  }

  private static final class GestureColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final GestureColorFunc8567756a instance = new GestureColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureColor(arg);
      }
    }
  }

  private static final class GestureStrokeAngleThresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final GestureStrokeAngleThresholdFunce0893188 instance = new GestureStrokeAngleThresholdFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeAngleThreshold(arg);
      }
    }
  }

  private static final class GestureStrokeLengthThresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final GestureStrokeLengthThresholdFunce0893188 instance = new GestureStrokeLengthThresholdFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeLengthThreshold(arg);
      }
    }
  }

  private static final class GestureStrokeSquarenessTresholdFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final GestureStrokeSquarenessTresholdFunce0893188 instance = new GestureStrokeSquarenessTresholdFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeSquarenessTreshold(arg);
      }
    }
  }

  private static final class GestureStrokeTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final GestureStrokeTypeFunc8567756a instance = new GestureStrokeTypeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeType(arg);
      }
    }
  }

  private static final class GestureStrokeWidthFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final GestureStrokeWidthFunce0893188 instance = new GestureStrokeWidthFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureStrokeWidth(arg);
      }
    }
  }

  private static final class GestureVisibleFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final GestureVisibleFunc148d6054 instance = new GestureVisibleFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setGestureVisible(arg);
      }
    }
  }

  private static final class GravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final GravityFunc8567756a instance = new GravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setGravity(arg);
      }
      if (v instanceof GridView) {
        ((GridView) v).setGravity(arg);
      }
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setGravity(arg);
      }
      if (v instanceof Spinner) {
        ((Spinner) v).setGravity(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setGravity(arg);
      }
    }
  }

  private static final class GroupIndicatorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final GroupIndicatorFuncfb47464a instance = new GroupIndicatorFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setGroupIndicator(arg);
      }
    }
  }

  private static final class HapticFeedbackEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HapticFeedbackEnabledFunc148d6054 instance = new HapticFeedbackEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHapticFeedbackEnabled(arg);
    }
  }

  private static final class HasTransientStateFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HasTransientStateFunc148d6054 instance = new HasTransientStateFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHasTransientState(arg);
    }
  }

  private static final class HeaderDividersEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HeaderDividersEnabledFunc148d6054 instance = new HeaderDividersEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setHeaderDividersEnabled(arg);
      }
    }
  }

  private static final class HeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HeightFunc8567756a instance = new HeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHeight(arg);
      }
    }
  }

  private static final class HighlightColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HighlightColorFunc8567756a instance = new HighlightColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHighlightColor(arg);
      }
    }
  }

  private static final class HintFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HintFunc8567756a instance = new HintFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHint(arg);
      }
    }
  }

  private static final class HintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final HintFuncc0af808b instance = new HintFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setHint(arg);
      }
    }
  }

  private static final class HintTextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final HintTextColorFunc9e5e0e4e instance = new HintTextColorFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setHintTextColor(arg);
      }
    }
  }

  private static final class HintTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HintTextColorFunc8567756a instance = new HintTextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setHintTextColor(arg);
      }
    }
  }

  private static final class HorizontalFadingEdgeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HorizontalFadingEdgeEnabledFunc148d6054 instance = new HorizontalFadingEdgeEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHorizontalFadingEdgeEnabled(arg);
    }
  }

  private static final class HorizontalGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HorizontalGravityFunc8567756a instance = new HorizontalGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setHorizontalGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setHorizontalGravity(arg);
      }
    }
  }

  private static final class HorizontalScrollBarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HorizontalScrollBarEnabledFunc148d6054 instance = new HorizontalScrollBarEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHorizontalScrollBarEnabled(arg);
    }
  }

  private static final class HorizontalScrollbarOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HorizontalScrollbarOverlayFunc148d6054 instance = new HorizontalScrollbarOverlayFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setHorizontalScrollbarOverlay(arg);
      }
    }
  }

  private static final class HorizontalSpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final HorizontalSpacingFunc8567756a instance = new HorizontalSpacingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setHorizontalSpacing(arg);
      }
    }
  }

  private static final class HorizontallyScrollingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HorizontallyScrollingFunc148d6054 instance = new HorizontallyScrollingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setHorizontallyScrolling(arg);
      }
    }
  }

  private static final class HoveredFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final HoveredFunc148d6054 instance = new HoveredFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setHovered(arg);
    }
  }

  private static final class IconifiedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IconifiedFunc148d6054 instance = new IconifiedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setIconified(arg);
      }
    }
  }

  private static final class IconifiedByDefaultFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IconifiedByDefaultFunc148d6054 instance = new IconifiedByDefaultFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setIconifiedByDefault(arg);
      }
    }
  }

  private static final class IdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final IdFunc8567756a instance = new IdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setId(arg);
    }
  }

  private static final class IgnoreGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final IgnoreGravityFunc8567756a instance = new IgnoreGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setIgnoreGravity(arg);
      }
    }
  }

  private static final class ImageAlphaFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ImageAlphaFunc8567756a instance = new ImageAlphaFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageAlpha(arg);
      }
    }
  }

  private static final class ImageBitmapFuncf4654c93 implements Anvil.AttrFunc<Bitmap> {
    public static final ImageBitmapFuncf4654c93 instance = new ImageBitmapFuncf4654c93();

    public void apply(View v, final Bitmap arg, final Bitmap old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageBitmap(arg);
      }
    }
  }

  private static final class ImageDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ImageDrawableFuncfb47464a instance = new ImageDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageDrawable(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageDrawable(arg);
      }
    }
  }

  private static final class ImageLevelFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ImageLevelFunc8567756a instance = new ImageLevelFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageLevel(arg);
      }
    }
  }

  private static final class ImageMatrixFunc6b9f325 implements Anvil.AttrFunc<Matrix> {
    public static final ImageMatrixFunc6b9f325 instance = new ImageMatrixFunc6b9f325();

    public void apply(View v, final Matrix arg, final Matrix old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageMatrix(arg);
      }
    }
  }

  private static final class ImageResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ImageResourceFunc8567756a instance = new ImageResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageResource(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageResource(arg);
      }
    }
  }

  private static final class ImageTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ImageTintListFunc9e5e0e4e instance = new ImageTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageTintList(arg);
      }
    }
  }

  private static final class ImageTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ImageTintModeFuncabb7a84e instance = new ImageTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setImageTintMode(arg);
      }
    }
  }

  private static final class ImageURIFunc75f430fc implements Anvil.AttrFunc<Uri> {
    public static final ImageURIFunc75f430fc instance = new ImageURIFunc75f430fc();

    public void apply(View v, final Uri arg, final Uri old) {
      if (v instanceof ImageSwitcher) {
        ((ImageSwitcher) v).setImageURI(arg);
      }
      if (v instanceof ImageView) {
        ((ImageView) v).setImageURI(arg);
      }
    }
  }

  private static final class ImeOptionsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ImeOptionsFunc8567756a instance = new ImeOptionsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setImeOptions(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setImeOptions(arg);
      }
    }
  }

  private static final class ImportantForAccessibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ImportantForAccessibilityFunc8567756a instance = new ImportantForAccessibilityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setImportantForAccessibility(arg);
    }
  }

  private static final class InAnimationFunc9a08bdaf implements Anvil.AttrFunc<ObjectAnimator> {
    public static final InAnimationFunc9a08bdaf instance = new InAnimationFunc9a08bdaf();

    public void apply(View v, final ObjectAnimator arg, final ObjectAnimator old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setInAnimation(arg);
      }
    }
  }

  private static final class InAnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    public static final InAnimationFunc76cb7b50 instance = new InAnimationFunc76cb7b50();

    public void apply(View v, final Animation arg, final Animation old) {
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setInAnimation(arg);
      }
    }
  }

  private static final class IncludeFontPaddingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IncludeFontPaddingFunc148d6054 instance = new IncludeFontPaddingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setIncludeFontPadding(arg);
      }
    }
  }

  private static final class IndeterminateFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IndeterminateFunc148d6054 instance = new IndeterminateFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminate(arg);
      }
    }
  }

  private static final class IndeterminateDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final IndeterminateDrawableFuncfb47464a instance = new IndeterminateDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateDrawable(arg);
      }
    }
  }

  private static final class IndeterminateDrawableTiledFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final IndeterminateDrawableTiledFuncfb47464a instance = new IndeterminateDrawableTiledFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateDrawableTiled(arg);
      }
    }
  }

  private static final class IndeterminateTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final IndeterminateTintListFunc9e5e0e4e instance = new IndeterminateTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateTintList(arg);
      }
    }
  }

  private static final class IndeterminateTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final IndeterminateTintModeFuncabb7a84e instance = new IndeterminateTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setIndeterminateTintMode(arg);
      }
    }
  }

  private static final class InflatedIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final InflatedIdFunc8567756a instance = new InflatedIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setInflatedId(arg);
      }
    }
  }

  private static final class InitialScaleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final InitialScaleFunc8567756a instance = new InitialScaleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof WebView) {
        ((WebView) v).setInitialScale(arg);
      }
    }
  }

  private static final class InputExtrasFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final InputExtrasFunc8567756a instance = new InputExtrasFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      try {
      	if (v instanceof android.widget.TextView)
      		((android.widget.TextView) v).setInputExtras(arg);
      } catch (org.xmlpull.v1.XmlPullParserException e) {
      	e.printStackTrace();
      } catch (java.io.IOException e) {
      	e.printStackTrace();
      }
    }
  }

  private static final class InputTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final InputTypeFunc8567756a instance = new InputTypeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setInputType(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setInputType(arg);
      }
    }
  }

  private static final class InterpolatorFunc805e457b implements Anvil.AttrFunc<Interpolator> {
    public static final InterpolatorFunc805e457b instance = new InterpolatorFunc805e457b();

    public void apply(View v, final Interpolator arg, final Interpolator old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setInterpolator(arg);
      }
    }
  }

  private static final class Is24HourViewFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final Is24HourViewFunc148d6054 instance = new Is24HourViewFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TimePicker) {
        ((TimePicker) v).setIs24HourView(arg);
      }
    }
  }

  private static final class IsIndicatorFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IsIndicatorFunc148d6054 instance = new IsIndicatorFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setIsIndicator(arg);
      }
    }
  }

  private static final class IsZoomInEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IsZoomInEnabledFunc148d6054 instance = new IsZoomInEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setIsZoomInEnabled(arg);
      }
    }
  }

  private static final class IsZoomOutEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final IsZoomOutEnabledFunc148d6054 instance = new IsZoomOutEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setIsZoomOutEnabled(arg);
      }
    }
  }

  private static final class ItemsCanFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ItemsCanFocusFunc148d6054 instance = new ItemsCanFocusFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ListView) {
        ((ListView) v).setItemsCanFocus(arg);
      }
    }
  }

  private static final class KeepScreenOnFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final KeepScreenOnFunc148d6054 instance = new KeepScreenOnFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setKeepScreenOn(arg);
    }
  }

  private static final class KeyListenerFuncc20cfe68 implements Anvil.AttrFunc<KeyListener> {
    public static final KeyListenerFuncc20cfe68 instance = new KeyListenerFuncc20cfe68();

    public void apply(View v, final KeyListener arg, final KeyListener old) {
      if (v instanceof TextView) {
        ((TextView) v).setKeyListener(arg);
      }
    }
  }

  private static final class KeyProgressIncrementFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final KeyProgressIncrementFunc8567756a instance = new KeyProgressIncrementFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setKeyProgressIncrement(arg);
      }
    }
  }

  private static final class KeyboardFunc68284f4c implements Anvil.AttrFunc<Keyboard> {
    public static final KeyboardFunc68284f4c instance = new KeyboardFunc68284f4c();

    public void apply(View v, final Keyboard arg, final Keyboard old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setKeyboard(arg);
      }
    }
  }

  private static final class LabelForFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LabelForFunc8567756a instance = new LabelForFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLabelFor(arg);
    }
  }

  private static final class LayerPaintFunc7c40a07a implements Anvil.AttrFunc<Paint> {
    public static final LayerPaintFunc7c40a07a instance = new LayerPaintFunc7c40a07a();

    public void apply(View v, final Paint arg, final Paint old) {
      v.setLayerPaint(arg);
    }
  }

  private static final class LayoutAnimationFunc97b72682 implements Anvil.AttrFunc<LayoutAnimationController> {
    public static final LayoutAnimationFunc97b72682 instance = new LayoutAnimationFunc97b72682();

    public void apply(View v, final LayoutAnimationController arg, final LayoutAnimationController old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutAnimation(arg);
      }
    }
  }

  private static final class LayoutAnimationListenerFunc3ffca91a implements Anvil.AttrFunc<Animation.AnimationListener> {
    public static final LayoutAnimationListenerFunc3ffca91a instance = new LayoutAnimationListenerFunc3ffca91a();

    public void apply(View v, final Animation.AnimationListener arg, final Animation.AnimationListener old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutAnimationListener(arg);
      }
    }
  }

  private static final class LayoutDirectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LayoutDirectionFunc8567756a instance = new LayoutDirectionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLayoutDirection(arg);
    }
  }

  private static final class LayoutInflaterFunc3f91d1f implements Anvil.AttrFunc<LayoutInflater> {
    public static final LayoutInflaterFunc3f91d1f instance = new LayoutInflaterFunc3f91d1f();

    public void apply(View v, final LayoutInflater arg, final LayoutInflater old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setLayoutInflater(arg);
      }
    }
  }

  private static final class LayoutModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LayoutModeFunc8567756a instance = new LayoutModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutMode(arg);
      }
    }
  }

  private static final class LayoutParamsFunc613f8e8e implements Anvil.AttrFunc<ViewGroup.LayoutParams> {
    public static final LayoutParamsFunc613f8e8e instance = new LayoutParamsFunc613f8e8e();

    public void apply(View v, final ViewGroup.LayoutParams arg, final ViewGroup.LayoutParams old) {
      v.setLayoutParams(arg);
    }
  }

  private static final class LayoutResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LayoutResourceFunc8567756a instance = new LayoutResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewStub) {
        ((ViewStub) v).setLayoutResource(arg);
      }
    }
  }

  private static final class LayoutTransitionFuncda5a1c48 implements Anvil.AttrFunc<LayoutTransition> {
    public static final LayoutTransitionFuncda5a1c48 instance = new LayoutTransitionFuncda5a1c48();

    public void apply(View v, final LayoutTransition arg, final LayoutTransition old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setLayoutTransition(arg);
      }
    }
  }

  private static final class LeftFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LeftFunc8567756a instance = new LeftFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setLeft(arg);
    }
  }

  private static final class LeftStripDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final LeftStripDrawableFuncfb47464a instance = new LeftStripDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setLeftStripDrawable(arg);
      }
    }
  }

  private static final class LeftStripDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LeftStripDrawableFunc8567756a instance = new LeftStripDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setLeftStripDrawable(arg);
      }
    }
  }

  private static final class LetterSpacingFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final LetterSpacingFunce0893188 instance = new LetterSpacingFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TextView) {
        ((TextView) v).setLetterSpacing(arg);
      }
    }
  }

  private static final class LettersWatcherFuncb32320d implements Anvil.AttrFunc<TextWatcher> {
    public static final LettersWatcherFuncb32320d instance = new LettersWatcherFuncb32320d();

    public void apply(View v, final TextWatcher arg, final TextWatcher old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setLettersWatcher(arg);
      }
    }
  }

  private static final class LinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LinesFunc8567756a instance = new LinesFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setLines(arg);
      }
    }
  }

  private static final class LinkTextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final LinkTextColorFunc9e5e0e4e instance = new LinkTextColorFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinkTextColor(arg);
      }
    }
  }

  private static final class LinkTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LinkTextColorFunc8567756a instance = new LinkTextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinkTextColor(arg);
      }
    }
  }

  private static final class LinksClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final LinksClickableFunc148d6054 instance = new LinksClickableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setLinksClickable(arg);
      }
    }
  }

  private static final class ListSelectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ListSelectionFunc8567756a instance = new ListSelectionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setListSelection(arg);
      }
    }
  }

  private static final class LogoFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final LogoFuncfb47464a instance = new LogoFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogo(arg);
      }
    }
  }

  private static final class LogoFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LogoFunc8567756a instance = new LogoFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogo(arg);
      }
    }
  }

  private static final class LogoDescriptionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final LogoDescriptionFunc8567756a instance = new LogoDescriptionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogoDescription(arg);
      }
    }
  }

  private static final class LogoDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final LogoDescriptionFuncc0af808b instance = new LogoDescriptionFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setLogoDescription(arg);
      }
    }
  }

  private static final class LongClickableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final LongClickableFunc148d6054 instance = new LongClickableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setLongClickable(arg);
    }
  }

  private static final class MarqueeRepeatLimitFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MarqueeRepeatLimitFunc8567756a instance = new MarqueeRepeatLimitFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMarqueeRepeatLimit(arg);
      }
    }
  }

  private static final class MaxFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxFunc8567756a instance = new MaxFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setMax(arg);
      }
    }
  }

  private static final class MaxDateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final MaxDateFunc17c521d0 instance = new MaxDateFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setMaxDate(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setMaxDate(arg);
      }
    }
  }

  private static final class MaxEmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxEmsFunc8567756a instance = new MaxEmsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMaxEms(arg);
      }
    }
  }

  private static final class MaxHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxHeightFunc8567756a instance = new MaxHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setMaxHeight(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setMaxHeight(arg);
      }
    }
  }

  private static final class MaxLinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxLinesFunc8567756a instance = new MaxLinesFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMaxLines(arg);
      }
    }
  }

  private static final class MaxValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxValueFunc8567756a instance = new MaxValueFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setMaxValue(arg);
      }
    }
  }

  private static final class MaxVisibleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxVisibleFunc8567756a instance = new MaxVisibleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof FragmentBreadCrumbs) {
        ((FragmentBreadCrumbs) v).setMaxVisible(arg);
      }
    }
  }

  private static final class MaxWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MaxWidthFunc8567756a instance = new MaxWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setMaxWidth(arg);
      }
      if (v instanceof SearchView) {
        ((SearchView) v).setMaxWidth(arg);
      }
      if (v instanceof TextView) {
        ((TextView) v).setMaxWidth(arg);
      }
    }
  }

  private static final class MeasureAllChildrenFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final MeasureAllChildrenFunc148d6054 instance = new MeasureAllChildrenFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof FrameLayout) {
        ((FrameLayout) v).setMeasureAllChildren(arg);
      }
    }
  }

  private static final class MeasureWithLargestChildEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final MeasureWithLargestChildEnabledFunc148d6054 instance = new MeasureWithLargestChildEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setMeasureWithLargestChildEnabled(arg);
      }
    }
  }

  private static final class MediaControllerFunc727c9135 implements Anvil.AttrFunc<MediaController> {
    public static final MediaControllerFunc727c9135 instance = new MediaControllerFunc727c9135();

    public void apply(View v, final MediaController arg, final MediaController old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setMediaController(arg);
      }
    }
  }

  private static final class MediaPlayerFunc3deec331 implements Anvil.AttrFunc<MediaController.MediaPlayerControl> {
    public static final MediaPlayerFunc3deec331 instance = new MediaPlayerFunc3deec331();

    public void apply(View v, final MediaController.MediaPlayerControl arg, final MediaController.MediaPlayerControl old) {
      if (v instanceof MediaController) {
        ((MediaController) v).setMediaPlayer(arg);
      }
    }
  }

  private static final class MinDateFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final MinDateFunc17c521d0 instance = new MinDateFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setMinDate(arg);
      }
      if (v instanceof DatePicker) {
        ((DatePicker) v).setMinDate(arg);
      }
    }
  }

  private static final class MinEmsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinEmsFunc8567756a instance = new MinEmsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinEms(arg);
      }
    }
  }

  private static final class MinHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinHeightFunc8567756a instance = new MinHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinHeight(arg);
      }
    }
  }

  private static final class MinLinesFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinLinesFunc8567756a instance = new MinLinesFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinLines(arg);
      }
    }
  }

  private static final class MinValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinValueFunc8567756a instance = new MinValueFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setMinValue(arg);
      }
    }
  }

  private static final class MinWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinWidthFunc8567756a instance = new MinWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setMinWidth(arg);
      }
    }
  }

  private static final class MinimumHeightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinimumHeightFunc8567756a instance = new MinimumHeightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setMinimumHeight(arg);
    }
  }

  private static final class MinimumWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final MinimumWidthFunc8567756a instance = new MinimumWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setMinimumWidth(arg);
    }
  }

  private static final class ModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ModeFunc8567756a instance = new ModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof DialerFilter) {
        ((DialerFilter) v).setMode(arg);
      }
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setMode(arg);
      }
    }
  }

  private static final class MotionEventSplittingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final MotionEventSplittingEnabledFunc148d6054 instance = new MotionEventSplittingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setMotionEventSplittingEnabled(arg);
      }
    }
  }

  private static final class MovementMethodFunc9584901b implements Anvil.AttrFunc<MovementMethod> {
    public static final MovementMethodFunc9584901b instance = new MovementMethodFunc9584901b();

    public void apply(View v, final MovementMethod arg, final MovementMethod old) {
      if (v instanceof TextView) {
        ((TextView) v).setMovementMethod(arg);
      }
    }
  }

  private static final class MultiChoiceModeListenerFunc74531ecd implements Anvil.AttrFunc<AbsListView.MultiChoiceModeListener> {
    public static final MultiChoiceModeListenerFunc74531ecd instance = new MultiChoiceModeListenerFunc74531ecd();

    public void apply(View v, final AbsListView.MultiChoiceModeListener arg, final AbsListView.MultiChoiceModeListener old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setMultiChoiceModeListener(arg);
      }
    }
  }

  private static final class NavigationContentDescriptionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NavigationContentDescriptionFunc8567756a instance = new NavigationContentDescriptionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationContentDescription(arg);
      }
    }
  }

  private static final class NavigationContentDescriptionFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final NavigationContentDescriptionFuncc0af808b instance = new NavigationContentDescriptionFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationContentDescription(arg);
      }
    }
  }

  private static final class NavigationIconFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final NavigationIconFuncfb47464a instance = new NavigationIconFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationIcon(arg);
      }
    }
  }

  private static final class NavigationIconFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NavigationIconFunc8567756a instance = new NavigationIconFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationIcon(arg);
      }
    }
  }

  private static final class NavigationOnClickListenerFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final NavigationOnClickListenerFunc79a13a5e instance = new NavigationOnClickListenerFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setNavigationOnClickListener(arg);
      }
    }
  }

  private static final class NestedScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final NestedScrollingEnabledFunc148d6054 instance = new NestedScrollingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setNestedScrollingEnabled(arg);
    }
  }

  private static final class NetworkAvailableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final NetworkAvailableFunc148d6054 instance = new NetworkAvailableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setNetworkAvailable(arg);
      }
    }
  }

  private static final class NextFocusDownIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NextFocusDownIdFunc8567756a instance = new NextFocusDownIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusDownId(arg);
    }
  }

  private static final class NextFocusForwardIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NextFocusForwardIdFunc8567756a instance = new NextFocusForwardIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusForwardId(arg);
    }
  }

  private static final class NextFocusLeftIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NextFocusLeftIdFunc8567756a instance = new NextFocusLeftIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusLeftId(arg);
    }
  }

  private static final class NextFocusRightIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NextFocusRightIdFunc8567756a instance = new NextFocusRightIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusRightId(arg);
    }
  }

  private static final class NextFocusUpIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NextFocusUpIdFunc8567756a instance = new NextFocusUpIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setNextFocusUpId(arg);
    }
  }

  private static final class NumColumnsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NumColumnsFunc8567756a instance = new NumColumnsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setNumColumns(arg);
      }
    }
  }

  private static final class NumStarsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final NumStarsFunc8567756a instance = new NumStarsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setNumStars(arg);
      }
    }
  }

  private static final class OnApplyWindowInsetsFunc1d84af6a implements Anvil.AttrFunc<View.OnApplyWindowInsetsListener> {
    public static final OnApplyWindowInsetsFunc1d84af6a instance = new OnApplyWindowInsetsFunc1d84af6a();

    public void apply(View v, final View.OnApplyWindowInsetsListener arg, final View.OnApplyWindowInsetsListener old) {
      if (arg != null) {
        v.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
          public WindowInsets onApplyWindowInsets(View a0, WindowInsets a1) {
            WindowInsets r = arg.onApplyWindowInsets(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
      }
    }
  }

  private static final class OnBreadCrumbClickFunc9216bf60 implements Anvil.AttrFunc<FragmentBreadCrumbs.OnBreadCrumbClickListener> {
    public static final OnBreadCrumbClickFunc9216bf60 instance = new OnBreadCrumbClickFunc9216bf60();

    public void apply(View v, final FragmentBreadCrumbs.OnBreadCrumbClickListener arg, final FragmentBreadCrumbs.OnBreadCrumbClickListener old) {
      if (v instanceof FragmentBreadCrumbs) {
        if (arg != null) {
          ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener(new FragmentBreadCrumbs.OnBreadCrumbClickListener() {
            public boolean onBreadCrumbClick(FragmentManager.BackStackEntry a0, int a1) {
              boolean r = arg.onBreadCrumbClick(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener((FragmentBreadCrumbs.OnBreadCrumbClickListener) null);
        }
      }
    }
  }

  private static final class OnCheckedChangeFunca7ec32e6 implements Anvil.AttrFunc<CompoundButton.OnCheckedChangeListener> {
    public static final OnCheckedChangeFunca7ec32e6 instance = new OnCheckedChangeFunca7ec32e6();

    public void apply(View v, final CompoundButton.OnCheckedChangeListener arg, final CompoundButton.OnCheckedChangeListener old) {
      if (v instanceof CompoundButton) {
        if (arg != null) {
          ((CompoundButton) v).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton a0, boolean a1) {
              arg.onCheckedChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((CompoundButton) v).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
      }
    }
  }

  private static final class OnCheckedChangeFunc9ce6f1ed implements Anvil.AttrFunc<RadioGroup.OnCheckedChangeListener> {
    public static final OnCheckedChangeFunc9ce6f1ed instance = new OnCheckedChangeFunc9ce6f1ed();

    public void apply(View v, final RadioGroup.OnCheckedChangeListener arg, final RadioGroup.OnCheckedChangeListener old) {
      if (v instanceof RadioGroup) {
        if (arg != null) {
          ((RadioGroup) v).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup a0, int a1) {
              arg.onCheckedChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((RadioGroup) v).setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
      }
    }
  }

  private static final class OnChildClickFunc41bf08ab implements Anvil.AttrFunc<ExpandableListView.OnChildClickListener> {
    public static final OnChildClickFunc41bf08ab instance = new OnChildClickFunc41bf08ab();

    public void apply(View v, final ExpandableListView.OnChildClickListener arg, final ExpandableListView.OnChildClickListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            public boolean onChildClick(ExpandableListView a0, View a1, int a2, int a3, long a4) {
              boolean r = arg.onChildClick(a0, a1, a2, a3, a4);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ExpandableListView) v).setOnChildClickListener((ExpandableListView.OnChildClickListener) null);
        }
      }
    }
  }

  private static final class OnChronometerTickFunc314a7a05 implements Anvil.AttrFunc<Chronometer.OnChronometerTickListener> {
    public static final OnChronometerTickFunc314a7a05 instance = new OnChronometerTickFunc314a7a05();

    public void apply(View v, final Chronometer.OnChronometerTickListener arg, final Chronometer.OnChronometerTickListener old) {
      if (v instanceof Chronometer) {
        if (arg != null) {
          ((Chronometer) v).setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            public void onChronometerTick(Chronometer a0) {
              arg.onChronometerTick(a0);
              Anvil.render();
            }
          });
        } else {
          ((Chronometer) v).setOnChronometerTickListener((Chronometer.OnChronometerTickListener) null);
        }
      }
    }
  }

  private static final class OnClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final OnClickFunc79a13a5e instance = new OnClickFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (arg != null) {
        v.setOnClickListener(new View.OnClickListener() {
          public void onClick(View a0) {
            arg.onClick(a0);
            Anvil.render();
          }
        });
      } else {
        v.setOnClickListener((View.OnClickListener) null);
      }
    }
  }

  private static final class OnCloseFunc2f96a1d7 implements Anvil.AttrFunc<SearchView.OnCloseListener> {
    public static final OnCloseFunc2f96a1d7 instance = new OnCloseFunc2f96a1d7();

    public void apply(View v, final SearchView.OnCloseListener arg, final SearchView.OnCloseListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnCloseListener(new SearchView.OnCloseListener() {
            public boolean onClose() {
              boolean r = arg.onClose();
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnCloseListener((SearchView.OnCloseListener) null);
        }
      }
    }
  }

  private static final class OnCompletionFunc118298c1 implements Anvil.AttrFunc<MediaPlayer.OnCompletionListener> {
    public static final OnCompletionFunc118298c1 instance = new OnCompletionFunc118298c1();

    public void apply(View v, final MediaPlayer.OnCompletionListener arg, final MediaPlayer.OnCompletionListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer a0) {
              arg.onCompletion(a0);
              Anvil.render();
            }
          });
        } else {
          ((VideoView) v).setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        }
      }
    }
  }

  private static final class OnCreateContextMenuFunc657678e8 implements Anvil.AttrFunc<View.OnCreateContextMenuListener> {
    public static final OnCreateContextMenuFunc657678e8 instance = new OnCreateContextMenuFunc657678e8();

    public void apply(View v, final View.OnCreateContextMenuListener arg, final View.OnCreateContextMenuListener old) {
      if (arg != null) {
        v.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
          public void onCreateContextMenu(ContextMenu a0, View a1, ContextMenu.ContextMenuInfo a2) {
            arg.onCreateContextMenu(a0, a1, a2);
            Anvil.render();
          }
        });
      } else {
        v.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
      }
    }
  }

  private static final class OnDateChangeFuncd43c4991 implements Anvil.AttrFunc<CalendarView.OnDateChangeListener> {
    public static final OnDateChangeFuncd43c4991 instance = new OnDateChangeFuncd43c4991();

    public void apply(View v, final CalendarView.OnDateChangeListener arg, final CalendarView.OnDateChangeListener old) {
      if (v instanceof CalendarView) {
        if (arg != null) {
          ((CalendarView) v).setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            public void onSelectedDayChange(CalendarView a0, int a1, int a2, int a3) {
              arg.onSelectedDayChange(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((CalendarView) v).setOnDateChangeListener((CalendarView.OnDateChangeListener) null);
        }
      }
    }
  }

  private static final class OnDismissFuncfea72fd6 implements Anvil.AttrFunc<AutoCompleteTextView.OnDismissListener> {
    public static final OnDismissFuncfea72fd6 instance = new OnDismissFuncfea72fd6();

    public void apply(View v, final AutoCompleteTextView.OnDismissListener arg, final AutoCompleteTextView.OnDismissListener old) {
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
            public void onDismiss() {
              arg.onDismiss();
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
      }
    }
  }

  private static final class OnDragFunc685605c6 implements Anvil.AttrFunc<View.OnDragListener> {
    public static final OnDragFunc685605c6 instance = new OnDragFunc685605c6();

    public void apply(View v, final View.OnDragListener arg, final View.OnDragListener old) {
      if (arg != null) {
        v.setOnDragListener(new View.OnDragListener() {
          public boolean onDrag(View a0, DragEvent a1) {
            boolean r = arg.onDrag(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnDragListener((View.OnDragListener) null);
      }
    }
  }

  private static final class OnDrawerCloseFunc2c932b02 implements Anvil.AttrFunc<SlidingDrawer.OnDrawerCloseListener> {
    public static final OnDrawerCloseFunc2c932b02 instance = new OnDrawerCloseFunc2c932b02();

    public void apply(View v, final SlidingDrawer.OnDrawerCloseListener arg, final SlidingDrawer.OnDrawerCloseListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
            public void onDrawerClosed() {
              arg.onDrawerClosed();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerCloseListener((SlidingDrawer.OnDrawerCloseListener) null);
        }
      }
    }
  }

  private static final class OnDrawerOpenFuncbff66a28 implements Anvil.AttrFunc<SlidingDrawer.OnDrawerOpenListener> {
    public static final OnDrawerOpenFuncbff66a28 instance = new OnDrawerOpenFuncbff66a28();

    public void apply(View v, final SlidingDrawer.OnDrawerOpenListener arg, final SlidingDrawer.OnDrawerOpenListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
            public void onDrawerOpened() {
              arg.onDrawerOpened();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerOpenListener((SlidingDrawer.OnDrawerOpenListener) null);
        }
      }
    }
  }

  private static final class OnDrawerScrollFunc44bfdd2b implements Anvil.AttrFunc<SlidingDrawer.OnDrawerScrollListener> {
    public static final OnDrawerScrollFunc44bfdd2b instance = new OnDrawerScrollFunc44bfdd2b();

    public void apply(View v, final SlidingDrawer.OnDrawerScrollListener arg, final SlidingDrawer.OnDrawerScrollListener old) {
      if (v instanceof SlidingDrawer) {
        if (arg != null) {
          ((SlidingDrawer) v).setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
            public void onScrollEnded() {
              arg.onScrollEnded();
              Anvil.render();
            }

            public void onScrollStarted() {
              arg.onScrollStarted();
              Anvil.render();
            }
          });
        } else {
          ((SlidingDrawer) v).setOnDrawerScrollListener((SlidingDrawer.OnDrawerScrollListener) null);
        }
      }
    }
  }

  private static final class OnEditorActionFuncb9b05d07 implements Anvil.AttrFunc<TextView.OnEditorActionListener> {
    public static final OnEditorActionFuncb9b05d07 instance = new OnEditorActionFuncb9b05d07();

    public void apply(View v, final TextView.OnEditorActionListener arg, final TextView.OnEditorActionListener old) {
      if (v instanceof TextView) {
        if (arg != null) {
          ((TextView) v).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView a0, int a1, KeyEvent a2) {
              boolean r = arg.onEditorAction(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((TextView) v).setOnEditorActionListener((TextView.OnEditorActionListener) null);
        }
      }
    }
  }

  private static final class OnErrorFunc19f5c42b implements Anvil.AttrFunc<MediaPlayer.OnErrorListener> {
    public static final OnErrorFunc19f5c42b instance = new OnErrorFunc19f5c42b();

    public void apply(View v, final MediaPlayer.OnErrorListener arg, final MediaPlayer.OnErrorListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public boolean onError(MediaPlayer a0, int a1, int a2) {
              boolean r = arg.onError(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((VideoView) v).setOnErrorListener((MediaPlayer.OnErrorListener) null);
        }
      }
    }
  }

  private static final class OnFocusChangeFunca56a1dfe implements Anvil.AttrFunc<View.OnFocusChangeListener> {
    public static final OnFocusChangeFunca56a1dfe instance = new OnFocusChangeFunca56a1dfe();

    public void apply(View v, final View.OnFocusChangeListener arg, final View.OnFocusChangeListener old) {
      if (arg != null) {
        v.setOnFocusChangeListener(new View.OnFocusChangeListener() {
          public void onFocusChange(View a0, boolean a1) {
            arg.onFocusChange(a0, a1);
            Anvil.render();
          }
        });
      } else {
        v.setOnFocusChangeListener((View.OnFocusChangeListener) null);
      }
    }
  }

  private static final class OnGenericMotionFunc35b75643 implements Anvil.AttrFunc<View.OnGenericMotionListener> {
    public static final OnGenericMotionFunc35b75643 instance = new OnGenericMotionFunc35b75643();

    public void apply(View v, final View.OnGenericMotionListener arg, final View.OnGenericMotionListener old) {
      if (arg != null) {
        v.setOnGenericMotionListener(new View.OnGenericMotionListener() {
          public boolean onGenericMotion(View a0, MotionEvent a1) {
            boolean r = arg.onGenericMotion(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnGenericMotionListener((View.OnGenericMotionListener) null);
      }
    }
  }

  private static final class OnGroupClickFunc8330a028 implements Anvil.AttrFunc<ExpandableListView.OnGroupClickListener> {
    public static final OnGroupClickFunc8330a028 instance = new OnGroupClickFunc8330a028();

    public void apply(View v, final ExpandableListView.OnGroupClickListener arg, final ExpandableListView.OnGroupClickListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            public boolean onGroupClick(ExpandableListView a0, View a1, int a2, long a3) {
              boolean r = arg.onGroupClick(a0, a1, a2, a3);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupClickListener((ExpandableListView.OnGroupClickListener) null);
        }
      }
    }
  }

  private static final class OnGroupCollapseFunc817eb235 implements Anvil.AttrFunc<ExpandableListView.OnGroupCollapseListener> {
    public static final OnGroupCollapseFunc817eb235 instance = new OnGroupCollapseFunc817eb235();

    public void apply(View v, final ExpandableListView.OnGroupCollapseListener arg, final ExpandableListView.OnGroupCollapseListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            public void onGroupCollapse(int a0) {
              arg.onGroupCollapse(a0);
              Anvil.render();
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupCollapseListener((ExpandableListView.OnGroupCollapseListener) null);
        }
      }
    }
  }

  private static final class OnGroupExpandFunccdb64d22 implements Anvil.AttrFunc<ExpandableListView.OnGroupExpandListener> {
    public static final OnGroupExpandFunccdb64d22 instance = new OnGroupExpandFunccdb64d22();

    public void apply(View v, final ExpandableListView.OnGroupExpandListener arg, final ExpandableListView.OnGroupExpandListener old) {
      if (v instanceof ExpandableListView) {
        if (arg != null) {
          ((ExpandableListView) v).setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            public void onGroupExpand(int a0) {
              arg.onGroupExpand(a0);
              Anvil.render();
            }
          });
        } else {
          ((ExpandableListView) v).setOnGroupExpandListener((ExpandableListView.OnGroupExpandListener) null);
        }
      }
    }
  }

  private static final class OnHierarchyChangeFunc7b5dc8bc implements Anvil.AttrFunc<ViewGroup.OnHierarchyChangeListener> {
    public static final OnHierarchyChangeFunc7b5dc8bc instance = new OnHierarchyChangeFunc7b5dc8bc();

    public void apply(View v, final ViewGroup.OnHierarchyChangeListener arg, final ViewGroup.OnHierarchyChangeListener old) {
      if (v instanceof ViewGroup) {
        if (arg != null) {
          ((ViewGroup) v).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
            public void onChildViewAdded(View a0, View a1) {
              arg.onChildViewAdded(a0, a1);
              Anvil.render();
            }

            public void onChildViewRemoved(View a0, View a1) {
              arg.onChildViewRemoved(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((ViewGroup) v).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
      }
    }
  }

  private static final class OnHoverFuncbf544a12 implements Anvil.AttrFunc<View.OnHoverListener> {
    public static final OnHoverFuncbf544a12 instance = new OnHoverFuncbf544a12();

    public void apply(View v, final View.OnHoverListener arg, final View.OnHoverListener old) {
      if (arg != null) {
        v.setOnHoverListener(new View.OnHoverListener() {
          public boolean onHover(View a0, MotionEvent a1) {
            boolean r = arg.onHover(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnHoverListener((View.OnHoverListener) null);
      }
    }
  }

  private static final class OnInflateFuncdd97752b implements Anvil.AttrFunc<ViewStub.OnInflateListener> {
    public static final OnInflateFuncdd97752b instance = new OnInflateFuncdd97752b();

    public void apply(View v, final ViewStub.OnInflateListener arg, final ViewStub.OnInflateListener old) {
      if (v instanceof ViewStub) {
        if (arg != null) {
          ((ViewStub) v).setOnInflateListener(new ViewStub.OnInflateListener() {
            public void onInflate(ViewStub a0, View a1) {
              arg.onInflate(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((ViewStub) v).setOnInflateListener((ViewStub.OnInflateListener) null);
        }
      }
    }
  }

  private static final class OnInfoFuncfc58c853 implements Anvil.AttrFunc<MediaPlayer.OnInfoListener> {
    public static final OnInfoFuncfc58c853 instance = new OnInfoFuncfc58c853();

    public void apply(View v, final MediaPlayer.OnInfoListener arg, final MediaPlayer.OnInfoListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnInfoListener(new MediaPlayer.OnInfoListener() {
            public boolean onInfo(MediaPlayer a0, int a1, int a2) {
              boolean r = arg.onInfo(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((VideoView) v).setOnInfoListener((MediaPlayer.OnInfoListener) null);
        }
      }
    }
  }

  private static final class OnItemClickFuncbe673005 implements Anvil.AttrFunc<AdapterView.OnItemClickListener> {
    public static final OnItemClickFuncbe673005 instance = new OnItemClickFuncbe673005();

    public void apply(View v, final AdapterView.OnItemClickListener arg, final AdapterView.OnItemClickListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemClick(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((AdapterView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
        }
      }
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemClick(a0, a1, a2, a3);
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
        }
      }
    }
  }

  private static final class OnItemLongClickFuncbc740669 implements Anvil.AttrFunc<AdapterView.OnItemLongClickListener> {
    public static final OnItemLongClickFuncbc740669 instance = new OnItemLongClickFuncbc740669();

    public void apply(View v, final AdapterView.OnItemLongClickListener arg, final AdapterView.OnItemLongClickListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView a0, View a1, int a2, long a3) {
              boolean r = arg.onItemLongClick(a0, a1, a2, a3);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((AdapterView) v).setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
        }
      }
    }
  }

  private static final class OnItemSelectedFuncb7923a26 implements Anvil.AttrFunc<AdapterView.OnItemSelectedListener> {
    public static final OnItemSelectedFuncb7923a26 instance = new OnItemSelectedFuncb7923a26();

    public void apply(View v, final AdapterView.OnItemSelectedListener arg, final AdapterView.OnItemSelectedListener old) {
      if (v instanceof AdapterView) {
        if (arg != null) {
          ((AdapterView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemSelected(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onNothingSelected(AdapterView a0) {
              arg.onNothingSelected(a0);
              Anvil.render();
            }
          });
        } else {
          ((AdapterView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
      }
      if (v instanceof AutoCompleteTextView) {
        if (arg != null) {
          ((AutoCompleteTextView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
              arg.onItemSelected(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onNothingSelected(AdapterView a0) {
              arg.onNothingSelected(a0);
              Anvil.render();
            }
          });
        } else {
          ((AutoCompleteTextView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        }
      }
    }
  }

  private static final class OnKeyFunce04764b5 implements Anvil.AttrFunc<View.OnKeyListener> {
    public static final OnKeyFunce04764b5 instance = new OnKeyFunce04764b5();

    public void apply(View v, final View.OnKeyListener arg, final View.OnKeyListener old) {
      if (arg != null) {
        v.setOnKeyListener(new View.OnKeyListener() {
          public boolean onKey(View a0, int a1, KeyEvent a2) {
            boolean r = arg.onKey(a0, a1, a2);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnKeyListener((View.OnKeyListener) null);
      }
    }
  }

  private static final class OnKeyboardActionFunc754370ed implements Anvil.AttrFunc<KeyboardView.OnKeyboardActionListener> {
    public static final OnKeyboardActionFunc754370ed instance = new OnKeyboardActionFunc754370ed();

    public void apply(View v, final KeyboardView.OnKeyboardActionListener arg, final KeyboardView.OnKeyboardActionListener old) {
      if (v instanceof KeyboardView) {
        if (arg != null) {
          ((KeyboardView) v).setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
            public void onKey(int a0, int[] a1) {
              arg.onKey(a0, a1);
              Anvil.render();
            }

            public void onPress(int a0) {
              arg.onPress(a0);
              Anvil.render();
            }

            public void onRelease(int a0) {
              arg.onRelease(a0);
              Anvil.render();
            }

            public void onText(CharSequence a0) {
              arg.onText(a0);
              Anvil.render();
            }

            public void swipeDown() {
              arg.swipeDown();
              Anvil.render();
            }

            public void swipeLeft() {
              arg.swipeLeft();
              Anvil.render();
            }

            public void swipeRight() {
              arg.swipeRight();
              Anvil.render();
            }

            public void swipeUp() {
              arg.swipeUp();
              Anvil.render();
            }
          });
        } else {
          ((KeyboardView) v).setOnKeyboardActionListener((KeyboardView.OnKeyboardActionListener) null);
        }
      }
    }
  }

  private static final class OnLongClickFuncdc7f3c42 implements Anvil.AttrFunc<View.OnLongClickListener> {
    public static final OnLongClickFuncdc7f3c42 instance = new OnLongClickFuncdc7f3c42();

    public void apply(View v, final View.OnLongClickListener arg, final View.OnLongClickListener old) {
      if (arg != null) {
        v.setOnLongClickListener(new View.OnLongClickListener() {
          public boolean onLongClick(View a0) {
            boolean r = arg.onLongClick(a0);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnLongClickListener((View.OnLongClickListener) null);
      }
    }
  }

  private static final class OnLongPressUpdateIntervalFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final OnLongPressUpdateIntervalFunc17c521d0 instance = new OnLongPressUpdateIntervalFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setOnLongPressUpdateInterval(arg);
      }
    }
  }

  private static final class OnMenuItemClickFuncc8271282 implements Anvil.AttrFunc<ActionMenuView.OnMenuItemClickListener> {
    public static final OnMenuItemClickFuncc8271282 instance = new OnMenuItemClickFuncc8271282();

    public void apply(View v, final ActionMenuView.OnMenuItemClickListener arg, final ActionMenuView.OnMenuItemClickListener old) {
      if (v instanceof ActionMenuView) {
        if (arg != null) {
          ((ActionMenuView) v).setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem a0) {
              boolean r = arg.onMenuItemClick(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((ActionMenuView) v).setOnMenuItemClickListener((ActionMenuView.OnMenuItemClickListener) null);
        }
      }
    }
  }

  private static final class OnMenuItemClickFunc8ed2cccd implements Anvil.AttrFunc<Toolbar.OnMenuItemClickListener> {
    public static final OnMenuItemClickFunc8ed2cccd instance = new OnMenuItemClickFunc8ed2cccd();

    public void apply(View v, final Toolbar.OnMenuItemClickListener arg, final Toolbar.OnMenuItemClickListener old) {
      if (v instanceof Toolbar) {
        if (arg != null) {
          ((Toolbar) v).setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem a0) {
              boolean r = arg.onMenuItemClick(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((Toolbar) v).setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener) null);
        }
      }
    }
  }

  private static final class OnPreparedFuncde5b2862 implements Anvil.AttrFunc<MediaPlayer.OnPreparedListener> {
    public static final OnPreparedFuncde5b2862 instance = new OnPreparedFuncde5b2862();

    public void apply(View v, final MediaPlayer.OnPreparedListener arg, final MediaPlayer.OnPreparedListener old) {
      if (v instanceof VideoView) {
        if (arg != null) {
          ((VideoView) v).setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer a0) {
              arg.onPrepared(a0);
              Anvil.render();
            }
          });
        } else {
          ((VideoView) v).setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        }
      }
    }
  }

  private static final class OnQueryTextFunc8c880774 implements Anvil.AttrFunc<SearchView.OnQueryTextListener> {
    public static final OnQueryTextFunc8c880774 instance = new OnQueryTextFunc8c880774();

    public void apply(View v, final SearchView.OnQueryTextListener arg, final SearchView.OnQueryTextListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextChange(String a0) {
              boolean r = arg.onQueryTextChange(a0);
              Anvil.render();
              return r;
            }

            public boolean onQueryTextSubmit(String a0) {
              boolean r = arg.onQueryTextSubmit(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnQueryTextListener((SearchView.OnQueryTextListener) null);
        }
      }
    }
  }

  private static final class OnQueryTextFocusChangeFunca56a1dfe implements Anvil.AttrFunc<View.OnFocusChangeListener> {
    public static final OnQueryTextFocusChangeFunca56a1dfe instance = new OnQueryTextFocusChangeFunca56a1dfe();

    public void apply(View v, final View.OnFocusChangeListener arg, final View.OnFocusChangeListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View a0, boolean a1) {
              arg.onFocusChange(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((SearchView) v).setOnQueryTextFocusChangeListener((View.OnFocusChangeListener) null);
        }
      }
    }
  }

  private static final class OnRatingBarChangeFunceb1aadb8 implements Anvil.AttrFunc<RatingBar.OnRatingBarChangeListener> {
    public static final OnRatingBarChangeFunceb1aadb8 instance = new OnRatingBarChangeFunceb1aadb8();

    public void apply(View v, final RatingBar.OnRatingBarChangeListener arg, final RatingBar.OnRatingBarChangeListener old) {
      if (v instanceof RatingBar) {
        if (arg != null) {
          ((RatingBar) v).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar a0, float a1, boolean a2) {
              arg.onRatingChanged(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((RatingBar) v).setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener) null);
        }
      }
    }
  }

  private static final class OnScrollFunce14bebe4 implements Anvil.AttrFunc<AbsListView.OnScrollListener> {
    public static final OnScrollFunce14bebe4 instance = new OnScrollFunce14bebe4();

    public void apply(View v, final AbsListView.OnScrollListener arg, final AbsListView.OnScrollListener old) {
      if (v instanceof AbsListView) {
        if (arg != null) {
          ((AbsListView) v).setOnScrollListener(new AbsListView.OnScrollListener() {
            public void onScroll(AbsListView a0, int a1, int a2, int a3) {
              arg.onScroll(a0, a1, a2, a3);
              Anvil.render();
            }

            public void onScrollStateChanged(AbsListView a0, int a1) {
              arg.onScrollStateChanged(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((AbsListView) v).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
      }
    }
  }

  private static final class OnScrollFunca8ab482c implements Anvil.AttrFunc<NumberPicker.OnScrollListener> {
    public static final OnScrollFunca8ab482c instance = new OnScrollFunca8ab482c();

    public void apply(View v, final NumberPicker.OnScrollListener arg, final NumberPicker.OnScrollListener old) {
      if (v instanceof NumberPicker) {
        if (arg != null) {
          ((NumberPicker) v).setOnScrollListener(new NumberPicker.OnScrollListener() {
            public void onScrollStateChange(NumberPicker a0, int a1) {
              arg.onScrollStateChange(a0, a1);
              Anvil.render();
            }
          });
        } else {
          ((NumberPicker) v).setOnScrollListener((NumberPicker.OnScrollListener) null);
        }
      }
    }
  }

  private static final class OnSearchClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final OnSearchClickFunc79a13a5e instance = new OnSearchClickFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnSearchClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((SearchView) v).setOnSearchClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OnSeekBarChangeFunc11980542 implements Anvil.AttrFunc<SeekBar.OnSeekBarChangeListener> {
    public static final OnSeekBarChangeFunc11980542 instance = new OnSeekBarChangeFunc11980542();

    public void apply(View v, final SeekBar.OnSeekBarChangeListener arg, final SeekBar.OnSeekBarChangeListener old) {
      if (v instanceof SeekBar) {
        if (arg != null) {
          ((SeekBar) v).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar a0, int a1, boolean a2) {
              arg.onProgressChanged(a0, a1, a2);
              Anvil.render();
            }

            public void onStartTrackingTouch(SeekBar a0) {
              arg.onStartTrackingTouch(a0);
              Anvil.render();
            }

            public void onStopTrackingTouch(SeekBar a0) {
              arg.onStopTrackingTouch(a0);
              Anvil.render();
            }
          });
        } else {
          ((SeekBar) v).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        }
      }
    }
  }

  private static final class OnSuggestionFunc8020caad implements Anvil.AttrFunc<SearchView.OnSuggestionListener> {
    public static final OnSuggestionFunc8020caad instance = new OnSuggestionFunc8020caad();

    public void apply(View v, final SearchView.OnSuggestionListener arg, final SearchView.OnSuggestionListener old) {
      if (v instanceof SearchView) {
        if (arg != null) {
          ((SearchView) v).setOnSuggestionListener(new SearchView.OnSuggestionListener() {
            public boolean onSuggestionClick(int a0) {
              boolean r = arg.onSuggestionClick(a0);
              Anvil.render();
              return r;
            }

            public boolean onSuggestionSelect(int a0) {
              boolean r = arg.onSuggestionSelect(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((SearchView) v).setOnSuggestionListener((SearchView.OnSuggestionListener) null);
        }
      }
    }
  }

  private static final class OnSystemUiVisibilityChangeFunc42302537 implements Anvil.AttrFunc<View.OnSystemUiVisibilityChangeListener> {
    public static final OnSystemUiVisibilityChangeFunc42302537 instance = new OnSystemUiVisibilityChangeFunc42302537();

    public void apply(View v, final View.OnSystemUiVisibilityChangeListener arg, final View.OnSystemUiVisibilityChangeListener old) {
      if (arg != null) {
        v.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
          public void onSystemUiVisibilityChange(int a0) {
            arg.onSystemUiVisibilityChange(a0);
            Anvil.render();
          }
        });
      } else {
        v.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
      }
    }
  }

  private static final class OnTabChangedFunc2d645be implements Anvil.AttrFunc<TabHost.OnTabChangeListener> {
    public static final OnTabChangedFunc2d645be instance = new OnTabChangedFunc2d645be();

    public void apply(View v, final TabHost.OnTabChangeListener arg, final TabHost.OnTabChangeListener old) {
      if (v instanceof TabHost) {
        if (arg != null) {
          ((TabHost) v).setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            public void onTabChanged(String a0) {
              arg.onTabChanged(a0);
              Anvil.render();
            }
          });
        } else {
          ((TabHost) v).setOnTabChangedListener((TabHost.OnTabChangeListener) null);
        }
      }
    }
  }

  private static final class OnTimeChangedFuncaf1cf294 implements Anvil.AttrFunc<TimePicker.OnTimeChangedListener> {
    public static final OnTimeChangedFuncaf1cf294 instance = new OnTimeChangedFuncaf1cf294();

    public void apply(View v, final TimePicker.OnTimeChangedListener arg, final TimePicker.OnTimeChangedListener old) {
      if (v instanceof TimePicker) {
        if (arg != null) {
          ((TimePicker) v).setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            public void onTimeChanged(TimePicker a0, int a1, int a2) {
              arg.onTimeChanged(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((TimePicker) v).setOnTimeChangedListener((TimePicker.OnTimeChangedListener) null);
        }
      }
    }
  }

  private static final class OnTouchFunca554ad15 implements Anvil.AttrFunc<View.OnTouchListener> {
    public static final OnTouchFunca554ad15 instance = new OnTouchFunca554ad15();

    public void apply(View v, final View.OnTouchListener arg, final View.OnTouchListener old) {
      if (arg != null) {
        v.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View a0, MotionEvent a1) {
            boolean r = arg.onTouch(a0, a1);
            Anvil.render();
            return r;
          }
        });
      } else {
        v.setOnTouchListener((View.OnTouchListener) null);
      }
    }
  }

  private static final class OnUnhandledInputEventFunc8283e384 implements Anvil.AttrFunc<TvView.OnUnhandledInputEventListener> {
    public static final OnUnhandledInputEventFunc8283e384 instance = new OnUnhandledInputEventFunc8283e384();

    public void apply(View v, final TvView.OnUnhandledInputEventListener arg, final TvView.OnUnhandledInputEventListener old) {
      if (v instanceof TvView) {
        if (arg != null) {
          ((TvView) v).setOnUnhandledInputEventListener(new TvView.OnUnhandledInputEventListener() {
            public boolean onUnhandledInputEvent(InputEvent a0) {
              boolean r = arg.onUnhandledInputEvent(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          ((TvView) v).setOnUnhandledInputEventListener((TvView.OnUnhandledInputEventListener) null);
        }
      }
    }
  }

  private static final class OnValueChangedFunc6e8a79aa implements Anvil.AttrFunc<NumberPicker.OnValueChangeListener> {
    public static final OnValueChangedFunc6e8a79aa instance = new OnValueChangedFunc6e8a79aa();

    public void apply(View v, final NumberPicker.OnValueChangeListener arg, final NumberPicker.OnValueChangeListener old) {
      if (v instanceof NumberPicker) {
        if (arg != null) {
          ((NumberPicker) v).setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            public void onValueChange(NumberPicker a0, int a1, int a2) {
              arg.onValueChange(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          ((NumberPicker) v).setOnValueChangedListener((NumberPicker.OnValueChangeListener) null);
        }
      }
    }
  }

  private static final class OnZoomInClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final OnZoomInClickFunc79a13a5e instance = new OnZoomInClickFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof ZoomControls) {
        if (arg != null) {
          ((ZoomControls) v).setOnZoomInClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((ZoomControls) v).setOnZoomInClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OnZoomOutClickFunc79a13a5e implements Anvil.AttrFunc<View.OnClickListener> {
    public static final OnZoomOutClickFunc79a13a5e instance = new OnZoomOutClickFunc79a13a5e();

    public void apply(View v, final View.OnClickListener arg, final View.OnClickListener old) {
      if (v instanceof ZoomControls) {
        if (arg != null) {
          ((ZoomControls) v).setOnZoomOutClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              arg.onClick(a0);
              Anvil.render();
            }
          });
        } else {
          ((ZoomControls) v).setOnZoomOutClickListener((View.OnClickListener) null);
        }
      }
    }
  }

  private static final class OpaqueFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final OpaqueFunc148d6054 instance = new OpaqueFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setOpaque(arg);
      }
    }
  }

  private static final class OrientationFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final OrientationFunc8567756a instance = new OrientationFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setOrientation(arg);
      }
      if (v instanceof GridLayout) {
        ((GridLayout) v).setOrientation(arg);
      }
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setOrientation(arg);
      }
    }
  }

  private static final class OutAnimationFunc9a08bdaf implements Anvil.AttrFunc<ObjectAnimator> {
    public static final OutAnimationFunc9a08bdaf instance = new OutAnimationFunc9a08bdaf();

    public void apply(View v, final ObjectAnimator arg, final ObjectAnimator old) {
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setOutAnimation(arg);
      }
    }
  }

  private static final class OutAnimationFunc76cb7b50 implements Anvil.AttrFunc<Animation> {
    public static final OutAnimationFunc76cb7b50 instance = new OutAnimationFunc76cb7b50();

    public void apply(View v, final Animation arg, final Animation old) {
      if (v instanceof ViewAnimator) {
        ((ViewAnimator) v).setOutAnimation(arg);
      }
    }
  }

  private static final class OutlineProviderFuncc76d7ca4 implements Anvil.AttrFunc<ViewOutlineProvider> {
    public static final OutlineProviderFuncc76d7ca4 instance = new OutlineProviderFuncc76d7ca4();

    public void apply(View v, final ViewOutlineProvider arg, final ViewOutlineProvider old) {
      v.setOutlineProvider(arg);
    }
  }

  private static final class OverScrollModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final OverScrollModeFunc8567756a instance = new OverScrollModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setOverScrollMode(arg);
    }
  }

  private static final class OverlayFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final OverlayFuncfb47464a instance = new OverlayFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof QuickContactBadge) {
        ((QuickContactBadge) v).setOverlay(arg);
      }
    }
  }

  private static final class OverscrollFooterFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final OverscrollFooterFuncfb47464a instance = new OverscrollFooterFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setOverscrollFooter(arg);
      }
    }
  }

  private static final class OverscrollHeaderFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final OverscrollHeaderFuncfb47464a instance = new OverscrollHeaderFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ListView) {
        ((ListView) v).setOverscrollHeader(arg);
      }
    }
  }

  private static final class PaintFlagsFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PaintFlagsFunc8567756a instance = new PaintFlagsFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setPaintFlags(arg);
      }
    }
  }

  private static final class PersistentDrawingCacheFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PersistentDrawingCacheFunc8567756a instance = new PersistentDrawingCacheFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setPersistentDrawingCache(arg);
      }
    }
  }

  private static final class PivotXFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final PivotXFunce0893188 instance = new PivotXFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setPivotX(arg);
    }
  }

  private static final class PivotYFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final PivotYFunce0893188 instance = new PivotYFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setPivotY(arg);
    }
  }

  private static final class PopupBackgroundDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final PopupBackgroundDrawableFuncfb47464a instance = new PopupBackgroundDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPopupBackgroundDrawable(arg);
      }
    }
  }

  private static final class PopupBackgroundResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PopupBackgroundResourceFunc8567756a instance = new PopupBackgroundResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPopupBackgroundResource(arg);
      }
    }
  }

  private static final class PopupParentFunc6c3617af implements Anvil.AttrFunc<View> {
    public static final PopupParentFunc6c3617af instance = new PopupParentFunc6c3617af();

    public void apply(View v, final View arg, final View old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setPopupParent(arg);
      }
    }
  }

  private static final class PopupThemeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PopupThemeFunc8567756a instance = new PopupThemeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ActionMenuView) {
        ((ActionMenuView) v).setPopupTheme(arg);
      }
      if (v instanceof Toolbar) {
        ((Toolbar) v).setPopupTheme(arg);
      }
    }
  }

  private static final class PreserveEGLContextOnPauseFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final PreserveEGLContextOnPauseFunc148d6054 instance = new PreserveEGLContextOnPauseFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setPreserveEGLContextOnPause(arg);
      }
    }
  }

  private static final class PressedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final PressedFunc148d6054 instance = new PressedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setPressed(arg);
    }
  }

  private static final class PreviewEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final PreviewEnabledFunc148d6054 instance = new PreviewEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setPreviewEnabled(arg);
      }
    }
  }

  private static final class PrivateImeOptionsFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final PrivateImeOptionsFunc473e3665 instance = new PrivateImeOptionsFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextView) {
        ((TextView) v).setPrivateImeOptions(arg);
      }
    }
  }

  private static final class ProgressFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ProgressFunc8567756a instance = new ProgressFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgress(arg);
      }
    }
  }

  private static final class ProgressBackgroundTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ProgressBackgroundTintListFunc9e5e0e4e instance = new ProgressBackgroundTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressBackgroundTintList(arg);
      }
    }
  }

  private static final class ProgressBackgroundTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ProgressBackgroundTintModeFuncabb7a84e instance = new ProgressBackgroundTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressBackgroundTintMode(arg);
      }
    }
  }

  private static final class ProgressDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ProgressDrawableFuncfb47464a instance = new ProgressDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressDrawable(arg);
      }
    }
  }

  private static final class ProgressDrawableTiledFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ProgressDrawableTiledFuncfb47464a instance = new ProgressDrawableTiledFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressDrawableTiled(arg);
      }
    }
  }

  private static final class ProgressTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ProgressTintListFunc9e5e0e4e instance = new ProgressTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressTintList(arg);
      }
    }
  }

  private static final class ProgressTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ProgressTintModeFuncabb7a84e instance = new ProgressTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setProgressTintMode(arg);
      }
    }
  }

  private static final class PromptFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final PromptFuncc0af808b instance = new PromptFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPrompt(arg);
      }
    }
  }

  private static final class PromptIdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final PromptIdFunc8567756a instance = new PromptIdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Spinner) {
        ((Spinner) v).setPromptId(arg);
      }
    }
  }

  private static final class ProximityCorrectionEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ProximityCorrectionEnabledFunc148d6054 instance = new ProximityCorrectionEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setProximityCorrectionEnabled(arg);
      }
    }
  }

  private static final class QueryHintFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final QueryHintFuncc0af808b instance = new QueryHintFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setQueryHint(arg);
      }
    }
  }

  private static final class QueryRefinementEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final QueryRefinementEnabledFunc148d6054 instance = new QueryRefinementEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setQueryRefinementEnabled(arg);
      }
    }
  }

  private static final class RatingFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final RatingFunce0893188 instance = new RatingFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setRating(arg);
      }
    }
  }

  private static final class RawInputTypeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RawInputTypeFunc8567756a instance = new RawInputTypeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setRawInputType(arg);
      }
    }
  }

  private static final class RecyclerListenerFunc93ebab97 implements Anvil.AttrFunc<AbsListView.RecyclerListener> {
    public static final RecyclerListenerFunc93ebab97 instance = new RecyclerListenerFunc93ebab97();

    public void apply(View v, final AbsListView.RecyclerListener arg, final AbsListView.RecyclerListener old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setRecyclerListener(arg);
      }
    }
  }

  private static final class RemoteViewsAdapterFuncbcfa9f30 implements Anvil.AttrFunc<Intent> {
    public static final RemoteViewsAdapterFuncbcfa9f30 instance = new RemoteViewsAdapterFuncbcfa9f30();

    public void apply(View v, final Intent arg, final Intent old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setRemoteViewsAdapter(arg);
      }
      if (v instanceof AdapterViewAnimator) {
        ((AdapterViewAnimator) v).setRemoteViewsAdapter(arg);
      }
    }
  }

  private static final class RenderModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RenderModeFunc8567756a instance = new RenderModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setRenderMode(arg);
      }
    }
  }

  private static final class RendererFunc48532fc4 implements Anvil.AttrFunc<GLSurfaceView.Renderer> {
    public static final RendererFunc48532fc4 instance = new RendererFunc48532fc4();

    public void apply(View v, final GLSurfaceView.Renderer arg, final GLSurfaceView.Renderer old) {
      if (v instanceof GLSurfaceView) {
        ((GLSurfaceView) v).setRenderer(arg);
      }
    }
  }

  private static final class RightFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RightFunc8567756a instance = new RightFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setRight(arg);
    }
  }

  private static final class RightStripDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final RightStripDrawableFuncfb47464a instance = new RightStripDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setRightStripDrawable(arg);
      }
    }
  }

  private static final class RightStripDrawableFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RightStripDrawableFunc8567756a instance = new RightStripDrawableFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setRightStripDrawable(arg);
      }
    }
  }

  private static final class RotationFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final RotationFunce0893188 instance = new RotationFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setRotation(arg);
    }
  }

  private static final class RotationXFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final RotationXFunce0893188 instance = new RotationXFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setRotationX(arg);
    }
  }

  private static final class RotationYFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final RotationYFunce0893188 instance = new RotationYFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setRotationY(arg);
    }
  }

  private static final class RouteTypesFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RouteTypesFunc8567756a instance = new RouteTypesFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof MediaRouteButton) {
        ((MediaRouteButton) v).setRouteTypes(arg);
      }
    }
  }

  private static final class RowCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final RowCountFunc8567756a instance = new RowCountFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setRowCount(arg);
      }
    }
  }

  private static final class RowOrderPreservedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final RowOrderPreservedFunc148d6054 instance = new RowOrderPreservedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setRowOrderPreserved(arg);
      }
    }
  }

  private static final class SaveEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SaveEnabledFunc148d6054 instance = new SaveEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSaveEnabled(arg);
    }
  }

  private static final class SaveFromParentEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SaveFromParentEnabledFunc148d6054 instance = new SaveFromParentEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSaveFromParentEnabled(arg);
    }
  }

  private static final class ScaleTypeFunc1c5151cb implements Anvil.AttrFunc<ImageView.ScaleType> {
    public static final ScaleTypeFunc1c5151cb instance = new ScaleTypeFunc1c5151cb();

    public void apply(View v, final ImageView.ScaleType arg, final ImageView.ScaleType old) {
      if (v instanceof ImageView) {
        ((ImageView) v).setScaleType(arg);
      }
    }
  }

  private static final class ScaleXFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final ScaleXFunce0893188 instance = new ScaleXFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setScaleX(arg);
    }
  }

  private static final class ScaleYFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final ScaleYFunce0893188 instance = new ScaleYFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setScaleY(arg);
    }
  }

  private static final class ScrollBarDefaultDelayBeforeFadeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollBarDefaultDelayBeforeFadeFunc8567756a instance = new ScrollBarDefaultDelayBeforeFadeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarDefaultDelayBeforeFade(arg);
    }
  }

  private static final class ScrollBarFadeDurationFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollBarFadeDurationFunc8567756a instance = new ScrollBarFadeDurationFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarFadeDuration(arg);
    }
  }

  private static final class ScrollBarSizeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollBarSizeFunc8567756a instance = new ScrollBarSizeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarSize(arg);
    }
  }

  private static final class ScrollBarStyleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollBarStyleFunc8567756a instance = new ScrollBarStyleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollBarStyle(arg);
    }
  }

  private static final class ScrollContainerFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ScrollContainerFunc148d6054 instance = new ScrollContainerFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setScrollContainer(arg);
    }
  }

  private static final class ScrollXFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollXFunc8567756a instance = new ScrollXFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollX(arg);
    }
  }

  private static final class ScrollYFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ScrollYFunc8567756a instance = new ScrollYFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setScrollY(arg);
    }
  }

  private static final class ScrollbarFadingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ScrollbarFadingEnabledFunc148d6054 instance = new ScrollbarFadingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setScrollbarFadingEnabled(arg);
    }
  }

  private static final class ScrollerFunc7fa71345 implements Anvil.AttrFunc<Scroller> {
    public static final ScrollerFunc7fa71345 instance = new ScrollerFunc7fa71345();

    public void apply(View v, final Scroller arg, final Scroller old) {
      if (v instanceof TextView) {
        ((TextView) v).setScroller(arg);
      }
    }
  }

  private static final class ScrollingCacheEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ScrollingCacheEnabledFunc148d6054 instance = new ScrollingCacheEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setScrollingCacheEnabled(arg);
      }
    }
  }

  private static final class SearchableInfoFunc1f96c03c implements Anvil.AttrFunc<SearchableInfo> {
    public static final SearchableInfoFunc1f96c03c instance = new SearchableInfoFunc1f96c03c();

    public void apply(View v, final SearchableInfo arg, final SearchableInfo old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSearchableInfo(arg);
      }
    }
  }

  private static final class SecondaryProgressFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SecondaryProgressFunc8567756a instance = new SecondaryProgressFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgress(arg);
      }
    }
  }

  private static final class SecondaryProgressTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final SecondaryProgressTintListFunc9e5e0e4e instance = new SecondaryProgressTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgressTintList(arg);
      }
    }
  }

  private static final class SecondaryProgressTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final SecondaryProgressTintModeFuncabb7a84e instance = new SecondaryProgressTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof ProgressBar) {
        ((ProgressBar) v).setSecondaryProgressTintMode(arg);
      }
    }
  }

  private static final class SecureFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SecureFunc148d6054 instance = new SecureFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setSecure(arg);
      }
    }
  }

  private static final class SelectAllOnFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SelectAllOnFocusFunc148d6054 instance = new SelectAllOnFocusFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setSelectAllOnFocus(arg);
      }
    }
  }

  private static final class SelectedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SelectedFunc148d6054 instance = new SelectedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSelected(arg);
    }
  }

  private static final class SelectedDateVerticalBarFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final SelectedDateVerticalBarFuncfb47464a instance = new SelectedDateVerticalBarFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedDateVerticalBar(arg);
      }
    }
  }

  private static final class SelectedDateVerticalBarFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectedDateVerticalBarFunc8567756a instance = new SelectedDateVerticalBarFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedDateVerticalBar(arg);
      }
    }
  }

  private static final class SelectedGroupFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectedGroupFunc8567756a instance = new SelectedGroupFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof ExpandableListView) {
        ((ExpandableListView) v).setSelectedGroup(arg);
      }
    }
  }

  private static final class SelectedWeekBackgroundColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectedWeekBackgroundColorFunc8567756a instance = new SelectedWeekBackgroundColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setSelectedWeekBackgroundColor(arg);
      }
    }
  }

  private static final class SelectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectionFunc8567756a instance = new SelectionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AdapterView) {
        ((AdapterView) v).setSelection(arg);
      }
      if (v instanceof EditText) {
        ((EditText) v).setSelection(arg);
      }
    }
  }

  private static final class SelectorFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final SelectorFuncfb47464a instance = new SelectorFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSelector(arg);
      }
    }
  }

  private static final class SelectorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SelectorFunc8567756a instance = new SelectorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSelector(arg);
      }
    }
  }

  private static final class ShiftedFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ShiftedFunc148d6054 instance = new ShiftedFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setShifted(arg);
      }
    }
  }

  private static final class ShowDividersFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ShowDividersFunc8567756a instance = new ShowDividersFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setShowDividers(arg);
      }
    }
  }

  private static final class ShowSoftInputOnFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ShowSoftInputOnFocusFunc148d6054 instance = new ShowSoftInputOnFocusFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setShowSoftInputOnFocus(arg);
      }
    }
  }

  private static final class ShowTextFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ShowTextFunc148d6054 instance = new ShowTextFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof Switch) {
        ((Switch) v).setShowText(arg);
      }
    }
  }

  private static final class ShowWeekNumberFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ShowWeekNumberFunc148d6054 instance = new ShowWeekNumberFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setShowWeekNumber(arg);
      }
    }
  }

  private static final class ShownWeekCountFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ShownWeekCountFunc8567756a instance = new ShownWeekCountFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setShownWeekCount(arg);
      }
    }
  }

  private static final class ShrinkAllColumnsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ShrinkAllColumnsFunc148d6054 instance = new ShrinkAllColumnsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TableLayout) {
        ((TableLayout) v).setShrinkAllColumns(arg);
      }
    }
  }

  private static final class SingleLineFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SingleLineFunc148d6054 instance = new SingleLineFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setSingleLine(arg);
      }
    }
  }

  private static final class SmoothScrollbarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SmoothScrollbarEnabledFunc148d6054 instance = new SmoothScrollbarEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setSmoothScrollbarEnabled(arg);
      }
    }
  }

  private static final class SmoothScrollingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SmoothScrollingEnabledFunc148d6054 instance = new SmoothScrollingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof HorizontalScrollView) {
        ((HorizontalScrollView) v).setSmoothScrollingEnabled(arg);
      }
      if (v instanceof ScrollView) {
        ((ScrollView) v).setSmoothScrollingEnabled(arg);
      }
    }
  }

  private static final class SoundEffectsEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SoundEffectsEnabledFunc148d6054 instance = new SoundEffectsEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setSoundEffectsEnabled(arg);
    }
  }

  private static final class SpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SpacingFunc8567756a instance = new SpacingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setSpacing(arg);
      }
    }
  }

  private static final class SpannableFactoryFunc195c8c78 implements Anvil.AttrFunc<Spannable.Factory> {
    public static final SpannableFactoryFunc195c8c78 instance = new SpannableFactoryFunc195c8c78();

    public void apply(View v, final Spannable.Factory arg, final Spannable.Factory old) {
      if (v instanceof TextView) {
        ((TextView) v).setSpannableFactory(arg);
      }
    }
  }

  private static final class SpinnersShownFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SpinnersShownFunc148d6054 instance = new SpinnersShownFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof DatePicker) {
        ((DatePicker) v).setSpinnersShown(arg);
      }
    }
  }

  private static final class SplitTrackFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SplitTrackFunc148d6054 instance = new SplitTrackFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setSplitTrack(arg);
      }
      if (v instanceof Switch) {
        ((Switch) v).setSplitTrack(arg);
      }
    }
  }

  private static final class StackFromBottomFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final StackFromBottomFunc148d6054 instance = new StackFromBottomFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setStackFromBottom(arg);
      }
    }
  }

  private static final class StateListAnimatorFunc24d8c9cd implements Anvil.AttrFunc<StateListAnimator> {
    public static final StateListAnimatorFunc24d8c9cd instance = new StateListAnimatorFunc24d8c9cd();

    public void apply(View v, final StateListAnimator arg, final StateListAnimator old) {
      v.setStateListAnimator(arg);
    }
  }

  private static final class StepSizeFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final StepSizeFunce0893188 instance = new StepSizeFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof RatingBar) {
        ((RatingBar) v).setStepSize(arg);
      }
    }
  }

  private static final class StreamVolumeFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final StreamVolumeFunce0893188 instance = new StreamVolumeFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TvView) {
        ((TvView) v).setStreamVolume(arg);
      }
    }
  }

  private static final class StretchAllColumnsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final StretchAllColumnsFunc148d6054 instance = new StretchAllColumnsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TableLayout) {
        ((TableLayout) v).setStretchAllColumns(arg);
      }
    }
  }

  private static final class StretchModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final StretchModeFunc8567756a instance = new StretchModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setStretchMode(arg);
      }
    }
  }

  private static final class StripEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final StripEnabledFunc148d6054 instance = new StripEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TabWidget) {
        ((TabWidget) v).setStripEnabled(arg);
      }
    }
  }

  private static final class SubmitButtonEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final SubmitButtonEnabledFunc148d6054 instance = new SubmitButtonEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSubmitButtonEnabled(arg);
      }
    }
  }

  private static final class SubtitleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SubtitleFunc8567756a instance = new SubtitleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitle(arg);
      }
    }
  }

  private static final class SubtitleFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final SubtitleFuncc0af808b instance = new SubtitleFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitle(arg);
      }
    }
  }

  private static final class SubtitleTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SubtitleTextColorFunc8567756a instance = new SubtitleTextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setSubtitleTextColor(arg);
      }
    }
  }

  private static final class SuggestionsAdapterFunc2f59eaee implements Anvil.AttrFunc<CursorAdapter> {
    public static final SuggestionsAdapterFunc2f59eaee instance = new SuggestionsAdapterFunc2f59eaee();

    public void apply(View v, final CursorAdapter arg, final CursorAdapter old) {
      if (v instanceof SearchView) {
        ((SearchView) v).setSuggestionsAdapter(arg);
      }
    }
  }

  private static final class SurfaceTextureFuncc2f30b12 implements Anvil.AttrFunc<SurfaceTexture> {
    public static final SurfaceTextureFuncc2f30b12 instance = new SurfaceTextureFuncc2f30b12();

    public void apply(View v, final SurfaceTexture arg, final SurfaceTexture old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setSurfaceTexture(arg);
      }
    }
  }

  private static final class SurfaceTextureListenerFunc528d697a implements Anvil.AttrFunc<TextureView.SurfaceTextureListener> {
    public static final SurfaceTextureListenerFunc528d697a instance = new SurfaceTextureListenerFunc528d697a();

    public void apply(View v, final TextureView.SurfaceTextureListener arg, final TextureView.SurfaceTextureListener old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setSurfaceTextureListener(arg);
      }
    }
  }

  private static final class SwitchMinWidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SwitchMinWidthFunc8567756a instance = new SwitchMinWidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchMinWidth(arg);
      }
    }
  }

  private static final class SwitchPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SwitchPaddingFunc8567756a instance = new SwitchPaddingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchPadding(arg);
      }
    }
  }

  private static final class SwitchTypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    public static final SwitchTypefaceFunc53b4afb instance = new SwitchTypefaceFunc53b4afb();

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof Switch) {
        ((Switch) v).setSwitchTypeface(arg);
      }
    }
  }

  private static final class SystemUiVisibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final SystemUiVisibilityFunc8567756a instance = new SystemUiVisibilityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setSystemUiVisibility(arg);
    }
  }

  private static final class TagFunc3f697993 implements Anvil.AttrFunc<Object> {
    public static final TagFunc3f697993 instance = new TagFunc3f697993();

    public void apply(View v, final Object arg, final Object old) {
      v.setTag(arg);
    }
  }

  private static final class TextFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextFunc8567756a instance = new TextFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setText(arg);
      }
    }
  }

  private static final class TextAlignmentFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextAlignmentFunc8567756a instance = new TextAlignmentFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTextAlignment(arg);
    }
  }

  private static final class TextColorFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final TextColorFunc9e5e0e4e instance = new TextColorFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextColor(arg);
      }
    }
  }

  private static final class TextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextColorFunc8567756a instance = new TextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextColor(arg);
      }
    }
  }

  private static final class TextDirectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TextDirectionFunc8567756a instance = new TextDirectionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTextDirection(arg);
    }
  }

  private static final class TextFilterEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final TextFilterEnabledFunc148d6054 instance = new TextFilterEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setTextFilterEnabled(arg);
      }
    }
  }

  private static final class TextIsSelectableFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final TextIsSelectableFunc148d6054 instance = new TextIsSelectableFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextIsSelectable(arg);
      }
    }
  }

  private static final class TextKeepStateFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final TextKeepStateFuncc0af808b instance = new TextKeepStateFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextKeepState(arg);
      }
    }
  }

  private static final class TextLocaleFuncba8c481a implements Anvil.AttrFunc<Locale> {
    public static final TextLocaleFuncba8c481a instance = new TextLocaleFuncba8c481a();

    public void apply(View v, final Locale arg, final Locale old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextLocale(arg);
      }
    }
  }

  private static final class TextOffFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final TextOffFuncc0af808b instance = new TextOffFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Switch) {
        ((Switch) v).setTextOff(arg);
      }
      if (v instanceof ToggleButton) {
        ((ToggleButton) v).setTextOff(arg);
      }
    }
  }

  private static final class TextOnFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final TextOnFuncc0af808b instance = new TextOnFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Switch) {
        ((Switch) v).setTextOn(arg);
      }
      if (v instanceof ToggleButton) {
        ((ToggleButton) v).setTextOn(arg);
      }
    }
  }

  private static final class TextScaleXFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final TextScaleXFunce0893188 instance = new TextScaleXFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof TextView) {
        ((TextView) v).setTextScaleX(arg);
      }
    }
  }

  private static final class ThresholdFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ThresholdFunc8567756a instance = new ThresholdFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setThreshold(arg);
      }
    }
  }

  private static final class ThumbFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ThumbFuncfb47464a instance = new ThumbFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumb(arg);
      }
    }
  }

  private static final class ThumbDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final ThumbDrawableFuncfb47464a instance = new ThumbDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbDrawable(arg);
      }
    }
  }

  private static final class ThumbOffsetFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ThumbOffsetFunc8567756a instance = new ThumbOffsetFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbOffset(arg);
      }
    }
  }

  private static final class ThumbResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ThumbResourceFunc8567756a instance = new ThumbResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbResource(arg);
      }
    }
  }

  private static final class ThumbTextPaddingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ThumbTextPaddingFunc8567756a instance = new ThumbTextPaddingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setThumbTextPadding(arg);
      }
    }
  }

  private static final class ThumbTintListFunc9e5e0e4e implements Anvil.AttrFunc<ColorStateList> {
    public static final ThumbTintListFunc9e5e0e4e instance = new ThumbTintListFunc9e5e0e4e();

    public void apply(View v, final ColorStateList arg, final ColorStateList old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbTintList(arg);
      }
    }
  }

  private static final class ThumbTintModeFuncabb7a84e implements Anvil.AttrFunc<PorterDuff.Mode> {
    public static final ThumbTintModeFuncabb7a84e instance = new ThumbTintModeFuncabb7a84e();

    public void apply(View v, final PorterDuff.Mode arg, final PorterDuff.Mode old) {
      if (v instanceof AbsSeekBar) {
        ((AbsSeekBar) v).setThumbTintMode(arg);
      }
    }
  }

  private static final class TimeZoneFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final TimeZoneFunc473e3665 instance = new TimeZoneFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof TextClock) {
        ((TextClock) v).setTimeZone(arg);
      }
    }
  }

  private static final class TitleFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TitleFunc8567756a instance = new TitleFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitle(arg);
      }
    }
  }

  private static final class TitleFuncc0af808b implements Anvil.AttrFunc<CharSequence> {
    public static final TitleFuncc0af808b instance = new TitleFuncc0af808b();

    public void apply(View v, final CharSequence arg, final CharSequence old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitle(arg);
      }
    }
  }

  private static final class TitleTextColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TitleTextColorFunc8567756a instance = new TitleTextColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Toolbar) {
        ((Toolbar) v).setTitleTextColor(arg);
      }
    }
  }

  private static final class TokenizerFunc6ae2b151 implements Anvil.AttrFunc<MultiAutoCompleteTextView.Tokenizer> {
    public static final TokenizerFunc6ae2b151 instance = new TokenizerFunc6ae2b151();

    public void apply(View v, final MultiAutoCompleteTextView.Tokenizer arg, final MultiAutoCompleteTextView.Tokenizer old) {
      if (v instanceof MultiAutoCompleteTextView) {
        ((MultiAutoCompleteTextView) v).setTokenizer(arg);
      }
    }
  }

  private static final class TopFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TopFunc8567756a instance = new TopFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setTop(arg);
    }
  }

  private static final class TouchDelegateFunc8217a01a implements Anvil.AttrFunc<TouchDelegate> {
    public static final TouchDelegateFunc8217a01a instance = new TouchDelegateFunc8217a01a();

    public void apply(View v, final TouchDelegate arg, final TouchDelegate old) {
      v.setTouchDelegate(arg);
    }
  }

  private static final class TouchscreenBlocksFocusFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final TouchscreenBlocksFocusFunc148d6054 instance = new TouchscreenBlocksFocusFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setTouchscreenBlocksFocus(arg);
      }
    }
  }

  private static final class TrackDrawableFuncfb47464a implements Anvil.AttrFunc<Drawable> {
    public static final TrackDrawableFuncfb47464a instance = new TrackDrawableFuncfb47464a();

    public void apply(View v, final Drawable arg, final Drawable old) {
      if (v instanceof Switch) {
        ((Switch) v).setTrackDrawable(arg);
      }
    }
  }

  private static final class TrackResourceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TrackResourceFunc8567756a instance = new TrackResourceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof Switch) {
        ((Switch) v).setTrackResource(arg);
      }
    }
  }

  private static final class TranscriptModeFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final TranscriptModeFunc8567756a instance = new TranscriptModeFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setTranscriptMode(arg);
      }
    }
  }

  private static final class TransformFunc6b9f325 implements Anvil.AttrFunc<Matrix> {
    public static final TransformFunc6b9f325 instance = new TransformFunc6b9f325();

    public void apply(View v, final Matrix arg, final Matrix old) {
      if (v instanceof TextureView) {
        ((TextureView) v).setTransform(arg);
      }
    }
  }

  private static final class TransformationMethodFunc65bbcab5 implements Anvil.AttrFunc<TransformationMethod> {
    public static final TransformationMethodFunc65bbcab5 instance = new TransformationMethodFunc65bbcab5();

    public void apply(View v, final TransformationMethod arg, final TransformationMethod old) {
      if (v instanceof TextView) {
        ((TextView) v).setTransformationMethod(arg);
      }
    }
  }

  private static final class TransitionGroupFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final TransitionGroupFunc148d6054 instance = new TransitionGroupFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof ViewGroup) {
        ((ViewGroup) v).setTransitionGroup(arg);
      }
    }
  }

  private static final class TransitionNameFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final TransitionNameFunc473e3665 instance = new TransitionNameFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      v.setTransitionName(arg);
    }
  }

  private static final class TranslationXFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final TranslationXFunce0893188 instance = new TranslationXFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationX(arg);
    }
  }

  private static final class TranslationYFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final TranslationYFunce0893188 instance = new TranslationYFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationY(arg);
    }
  }

  private static final class TranslationZFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final TranslationZFunce0893188 instance = new TranslationZFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setTranslationZ(arg);
    }
  }

  private static final class TypefaceFunc53b4afb implements Anvil.AttrFunc<Typeface> {
    public static final TypefaceFunc53b4afb instance = new TypefaceFunc53b4afb();

    public void apply(View v, final Typeface arg, final Typeface old) {
      if (v instanceof TextView) {
        ((TextView) v).setTypeface(arg);
      }
    }
  }

  private static final class UncertainGestureColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final UncertainGestureColorFunc8567756a instance = new UncertainGestureColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GestureOverlayView) {
        ((GestureOverlayView) v).setUncertainGestureColor(arg);
      }
    }
  }

  private static final class UnfocusedMonthDateColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final UnfocusedMonthDateColorFunc8567756a instance = new UnfocusedMonthDateColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setUnfocusedMonthDateColor(arg);
      }
    }
  }

  private static final class UnselectedAlphaFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final UnselectedAlphaFunce0893188 instance = new UnselectedAlphaFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof Gallery) {
        ((Gallery) v).setUnselectedAlpha(arg);
      }
    }
  }

  private static final class UpFunc7b013b1f implements Anvil.AttrFunc<LocalActivityManager> {
    public static final UpFunc7b013b1f instance = new UpFunc7b013b1f();

    public void apply(View v, final LocalActivityManager arg, final LocalActivityManager old) {
      if (v instanceof TabHost) {
        ((TabHost) v).setup(arg);
      }
    }
  }

  private static final class UseDefaultMarginsFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final UseDefaultMarginsFunc148d6054 instance = new UseDefaultMarginsFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof GridLayout) {
        ((GridLayout) v).setUseDefaultMargins(arg);
      }
    }
  }

  private static final class ValidatorFuncd6d080a9 implements Anvil.AttrFunc<AutoCompleteTextView.Validator> {
    public static final ValidatorFuncd6d080a9 instance = new ValidatorFuncd6d080a9();

    public void apply(View v, final AutoCompleteTextView.Validator arg, final AutoCompleteTextView.Validator old) {
      if (v instanceof AutoCompleteTextView) {
        ((AutoCompleteTextView) v).setValidator(arg);
      }
    }
  }

  private static final class ValueFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final ValueFunc8567756a instance = new ValueFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setValue(arg);
      }
    }
  }

  private static final class VelocityScaleFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final VelocityScaleFunce0893188 instance = new VelocityScaleFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof AbsListView) {
        ((AbsListView) v).setVelocityScale(arg);
      }
    }
  }

  private static final class VerticalCorrectionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final VerticalCorrectionFunc8567756a instance = new VerticalCorrectionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof KeyboardView) {
        ((KeyboardView) v).setVerticalCorrection(arg);
      }
    }
  }

  private static final class VerticalFadingEdgeEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final VerticalFadingEdgeEnabledFunc148d6054 instance = new VerticalFadingEdgeEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setVerticalFadingEdgeEnabled(arg);
    }
  }

  private static final class VerticalGravityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final VerticalGravityFunc8567756a instance = new VerticalGravityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setVerticalGravity(arg);
      }
      if (v instanceof RelativeLayout) {
        ((RelativeLayout) v).setVerticalGravity(arg);
      }
    }
  }

  private static final class VerticalScrollBarEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final VerticalScrollBarEnabledFunc148d6054 instance = new VerticalScrollBarEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setVerticalScrollBarEnabled(arg);
    }
  }

  private static final class VerticalScrollbarOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final VerticalScrollbarOverlayFunc148d6054 instance = new VerticalScrollbarOverlayFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setVerticalScrollbarOverlay(arg);
      }
    }
  }

  private static final class VerticalScrollbarPositionFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final VerticalScrollbarPositionFunc8567756a instance = new VerticalScrollbarPositionFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setVerticalScrollbarPosition(arg);
    }
  }

  private static final class VerticalSpacingFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final VerticalSpacingFunc8567756a instance = new VerticalSpacingFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof GridView) {
        ((GridView) v).setVerticalSpacing(arg);
      }
    }
  }

  private static final class VideoPathFunc473e3665 implements Anvil.AttrFunc<String> {
    public static final VideoPathFunc473e3665 instance = new VideoPathFunc473e3665();

    public void apply(View v, final String arg, final String old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setVideoPath(arg);
      }
    }
  }

  private static final class VideoURIFunc75f430fc implements Anvil.AttrFunc<Uri> {
    public static final VideoURIFunc75f430fc instance = new VideoURIFunc75f430fc();

    public void apply(View v, final Uri arg, final Uri old) {
      if (v instanceof VideoView) {
        ((VideoView) v).setVideoURI(arg);
      }
    }
  }

  private static final class VisibilityFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final VisibilityFunc8567756a instance = new VisibilityFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      v.setVisibility(arg);
    }
  }

  private static final class WebChromeClientFunc54f22bac implements Anvil.AttrFunc<WebChromeClient> {
    public static final WebChromeClientFunc54f22bac instance = new WebChromeClientFunc54f22bac();

    public void apply(View v, final WebChromeClient arg, final WebChromeClient old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebChromeClient(arg);
      }
    }
  }

  private static final class WebContentsDebuggingEnabledFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final WebContentsDebuggingEnabledFunc148d6054 instance = new WebContentsDebuggingEnabledFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebContentsDebuggingEnabled(arg);
      }
    }
  }

  private static final class WebViewClientFunc95cf0d57 implements Anvil.AttrFunc<WebViewClient> {
    public static final WebViewClientFunc95cf0d57 instance = new WebViewClientFunc95cf0d57();

    public void apply(View v, final WebViewClient arg, final WebViewClient old) {
      if (v instanceof WebView) {
        ((WebView) v).setWebViewClient(arg);
      }
    }
  }

  private static final class WeekDayTextAppearanceFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final WeekDayTextAppearanceFunc8567756a instance = new WeekDayTextAppearanceFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekDayTextAppearance(arg);
      }
    }
  }

  private static final class WeekNumberColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final WeekNumberColorFunc8567756a instance = new WeekNumberColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekNumberColor(arg);
      }
    }
  }

  private static final class WeekSeparatorLineColorFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final WeekSeparatorLineColorFunc8567756a instance = new WeekSeparatorLineColorFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof CalendarView) {
        ((CalendarView) v).setWeekSeparatorLineColor(arg);
      }
    }
  }

  private static final class WeightSumFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final WeightSumFunce0893188 instance = new WeightSumFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      if (v instanceof LinearLayout) {
        ((LinearLayout) v).setWeightSum(arg);
      }
    }
  }

  private static final class WidthFunc8567756a implements Anvil.AttrFunc<Integer> {
    public static final WidthFunc8567756a instance = new WidthFunc8567756a();

    public void apply(View v, final Integer arg, final Integer old) {
      if (v instanceof TextView) {
        ((TextView) v).setWidth(arg);
      }
    }
  }

  private static final class WillNotCacheDrawingFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final WillNotCacheDrawingFunc148d6054 instance = new WillNotCacheDrawingFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setWillNotCacheDrawing(arg);
    }
  }

  private static final class WillNotDrawFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final WillNotDrawFunc148d6054 instance = new WillNotDrawFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      v.setWillNotDraw(arg);
    }
  }

  private static final class WrapSelectorWheelFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final WrapSelectorWheelFunc148d6054 instance = new WrapSelectorWheelFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof NumberPicker) {
        ((NumberPicker) v).setWrapSelectorWheel(arg);
      }
    }
  }

  private static final class XFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final XFunce0893188 instance = new XFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setX(arg);
    }
  }

  private static final class YFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final YFunce0893188 instance = new YFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setY(arg);
    }
  }

  private static final class ZFunce0893188 implements Anvil.AttrFunc<Float> {
    public static final ZFunce0893188 instance = new ZFunce0893188();

    public void apply(View v, final Float arg, final Float old) {
      v.setZ(arg);
    }
  }

  private static final class ZOrderMediaOverlayFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ZOrderMediaOverlayFunc148d6054 instance = new ZOrderMediaOverlayFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setZOrderMediaOverlay(arg);
      }
    }
  }

  private static final class ZOrderOnTopFunc148d6054 implements Anvil.AttrFunc<Boolean> {
    public static final ZOrderOnTopFunc148d6054 instance = new ZOrderOnTopFunc148d6054();

    public void apply(View v, final Boolean arg, final Boolean old) {
      if (v instanceof SurfaceView) {
        ((SurfaceView) v).setZOrderOnTop(arg);
      }
    }
  }

  private static final class ZoomSpeedFunc17c521d0 implements Anvil.AttrFunc<Long> {
    public static final ZoomSpeedFunc17c521d0 instance = new ZoomSpeedFunc17c521d0();

    public void apply(View v, final Long arg, final Long old) {
      if (v instanceof ZoomButton) {
        ((ZoomButton) v).setZoomSpeed(arg);
      }
      if (v instanceof ZoomControls) {
        ((ZoomControls) v).setZoomSpeed(arg);
      }
    }
  }
}