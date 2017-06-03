android_sdk_repository(
    name="androidsdk",
    path="/Users/aaronstacy/Library/Android/sdk",
    api_level=25,
)

android_ndk_repository(
    name="androidndk",
    path="/Users/aaronstacy/Library/Android/android-ndk-r12",
    api_level=12,
)

git_repository(
    name = "org_pubref_rules_kotlin",
    remote = "https://github.com/pubref/rules_kotlin.git",
    tag = "v0.3.1",
)

load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_repositories")
kotlin_repositories()

load("@bazel_tools//tools/build_defs/repo:maven_rules.bzl", "maven_aar")
maven_aar(
    name = "google_tasks",
    artifact = "com.google.android.gms:play-services-tasks:10.2.6",
    settings = "//:settings.xml"
)

