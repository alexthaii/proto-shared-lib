def call(Map pipelineParams) {
    pipeline {
        agent any

        stages{
            stage('checkout git') {
                steps {
                    git branch: 'master', url: pipelineParams.scmUrl
                }
            }
        }
    }
}