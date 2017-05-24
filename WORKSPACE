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
    tag = "v0.2.2",
)
load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_repositories")
kotlin_repositories()
