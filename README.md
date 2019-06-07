## when

```groovy
Stage("Not Master") {
    when(env.BRANCH_NAME != "master") {
        // Do this
    }
}
```
