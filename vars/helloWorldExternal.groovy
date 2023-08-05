def call(Map config=[:]){
    println "helloworld execution started"
    loadLinuxScript(filename: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
