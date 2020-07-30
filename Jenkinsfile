
@Library('cicd-pipeline') _

def config = [
    branchMatcher: [RELEASE: ['master'], DEVELOPMENT: ['^(?!master$).*$']],
    ]
terraformPipeline(config)
