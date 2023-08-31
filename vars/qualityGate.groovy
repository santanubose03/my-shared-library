def call(){
   def qualityGate = waitForQualityGate abortPipeline: true, credentialsId: 'sonar-api'
   sh 'echo "Quality Gate Status: ${qualityGate.status}"'
}
