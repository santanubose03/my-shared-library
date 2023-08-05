def call(Map config=[:]){
    sh "echo entered helloWorldExternal file"
    loadLinuxScript(filename: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
