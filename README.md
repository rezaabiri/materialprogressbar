![](https://s17.picofile.com/file/8426299918/Screenshot_2021_02_26_20_00_38_548_ir_cenlearn_progressbarcustom.jpg)



# Usage


### Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

### Add the dependency:

```
dependencies {
      implementation 'com.github.rezaabiri:materialprogressbar:1.2'
}
```

To use this library, do the following:
for display :

```
ProgressMaterial progress = new ProgressMaterial();
progress.show(context, true/false);
```
for dismiss:

```
progress.dismiss();
```