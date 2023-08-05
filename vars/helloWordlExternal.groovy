def call(Map config=[:]){
    loadLinuxScript(filename: 'hello-world.sh')
    sh "./hello-world.sh ${config}.name ${config}.dayOfWeek"
}
