project_name = "jenkins-pipeline-python-test"
repo = "git@github.com:Jugger25/tests-jenkins-1.git"
repo_name = "repo"

pipelineJob(project_name){
  definition{
    triggers{
      scm('H/5 * * * *')
    }
    
    cpsScm{
      scm{
        git{
          remote{
            name(repo_name)
            url(repo)
          }
        }
        scriptPath("Jenkinsfile")

      }
    }
  }
}
