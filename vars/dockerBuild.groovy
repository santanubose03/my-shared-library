def call(String project,String imageTag,String dockerHub){
  sh """
     docker image build -t ${dockerHub}/${project} .
     docker image tag ${dockerHub}/${project} ${dockerHub}/${project}:${imageTag}
     docker image tag ${dockerHub}/${project} ${dockerHub}/${project}:latest
  """
}
