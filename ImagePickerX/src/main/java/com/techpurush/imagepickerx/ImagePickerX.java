package com.techpurush.imagepickerx;

import android.app.Activity;

public class ImagePickerX {


    Activity context;

    public static ImagePickerX Builder(Activity context) {

        ImagePickerX imagePickerUtils = new ImagePickerX();
        imagePickerUtils.context=context;

        return imagePickerUtils;

    }

    public void pickWithListener(GetPickedImage getPickedImage) {

        ImagePickerFragment imagePickerFragment = new ImagePickerFragment();
        imagePickerFragment.withListener(getPickedImage);

        this.context.getFragmentManager().beginTransaction().add(imagePickerFragment, "frag").commit();

    }

}


