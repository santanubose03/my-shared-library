def call(Map config=[:]){
    loadLinuxScript(filename: 'hello-world.sh')
    sh "${WORKSPACE}/hello-world.sh ${config.name} ${config.dayOfWeek}"
}
