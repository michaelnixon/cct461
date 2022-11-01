I updated the Android Cloud Vision API to a working project with current gradle and other build settings. It now provides a simple output of emotions detected.

[android]: //github.com/GoogleCloudPlatform/android-docs-samples/


-----

# Google Cloud Vision API examples

This repo contains some [Google Cloud Vision
API](https://cloud.google.com/vision/) examples.

### Face Detection

See the [face detection](https://cloud.google.com/vision/docs/face-tutorial) tutorial in the docs.

- [Java Code](https://github.com/GoogleCloudPlatform/java-docs-samples/tree/master/vision/face-detection)

### Label Detection

See the [label detection](https://cloud.google.com/vision/docs/label-tutorial) tutorial in the docs.

- [Java Code](https://github.com/GoogleCloudPlatform/java-docs-samples/tree/master/vision/label)


### Image Detection Using Android Device Photos

This simple single-activity sample that shows you how to make a call to the
Cloud Vision API with an image picked from your device’s gallery.

- [Documentation and Android Code](https://github.com/GoogleCloudPlatform/cloud-vision/tree/master/android)

Please note that if you're building this project you'll need to add a gradle.properties file to contain the following values:

android.useAndroidX=true

android.enableJetifier=true

API_KEY = "YOUR API KEY FOR THE CLOUD VISION SERVICE"
