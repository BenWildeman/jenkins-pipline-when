import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def call(boolean condition, body) {
    if (condition) {
        body()
    } else {
        Utils.markStageSkippedForConditional(STAGE_NAME)
    }
}
