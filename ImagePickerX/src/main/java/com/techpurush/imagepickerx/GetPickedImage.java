package com.techpurush.imagepickerx;

import android.graphics.Bitmap;
import android.net.Uri;

public interface GetPickedImage{

    void pickedImage(Bitmap bitmap);

    void pickedImage(Uri imageUri);

}
