This is an Android app that's written in Kotlin and builds with Bazel.

## Build

    bazel build --strategy=KotlinCompile=standalone :app

## Issues to resolve

### Android Studio tho

The Intellij/Androd Studio Bazel plugin doesn't work for this project. When you try to add a bazel run configuration, or run the `:app` rule by right-clicking it in the BUILD file, it fails with [this error](https://gist.github.com/aaronj1335/2905f0ce8b59f0dfc27d55d46f77453a).

That being said, it's pretty straitforward to just run the build from the command line, and then you can still attach the Studio debugger to the running app.

Here's an example `.bazelproject`:

```
directories:
  .

targets:
  //...:all

android_sdk_platform: android-25

build_flags:
  --strategy=KotlinCompile=standalone
```

### Including AAR dependencies from Maven repos

[Looks like there's a macro for this](https://github.com/bazelbuild/bazel/issues/561#issuecomment-259458533), but I'd like to get that working within this app.
