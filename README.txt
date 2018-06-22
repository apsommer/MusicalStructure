6/21/18

Removed excessive blank lines from xml files, changed the placeholder image used by the xml tools namespace to one that has multiple densities, revealed the action bar for legacy devices.

6/20/18

This app was created with Android Studio 3.1.3. Testing was completed on a Sony E5823 with Android 7.1.1 (API 25). Images were formatted to multiple densities using the Android Drawable Importer plugin. Custom objects (Song) are stored in an ArrayList, a custom ArrayAdapter (SongAdapter) inflates views of these objects to populate a ListView. The custom objects are passed between activities at runtime by implementing the Serializable interface.
