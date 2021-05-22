# ImagePickerX

How to use:

1)Add storage permission to your manifest.

      <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>


2)Add this at project level:

        maven { url 'https://jitpack.io' }


3)Add this at app level:

    implementation 'com.github.techpurush:ImagePickerX:1.0.0'


4)Sample code implementation:

                    ImagePickerX.Builder(getContext())
                                .pickWithListener(new GetPickedImage() {
                                    @Override
                                    public void pickedImage(Bitmap bitmap) {

                                        if (bitmap != null) {

                                            ImageView imageView = findViewById(R.id.imageView);

                                            imageView.setImageBitmap(bitmap);

                                        }

                                    }
                                });
