# android-custom-view-tutorial

Android Studio project that provides an example application demonstrating the custom views created in the tutorial series
[Android Custom Views][1].  The code for the custom views is located in a library module within the project.

## Value Selector

View to allow the selection of a numeric value by pressing plus/minus buttons.  Pressing and holding a
button will update the value repeatedly.
This view can be configured with a minimum and maximum value.  There is also a label that will
display below the current value.

![ValueSelector](http://www.intertech.com/Blog/wp-content/uploads/2015/07/value_selector.png "ValueSelector")

## Value Bar

View that displays a colored bar as a ratio of an integer value to a maximum value.  There is also a circle
indicator and text that displays at the position of the current value, as well as a label (positioned above the bar).
The maximum value is displayed to the right of the bar.

![ValueBar](http://www.intertech.com/Blog/wp-content/uploads/2015/07/value_bar.png "ValueBar")

[1]: http://www.intertech.com/Blog/android-custom-view-tutorial-part-1-combining-existing-views/
