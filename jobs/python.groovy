project_name = "jenkins-pipeline-python"
repo = "git@github.com:Jugger25/tests-jenkins-1.git"
repo_name = "repo"

folder('proyect-a'){
  displayName('Proyect A')
  description('Folder for project A')
}

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
