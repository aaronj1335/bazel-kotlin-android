This is an Android app that's written in Kotlin and builds with Bazel.

## Build

    bazel build --strategy=KotlinCompile=standalone :app

## This is almost cool

I think this approaches the development fun of just opening an `index.html` file in a browser, but there are a couple pain points:

* I don't know how to resolve `R.*` classes. I think if `kotlin_library` could depend on `android_library`, I could create an `android_library` target for resources that provided these.

* The Intellij/Androd Studio Bazel plugin doesn't work for this project. When you try to add a bazel run configuration, or run the `:app` rule by right-clicking it in the BUILD file, it fails with [this error](https://gist.github.com/aaronj1335/2905f0ce8b59f0dfc27d55d46f77453a).
